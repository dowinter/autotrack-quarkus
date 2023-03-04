package de.dowinter.ootr.jna;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinNT;

public class BizhawkRom {
    private final WinNT.HANDLE process;
    Pointer romStartAddress;

    public BizhawkRom(WinNT.HANDLE process, Pointer romStartAddress) {
        this.process = process;
        this.romStartAddress = romStartAddress;
    }

    public Pointer getRomStartAddress() {
        return romStartAddress;
    }

    public WinNT.HANDLE getProcess() {
        return process;
    }
}
