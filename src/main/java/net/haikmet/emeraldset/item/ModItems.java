package net.haikmet.emeraldset.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.haikmet.emeraldset.EmeraldSets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.function.Function;

public class ModItems {
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties.sword(
        ModToolMaterials.EMERALD, 3, -2.4f)));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties.pickaxe(
            ModToolMaterials.EMERALD, 1, -2.8f)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(
            ModToolMaterials.EMERALD, 6, -3.2f, properties));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(
            ModToolMaterials.EMERALD, 1.5f, -3f, properties));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(
            ModToolMaterials.EMERALD, 0, -3f, properties));
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", properties -> new Item(properties.spear(
            ModToolMaterials.EMERALD,  1, 1, 0.6F, 3F, 10.5F,
            6.5F, 5.1F, 10.5F, 4.6F)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, name)))));

    }
    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerModItems() {
        EmeraldSets.LOGGER.info("Registering Mod Items" + EmeraldSets.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(ModItems.EMERALD_SWORD);
            output.accept(ModItems.EMERALD_PICKAXE);
            output.accept(ModItems.EMERALD_HOE);
            output.accept(ModItems.EMERALD_AXE);
            output.accept(ModItems.EMERALD_SHOVEL);
            output.accept(ModItems.EMERALD_SPEAR);
        });
    }
}
