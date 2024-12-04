package net.maximerix.tuffblocks.init;

import net.maximerix.tuffblocks.block.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.TuffMod;

public class TuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TuffMod.MODID);
	public static final RegistryObject<Block> TUFF = REGISTRY.register("tuff", () -> new TuffBlock());
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
}
