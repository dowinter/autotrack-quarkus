package de.dowinter.ootr.jna.pointers;

import com.sun.jna.Memory;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.ptr.IntByReference;
import de.dowinter.ootr.jna.BizhawkRom;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class OOTMemoryState {
    public static final long SAVE_OFFSET_BASE = 0x11A5D0;

    public static final long SKULLTULA_FLAGS_OFFSET =  0xE9C; //0x11B46C

    // marks end of save
    public static final long CHECKSUM_OFFSET = 0x1352;

    Memory buffer = new Memory(CHECKSUM_OFFSET);

    @Inject
    BizhawkRom rom;

    @Inject
    Kernel32 k32;

    public void refreshMemory() {
        IntByReference bytesRead = new IntByReference(0);
        k32.ReadProcessMemory(
                rom.getProcess(),
                rom.getRomStartAddress().share(SAVE_OFFSET_BASE),
                buffer,
                Long.valueOf(CHECKSUM_OFFSET).intValue(),
                bytesRead
        );

        System.out.println("bytesRead = " + bytesRead);
    }

    public byte getSkulltulaFlags(long sceneOffset) {
        return this.getByte(SKULLTULA_FLAGS_OFFSET + sceneOffset);
    }


    private short getShort(long offset) {
        return (short) (getByte(offset) << 8 | getByte(offset + 1));
    }
    private byte getByte(long offset) {
        long bytePos = offset % 4;
        int paddedInt = this.buffer.getInt(offset - bytePos);
        int shifted = paddedInt >> (24 - bytePos * 8);
        return (byte) (shifted & 0xFF);
    }

}
