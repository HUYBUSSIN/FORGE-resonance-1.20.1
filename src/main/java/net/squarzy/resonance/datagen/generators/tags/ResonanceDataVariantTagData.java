package net.squarzy.resonance.datagen.generators.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.painting.ResonancePaintingVariants;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ResonanceDataVariantTagData extends PaintingVariantTagsProvider {
    public ResonanceDataVariantTagData(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, Resonance.MOD_ID, existingFileHelper);
}
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .add(

                        ResonancePaintingVariants.HALL.getKey(),
                        ResonancePaintingVariants.W96.getKey(),
                        ResonancePaintingVariants.MAZE.getKey(),
                        ResonancePaintingVariants.LIMBO.getKey(),
                        ResonancePaintingVariants.LOUNGE.getKey(),
                        ResonancePaintingVariants.OBLIVION.getKey(),
                        ResonancePaintingVariants.LOON_GARDEN.getKey(),
                        ResonancePaintingVariants.CONE_ISLAND.getKey(),
                        ResonancePaintingVariants.OFFICE_DAY.getKey(),
                        ResonancePaintingVariants.DAY_OUT.getKey(),
                        ResonancePaintingVariants.WEVE_BEEN_OKAY.getKey(),
                        ResonancePaintingVariants.DISC.getKey(),
                        ResonancePaintingVariants.FLOATING_SPHERES.getKey()

                );
    }
}