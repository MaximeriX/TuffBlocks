package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class TuffItems {
	public static final DeferredRegister<Item> REGISTRY =
			DeferredRegister.create(ForgeRegistries.ITEMS, TuffMod.MODID);

	private static RegistryObject<Item> fromBlock(RegistryObject<Block> block) {
		return REGISTRY.register(
				block.getId().getPath(),
				() -> new BlockItem(block.get(), new Item.Properties())
		);
	}

	public static final RegistryObject<Item> TUFF_STAIRS = fromBlock(TuffBlocks.TUFF_STAIRS);
	public static final RegistryObject<Item> TUFF_SLAB = fromBlock(TuffBlocks.TUFF_SLAB);
	public static final RegistryObject<Item> TUFF_WALL = fromBlock(TuffBlocks.TUFF_WALL);
	public static final RegistryObject<Item> CHISELED_TUFF = fromBlock(TuffBlocks.CHISELED_TUFF);

	public static final RegistryObject<Item> POLISHED_TUFF = fromBlock(TuffBlocks.POLISHED_TUFF);
	public static final RegistryObject<Item> POLISHED_TUFF_STAIRS = fromBlock(TuffBlocks.POLISHED_TUFF_STAIRS);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = fromBlock(TuffBlocks.POLISHED_TUFF_SLAB);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = fromBlock(TuffBlocks.POLISHED_TUFF_WALL);

	public static final RegistryObject<Item> TUFF_BRICKS = fromBlock(TuffBlocks.TUFF_BRICKS);
	public static final RegistryObject<Item> TUFF_BRICK_STAIRS = fromBlock(TuffBlocks.TUFF_BRICK_STAIRS);
	public static final RegistryObject<Item> TUFF_BRICK_SLAB = fromBlock(TuffBlocks.TUFF_BRICK_SLAB);
	public static final RegistryObject<Item> TUFF_BRICK_WALL = fromBlock(TuffBlocks.TUFF_BRICK_WALL);
	public static final RegistryObject<Item> CHISELED_TUFF_BRICKS = fromBlock(TuffBlocks.CHISELED_TUFF_BRICKS);
}