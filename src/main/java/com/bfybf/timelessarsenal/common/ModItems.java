package com.bfybf.timelessarsenal.common;


import com.bfybf.timelessarsenal.timelessarsenal;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModItems {

    private static final CreateRegistrate REGISTRATE = timelessarsenal.REGISTRATE.creativeModeTab(() -> ModItemGroup.MAIN_GROUP);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, timelessarsenal.MOD_ID);

    public static final ItemEntry<Item>
            THIN_COPPER_SHEET = ingredient("thin_brass_sheet"),
            THIN_STEEL_SHEET = ingredient("thin_steel_sheet"),
            THIN_NETHERITE_STEEL_SHEET = ingredient("thin_netherite_steel_sheet"),
            STEEL_STANDARD_BULLET_CASING=ingredient("steel_standard_bullet_casing"),
            LARGE_BULLET_CASING=ingredient("large_bullet_casing"),
            NETHERITE_STEEL_HEAVY_BULLET_CASING=ingredient("netherite_steel_heavy_bullet_casing"),
            STANDARD_BULLET_CASING=ingredient("standard_bullet_casing"),
            SMALL_BULLET_CASING=ingredient("small_bullet_casing"),
            BULLET_PROJECTILE=ingredient("bullet_projectile"),
            SMALL_PILE_OF_GUNPOWDER=ingredient("small_pile_of_gunpowder"),
            SHOTGUN_SHELL=ingredient("shotgun_shell");

    public static final ItemEntry<Item>
            NATO_556_BULLET_CASING=ingredient("nato_556_bullet_casing"),
            BULLET_68_CASING=ingredient("bullet68_casing"),
            BULLET_308_CASING=ingredient("bullet308_casing"),
            BULLET_WIN_30_30_CASING=ingredient("win_30-30_casing"),
            B_762x54_CASING=ingredient("762x54_casing"),
            B_58x42_CASING=ingredient("58x42_casing"),
            B_762x39_CASING=ingredient("762x39_casing"),
            LAPUA338_CASING=ingredient("lapua338_casing"),
            B_9MM_ROUND_CASING=ingredient("9mm_round_casing"),
            ROUND45_CASING=ingredient("round45_casing"),
            B_762x25_CASING=ingredient("762x25_casing"),
            B_57x28_CASING=ingredient("57x28_casing"),
            B_46x30_CASING=ingredient("46x30_casing"),
            AE50_CASING=ingredient("ae50_casing"),
            B_MAGNUM_CASING=ingredient("b_magnum_casing"),
            B_50BMG_CASING=ingredient("50bmg_casing");



    public static final ItemEntry<SequencedAssemblyItem>

            INCOMPLETE_NATO_556_BULLET = sequencedIngredient("incomplete_nato_556_bullet"),
            INCOMPLETE_BULLET_68 = sequencedIngredient("incomplete_bullet68"),
            INCOMPLETE_BULLET_308 = sequencedIngredient("incomplete_bullet308"),
            INCOMPLETE_WIN_30_30 = sequencedIngredient("incomplete_win_30-30"),
            INCOMPLETE_B_762x54 = sequencedIngredient("incomplete_762x54"),
            INCOMPLETE_B_58x42 = sequencedIngredient("incomplete_58x42"),
            INCOMPLETE_B_762x39 = sequencedIngredient("incomplete_762x39"),
            INCOMPLETE_LAPUA338 = sequencedIngredient("incomplete_lapua338"),
            INCOMPLETE_B_9MM_ROUND = sequencedIngredient("incomplete_9mm_round"),
            INCOMPLETE_ROUND45 = sequencedIngredient("incomplete_round45"),
            INCOMPLETE_B_762x25 = sequencedIngredient("incomplete_762x25"),
            INCOMPLETE_B_57x28 = sequencedIngredient("incomplete_57x28"),
            INCOMPLETE_B_46x30 = sequencedIngredient("incomplete_46x30"),
            INCOMPLETE_AE50_CASING = sequencedIngredient("incomplete_ae50"),
            INCOMPLETE_B_MAGNUM = sequencedIngredient("incomplete_b_magnum"),
            INCOMPLETE_B_50BMG = sequencedIngredient("incomplete_50bmg");

    //create shortcut-------------------------------------------
    private static ItemEntry<Item> ingredient(String name) {
        return REGISTRATE.item(name, Item::new)
                .register();
    }

    private static ItemEntry<SequencedAssemblyItem> sequencedIngredient(String name) {
        return REGISTRATE.item(name, SequencedAssemblyItem::new)
                .register();
    }


    @SafeVarargs
    private static ItemEntry<Item> taggedIngredient(String name, TagKey<Item>... tags) {
        return REGISTRATE.item(name, Item::new)
                .tag(tags)
                .register();
    }
}
