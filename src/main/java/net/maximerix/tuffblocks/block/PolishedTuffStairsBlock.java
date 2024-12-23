package net.maximerix.tuffblocks.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class PolishedTuffStairsBlock extends StairBlock {
	public PolishedTuffStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_GRAY)
						.sound(new ForgeSoundType(1.0f, 1.0f,
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.break")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.step")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.place")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.hit")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.fall"))))
						.strength(1.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
