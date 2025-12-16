package net.Azixc.BetterProgression.items;


import net.Azixc.BetterProgression.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier GOLD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL,
            700, 7,3.0F, 22, () -> Ingredient.of(Items.GOLD_INGOT));
}
