package de.dowinter.ootr.jna.pointers.objectives;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.dowinter.ootr.jna.pointers.constants.OotLocation;
import java.util.function.Supplier;

public abstract class Check {
    OotLocation location;
    Supplier<Boolean> checkDone;
    String name;
    String hints;

    public Check(OotLocation location, Supplier<Boolean> checkDone, String name, String hints) {
        this.location = location;
        this.checkDone = checkDone;
        this.name = name;
        this.hints = hints;
    }

    @Override
    public String toString() {
        return "Check{" +
                "location=" + location +
                ", checkDone=" + checkDone.get() +
                ", name='" + name + '\'' +
                ", hints='" + hints + '\'' +
                '}';
    }

    public OotLocation getLocation() {
        return location;
    }

    @JsonIgnore
    public Supplier<Boolean> getCheckDone() {
        return checkDone;
    }

    public String getName() {
        return name;
    }

    public String getHints() {
        return hints;
    }

    public boolean isDone() {
        return checkDone.get();
    }
}
