package net.maximerix.tuffblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
import net.maximerix.tuffblocks.TuffMod;

public class TuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TuffMod.MODID);
	public static final RegistryObject<Block> TUFF_STAIRS = REGISTRY.register("tuff_stairs", () -> new TuffStairsBlock());
	public static final RegistryObject<Block> TUFF_SLAB = REGISTRY.register("tuff_slab", () -> new TuffSlabBlock());
	public static final RegistryObject<Block> TUFF_WALL = REGISTRY.register("tuff_wall", () -> new TuffWallBlock());
	public static final RegistryObject<Block> CHISELED_TUFF = REGISTRY.register("chiseled_tuff", () -> new ChiseledTuffBlock());
	public static final RegistryObject<Block> POLISHED_TUFF = REGISTRY.register("polished_tuff", () -> new PolishedTuffBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = REGISTRY.register("polished_tuff_stairs", () -> new PolishedTuffStairsBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB = REGISTRY.register("polished_tuff_slab", () -> new PolishedTuffSlabBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_WALL = REGISTRY.register("polished_tuff_wall", () -> new PolishedTuffWallBlock());
	public static final RegistryObject<Block> TUFF_BRICKS = REGISTRY.register("tuff_bricks", () -> new TuffBricksBlock());
	public static final RegistryObject<Block> TUFF_BRICK_STAIRS = REGISTRY.register("tuff_brick_stairs", () -> new TuffBrickStairsBlock());
	public static final RegistryObject<Block> TUFF_BRICK_SLAB = REGISTRY.register("tuff_brick_slab", () -> new TuffBrickSlabBlock());
	public static final RegistryObject<Block> TUFF_BRICK_WALL = REGISTRY.register("tuff_brick_wall", () -> new TuffBrickWallBlock());
	public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = REGISTRY.register("chiseled_tuff_bricks", () -> new ChiseledTuffBricksBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TuffStairsBlock.registerRenderLayer();
			PolishedTuffBlock.registerRenderLayer();
			PolishedTuffStairsBlock.registerRenderLayer();
			TuffBricksBlock.registerRenderLayer();
			TuffBrickStairsBlock.registerRenderLayer();
			TuffBrickSlabBlock.registerRenderLayer();
			ChiseledTuffBricksBlock.registerRenderLayer();
		}
	}
}
