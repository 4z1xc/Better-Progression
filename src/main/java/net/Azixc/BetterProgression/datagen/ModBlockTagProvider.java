//package net.Azixc.BetterProgression.datagen;
//
//import net.Azixc.BetterProgression.BetterProgression;
//import net.Azixc.BetterProgression.util.ModTags;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.tags.BlockTags;
//import net.neoforged.neoforge.common.data.BlockTagsProvider;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//import org.jetbrains.annotations.Nullable;
//
//import java.util.concurrent.CompletableFuture;
//
//public class ModBlockTagProvider extends BlockTagsProvider {
//
//    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
//        super(output, lookupProvider, BetterProgression.MOD_ID, existingFileHelper);
//    }
//
//    @Override
//    protected void addTags(HolderLookup.Provider provider) {
//        tag(ModTags.Blocks.NEEDS_GOLD_TOOL)
//                .addTags(BlockTags.NEEDS_DIAMOND_TOOL);
//        tag(ModTags.Blocks.INCORRECT_FOR_GOLD_TOOL)
//                .addTags(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
//                .remove(ModTags.Blocks.NEEDS_GOLD_TOOL);
//
//    }
//}
