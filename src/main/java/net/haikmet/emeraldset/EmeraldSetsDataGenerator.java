package net.haikmet.emeraldset;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.haikmet.emeraldset.datagen.ModItemTagsGen;
import net.haikmet.emeraldset.datagen.ModModelGen;

public class EmeraldSetsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelGen::new);
		pack.addProvider(ModItemTagsGen::new);
	}
}
