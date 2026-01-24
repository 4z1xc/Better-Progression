package net.Azixc.BetterProgression.util;

import net.Azixc.BetterProgression.BetterProgression;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.checkerframework.checker.units.qual.A;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterial {

    public static final Holder<ArmorMaterial> COPPER_ARMOR_MATERIAL = register("copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET,2);
                attribute.put(ArmorItem.Type.CHESTPLATE,5);
                attribute.put(ArmorItem.Type.LEGGINGS,4);
                attribute.put(ArmorItem.Type.BOOTS,1);
                attribute.put(ArmorItem.Type.BODY,4);
            }),8,0f,0,SoundEvents.ARMOR_EQUIP_IRON,() -> Items.COPPER_INGOT);


    public static final Holder<ArmorMaterial> GOLD_ARMOR_MATERIAL = register("gold",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET,2);
                attribute.put(ArmorItem.Type.CHESTPLATE,7);
                attribute.put(ArmorItem.Type.LEGGINGS,6);
                attribute.put(ArmorItem.Type.BOOTS,2);
                attribute.put(ArmorItem.Type.BODY,8);
            }),8,0f,0,SoundEvents.ARMOR_EQUIP_GOLD,() -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> DIAMOND_ARMOR_MATERIAL = register("diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET,3);
                attribute.put(ArmorItem.Type.CHESTPLATE,8);
                attribute.put(ArmorItem.Type.LEGGINGS,7);
                attribute.put(ArmorItem.Type.BOOTS,3);
                attribute.put(ArmorItem.Type.BODY,11);
            }),8,2f,1,SoundEvents.ARMOR_EQUIP_DIAMOND,() -> Items.DIAMOND);

    public static final Holder<ArmorMaterial> NETHERITE_ARMOR_MATERIAL = register("netherite",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET,3);
                attribute.put(ArmorItem.Type.CHESTPLATE,9);
                attribute.put(ArmorItem.Type.LEGGINGS,8);
                attribute.put(ArmorItem.Type.BOOTS,3);
                attribute.put(ArmorItem.Type.BODY,13);
            }),8,3f,3,SoundEvents.ARMOR_EQUIP_NETHERITE,() -> Items.NETHERITE_INGOT);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int encahntability, float toughness, float knockbackResistance, Holder<SoundEvent> equipSound,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(BetterProgression.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type,typeProtection.get(type));
        }
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection,encahntability,equipSound,ingredient,layers,toughness,knockbackResistance));
    }
}
