package net.maximerix.tuffblocks.sound;

import net.maximerix.tuffblocks.TuffBlocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static final SoundEvent POLISHED_TUFF_BREAK = registerSoundEvent("block.polished_tuff.break");
    public static final SoundEvent POLISHED_TUFF_STEP = registerSoundEvent("block.polished_tuff.step");
    public static final SoundEvent POLISHED_TUFF_PLACE = registerSoundEvent("block.polished_tuff.place");
    public static final SoundEvent POLISHED_TUFF_HIT = registerSoundEvent("block.polished_tuff.hit");
    public static final SoundEvent POLISHED_TUFF_FALL = registerSoundEvent("block.polished_tuff.fall");

    public static final BlockSoundGroup POLISHED_TUFF_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.
                    POLISHED_TUFF_BREAK,
            POLISHED_TUFF_STEP,
            POLISHED_TUFF_PLACE,
            POLISHED_TUFF_HIT,
            POLISHED_TUFF_FALL);

    public static final SoundEvent TUFF_BRICKS_BREAK = registerSoundEvent("block.tuff_bricks.break");
    public static final SoundEvent TUFF_BRICKS_STEP = registerSoundEvent("block.tuff_bricks.step");
    public static final SoundEvent TUFF_BRICKS_PLACE = registerSoundEvent("block.tuff_bricks.place");
    public static final SoundEvent TUFF_BRICKS_HIT = registerSoundEvent("block.tuff_bricks.hit");
    public static final SoundEvent TUFF_BRICKS_FALL = registerSoundEvent("block.tuff_bricks.fall");

    public static final BlockSoundGroup TUFF_BRICKS_SOUNDS = new BlockSoundGroup(1f, 1f,
                    ModSounds.
                             TUFF_BRICKS_BREAK,
                             TUFF_BRICKS_STEP,
                             TUFF_BRICKS_PLACE,
                             TUFF_BRICKS_HIT,
                             TUFF_BRICKS_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TuffBlocks.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {

    }
}
