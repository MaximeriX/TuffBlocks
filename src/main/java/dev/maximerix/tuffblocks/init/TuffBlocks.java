package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import dev.maximerix.tuffblocks.blocks.*;

public class TuffBlocks {
	public static final DeferredRegister<Block> REGISTRY =
			DeferredRegister.create(ForgeRegistries.BLOCKS, TuffMod.MODID);

	public static final RegistryObject<Block> TUFF_STAIRS =
			REGISTRY.register("tuff_stairs", TuffStairs::new);
	public static final RegistryObject<Block> TUFF_SLAB =
			REGISTRY.register("tuff_slab", TuffSlab::new);
	public static final RegistryObject<Block> TUFF_WALL =
			REGISTRY.register("tuff_wall", TuffWall::new);
	public static final RegistryObject<Block> CHISELED_TUFF =
			REGISTRY.register("chiseled_tuff", ChiseledTuff::new);

	public static final RegistryObject<Block> POLISHED_TUFF =
			REGISTRY.register("polished_tuff", PolishedTuff::new);
	public static final RegistryObject<Block> POLISHED_TUFF_STAIRS =
			REGISTRY.register("polished_tuff_stairs", PolishedTuffStairs::new);
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB =
			REGISTRY.register("polished_tuff_slab", PolishedTuffSlab::new);
	public static final RegistryObject<Block> POLISHED_TUFF_WALL =
			REGISTRY.register("polished_tuff_wall", PolishedTuffWall::new);

	public static final RegistryObject<Block> TUFF_BRICKS =
			REGISTRY.register("tuff_bricks", TuffBricks::new);
	public static final RegistryObject<Block> TUFF_BRICK_STAIRS =
			REGISTRY.register("tuff_brick_stairs", TuffBrickStairs::new);
	public static final RegistryObject<Block> TUFF_BRICK_SLAB =
			REGISTRY.register("tuff_brick_slab", TuffBrickSlab::new);
	public static final RegistryObject<Block> TUFF_BRICK_WALL =
			REGISTRY.register("tuff_brick_wall", TuffBrickWall::new);
	public static final RegistryObject<Block> CHISELED_TUFF_BRICKS =
			REGISTRY.register("chiseled_tuff_bricks", ChiseledTuffBricks::new);
}