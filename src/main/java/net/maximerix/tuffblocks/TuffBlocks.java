package net.maximerix.tuffblocks;

import net.fabricmc.api.ModInitializer;

import net.maximerix.tuffblocks.block.ModBlocks;
import net.maximerix.tuffblocks.sound.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TuffBlocks implements ModInitializer {
	public static final String MOD_ID = "tuff";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		LOGGER.info("TuffBlocks successfully loaded!");
	}
}