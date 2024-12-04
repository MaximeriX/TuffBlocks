package net.maximerix.tuffblocks.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PolishedTuffStairsBlock extends StairBlock {
	public PolishedTuffStairsBlock() {
		super(() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.break")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.step")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.place")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.hit")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
						.sound(new ForgeSoundType(1.0f, 1.0f,
								() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.break")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.step")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.place")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.hit")),
								() -> new SoundEvent(new ResourceLocation("tuff:block.polished_tuff.fall"))))
						.strength(1.5f, 6f).requiresCorrectToolForDrops().dynamicShape());
		setRegistryName("polished_tuff_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
