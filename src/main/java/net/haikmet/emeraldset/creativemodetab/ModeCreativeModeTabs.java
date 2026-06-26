package net.haikmet.emeraldset.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.haikmet.emeraldset.EmeraldSets;
import net.haikmet.emeraldset.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModeCreativeModeTabs {
    public static final CreativeModeTab EMERALD_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, "emerald_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(Items.EMERALD))
                    .title(Component.translatable("creativemodetab.emerald_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_HOE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_SPEAR);

                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);

                        output.accept(ModItems.EMERALD_HORSE_ARMOR);
                        output.accept(ModItems.EMERALD_NAUTILUS_ARMOR);
                    }).build());


    public static void registerCreativeTabs() {
        EmeraldSets.LOGGER.info("Registering Creative Tabs" + EmeraldSets.MOD_ID);

    }
}
