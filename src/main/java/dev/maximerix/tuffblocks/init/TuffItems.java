package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

public class TuffItems {
	public static final DeferredRegister<Item> REGISTRY =
			DeferredRegister.create(ForgeRegistries.ITEMS, TuffMod.MODID);

	private static RegistryObject<Item> fromBlock(String name, RegistryObject<Block> block) {
		return REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static final RegistryObject<Item> TUFF_STAIRS = fromBlock("tuff_stairs", TuffBlocks.TUFF_STAIRS);
	public static final RegistryObject<Item> TUFF_SLAB = fromBlock("tuff_slab", TuffBlocks.TUFF_SLAB);
	public static final RegistryObject<Item> TUFF_WALL = fromBlock("tuff_wall", TuffBlocks.TUFF_WALL);
	public static final RegistryObject<Item> CHISELED_TUFF = fromBlock("chiseled_tuff", TuffBlocks.CHISELED_TUFF);

	public static final RegistryObject<Item> POLISHED_TUFF = fromBlock("polished_tuff", TuffBlocks.POLISHED_TUFF);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = fromBlock("polished_tuff_stairs", TuffBlocks.POLISHED_TUFF_STAIRS);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = fromBlock("polished_tuff_slab", TuffBlocks.POLISHED_TUFF_SLAB);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = fromBlock("polished_tuff_wall", TuffBlocks.POLISHED_TUFF_WALL);

	public static final RegistryObject<Item> TUFF_BRICKS = fromBlock("tuff_bricks", TuffBlocks.TUFF_BRICKS);
	public static final RegistryObject<Item> TUFF_BRICK_STAIRS = fromBlock("tuff_brick_stairs", TuffBlocks.TUFF_BRICK_STAIRS);
	public static final RegistryObject<Item> TUFF_BRICK_SLAB = fromBlock("tuff_brick_slab", TuffBlocks.TUFF_BRICK_SLAB);
	public static final RegistryObject<Item> TUFF_BRICK_WALL = fromBlock("tuff_brick_wall", TuffBlocks.TUFF_BRICK_WALL);
	public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = fromBlock("chiseled_tuff_bricks", TuffBlocks.CHISELED_TUFF_BRICKS);
}