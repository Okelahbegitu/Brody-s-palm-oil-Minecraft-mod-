package net.palmoil.fabric;

import net.palmoil.PalmOil;
import net.fabricmc.api.ModInitializer;
import net.palmoil.PalmOilClient;

public class PalmOilFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PalmOil.init();
    }
}
