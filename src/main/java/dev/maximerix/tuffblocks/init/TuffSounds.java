package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TuffSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuffMod.MODID);

	private static RegistryObject<SoundEvent> register(String name) {
		return REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(TuffMod.id(name)));
	}

	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_BREAK = register("block.polished_tuff.break");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_PLACE = register("block.polished_tuff.place");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_HIT = register("block.polished_tuff.hit");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_FALL = register("block.polished_tuff.fall");
	public static final RegistryObject<SoundEvent> BLOCK_POLISHED_TUFF_STEP = register("block.polished_tuff.step");

	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_BREAK = register("block.tuff_bricks.break");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_PLACE = register("block.tuff_bricks.place");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_HIT = register("block.tuff_bricks.hit");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_FALL = register("block.tuff_bricks.fall");
	public static final RegistryObject<SoundEvent> BLOCK_TUFF_BRICKS_STEP = register("block.tuff_bricks.step");
}