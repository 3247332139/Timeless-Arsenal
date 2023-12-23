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
            LARGE_BULLET_CASING=taggedIngredient("large_bullet_casing", ModTags.Items.CASING),
            STANDARD_BULLET_CASING=taggedIngredient("standard_bullet_casing", ModTags.Items.CASING),
            SMALL_BULLET_CASING=taggedIngredient("small_bullet_casing", ModTags.Items.CASING);

    public static final ItemEntry<Item>
            M_556MM_BULLET_CASING=taggedIngredient("556x45mm_bullet_casing", ModTags.Items.CASING);

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
