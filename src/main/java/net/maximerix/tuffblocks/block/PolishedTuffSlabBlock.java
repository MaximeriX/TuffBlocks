package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.TuffModElements;

@TuffModElements.ModElement.Tag
public class PolishedTuffSlabBlock extends TuffModElements.ModElement {
	@ObjectHolder("tuff:polished_tuff_slab")
	public static final Block block = null;

	public PolishedTuffSlabBlock(TuffModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f,
							() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.break")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.step")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.place")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.hit")),
							() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.step"))))
					.hardnessAndResistance(1.5f, 6f).setLightLevel(s -> 0).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("polished_tuff_slab");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GRAY_TERRACOTTA;
		}
	}
}
