package net.maximerix.tuffblocks.block;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.fluid.IFluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.WallBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.maximerix.tuffblocks.init.TuffModBlocks;

public class TuffBrickWallBlock extends WallBlock {
	public TuffBrickWallBlock() {
		super(Block.Properties.create(Material.ROCK, MaterialColor.GRAY_TERRACOTTA).sound(new SoundType(1.0f, 1.0f, null, null, null, null, null) {
			@Override
			public SoundEvent getBreakSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.break"));
			}

			@Override
			public SoundEvent getStepSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.step"));
			}

			@Override
			public SoundEvent getPlaceSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.place"));
			}

			@Override
			public SoundEvent getHitSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.hit"));
			}

			@Override
			public SoundEvent getFallSound() {
				return new SoundEvent(new ResourceLocation("tuff:block.tuff_bricks.fall"));
			}
		}).hardnessAndResistance(1.5f, 6f).harvestLevel(0).harvestTool(ToolType.PICKAXE).notSolid());
	}

	private boolean func_220113_a(BlockState state, boolean checkattach, Direction face) {
		boolean flag = state.getBlock() instanceof WallBlock || state.getBlock() instanceof FenceGateBlock && FenceGateBlock.isParallel(state, face);
		return !cannotAttach(state.getBlock()) && checkattach || flag;
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		IWorldReader iworldreader = context.getWorld();
		BlockPos blockpos = context.getPos();
		IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
		BlockPos blockpos1 = blockpos.north();
		BlockPos blockpos2 = blockpos.east();
		BlockPos blockpos3 = blockpos.south();
		BlockPos blockpos4 = blockpos.west();
		BlockState blockstate = iworldreader.getBlockState(blockpos1);
		BlockState blockstate1 = iworldreader.getBlockState(blockpos2);
		BlockState blockstate2 = iworldreader.getBlockState(blockpos3);
		BlockState blockstate3 = iworldreader.getBlockState(blockpos4);
		boolean flag = this.func_220113_a(blockstate, blockstate.isSolidSide(iworldreader, blockpos1, Direction.SOUTH), Direction.SOUTH);
		boolean flag1 = this.func_220113_a(blockstate1, blockstate1.isSolidSide(iworldreader, blockpos2, Direction.WEST), Direction.WEST);
		boolean flag2 = this.func_220113_a(blockstate2, blockstate2.isSolidSide(iworldreader, blockpos3, Direction.NORTH), Direction.NORTH);
		boolean flag3 = this.func_220113_a(blockstate3, blockstate3.isSolidSide(iworldreader, blockpos4, Direction.EAST), Direction.EAST);
		boolean flag4 = (!flag || flag1 || !flag2 || flag3) && (flag || !flag1 || flag2 || !flag3);
		return this.getDefaultState().with(UP, Boolean.valueOf(flag4 || !iworldreader.isAirBlock(blockpos.up()))).with(NORTH, Boolean.valueOf(flag))
				.with(EAST, Boolean.valueOf(flag1)).with(SOUTH, Boolean.valueOf(flag2)).with(WEST, Boolean.valueOf(flag3))
				.with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
	}

	@Override
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos,
			BlockPos facingPos) {
		if (stateIn.get(WATERLOGGED)) {
			worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		}
		if (facing == Direction.DOWN) {
			return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
		} else {
			Direction direction = facing.getOpposite();
			boolean flag = facing == Direction.NORTH
					? this.func_220113_a(facingState, facingState.isSolidSide(worldIn, facingPos, direction), direction)
					: stateIn.get(NORTH);
			boolean flag1 = facing == Direction.EAST
					? this.func_220113_a(facingState, facingState.isSolidSide(worldIn, facingPos, direction), direction)
					: stateIn.get(EAST);
			boolean flag2 = facing == Direction.SOUTH
					? this.func_220113_a(facingState, facingState.isSolidSide(worldIn, facingPos, direction), direction)
					: stateIn.get(SOUTH);
			boolean flag3 = facing == Direction.WEST
					? this.func_220113_a(facingState, facingState.isSolidSide(worldIn, facingPos, direction), direction)
					: stateIn.get(WEST);
			boolean flag4 = (!flag || flag1 || !flag2 || flag3) && (flag || !flag1 || flag2 || !flag3);
			return stateIn.with(UP, Boolean.valueOf(flag4 || !worldIn.isAirBlock(currentPos.up()))).with(NORTH, Boolean.valueOf(flag))
					.with(EAST, Boolean.valueOf(flag1)).with(SOUTH, Boolean.valueOf(flag2)).with(WEST, Boolean.valueOf(flag3));
		}
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void clientLoad(FMLClientSetupEvent event) {

		RenderTypeLookup.setRenderLayer(TuffModBlocks.TUFF_BRICK_WALL.get(), RenderType.getCutout());
	}

	@Override
	public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return false;
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
