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

                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET)
                        .pattern("EEE")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE)
                        .pattern("E E")
                        .pattern("EEE")
                        .pattern("EEE")
                        .define('E', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS)
                        .pattern("EEE")
                        .pattern("E E")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS)
                        .pattern("E E")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HORSE_ARMOR)
                        .pattern("L E")
                        .pattern("EEE")
                        .pattern("E E")
                        .define('E', Items.EMERALD)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR)
                        .pattern("L D")
                        .pattern("DDD")
                        .pattern("D D")
                        .define('D', Items.DIAMOND)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.COPPER_HORSE_ARMOR)
                        .pattern("L C")
                        .pattern("CCC")
                        .pattern("C C")
                        .define('C', Items.COPPER_INGOT)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR)
                        .pattern("L I")
                        .pattern("III")
                        .pattern("I I")
                        .define('I', Items.IRON_INGOT)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR)
                        .pattern("L G")
                        .pattern("GGG")
                        .pattern("G G")
                        .define('G', Items.GOLD_INGOT)
                        .define('L', Items.LEATHER)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output);

                shaped(RecipeCategory.COMBAT, ModItems.EMERALD_NAUTILUS_ARMOR)
                        .pattern(" E ")
                        .pattern("ENE")
                        .pattern(" E ")
                        .define('E', Items.EMERALD)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.COPPER_NAUTILUS_ARMOR)
                        .pattern(" C ")
                        .pattern("CNC")
                        .pattern(" C ")
                        .define('C', Items.COPPER_INGOT)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.IRON_NAUTILUS_ARMOR)
                        .pattern(" I ")
                        .pattern("INI")
                        .pattern(" I ")
                        .define('I', Items.IRON_INGOT)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.GOLDEN_NAUTILUS_ARMOR)
                        .pattern(" G ")
                        .pattern("GNG")
                        .pattern(" G ")
                        .define('G', Items.GOLD_INGOT)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);
                shaped(RecipeCategory.COMBAT, Items.DIAMOND_NAUTILUS_ARMOR)
                        .pattern(" D ")
                        .pattern("DND")
                        .pattern(" D ")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NAUTILUS_SHELL)
                        .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Emerald Set Mod Recipes";
    }
}