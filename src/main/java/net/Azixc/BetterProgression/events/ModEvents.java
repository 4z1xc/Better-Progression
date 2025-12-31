package net.Azixc.BetterProgression.events;

import net.Azixc.BetterProgression.BetterProgression;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Tool;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;

import java.util.Collections;

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

        event.modify(Items.GOLDEN_PICKAXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_PICKAXE, 8)),1,1)));

        event.modify(Items.GOLDEN_AXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_AXE, 8)),1,1)));

        event.modify(Items.GOLDEN_HOE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_HOE, 8)),1,1)));

        event.modify(Items.GOLDEN_SHOVEL, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_SHOVEL, 8)),1,1)));

        event.modify(Items.DIAMOND_PICKAXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_PICKAXE, 10)),1,1)));

        event.modify(Items.DIAMOND_AXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_AXE, 10)),1,1)));

        event.modify(Items.DIAMOND_HOE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_HOE, 10)),1,1)));

        event.modify(Items.DIAMOND_SHOVEL, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_SHOVEL, 10)),1,1)));

        event.modify(Items.NETHERITE_PICKAXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_PICKAXE, 13)),1,1)));

        event.modify(Items.NETHERITE_AXE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_AXE, 13)),1,1)));

        event.modify(Items.NETHERITE_HOE, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_HOE, 13)),1,1)));

        event.modify(Items.NETHERITE_SHOVEL, builder -> builder.set(
                DataComponents.TOOL, new Tool(Collections.singletonList(Tool.Rule.minesAndDrops(BlockTags.MINEABLE_WITH_SHOVEL, 13)),1,1)));


//        /give Dev minecraft:golden_pickaxe[minecraft:max_damage=520,minecraft:tool={default_mining_speed:1.5,rules:[{blocks:"#mineable/pickaxe",speed:7,correct_for_drops:true}]}]
    }





}
