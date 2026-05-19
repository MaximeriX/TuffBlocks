package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = TuffMod.MODID, value = Side.CLIENT)
public final class TuffModels {
    @SubscribeEvent
    public static void register(ModelRegistryEvent event) {
        reg(TuffBlocks.TUFF);
        reg(TuffBlocks.TUFF_STAIRS);
        reg(TuffBlocks.TUFF_SLAB);
        reg(TuffBlocks.TUFF_WALL);
        reg(TuffBlocks.CHISELED_TUFF);

        reg(TuffBlocks.POLISHED_TUFF);
        reg(TuffBlocks.POLISHED_TUFF_STAIRS);
        reg(TuffBlocks.POLISHED_TUFF_SLAB);
        reg(TuffBlocks.POLISHED_TUFF_WALL);

        reg(TuffBlocks.TUFF_BRICKS);
        reg(TuffBlocks.TUFF_BRICK_STAIRS);
        reg(TuffBlocks.TUFF_BRICK_SLAB);
        reg(TuffBlocks.TUFF_BRICK_WALL);
        reg(TuffBlocks.CHISELED_TUFF_BRICKS);
    }

    private static void reg(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    private TuffModels() {}
}
