package net.maximerix.tuffblocks;

import net.fabricmc.api.ClientModInitializer;
import net.maximerix.tuffblocks.block.ModBlocks;
import net.maximerix.tuffblocks.item.ModItems;
import net.maximerix.tuffblocks.sound.ModSounds;

public class TuffBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
    }
}
