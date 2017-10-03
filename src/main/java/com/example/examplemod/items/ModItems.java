package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by LetsUsRush on 10/2/2017.
 */

@Mod.EventBusSubscriber
public class ModItems {

    public static Item ItemLack = new ItemBase("Lack", true);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(ItemLack);
    }
}
