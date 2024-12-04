package net.maximerix.tuffblocks.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.maximerix.tuffblocks.init.TuffModBlocks;

public class TuffWallBlock extends WallBlock {
	public TuffWallBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.break")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.step")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.place")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.hit")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("tuff_wall");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TuffModBlocks.TUFF_WALL, renderType -> renderType == RenderType.cutout());
	}
}
