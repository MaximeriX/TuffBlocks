package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.TuffModElements;

@TuffModElements.ModElement.Tag
public class ChiseledTuffBricksBlock extends TuffModElements.ModElement {
	@ObjectHolder("tuff:chiseled_tuff_bricks")
	public static final Block block = null;

	public ChiseledTuffBricksBlock(TuffModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f,
							() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.break")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.step")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.place")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.hit")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.step"))))
					.hardnessAndResistance(1.5f, 6f).setLightLevel(s -> 0).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("chiseled_tuff_bricks");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GRAY_TERRACOTTA;
		}
	}
}
