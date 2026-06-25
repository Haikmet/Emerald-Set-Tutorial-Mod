package net.haikmet.emeraldset.datagen;

import com.mojang.serialization.Codec;
import net.haikmet.emeraldset.EmeraldSets;
import net.haikmet.emeraldset.item.ModArmorMaterials;
import net.minecraft.client.data.models.EquipmentAssetProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import static net.minecraft.core.component.DataComponents.bootstrap;

public class ModEquipmentAssetGen extends EquipmentAssetProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetGen(PackOutput packOutput) {
        super(packOutput);
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(ModArmorMaterials.EMERALD_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, "emerald"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, "emerald")))
                        .addLayers(EquipmentClientInfo.LayerType.NAUTILUS_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(EmeraldSets.MOD_ID, "emerald")))
                        .build());
    }




    public CompletableFuture<?> run(final CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Emerald Sets Mod Assets Definition";
    }
}
