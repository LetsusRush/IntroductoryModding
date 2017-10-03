package com.example.examplemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by LetsUsRush on 9/29/2017.
 */

// The extends makes the client run everything just as the common
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e){
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e){
        super.postInit(e);
    }
}
