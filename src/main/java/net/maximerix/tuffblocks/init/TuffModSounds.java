
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maximerix.tuffblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.maximerix.tuffblocks.TuffMod;

public class TuffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuffMod.MODID);
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BREAK = REGISTRY.register("block.tuff.break",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff.break")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_PLACE = REGISTRY.register("block.tuff.place",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff.place")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_HIT = REGISTRY.register("block.tuff.hit",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_STEP = REGISTRY.register("block.tuff.step",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff.step")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_FALL = REGISTRY.register("block.tuff.fall",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff.fall")));
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_BREAK = REGISTRY.register("block.polished_tuff.break",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.polished_tuff.break")));
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_PLACE = REGISTRY.register("block.polished_tuff.place",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.polished_tuff.place")));
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_HIT = REGISTRY.register("block.polished_tuff.hit",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.polished_tuff.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_STEP = REGISTRY.register("block.polished_tuff.step",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.polished_tuff.step")));
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_FALL = REGISTRY.register("block.polished_tuff.fall",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.polished_tuff.fall")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_BREAK = REGISTRY.register("block.tuff_bricks.break",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff_bricks.break")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_PLACE = REGISTRY.register("block.tuff_bricks.place",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff_bricks.place")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_HIT = REGISTRY.register("block.tuff_bricks.hit",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff_bricks.hit")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_STEP = REGISTRY.register("block.tuff_bricks.step",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff_bricks.step")));
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_FALL = REGISTRY.register("block.tuff_bricks.fall",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tuff", "block.tuff_bricks.fall")));
}
