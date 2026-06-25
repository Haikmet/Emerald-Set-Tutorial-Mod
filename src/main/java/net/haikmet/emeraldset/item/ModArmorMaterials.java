package net.haikmet.emeraldset.item;

import net.haikmet.emeraldset.EmeraldSets;
import net.haikmet.emeraldset.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(REGISTRY_KEY,
            Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, "emerald"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(25,
            ArmorMaterials.makeDefense(3, 5, 7, 3, 10),
            10, SoundEvents.ARMOR_EQUIP_GENERIC, 1, 0, ModTags.Items.EMERALD_REPAIR, EMERALD_KEY);
}
