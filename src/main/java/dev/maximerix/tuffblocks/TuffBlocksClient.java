package dev.maximerix.tuffblocks;

import net.fabricmc.api.ClientModInitializer;
import dev.maximerix.tuffblocks.block.ModBlocks;
import dev.maximerix.tuffblocks.sound.ModSounds;

public class TuffBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
    }
}