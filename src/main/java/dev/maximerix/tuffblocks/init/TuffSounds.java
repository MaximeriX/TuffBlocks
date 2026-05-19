package dev.maximerix.tuffblocks.init;

import dev.maximerix.tuffblocks.TuffMod;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TuffSounds {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuffMod.MODID);

	public static final SoundEvent BLOCK_TUFF_BREAK = create("block.tuff.break");
	public static final SoundEvent BLOCK_TUFF_PLACE = create("block.tuff.place");
	public static final SoundEvent BLOCK_TUFF_HIT = create("block.tuff.hit");
	public static final SoundEvent BLOCK_TUFF_FALL = create("block.tuff.fall");
	public static final SoundEvent BLOCK_TUFF_STEP = create("block.tuff.step");

	public static final SoundEvent BLOCK_POLISHED_TUFF_BREAK = create("block.polished_tuff.break");
	public static final SoundEvent BLOCK_POLISHED_TUFF_PLACE = create("block.polished_tuff.place");
	public static final SoundEvent BLOCK_POLISHED_TUFF_HIT = create("block.polished_tuff.hit");
	public static final SoundEvent BLOCK_POLISHED_TUFF_FALL = create("block.polished_tuff.fall");
	public static final SoundEvent BLOCK_POLISHED_TUFF_STEP = create("block.polished_tuff.step");

	public static final SoundEvent BLOCK_TUFF_BRICKS_BREAK = create("block.tuff_bricks.break");
	public static final SoundEvent BLOCK_TUFF_BRICKS_PLACE = create("block.tuff_bricks.place");
	public static final SoundEvent BLOCK_TUFF_BRICKS_HIT = create("block.tuff_bricks.hit");
	public static final SoundEvent BLOCK_TUFF_BRICKS_FALL = create("block.tuff_bricks.fall");
	public static final SoundEvent BLOCK_TUFF_BRICKS_STEP = create("block.tuff_bricks.step");

	static {
		register("block.tuff.break", BLOCK_TUFF_BREAK);
		register("block.tuff.place", BLOCK_TUFF_PLACE);
		register("block.tuff.hit", BLOCK_TUFF_HIT);
		register("block.tuff.fall", BLOCK_TUFF_FALL);
		register("block.tuff.step", BLOCK_TUFF_STEP);

		register("block.polished_tuff.break", BLOCK_POLISHED_TUFF_BREAK);
		register("block.polished_tuff.place", BLOCK_POLISHED_TUFF_PLACE);
		register("block.polished_tuff.hit", BLOCK_POLISHED_TUFF_HIT);
		register("block.polished_tuff.fall", BLOCK_POLISHED_TUFF_FALL);
		register("block.polished_tuff.step", BLOCK_POLISHED_TUFF_STEP);

		register("block.tuff_bricks.break", BLOCK_TUFF_BRICKS_BREAK);
		register("block.tuff_bricks.place", BLOCK_TUFF_BRICKS_PLACE);
		register("block.tuff_bricks.hit", BLOCK_TUFF_BRICKS_HIT);
		register("block.tuff_bricks.fall", BLOCK_TUFF_BRICKS_FALL);
		register("block.tuff_bricks.step", BLOCK_TUFF_BRICKS_STEP);
	}

	private static SoundEvent create(String name) {
		return new SoundEvent(TuffMod.id(name));
	}

	private static void register(String name, SoundEvent soundEvent) {
		SOUND_EVENTS.register(name, () -> soundEvent);
	}
}