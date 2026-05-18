package dev.maximerix.tuffblocks.init;

import net.minecraftforge.common.util.ForgeSoundType;

public class TuffSoundTypes {
    public static final ForgeSoundType POLISHED_TUFF = new ForgeSoundType(
            1.0f, 1.0f,
            () -> TuffSounds.BLOCK_POLISHED_TUFF_BREAK.get(),
            () -> TuffSounds.BLOCK_POLISHED_TUFF_STEP.get(),
            () -> TuffSounds.BLOCK_POLISHED_TUFF_PLACE.get(),
            () -> TuffSounds.BLOCK_POLISHED_TUFF_HIT.get(),
            () -> TuffSounds.BLOCK_POLISHED_TUFF_FALL.get()
    );

    public static final ForgeSoundType TUFF_BRICKS = new ForgeSoundType(
            1.0f, 1.0f,
            () -> TuffSounds.BLOCK_TUFF_BRICKS_BREAK.get(),
            () -> TuffSounds.BLOCK_TUFF_BRICKS_STEP.get(),
            () -> TuffSounds.BLOCK_TUFF_BRICKS_PLACE.get(),
            () -> TuffSounds.BLOCK_TUFF_BRICKS_HIT.get(),
            () -> TuffSounds.BLOCK_TUFF_BRICKS_FALL.get()
    );
}