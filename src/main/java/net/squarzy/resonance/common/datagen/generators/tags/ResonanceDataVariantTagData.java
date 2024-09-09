package net.squarzy.resonance.common.datagen.generators.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.common.registry.painting.ResonancePaintingVariants;

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
                        ResonancePaintingVariants.FLOATING_SPHERES.getKey(),
                        ResonancePaintingVariants.YES_DA_DA_DA.getKey(),
                        ResonancePaintingVariants.ONE_NINE_NINE_NINE_NINE.getKey(),
                        ResonancePaintingVariants.NEW_TWILIGHT.getKey(),
                        ResonancePaintingVariants.ACHIEVEMENT.getKey(),
                        ResonancePaintingVariants.CUT_UP_SECTIONS.getKey(),
                        ResonancePaintingVariants.DATED_NEW_AESTHETIC.getKey(),
                        ResonancePaintingVariants.EMPTY_HIDING_WORLD.getKey(),
                        ResonancePaintingVariants.ENCHANTED_INSTRUMENTALS_AND_WHISPERS.getKey(),
                        ResonancePaintingVariants.GLASS_PRISM.getKey(),
                        ResonancePaintingVariants.GRADIENT_HORIZONT.getKey(),
                        ResonancePaintingVariants.HOW_TO_SEE_THROUGH_WALLS.getKey(),
                        ResonancePaintingVariants.IN_THE_WORLDE.getKey(),
                        ResonancePaintingVariants.LYNX.getKey(),
                        ResonancePaintingVariants.MAGIC_PEAKS.getKey(),
                        ResonancePaintingVariants.NEMATOPHY.getKey(),
                        ResonancePaintingVariants.NEW_TWILIGHT.getKey(),
                        ResonancePaintingVariants.NOSTALGI_GAIUS.getKey(),
                        ResonancePaintingVariants.ONE_HUNDRED_MORNINGS.getKey(),
                        ResonancePaintingVariants.OPTIMIZED.getKey(),
                        ResonancePaintingVariants.PALE_MEDITATIONS.getKey(),
                        ResonancePaintingVariants.PLUME_VALLEY.getKey(),
                        ResonancePaintingVariants.RED_TWILIGHT.getKey(),
                        ResonancePaintingVariants.REFLECTIONS.getKey(),
                        ResonancePaintingVariants.VIBES.getKey(),
                        ResonancePaintingVariants.VISTA_OF_CHAOS.getKey(),
                        ResonancePaintingVariants.YES_DA_DA_DA.getKey(),
                        ResonancePaintingVariants.FINITE_TIME.getKey(),
                        ResonancePaintingVariants.THE_FOOL.getKey(),
                        ResonancePaintingVariants.PNEMIA.getKey()

                );
    }
}