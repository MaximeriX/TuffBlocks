package net.maximerix.tuffblocks;

import net.fabricmc.api.ModInitializer;

import net.maximerix.tuffblocks.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TuffBlocks implements ModInitializer {
	public static final String MOD_ID = "tuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("TuffBlocks successfully loaded!");
		ModBlocks.registerModBlocks();
	}
}