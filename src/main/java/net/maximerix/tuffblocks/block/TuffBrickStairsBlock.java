package net.maximerix.tuffblocks.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

public class TuffBrickStairsBlock extends StairsBlock {
	public TuffBrickStairsBlock() {
		super(() -> Blocks.AIR.getDefaultState(),
				Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).sound(new SoundType(1.0f, 1.0f, null, null, null, null, null) {
					@Override
					public SoundEvent getBreakSound() {
						return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.break"));
					}

					@Override
					public SoundEvent getStepSound() {
						return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.step"));
					}

					@Override
					public SoundEvent getPlaceSound() {
						return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.place"));
					}

					@Override
					public SoundEvent getHitSound() {
						return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.hit"));
					}

					@Override
					public SoundEvent getFallSound() {
						return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff_bricks.fall"));
					}
				}).hardnessAndResistance(1.5f, 6f).harvestLevel(0).harvestTool(ToolType.PICKAXE).variableOpacity());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean ticksRandomly(BlockState state) {
		return false;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.SOLID;
	}

	@Override
	public int tickRate(IWorldReader world) {
		return 0;
	}

	@Override
	public MaterialColor getMaterialColor(BlockState state, IBlockReader blockAccess, BlockPos pos) {
		return MaterialColor.GRAY_TERRACOTTA;
	}
}
