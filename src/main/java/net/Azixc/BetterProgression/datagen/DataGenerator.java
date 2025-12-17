//package net.Azixc.BetterProgression.datagen;
//
//import net.Azixc.BetterProgression.BetterProgression;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.common.data.BlockTagsProvider;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//import net.neoforged.neoforge.data.event.GatherDataEvent;
//
//import java.util.concurrent.CompletableFuture;
//
//@EventBusSubscriber (modid = BetterProgression.MOD_ID)
//public class DataGenerator {
//    @SubscribeEvent
//    public static void gatherData(GatherDataEvent event) {
//        net.minecraft.data.DataGenerator generator = event.getGenerator();
//        PackOutput packOutput = generator.getPackOutput();
//        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
//        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
//
//        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
//        generator.addProvider(event.includeServer(), blockTagsProvider);
//
//    }
//}
