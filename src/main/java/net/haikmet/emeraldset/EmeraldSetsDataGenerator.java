package net.haikmet.emeraldset;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.haikmet.emeraldset.datagen.ModEquipmentAssetGen;
import net.haikmet.emeraldset.datagen.ModItemTagsGen;
import net.haikmet.emeraldset.datagen.ModModelGen;
import net.haikmet.emeraldset.datagen.ModRecipeGen;

public class EmeraldSetsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelGen::new);
		pack.addProvider(ModItemTagsGen::new);
		pack.addProvider(ModRecipeGen::new);
		pack.addProvider((FabricDataGenerator.Pack.Factory<ModEquipmentAssetGen>) ModEquipmentAssetGen::new);
	}
}
