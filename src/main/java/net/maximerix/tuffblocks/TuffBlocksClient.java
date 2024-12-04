package net.maximerix.tuffblocks;

import net.fabricmc.api.ClientModInitializer;
import net.maximerix.tuffblocks.block.ModBlocks;
import net.maximerix.tuffblocks.sound.ModSounds;

public class TuffBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
    }
}