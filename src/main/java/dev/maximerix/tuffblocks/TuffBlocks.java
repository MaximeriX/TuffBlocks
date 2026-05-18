package dev.maximerix.tuffblocks;

import net.fabricmc.api.ModInitializer;

import dev.maximerix.tuffblocks.block.ModBlocks;
import dev.maximerix.tuffblocks.sound.ModSounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TuffBlocks implements ModInitializer {
	public static final String MOD_ID = "tuff";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		LOGGER.info("TuffBlocks fully loaded and ready to tuff up your world! :D");
	}
}