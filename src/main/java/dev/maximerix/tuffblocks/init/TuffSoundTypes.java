package dev.maximerix.tuffblocks.init;

import net.minecraft.block.SoundType;

public class TuffSoundTypes {
    public static final SoundType TUFF = new SoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_TUFF_BREAK,
            TuffSounds.BLOCK_TUFF_STEP,
            TuffSounds.BLOCK_TUFF_PLACE,
            TuffSounds.BLOCK_TUFF_HIT,
            TuffSounds.BLOCK_TUFF_FALL
    );

    public static final SoundType POLISHED_TUFF = new SoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_POLISHED_TUFF_BREAK,
            TuffSounds.BLOCK_POLISHED_TUFF_STEP,
            TuffSounds.BLOCK_POLISHED_TUFF_PLACE,
            TuffSounds.BLOCK_POLISHED_TUFF_HIT,
            TuffSounds.BLOCK_POLISHED_TUFF_FALL
    );

    public static final SoundType TUFF_BRICKS = new SoundType(1.0f, 1.0f,
            TuffSounds.BLOCK_TUFF_BRICKS_BREAK,
            TuffSounds.BLOCK_TUFF_BRICKS_STEP,
            TuffSounds.BLOCK_TUFF_BRICKS_PLACE,
            TuffSounds.BLOCK_TUFF_BRICKS_HIT,
            TuffSounds.BLOCK_TUFF_BRICKS_FALL
    );
}
