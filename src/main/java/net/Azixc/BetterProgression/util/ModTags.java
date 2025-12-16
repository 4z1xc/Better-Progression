package net.Azixc.BetterProgression.util;

import net.Azixc.BetterProgression.BetterProgression;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class  Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(BetterProgression.MOD_ID, name));
        }

        public static final TagKey<Block> NEEDS_GOLD_TOOL = createTag("needs_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_GOLD_TOOL = createTag("incorrect_for_gold_tool");
    }

    public static class Items{
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BetterProgression.MOD_ID, name));
        }
    }
}
