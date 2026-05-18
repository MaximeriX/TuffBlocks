package dev.maximerix.tuffblocks.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class TuffWorldGen {
    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome.getCategory() == Biome.Category.NETHER || biome.getCategory() == Biome.Category.THEEND) {
                continue;
            }

            biome.addFeature(
                    GenerationStage.Decoration.UNDERGROUND_ORES,
                    Biome.createDecoratedFeature(
                            Feature.ORE,
                            new OreFeatureConfig(
                                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    TuffBlocks.TUFF.get().getDefaultState(), 30
                            ),
                            Placement.COUNT_RANGE,
                            new CountRangeConfig(3, 0, 0, 20)
                    )
            );
        }
    }
}