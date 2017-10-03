package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LetsUsRush on 10/2/2017.
 */
public class ItemBase extends Item {

    public ItemBase(String name, Boolean addToTab) {

        super();
        setUnlocalizedName(name);
        setRegistryName(ExampleMod.MODID + ":" + name);
        if (addToTab) { setCreativeTab(CreativeTabs.MATERIALS); }
    }
}
