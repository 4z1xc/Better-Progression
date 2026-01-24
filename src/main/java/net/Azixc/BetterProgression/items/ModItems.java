package net.Azixc.BetterProgression.items;

import net.Azixc.BetterProgression.BetterProgression;
import net.Azixc.BetterProgression.util.ModArmorMaterial;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.Azixc.BetterProgression.util.ModTier.COPPER;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterProgression.MOD_ID);

    public static final DeferredItem<Item> PEBBLE = ITEMS.register("pebble",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));


    //Stone
    public static final Supplier<SwordItem> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.STONE, 2,-2.4f))));

    public static final Supplier<ShovelItem> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new ShovelItem(Tiers.STONE, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.STONE, .5f,-3))));

    public static final Supplier<PickaxeItem> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.STONE, 0,-2.8f))));

    public static final Supplier<AxeItem> STONE_AXE = ITEMS.register("stone_axe",
            () -> new AxeItem(Tiers.STONE, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.STONE, 5,-3.2f))));

    public static final Supplier<HoeItem> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new HoeItem(Tiers.STONE, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.STONE, -1,-2f))));


    //Copper
    public static final Supplier<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(COPPER, new Item.Properties().attributes(SwordItem.createAttributes(COPPER, 3,-2.4f))));

    public static final Supplier<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(COPPER, 1.5f,-3))));

    public static final Supplier<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(COPPER, 1,-2.8f))));

    public static final Supplier<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(COPPER, new Item.Properties().attributes(AxeItem.createAttributes(COPPER, 6,-3.2f))));

    public static final Supplier<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(COPPER, new Item.Properties().attributes(HoeItem.createAttributes(COPPER, -1,-2f))));


    //Gold
    public static final Supplier<SwordItem> GOLDEN_SWORD = ITEMS.register("golden_sword",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 6,-2.4f)).rarity(Rarity.RARE)));

    public static final Supplier<AxeItem> GOLDEN_AXE = ITEMS.register("golden_axe",
            () -> new AxeItem(Tiers.GOLD, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.GOLD, 9,-3.2f)).rarity(Rarity.RARE)));

    public static final Supplier<PickaxeItem> GOLDEN_PICKAXE = ITEMS.register("golden_pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.GOLD, 4,-2.8f)).rarity(Rarity.RARE)));

    public static final Supplier<ShovelItem> GOLDEN_SHOVEL = ITEMS.register("golden_shovel",
            () -> new ShovelItem(Tiers.GOLD, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.GOLD, 4.5f,-3)).rarity(Rarity.RARE)));

    public static final Supplier<HoeItem> GOLDEN_HOE = ITEMS.register("golden_hoe",
            () -> new HoeItem(Tiers.GOLD, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.GOLD, 0,-2f)).rarity(Rarity.RARE)));


    //Diamond
    public static final Supplier<SwordItem> DIAMOND_SWORD = ITEMS.register("diamond_sword",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 4,-2.4f)).rarity(Rarity.RARE)));

    public static final Supplier<ShovelItem> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 2.5f,-3)).rarity(Rarity.RARE)));

    public static final Supplier<PickaxeItem> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 2,-2.8f)).rarity(Rarity.RARE)));

    public static final Supplier<AxeItem> DIAMOND_AXE = ITEMS.register("diamond_axe",
            () -> new AxeItem(Tiers.DIAMOND, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.DIAMOND, 7,-3.2f)).rarity(Rarity.RARE)));

    public static final Supplier<HoeItem> DIAMOND_HOE = ITEMS.register("diamond_hoe",
            () -> new HoeItem(Tiers.DIAMOND, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.DIAMOND, -3,-2f)).rarity(Rarity.RARE)));


    //Netherite
    public static final Supplier<SwordItem> NETHERITE_SWORD = ITEMS.register("netherite_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4,-2.4f)).rarity(Rarity.EPIC)));

    public static final Supplier<ShovelItem> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 2.5f,-3)).rarity(Rarity.EPIC)));

    public static final Supplier<PickaxeItem> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 2,-2.8f)).rarity(Rarity.EPIC)));

    public static final Supplier<AxeItem> NETHERITE_AXE = ITEMS.register("netherite_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.NETHERITE, 7,-3.2f)).rarity(Rarity.EPIC)));

    public static final Supplier<HoeItem> NETHERITE_HOE = ITEMS.register("netherite_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.NETHERITE, -4,-2f)).rarity(Rarity.EPIC)));








    //Copper Armor
    public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));

    public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));

    public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));

    public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterial.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));


    //Netherite Armor
    public static final DeferredItem<ArmorItem> NETHERITE_HELMET = ITEMS.register("netherite_helmet",
            () -> new ArmorItem(ModArmorMaterial.NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(39)).rarity(Rarity.EPIC)));

    public static final DeferredItem<ArmorItem> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate",
            () -> new ArmorItem(ModArmorMaterial.NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(39)).rarity(Rarity.EPIC)));

    public static final DeferredItem<ArmorItem> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings",
            () -> new ArmorItem(ModArmorMaterial.NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(39)).rarity(Rarity.EPIC)));

    public static final DeferredItem<ArmorItem> NETHERITE_BOOTS = ITEMS.register("netherite_boots",
            () -> new ArmorItem(ModArmorMaterial.NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(39)).rarity(Rarity.EPIC)));


    //Diamond Armor
    public static final DeferredItem<ArmorItem> DIAMOND_HELMET = ITEMS.register("diamond_helmet",
            () -> new ArmorItem(ModArmorMaterial.DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterial.DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(33)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> DIAMOND_LEGGINGS = ITEMS.register("diamond_leggings",
            () -> new ArmorItem(ModArmorMaterial.DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(33)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> DIAMOND_BOOTS = ITEMS.register("diamond_boots",
            () -> new ArmorItem(ModArmorMaterial.DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(33)).rarity(Rarity.RARE)));


    //Gold Armor
    public static final DeferredItem<ArmorItem> GOLDEN_HELMET = ITEMS.register("golden_helmet",
            () -> new ArmorItem(ModArmorMaterial.GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> GOLDEN_CHESTPLATE = ITEMS.register("golden_chestplate",
            () -> new ArmorItem(ModArmorMaterial.GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> GOLDEN_LEGGINGS = ITEMS.register("golden_leggings",
            () -> new ArmorItem(ModArmorMaterial.GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25)).rarity(Rarity.RARE)));

    public static final DeferredItem<ArmorItem> GOLDEN_BOOTS = ITEMS.register("golden_boots",
            () -> new ArmorItem(ModArmorMaterial.GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25)).rarity(Rarity.RARE)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
