package net.maximerix.tuffblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class PolishedTuffBlock extends Block {
	public PolishedTuffBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f,
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tuff:block.polished_tuff.fall"))))
				.strength(1.5f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	public static void registerRenderLayer() {

	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}