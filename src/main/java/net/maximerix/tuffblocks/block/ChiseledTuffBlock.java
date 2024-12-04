package net.maximerix.tuffblocks.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ChiseledTuffBlock extends Block {
	public ChiseledTuffBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.break")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.step")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.place")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.hit")),
						() -> new SoundEvent(new ResourceLocation("tuff:block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops());
		setRegistryName("chiseled_tuff");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
