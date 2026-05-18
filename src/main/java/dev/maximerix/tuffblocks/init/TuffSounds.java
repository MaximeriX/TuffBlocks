package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.RegistryObject;

public class TuffSounds {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuffMod.MODID);

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

	private static RegistryObject<SoundEvent> register(String name) {
		return SOUND_EVENTS.register(name, () -> {
			ResourceLocation id = TuffMod.id(name);
			return new SoundEvent(id);
		});
	}
}