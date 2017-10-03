package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by LetsUsRush on 9/29/2017.
 */

public class BlockOne extends Block {

    public BlockOne() {

        super(Material.ROCK);
        setUnlocalizedName(ExampleMod.MODID + ":blockone");
        setRegistryName("blockone");
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}