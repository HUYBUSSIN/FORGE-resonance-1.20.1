package net.squarzy.resonance.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.squarzy.resonance.Resonance;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

    public class BlockTagsProviderMod extends BlockTagsProvider {
        public BlockTagsProviderMod(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, Resonance.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }
