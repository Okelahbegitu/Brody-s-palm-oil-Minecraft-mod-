package net.palmoil.forge;

import dev.architectury.platform.forge.EventBuses;
import net.palmoil.PalmOil;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PalmOil.MOD_ID)
public class PalmOilForge {
    public PalmOilForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PalmOil.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        PalmOil.init();
    }
}
