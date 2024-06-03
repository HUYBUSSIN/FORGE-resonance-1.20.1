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
                .add(Moditems.MUSIC_DISC_IRREAL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_IRREAL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SPACE_PINBALL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SPACE_PINBALL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEW_REALIZATION.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEW_REALIZATION.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEVERMIND.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NEVERMIND.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_XASD.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_XASD.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHRONOLOGY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHRONOLOGY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NOME_DA_MUSICA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NOME_DA_MUSICA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_TAKEAGUESS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_TAKEAGUESS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_WAY_WAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_WAY_WAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EDENIC_GREEN_PLUS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EDENIC_GREEN_PLUS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CRYSTALLINE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CRYSTALLINE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_LOOKING_FORWARD.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_LOOKING_FORWARD.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SKYSAIL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SKYSAIL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_IN_BETWEEN_YEARS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_IN_BETWEEN_YEARS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DRIFTER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DRIFTER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HEALS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HEALS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_STAR_LEVEL_II.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_STAR_LEVEL_II.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNDERWATER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNDERWATER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HELLO_EARTH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HELLO_EARTH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HAZY_TRIP.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_HAZY_TRIP.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CALIGULA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CALIGULA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_BLISS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_BLISS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINE_YOU.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINE_YOU.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PUNCH_YOUR_FACE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_PUNCH_YOUR_FACE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EARTH_BOUND.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_EARTH_BOUND.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHROME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHROME.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNCONSIOUS_RECOLLECTS_II.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNCONSIOUS_RECOLLECTS_II.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_TRANQUILITY_PATH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_TRANQUILITY_PATH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ARCARDIA_TOWN.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ARCARDIA_TOWN.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHIC_SOLITUDE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_CHIC_SOLITUDE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SUPERFICIALISM.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_SUPERFICIALISM.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNIT_1644.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_UNIT_1644.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DRIVE_SLOW.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_DRIVE_SLOW.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NO_FUTURE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_NO_FUTURE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_AQUA_PURA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_AQUA_PURA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_U_KNOW.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_U_KNOW.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_A_NEW_DAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_A_NEW_DAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_RED_SKIES.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_RED_SKIES.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINITE_TIME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_FINITE_TIME.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ALL_I_WANT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Moditems.MUSIC_DISC_ALL_I_WANT.getKey());


    }
}
