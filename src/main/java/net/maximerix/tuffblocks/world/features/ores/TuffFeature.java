package net.maximerix.tuffblocks.world.features.ores;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.maximerix.tuffblocks.init.TuffModBlocks;
import java.util.Random;

@Mod.EventBusSubscriber
public class TuffFeature {
	private static Feature<OreFeatureConfig> feature = null;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class FeatureRegisterHandler {
		@SubscribeEvent
		public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
			feature = new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random random, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;
					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.place(world, generator, random, pos, config);
				}
			};
			event.getRegistry().register(feature.setRegistryName("tuff"));
		}

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(feature,
						new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("tuff", "tuff", blockAt -> {
							boolean blockCriteria = false;
							if (blockAt.getBlock() == Blocks.STONE)
								blockCriteria = true;
							return blockCriteria;
						}), TuffModBlocks.TUFF.get().getDefaultState(), 30), Placement.COUNT_RANGE, new CountRangeConfig(3, 0, 0, 20)));
			}
		}
	}
}
