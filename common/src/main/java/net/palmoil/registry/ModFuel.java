package net.palmoil.registry;

import dev.architectury.registry.fuel.FuelRegistry;

public class ModFuel
{
    public static void register(){
        FuelRegistry.register(2800, ModItem.PALM_OIL_FRUIT.get());
        FuelRegistry.register(6600, ModItem.PALM_OIL.get());
    }
}
