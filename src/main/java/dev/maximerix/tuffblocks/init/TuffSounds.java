package dev.maximerix.tuffblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.sounds.SoundEvent;

import dev.maximerix.tuffblocks.TuffMod;

public class TuffSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuffMod.MODID);

	private static RegistryObject<SoundEvent> sound(String id) {
		return REGISTRY.register(
				id,
				() -> SoundEvent.createVariableRangeEvent(TuffMod.id(id))
		);
	}

	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_BREAK = sound("block.polished_tuff.break");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_PLACE = sound("block.polished_tuff.place");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_HIT = sound("block.polished_tuff.hit");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_FALL = sound("block.polished_tuff.fall");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_STEP = sound("block.polished_tuff.step");

	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_BREAK = sound("block.tuff_bricks.break");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_PLACE = sound("block.tuff_bricks.place");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_HIT = sound("block.tuff_bricks.hit");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_FALL = sound("block.tuff_bricks.fall");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_STEP = sound("block.tuff_bricks.step");
}