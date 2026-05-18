package dev.maximerix.tuffblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import dev.maximerix.tuffblocks.blocks.TuffWall;
import dev.maximerix.tuffblocks.blocks.TuffStairs;
import dev.maximerix.tuffblocks.blocks.TuffSlab;
import dev.maximerix.tuffblocks.blocks.TuffBricks;
import dev.maximerix.tuffblocks.blocks.TuffBrickWall;
import dev.maximerix.tuffblocks.blocks.TuffBrickStairs;
import dev.maximerix.tuffblocks.blocks.TuffBrickSlab;
import dev.maximerix.tuffblocks.blocks.PolishedTuffWall;
import dev.maximerix.tuffblocks.blocks.PolishedTuffStairs;
import dev.maximerix.tuffblocks.blocks.PolishedTuffSlab;
import dev.maximerix.tuffblocks.blocks.PolishedTuff;
import dev.maximerix.tuffblocks.blocks.ChiseledTuffBricks;
import dev.maximerix.tuffblocks.blocks.ChiseledTuff;
import dev.maximerix.tuffblocks.TuffMod;

public class TuffBlocks {
	public static final DeferredRegister<Block>
			REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TuffMod.MODID);
	public static final RegistryObject<Block> TUFF_STAIRS =
			REGISTRY.register("tuff_stairs", () -> new TuffStairs());
	public static final RegistryObject<Block> TUFF_SLAB =
			REGISTRY.register("tuff_slab", () -> new TuffSlab());
	public static final RegistryObject<Block> TUFF_WALL =
			REGISTRY.register("tuff_wall", () -> new TuffWall());
	public static final RegistryObject<Block> CHISELED_TUFF =
			REGISTRY.register("chiseled_tuff", () -> new ChiseledTuff());

	public static final RegistryObject<Block> POLISHED_TUFF =
			REGISTRY.register("polished_tuff", () -> new PolishedTuff());
	public static final RegistryObject<Block> POLISHED_TUFF_STAIRS =
			REGISTRY.register("polished_tuff_stairs", () -> new PolishedTuffStairs());
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB =
			REGISTRY.register("polished_tuff_slab", () -> new PolishedTuffSlab());
	public static final RegistryObject<Block> POLISHED_TUFF_WALL =
			REGISTRY.register("polished_tuff_wall", () -> new PolishedTuffWall());

	public static final RegistryObject<Block> TUFF_BRICKS =
			REGISTRY.register("tuff_bricks", () -> new TuffBricks());
	public static final RegistryObject<Block> TUFF_BRICK_STAIRS =
			REGISTRY.register("tuff_brick_stairs", () -> new TuffBrickStairs());
	public static final RegistryObject<Block> TUFF_BRICK_SLAB =
			REGISTRY.register("tuff_brick_slab", () -> new TuffBrickSlab());
	public static final RegistryObject<Block> TUFF_BRICK_WALL =
			REGISTRY.register("tuff_brick_wall", () -> new TuffBrickWall());
	public static final RegistryObject<Block> CHISELED_TUFF_BRICKS =
			REGISTRY.register("chiseled_tuff_bricks", () -> new ChiseledTuffBricks());
}
