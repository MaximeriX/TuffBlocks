package net.maximerix.tuffblocks.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.level.block.Block;
import net.maximerix.tuffblocks.block.TuffWallBlock;
import net.maximerix.tuffblocks.block.TuffStairsBlock;
import net.maximerix.tuffblocks.block.TuffSlabBlock;
import net.maximerix.tuffblocks.block.TuffBricksBlock;
import net.maximerix.tuffblocks.block.TuffBrickWallBlock;
import net.maximerix.tuffblocks.block.TuffBrickStairsBlock;
import net.maximerix.tuffblocks.block.TuffBrickSlabBlock;
import net.maximerix.tuffblocks.block.PolishedTuffWallBlock;
import net.maximerix.tuffblocks.block.PolishedTuffStairsBlock;
import net.maximerix.tuffblocks.block.PolishedTuffSlabBlock;
import net.maximerix.tuffblocks.block.PolishedTuffBlock;
import net.maximerix.tuffblocks.block.ChiseledTuffBricksBlock;
import net.maximerix.tuffblocks.block.ChiseledTuffBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TuffModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TUFF_STAIRS = register(new TuffStairsBlock());
	public static final Block TUFF_SLAB = register(new TuffSlabBlock());
	public static final Block TUFF_WALL = register(new TuffWallBlock());
	public static final Block CHISELED_TUFF = register(new ChiseledTuffBlock());
	public static final Block POLISHED_TUFF = register(new PolishedTuffBlock());
	public static final Block POLISHED_TUFF_STAIRS = register(new PolishedTuffStairsBlock());
	public static final Block POLISHED_TUFF_SLAB = register(new PolishedTuffSlabBlock());
	public static final Block POLISHED_TUFF_WALL = register(new PolishedTuffWallBlock());
	public static final Block TUFF_BRICKS = register(new TuffBricksBlock());
	public static final Block TUFF_BRICK_STAIRS = register(new TuffBrickStairsBlock());
	public static final Block TUFF_BRICK_SLAB = register(new TuffBrickSlabBlock());
	public static final Block TUFF_BRICK_WALL = register(new TuffBrickWallBlock());
	public static final Block CHISELED_TUFF_BRICKS = register(new ChiseledTuffBricksBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TuffWallBlock.registerRenderLayer();
			PolishedTuffWallBlock.registerRenderLayer();
			TuffBrickWallBlock.registerRenderLayer();
		}
	}
}
