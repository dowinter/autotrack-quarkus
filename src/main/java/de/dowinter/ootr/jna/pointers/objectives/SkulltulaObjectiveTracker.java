package de.dowinter.ootr.jna.pointers.objectives;

import de.dowinter.ootr.jna.pointers.OOTMemoryState;
import de.dowinter.ootr.jna.pointers.constants.OotLocation;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class SkulltulaObjectiveTracker {

    @Inject
    OOTMemoryState memoryState;

    @Produces
    @ApplicationScoped
    List<Skulltula> produceSkulltulaChecks() {
        return List.of(
                new Skulltula(OotLocation.KOKIRI_FOREST, () -> this.skulltulaCheck(0x0C, 0), "GS in soft soil"),
                new Skulltula(OotLocation.KOKIRI_FOREST, () -> this.skulltulaCheck(0x0C, 1), "GS on Know-it-All's House"),
                new Skulltula(OotLocation.KOKIRI_FOREST, () -> this.skulltulaCheck(0x0C, 2), "GS on Twin's House"),
                new Skulltula(OotLocation.LOST_WOODS, () -> this.skulltulaCheck(0x0D, 0), "GS soft soil by bridge"),
                new Skulltula(OotLocation.LOST_WOODS, () -> this.skulltulaCheck(0x0D, 1), "GS soft soil by theater"),
                new Skulltula(OotLocation.LOST_WOODS, () -> this.skulltulaCheck(0x0D, 2), "GS above theater"),
                new Skulltula(OotLocation.SACRED_FOREST_MEADOW, () -> this.skulltulaCheck(0x0D, 3), "GS on wall"),
                new Skulltula(OotLocation.DEKU_TREE, () -> this.skulltulaCheck(0x00, 3), "GS in compass room"),
                new Skulltula(OotLocation.DEKU_TREE, () -> this.skulltulaCheck(0x00, 2), "GS on basement vines"),
                new Skulltula(OotLocation.DEKU_TREE, () -> this.skulltulaCheck(0x00, 1), "GS on basement gate"),
                new Skulltula(OotLocation.DEKU_TREE, () -> this.skulltulaCheck(0x00, 0), "GS in basement bomb wall room"),
                new Skulltula(OotLocation.FOREST_TEMPLE, () -> this.skulltulaCheck(0x03, 0), "GS in raised island courtyard"),
                new Skulltula(OotLocation.FOREST_TEMPLE, () -> this.skulltulaCheck(0x03, 1), "GS in entry room"),
                new Skulltula(OotLocation.FOREST_TEMPLE, () -> this.skulltulaCheck(0x03, 2), "GS in level island courtyard"),
                new Skulltula(OotLocation.FOREST_TEMPLE, () -> this.skulltulaCheck(0x03, 3), "GS in lobby"),
                new Skulltula(OotLocation.FOREST_TEMPLE, () -> this.skulltulaCheck(0x03, 4), "GS in basement"),
                new Skulltula(OotLocation.HYRULE_FIELD, () -> this.skulltulaCheck(0x0A, 0), "GS in cow grotto"),
                new Skulltula(OotLocation.HYRULE_FIELD, () -> this.skulltulaCheck(0x0A, 1), "GS in grotto near Kakariko"),
                new Skulltula(OotLocation.LON_LON_RANCH, () -> this.skulltulaCheck(0x0B, 0), "GS in on outer wall"),
                new Skulltula(OotLocation.LON_LON_RANCH, () -> this.skulltulaCheck(0x0B, 1), "GS in back of corral wall"),
                new Skulltula(OotLocation.LON_LON_RANCH, () -> this.skulltulaCheck(0x0B, 2), "GS on house window"),
                new Skulltula(OotLocation.LON_LON_RANCH, () -> this.skulltulaCheck(0x0B, 3), "GS in tree"),
                new Skulltula(OotLocation.MARKET, () -> this.skulltulaCheck(0x0E, 3), "GS guard house crate"),
                new Skulltula(OotLocation.HYRULE_CASTLE, () -> this.skulltulaCheck(0x0E, 1), "GS in storms grotto"),
                new Skulltula(OotLocation.HYRULE_CASTLE, () -> this.skulltulaCheck(0x0E, 2), "GS in tree"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 1), "GS on guard's house"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 2), "GS on watchtower"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 3), "GS on construction site"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 4), "GS on Skulltula house"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 5), "GS in tree"),
                new Skulltula(OotLocation.KAKARIKO, () -> this.skulltulaCheck(0x10, 6), "GS above Impa's house"),
                new Skulltula(OotLocation.GRAVEYARD, () -> this.skulltulaCheck(0x10, 0), "GS in soft soil"),
                new Skulltula(OotLocation.GRAVEYARD, () -> this.skulltulaCheck(0x10, 7), "GS on wall"),
                new Skulltula(OotLocation.BOTW, () -> this.skulltulaCheck(0x08, 0), "GS in like like cage"),
                new Skulltula(OotLocation.BOTW, () -> this.skulltulaCheck(0x08, 1), "GS East inner room"),
                new Skulltula(OotLocation.BOTW, () -> this.skulltulaCheck(0x08, 2), "GS West inner room"),
                new Skulltula(OotLocation.SHADOW_TEMPLE, () -> this.skulltulaCheck(0x07, 0), "GS in single giant pot"),
                new Skulltula(OotLocation.SHADOW_TEMPLE, () -> this.skulltulaCheck(0x07, 1), "GS in falling spikes room"),
                new Skulltula(OotLocation.SHADOW_TEMPLE, () -> this.skulltulaCheck(0x07, 2), "GS in triple giant pot"),
                new Skulltula(OotLocation.SHADOW_TEMPLE, () -> this.skulltulaCheck(0x07, 3), "GS in invisible scythe room"),
                new Skulltula(OotLocation.SHADOW_TEMPLE, () -> this.skulltulaCheck(0x07, 4), "GS near ship"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_TRAIL, () -> this.skulltulaCheck(0x0F, 1), "GS in soft soil"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_TRAIL, () -> this.skulltulaCheck(0x0F, 2), "GS in bombable wall by Kakariko"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_TRAIL, () -> this.skulltulaCheck(0x0F, 3), "GS on ledge above Dodongo's Cavern"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_TRAIL, () -> this.skulltulaCheck(0x0F, 4), "GS on falling rocks path"),
                new Skulltula(OotLocation.GORON_CITY, () -> this.skulltulaCheck(0x0F, 5), "GS on center platform"),
                new Skulltula(OotLocation.GORON_CITY, () -> this.skulltulaCheck(0x0F, 6), "GS in rock maze crate"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_CRATER, () -> this.skulltulaCheck(0x0F, 7), "GS in entrance crate"),
                new Skulltula(OotLocation.DEATH_MOUNTAIN_CRATER, () -> this.skulltulaCheck(0x0F, 0), "GS in soft soil"),
                new Skulltula(OotLocation.DODONGOS_CAVERN, () -> this.skulltulaCheck(0x01, 4), "GS in side room by lower lizalfos"),
                new Skulltula(OotLocation.DODONGOS_CAVERN, () -> this.skulltulaCheck(0x01, 1), "GS in scarecrow hallway"),
                new Skulltula(OotLocation.DODONGOS_CAVERN, () -> this.skulltulaCheck(0x01, 2), "GS in alcove above falling stairs"),
                new Skulltula(OotLocation.DODONGOS_CAVERN, () -> this.skulltulaCheck(0x01, 0), "GS on vines in falling stairs room"),
                new Skulltula(OotLocation.DODONGOS_CAVERN, () -> this.skulltulaCheck(0x01, 3), "GS in back room"),
                new Skulltula(OotLocation.FIRE_TEMPLE, () -> this.skulltulaCheck(0x04, 0), "GS in song of time room"),
                new Skulltula(OotLocation.FIRE_TEMPLE, () -> this.skulltulaCheck(0x04, 1), "GS in boss key loop"),
                new Skulltula(OotLocation.FIRE_TEMPLE, () -> this.skulltulaCheck(0x04, 2), "GS in boulder maze room"),
                new Skulltula(OotLocation.FIRE_TEMPLE, () -> this.skulltulaCheck(0x04, 3), "GS at scarecrow top"),
                new Skulltula(OotLocation.FIRE_TEMPLE, () -> this.skulltulaCheck(0x04, 4), "GS at scarecrow climb"),
                new Skulltula(OotLocation.ZORA_RIVER, () -> this.skulltulaCheck(0x11, 0), "GS on ladder"),
                new Skulltula(OotLocation.ZORA_RIVER, () -> this.skulltulaCheck(0x11, 1), "GS in tree"),
                new Skulltula(OotLocation.ZORA_RIVER, () -> this.skulltulaCheck(0x11, 3), "GS on wall above bridge"),
                new Skulltula(OotLocation.ZORA_RIVER, () -> this.skulltulaCheck(0x11, 4), "GS on wall by upper grottos"),
                new Skulltula(OotLocation.ZORA_DOMAIN, () -> this.skulltulaCheck(0x11, 6), "GS by frozen waterfall"),
                new Skulltula(OotLocation.ZORA_FOUNTAIN, () -> this.skulltulaCheck(0x11, 2), "GS above log"),
                new Skulltula(OotLocation.ZORA_FOUNTAIN, () -> this.skulltulaCheck(0x11, 7), "GS in tree"),
                new Skulltula(OotLocation.ZORA_FOUNTAIN, () -> this.skulltulaCheck(0x11, 5), "GS in hidden cave"),
                new Skulltula(OotLocation.JABU, () -> this.skulltulaCheck(0x02, 0), "GS in lobby basement (lower 1/2)"),
                new Skulltula(OotLocation.JABU, () -> this.skulltulaCheck(0x02, 1), "GS in lobby basement (upper 2/2)"),
                new Skulltula(OotLocation.JABU, () -> this.skulltulaCheck(0x02, 2), "GS near boss room"),
                new Skulltula(OotLocation.JABU, () -> this.skulltulaCheck(0x02, 3), "GS in water switch room"),
                new Skulltula(OotLocation.ICE_CAVERN, () -> this.skulltulaCheck(0x09, 0), "GS in push block room"),
                new Skulltula(OotLocation.ICE_CAVERN, () -> this.skulltulaCheck(0x09, 1), "GS in spinning scythe room"),
                new Skulltula(OotLocation.ICE_CAVERN, () -> this.skulltulaCheck(0x09, 2), "GS in iced HP room"),
                new Skulltula(OotLocation.LAKE_HYLIA, () -> this.skulltulaCheck(0x12, 0), "GS in soft soil"),
                new Skulltula(OotLocation.LAKE_HYLIA, () -> this.skulltulaCheck(0x12, 1), "GS on fire arrow island"),
                new Skulltula(OotLocation.LAKE_HYLIA, () -> this.skulltulaCheck(0x12, 2), "GS on lab wall"),
                new Skulltula(OotLocation.LAKE_HYLIA, () -> this.skulltulaCheck(0x12, 3), "GS in lab crate"),
                new Skulltula(OotLocation.LAKE_HYLIA, () -> this.skulltulaCheck(0x12, 4), "GS in big tree"),
                new Skulltula(OotLocation.WATER_TEMPLE, () -> this.skulltulaCheck(0x05, 0), "GS behind gate"),
                new Skulltula(OotLocation.WATER_TEMPLE, () -> this.skulltulaCheck(0x05, 1), "GS in falling platforms room"),
                new Skulltula(OotLocation.WATER_TEMPLE, () -> this.skulltulaCheck(0x05, 2), "GS in central pillar room"),
                new Skulltula(OotLocation.WATER_TEMPLE, () -> this.skulltulaCheck(0x05, 3), "GS near boss key room"),
                new Skulltula(OotLocation.WATER_TEMPLE, () -> this.skulltulaCheck(0x05, 4), "GS in river room"),
                new Skulltula(OotLocation.GERUDO_VALLEY, () -> this.skulltulaCheck(0x13, 0), "GS in soft soil"),
                new Skulltula(OotLocation.GERUDO_VALLEY, () -> this.skulltulaCheck(0x13, 1), "GS by entry bridge"),
                new Skulltula(OotLocation.GERUDO_VALLEY, () -> this.skulltulaCheck(0x13, 2), "GS on pillar"),
                new Skulltula(OotLocation.GERUDO_VALLEY, () -> this.skulltulaCheck(0x13, 3), "GS behind tent"),
                new Skulltula(OotLocation.GERUDO_FORTRESS, () -> this.skulltulaCheck(0x14, 0), "GS on far archery target"),
                new Skulltula(OotLocation.GERUDO_FORTRESS, () -> this.skulltulaCheck(0x14, 1), "GS at top of fortress"),
                new Skulltula(OotLocation.HAUNTED_WASTELAND, () -> this.skulltulaCheck(0x15, 1), "GS in shelter"),
                new Skulltula(OotLocation.DESERT_COLOSSUS, () -> this.skulltulaCheck(0x15, 0), "GS in soft soil"),
                new Skulltula(OotLocation.DESERT_COLOSSUS, () -> this.skulltulaCheck(0x15, 2), "GS on hill"),
                new Skulltula(OotLocation.DESERT_COLOSSUS, () -> this.skulltulaCheck(0x15, 3), "GS on tree"),
                new Skulltula(OotLocation.SPIRIT_TEMPLE, () -> this.skulltulaCheck(0x06, 0), "GS in hall after sun block room"),
                new Skulltula(OotLocation.SPIRIT_TEMPLE, () -> this.skulltulaCheck(0x06, 1), "GS in boulder room (SoT)"),
                new Skulltula(OotLocation.SPIRIT_TEMPLE, () -> this.skulltulaCheck(0x06, 2), "GS in lobby"),
                new Skulltula(OotLocation.SPIRIT_TEMPLE, () -> this.skulltulaCheck(0x06, 3), "GS on sun room floor"),
                new Skulltula(OotLocation.SPIRIT_TEMPLE, () -> this.skulltulaCheck(0x06, 4), "GS on metal fence"),
                new Skulltula(OotLocation.OUTSIDE_GANON, () -> this.skulltulaCheck(0x0E, 0), "GS outside on pillar")
                );
    }

    private long mapSkulltulaSceneToArrayIndex(long i) {
        return (i + 3) - 2 * (i % 4);
    }

    private boolean skulltulaCheck(long sceneOffset, int bitToCheck) {
        byte bitMask = (byte) (1 << bitToCheck);

        memoryState.refreshMemory();

        var mappedOffset = mapSkulltulaSceneToArrayIndex(sceneOffset);
        var skullflags = memoryState.getSkulltulaFlags(mappedOffset);

        return (skullflags & bitMask) != 0;
    }


}
