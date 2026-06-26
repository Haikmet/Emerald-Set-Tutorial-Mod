package net.haikmet.emeraldset;

import net.fabricmc.api.ModInitializer;

import net.haikmet.emeraldset.creativemodetab.ModeCreativeModeTabs;
import net.haikmet.emeraldset.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldSets implements ModInitializer {
	public static final String MOD_ID = "emerald-sets";
 public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
 @Override
    public void onInitialize() {
	 	ModItems.registerModItems();
        ModeCreativeModeTabs.registerCreativeTabs();
	}
}
