package net.Azixc.BetterProgression.events;

import net.Azixc.BetterProgression.BetterProgression;
import net.Azixc.BetterProgression.util.ModTags;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = BetterProgression.MOD_ID)
class ModEvents {

    @SubscribeEvent
    public static void ModifyComponents(ModifyDefaultComponentsEvent event) {
        event.modify(Items.GOLDEN_PICKAXE, builder -> builder.set(
                DataComponents.MAX_DAMAGE, 720));

        event.modify(Items.GOLDEN_HOE, builder -> builder.set(
                DataComponents.MAX_DAMAGE, 720));

        event.modify(Items.GOLDEN_AXE, builder -> builder.set(
                DataComponents.MAX_DAMAGE, 720));

        event.modify(Items.GOLDEN_SHOVEL, builder -> builder.set(
                DataComponents.MAX_DAMAGE, 720));

        event.modify(Items.GOLDEN_SWORD, builder -> builder.set(
                DataComponents.MAX_DAMAGE, 720));
    }
}
