package net.palmoil.registry.worldgen;

import terrablender.api.Regions;

public class ModTerrablender {
    public static void init() {
        Regions.register(new PalmOilRegion());
    }
}