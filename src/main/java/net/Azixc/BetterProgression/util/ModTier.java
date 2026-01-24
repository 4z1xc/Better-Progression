package net.Azixc.BetterProgression.util;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class ModTier {

    public static final Tier COPPER = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,

            190,
            5f,
            1f,
            13,
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER)
    );

}

