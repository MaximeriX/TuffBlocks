package dev.maximerix.tuffblocks.worldgen;

import dev.maximerix.tuffblocks.TuffBlocks;
import dev.maximerix.tuffblocks.block.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModWorldgen {
    private static final Identifier TUFF_ORE_ID = new Identifier(TuffBlocks.MOD_ID, "ore_tuff");
    private static final RegistryKey<ConfiguredFeature<?, ?>> TUFF_ORE_KEY =
            RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, TUFF_ORE_ID);

    private static final ConfiguredFeature<?, ?> TUFF_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.TUFF.getDefaultState(),
                    30))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 20)))
            .spreadHorizontally()
            .repeat(3);

    public static void init() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, TUFF_ORE_ID, TUFF_ORE);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                TUFF_ORE_KEY);
    }
}
