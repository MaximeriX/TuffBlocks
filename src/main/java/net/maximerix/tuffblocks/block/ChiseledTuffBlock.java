package net.maximerix.tuffblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class ChiseledTuffBlock extends Block {
	public ChiseledTuffBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}