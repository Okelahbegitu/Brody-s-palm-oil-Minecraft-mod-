package net.palmoil.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.palmoil.PalmOilClient;

public class PalmOilFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PalmOilClient.init();
    }
}
