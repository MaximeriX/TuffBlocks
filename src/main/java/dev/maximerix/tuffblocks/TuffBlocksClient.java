package dev.maximerix.tuffblocks;

import net.fabricmc.api.ClientModInitializer;
import dev.maximerix.tuffblocks.block.ModBlocks;
import dev.maximerix.tuffblocks.item.ModItems;
import dev.maximerix.tuffblocks.sound.ModSounds;

public class TuffBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
    }
}