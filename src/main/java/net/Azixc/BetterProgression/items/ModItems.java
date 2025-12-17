package net.Azixc.BetterProgression.items;

import net.Azixc.BetterProgression.BetterProgression;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Object> ITEMS = DeferredRegister.create(ResourceLocation.parse(BetterProgression.MOD_ID), "minecraft");

    public static final DeferredHolder<Object, SwordItem> GOLDEN_SWORD = ITEMS.register("golden_sword",
            () -> new SwordItem(ModToolTiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.GOLD, 3, -2.4F))));
    public static final DeferredHolder<Object, PickaxeItem> GOLDEN_PICKAXE = ITEMS.register("golden_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.GOLD, 1.0F, -2.8F))));
    public static final DeferredHolder<Object, ShovelItem> GOLDEN_SHOVEL = ITEMS.register("golden_shovel",
            () -> new ShovelItem(ModToolTiers.GOLD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.GOLD, 1.5F, -3.0F))));
    public static final DeferredHolder<Object, AxeItem> GOLDEN_AXE = ITEMS.register("golden_axe",
            () -> new AxeItem(ModToolTiers.GOLD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.GOLD, 6F, -3.2F))));
    public static final DeferredHolder<Object, HoeItem> GOLDEN_HOE = ITEMS.register("golden_hoe",
            () -> new HoeItem(ModToolTiers.GOLD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.GOLD, 0F, -3.0F))));
};
