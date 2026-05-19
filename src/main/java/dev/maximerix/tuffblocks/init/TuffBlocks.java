package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import dev.maximerix.tuffblocks.block.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TuffBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, TuffMod.MODID);

	public static final RegistryObject<Block> TUFF = BLOCKS.register("tuff", Tuff::new);
	public static final RegistryObject<Block> TUFF_STAIRS = BLOCKS.register("tuff_stairs", TuffStairs::new);
	public static final RegistryObject<Block> TUFF_SLAB = BLOCKS.register("tuff_slab", TuffSlab::new);
	public static final RegistryObject<Block> TUFF_WALL = BLOCKS.register("tuff_wall", TuffWall::new);
	public static final RegistryObject<Block> CHISELED_TUFF = BLOCKS.register("chiseled_tuff", ChiseledTuff::new);

	public static final RegistryObject<Block> POLISHED_TUFF = BLOCKS.register("polished_tuff", PolishedTuff::new);
	public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", PolishedTuffStairs::new);
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", PolishedTuffSlab::new);
	public static final RegistryObject<Block> POLISHED_TUFF_WALL = BLOCKS.register("polished_tuff_wall", PolishedTuffWall::new);

	public static final RegistryObject<Block> TUFF_BRICKS = BLOCKS.register("tuff_bricks", TuffBricks::new);
	public static final RegistryObject<Block> TUFF_BRICK_STAIRS = BLOCKS.register("tuff_brick_stairs", TuffBrickStairs::new);
	public static final RegistryObject<Block> TUFF_BRICK_SLAB = BLOCKS.register("tuff_brick_slab", TuffBrickSlab::new);
	public static final RegistryObject<Block> TUFF_BRICK_WALL = BLOCKS.register("tuff_brick_wall", TuffBrickWall::new);
	public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = BLOCKS.register("chiseled_tuff_bricks", ChiseledTuffBricks::new);
}