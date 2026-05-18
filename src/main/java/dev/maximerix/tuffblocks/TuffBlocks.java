package dev.maximerix.tuffblocks;

import net.fabricmc.api.ModInitializer;

import dev.maximerix.tuffblocks.block.ModBlocks;
import dev.maximerix.tuffblocks.item.ModItems;
import dev.maximerix.tuffblocks.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TuffBlocks implements ModInitializer {
	public static final String MOD_ID = "tuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		LOGGER.info("TuffBlocks fully loaded and ready to tuff up your world! :D");
	}
}