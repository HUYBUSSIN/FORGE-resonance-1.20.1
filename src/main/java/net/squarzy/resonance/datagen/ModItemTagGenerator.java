package net.squarzy.resonance.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.item.Moditems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Resonance.MOD_ID, existingFileHelper);

}

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_YES_DA_DA_DA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_YES_DA_DA_DA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_19999.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_19999.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEW_TWILIGHT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEW_TWILIGHT.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DATED_NEW_AESTHETICS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DATED_NEW_AESTHETICS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HOW_TO_SEE_THROUGH_WALLS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HOW_TO_SEE_THROUGH_WALLS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EMPTY_HIDING_WORLD.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EMPTY_HIDING_WORLD.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_MAGIC_PEAKS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_MAGIC_PEAKS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_RED_TWILIGHT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_RED_TWILIGHT.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_IN_THE_WORLDE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_IN_THE_WORLDE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ENCHANTED_INSTRUMENTALS_AND_WHISPERS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ENCHANTED_INSTRUMENTALS_AND_WHISPERS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ONE_HUNDRED_MORNINGS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ONE_HUNDRED_MORNINGS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NOSTAlGI_GAIUS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NOSTAlGI_GAIUS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GRADIENT_HORIZONT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GRADIENT_HORIZONT.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_OPTIMIZED.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_OPTIMIZED.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PLUME_VALLEY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PLUME_VALLEY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PALE_MEDITATIONS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PALE_MEDITATIONS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_VISTA_OF_CHAOS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_VISTA_OF_CHAOS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_REFLECTIONS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_REFLECTIONS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEMATOPHY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEMATOPHY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_VIBES.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_VIBES.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINITE_TIME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINITE_TIME.getKey());


    }
}
