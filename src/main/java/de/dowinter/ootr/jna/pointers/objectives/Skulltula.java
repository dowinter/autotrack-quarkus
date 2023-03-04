package de.dowinter.ootr.jna.pointers.objectives;

import de.dowinter.ootr.jna.pointers.constants.OotLocation;
import java.util.function.Supplier;

public class Skulltula extends Check {
    public Skulltula(OotLocation location, Supplier<Boolean> checkDone, String name) {
        super(location, checkDone, name, null);
    }
}
