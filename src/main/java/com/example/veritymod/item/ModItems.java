package com.example.veritymod.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static Item FLASHLIGHT;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

        FLASHLIGHT = new Item(new Item.Properties())
                .setRegistryName("flashlight");

        event.getRegistry().register(FLASHLIGHT);
    }
}
