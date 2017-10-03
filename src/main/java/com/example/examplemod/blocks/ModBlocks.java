package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.rmi.registry.Registry;

/**
 * Created by LetsUsRush on 9/29/2017.
 */

@Mod.EventBusSubscriber
public class ModBlocks {

    public static final Block blockOne = new BlockOne();

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        IForgeRegistry<Block> r = e.getRegistry();

        r.register(blockOne);
    }
}