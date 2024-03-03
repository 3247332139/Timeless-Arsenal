package com.bfybf.timelessarsenal;

import com.bfybf.timelessarsenal.common.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(timelessarsenal.MOD_ID)
public class timelessarsenal
{

    public static final String MOD_ID = "timelessarsenal";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public timelessarsenal()
    {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modbus);
        REGISTRATE.registerEventListeners(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
