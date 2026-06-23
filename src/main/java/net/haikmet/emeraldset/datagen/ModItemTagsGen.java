package net.haikmet.emeraldset.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.haikmet.emeraldset.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGen extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.EMERALD_SWORD));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.EMERALD_AXE));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.EMERALD_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.EMERALD_SHOVEL));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.EMERALD_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.EMERALD_SPEAR));

    }
}
