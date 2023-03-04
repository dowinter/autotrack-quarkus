package de.dowinter.ootr.jna;

import static com.sun.jna.platform.win32.Tlhelp32.TH32CS_SNAPMODULE;
import static com.sun.jna.platform.win32.Tlhelp32.TH32CS_SNAPPROCESS;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Tlhelp32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class ProcessDiscovery {

    public static final String EMU_HAWK_EXE = "EmuHawk.exe";
    public static final String MUPEN64PLUS_DLL = "mupen64plus.dll";
    public static final long ROM_OFFSET = 0x658E0;

    @Inject
    User32 user;

    @Inject
    Kernel32 kernel;

    public Optional<WinNT.HANDLE> getBizhawkProcess() {
        WinNT.HANDLE hProcess = null;
        Tlhelp32.PROCESSENTRY32.ByReference entry = new Tlhelp32.PROCESSENTRY32.ByReference();

        WinNT.HANDLE snapshot = kernel.CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, new WinDef.DWORD(0));

        if (kernel.Process32First(snapshot, entry)) {
            while (kernel.Process32Next(snapshot, entry)) {
                if (new String(entry.szExeFile).trim().equalsIgnoreCase(EMU_HAWK_EXE)) {
                    hProcess = kernel.OpenProcess(WinNT.PROCESS_ALL_ACCESS, false, entry.th32ProcessID.intValue());
                }
            }
        }

        return Optional.ofNullable(hProcess);
    }

    public Pointer getRomStartAddrFromBizhawkProc(WinNT.HANDLE bizhawk) {

        WinNT.HANDLE snapshot = kernel.CreateToolhelp32Snapshot(TH32CS_SNAPMODULE, new WinDef.DWORD(kernel.GetProcessId(bizhawk)));
        Tlhelp32.MODULEENTRY32W.ByReference entry = new Tlhelp32.MODULEENTRY32W.ByReference();
        List<String> loadedModules = new ArrayList<>();
        if (kernel.Module32FirstW(snapshot, entry)) {
            while (kernel.Module32NextW(snapshot, entry)) {
                String module = new String(entry.szModule).trim();
                loadedModules.add(module);
                if (module.equalsIgnoreCase(MUPEN64PLUS_DLL)) {
                    return entry.modBaseAddr.share(ROM_OFFSET);
                }
            }
        }

        throw new IllegalStateException(String.format("No pointer for '%s' found, dll might not be loaded. Loaded modules found: %s", MUPEN64PLUS_DLL, loadedModules));
    }

    @Produces
    @RequestScoped
    public BizhawkRom produceRom() {
        WinNT.HANDLE bizhawk = getBizhawkProcess().get();

        return new BizhawkRom(bizhawk, getRomStartAddrFromBizhawkProc(bizhawk));
    }
}
