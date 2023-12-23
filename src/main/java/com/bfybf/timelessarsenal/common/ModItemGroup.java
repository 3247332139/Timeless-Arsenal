package com.bfybf.timelessarsenal.common;

import com.bfybf.timelessarsenal.timelessarsenal;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroup {

    public static final CreativeModeTab MAIN_GROUP = new CreativeModeTab(timelessarsenal.MOD_ID + ".main_group")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
    private static final CreateRegistrate REGISTRATE = timelessarsenal.REGISTRATE
            .creativeModeTab(() -> MAIN_GROUP, "Timeless Arsenal");
}
