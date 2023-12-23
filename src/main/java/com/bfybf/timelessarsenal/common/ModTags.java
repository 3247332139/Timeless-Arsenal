package com.bfybf.timelessarsenal.common;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.ForgeRegistries;

import static com.simibubi.create.AllTags.forgeTag;

public class ModTags {

    public static TagKey<Fluid> forgeFluidTag(String path) {
        return forgeTag(ForgeRegistries.FLUIDS, path);
    }

    public static class Items {
        public static final TagKey<Item> THIN_SHEET = ItemTags.create(new ResourceLocation("timelessarsenal", "timelessarsenaltags"));
        public static final TagKey<Item> CASING = ItemTags.create(new ResourceLocation("timelessarsenal", "timelessarsenaltags"));

    }


}
