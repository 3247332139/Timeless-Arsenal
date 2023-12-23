package com.bfybf.timelessarsenal.common;


import com.bfybf.timelessarsenal.timelessarsenal;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.recipe.CompatMetals;
import com.simibubi.create.foundation.item.TagDependentIngredientItem;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.simibubi.create.AllTags.AllItemTags.CRUSHED_RAW_MATERIALS;


public class ModItems {

    private static final CreateRegistrate REGISTRATE = timelessarsenal.REGISTRATE.creativeModeTab(() -> ModItemGroup.MAIN_GROUP);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, timelessarsenal.MOD_ID);

    public static final ItemEntry<Item>
            THIN_COPPER_SHEET = taggedIngredient("thin_brass_sheet", ModTags.Items.THIN_SHEET),
            THIN_STEEL_SHEET = taggedIngredient("thin_steel_sheet", ModTags.Items.THIN_SHEET),
            STEEL_STANDARD_BULLET_CASING=taggedIngredient("steel_standard_bullet_casing"),
            LARGE_BULLET_CASING=taggedIngredient("large_bullet_casing"),
            STANDARD_BULLET_CASING=taggedIngredient("standard_bullet_casing"),
            SMALL_BULLET_CASING=taggedIngredient("small_bullet_casing"),
            BULLET_PROJECTILE=taggedIngredient("bullet_projectile"),
            SMALL_PILE_OF_GUNPOWDER=taggedIngredient("small_pile_of_gunpowder");

    public static final ItemEntry<Item>
            NATO_556_BULLET_CASING=taggedIngredient("nato_556_bullet_casing", ModTags.Items.CASING),
            BULLET_68_CASING=taggedIngredient("bullet68_casing", ModTags.Items.CASING),
            BULLET_308_CASING=taggedIngredient("bullet308_casing", ModTags.Items.CASING),
            B_762x54_CASING=taggedIngredient("762x54_casing", ModTags.Items.CASING),
            B_58x42_CASING=taggedIngredient("58x42_casing", ModTags.Items.CASING),
            B_762x39_CASING=taggedIngredient("762x39_casing", ModTags.Items.CASING);

    public static final ItemEntry<SequencedAssemblyItem>

            INCOMPLETE_NATO_556_BULLET = sequencedIngredient("incomplete_nato_556_bullet"),
            INCOMPLETE_BULLET_68 = sequencedIngredient("incomplete_bullet68"),
            INCOMPLETE_BULLET_308 = sequencedIngredient("incomplete_bullet308"),
            INCOMPLETE_B_762x54 = sequencedIngredient("incomplete_762x54"),
            INCOMPLETE_B_58x42 = sequencedIngredient("incomplete_58x42"),
             INCOMPLETE_B_762x39 = sequencedIngredient("incomplete_762x39");

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

    private static ItemEntry<TagDependentIngredientItem> compatCrushedOre(CompatMetals metal) {
        String metalName = metal.getName();
        return REGISTRATE
                .item("crushed_raw_" + metalName,
                        props -> new TagDependentIngredientItem(props, AllTags.forgeItemTag("ores/" + metalName)))
                .tag(CRUSHED_RAW_MATERIALS.tag)
                .register();
    }
}
