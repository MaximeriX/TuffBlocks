package net.maximerix.tuffblocks.block;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.init.TuffModBlocks;

public class ChiseledTuffBlock extends Block {
	public ChiseledTuffBlock() {
		super(Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).sound(new SoundType(1.0f, 1.0f, null, null, null, null, null) {
			@Override
			public SoundEvent getBreakSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff.break"));
			}

			@Override
			public SoundEvent getStepSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff.step"));
			}

			@Override
			public SoundEvent getPlaceSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff.place"));
			}

			@Override
			public SoundEvent getHitSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff.hit"));
			}

			@Override
			public SoundEvent getFallSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff.fall"));
			}
		}).hardnessAndResistance(1.5f, 6f).harvestLevel(0).harvestTool(ToolType.PICKAXE));
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(TuffModBlocks.CHISELED_TUFF.get(), RenderType.getSolid());
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
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
