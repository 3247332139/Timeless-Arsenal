package com.bfybf.timelessarsenal.common;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> THIN_SHEET = ItemTags.create(new ResourceLocation("timelessarsenal", "timelessarsenaltags"));
        public static final TagKey<Item> CASE = ItemTags.create(new ResourceLocation("timelessarsenal", "timelessarsenaltags"));

    }

}
