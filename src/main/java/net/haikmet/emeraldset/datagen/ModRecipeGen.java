package net.haikmet.emeraldset.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.haikmet.emeraldset.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGen extends FabricRecipeProvider {
    public ModRecipeGen(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD)
                        .pattern("E")
                        .pattern("E")
                        .pattern("S")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SPEAR)
                        .pattern("  E")
                        .pattern(" S ")
                        .pattern("S  ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE)
                        .pattern("EEE")
                        .pattern(" S ")
                        .pattern(" S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE)
                        .pattern("EE")
                        .pattern("SE")
                        .pattern("S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE)
                        .pattern("EE")
                        .pattern("S ")
                        .pattern("S ")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);
                shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL)
                        .pattern("E")
                        .pattern("S")
                        .pattern("S")
                        .define('E', Items.EMERALD)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.STICK))
                        .save(output);







            }
        };
    }

    @Override
    public String getName() {
        return "Emerald Set Mod Recipes";
    }
}