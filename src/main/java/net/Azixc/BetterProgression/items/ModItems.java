package net.Azixc.BetterProgression.items;

import net.Azixc.BetterProgression.BetterProgression;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterProgression.MOD_ID);

    public static final DeferredItem<Item> PEBBLE = ITEMS.register("pebble",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
