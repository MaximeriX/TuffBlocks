package dev.maximerix.tuffblocks.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.ArrayList;

public class TuffWorldGen {
    private static final List<ConfiguredFeature<?, ?>> ORE_FEATURES = new ArrayList<>();

    public static void init() {
        ORE_FEATURES.add(
                Feature.ORE.configured(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                TuffBlocks.TUFF.get().defaultBlockState(), 30)
                        )
                        .range(20)
                        .squared()
                        .count(3)
        );
    }

    public static void generateOres(final BiomeLoadingEvent event) {
        Biome.Category category = event.getCategory();
        if (category == Biome.Category.NETHER || category == Biome.Category.THEEND) {
            return;
        }

        for (ConfiguredFeature<?, ?> feature : ORE_FEATURES) {
            event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, feature);
        }
    }
}