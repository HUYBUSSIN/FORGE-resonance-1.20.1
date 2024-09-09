package net.squarzy.resonance.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.common.registry.item.Resonanceitems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Resonance.MOD_ID, existingFileHelper);

}

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // 1-Yes Da Da Da
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_IRREAL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_IRREAL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SPACE_PINBALL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SPACE_PINBALL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNDERWATER_WERE_OKAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNDERWATER_WERE_OKAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ITS_CHANGED.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ITS_CHANGED.getKey());

        // 2-19999
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEW_REALIZATION.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEW_REALIZATION.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEVERMIND.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEVERMIND.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SYNTHLINE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SYNTHLINE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DREAM_PLACE_II.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DREAM_PLACE_II.getKey());

        // 3-New Twilight Vol.1
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_XASD.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_XASD.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHRONOLOGY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHRONOLOGY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PINWHEEL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PINWHEEL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SKUNK.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SKUNK.getKey());

        // 4-Dated New Aesthetics
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NOME_DA_MUSICA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NOME_DA_MUSICA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TAKEAGUESS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TAKEAGUESS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NOCTURNE_BUTTON_PRESSES.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NOCTURNE_BUTTON_PRESSES.getKey());

        // 5-How to See Through Walls?
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WAY_WAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WAY_WAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_I_THINK_ITS_OVER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_I_THINK_ITS_OVER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEW_MIDSTS_ACID.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEW_MIDSTS_ACID.getKey());

        // 6-Empty Hiding World
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_EDENIC_GREEN_PLUS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_EDENIC_GREEN_PLUS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CRYSTALLINE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CRYSTALLINE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ROULETTE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ROULETTE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MANY_YEARS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MANY_YEARS.getKey());

        // 7-Magic Peaks
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LOOKING_FORWARD.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LOOKING_FORWARD.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SKYSAIL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SKYSAIL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DISCOVERY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DISCOVERY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEBLINA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NEBLINA.getKey());

        // 8-Red Twilight
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_IN_BETWEEN_YEARS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_IN_BETWEEN_YEARS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DRIFTER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DRIFTER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_THER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_THER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PACIFIC.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PACIFIC.getKey());

        // 9-In the Worlde
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HEALS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HEALS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_STAR_LEVEL_II.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_STAR_LEVEL_II.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_STAR_LEVEL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_STAR_LEVEL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_32K.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_32K.getKey());

        // 10-Glass Prism
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_GLASS_PRISM.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNDERWATER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNDERWATER.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_I_SWEAR.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_I_SWEAR.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEE_YOU.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEE_YOU.getKey());

        // 11-Enchanted Instrumentals and Whispers
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HELLO_EARTH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HELLO_EARTH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HAZY_TRIP.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HAZY_TRIP.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HYPNOSIS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HYPNOSIS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WASTING_TIME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WASTING_TIME.getKey());

        // 12-One Hundred Mornings
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CALIGULA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CALIGULA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_BLISS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_BLISS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MIND_MIRAGE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MIND_MIRAGE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_RITUALS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_RITUALS.getKey());

        // 13-Nostalgi Gaius
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_FINE_YOU.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_FINE_YOU.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PUNCH_YOUR_FACE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PUNCH_YOUR_FACE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LOST_AND_LOST.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LOST_AND_LOST.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ONE_DAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ONE_DAY.getKey());

        // 14-Gradient Horizont
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_EARTHBOUND.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_EARTHBOUND.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TRANSIENT_FEELING.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TRANSIENT_FEELING.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MOTION.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MOTION.getKey());

        // 15-Optimized
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHROME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHROME.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS_II.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS_II.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MIZUMI.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_MIZUMI.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS.getKey());

        // 16-Plume Valley
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TRANQUILITY_PATH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TRANQUILITY_PATH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ARCADIA_TOWN.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ARCADIA_TOWN.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DREAM_PORT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DREAM_PORT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HIGHWIND_PRAIRIE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HIGHWIND_PRAIRIE.getKey());

        // 17-Pale Meditation
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHIC_SOLITUDE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHIC_SOLITUDE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SUPERFICIALISM.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SUPERFICIALISM.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEEKING_TRUTH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEEKING_TRUTH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TALKING_AND_TALKING.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TALKING_AND_TALKING.getKey());

        // 19-Vitas pf Chaos
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNIT_1644.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNIT_1644.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TMIASFOR_CREEP.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_TMIASFOR_CREEP.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PROMYSHLENNYI.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PROMYSHLENNYI.getKey());

        // 20-Reflections
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DRIVE_SLOW.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_DRIVE_SLOW.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NO_FUTURE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_NO_FUTURE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ARE_YOU_SAD_ENOUGH.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ARE_YOU_SAD_ENOUGH.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHASING_THE_SUN.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CHASING_THE_SUN.getKey());

        // 21-Nematophy
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AQUA_PURA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AQUA_PURA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_U_KNOW.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_U_KNOW.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEGA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_SEGA.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WHITENOISETRUTHFULL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_WHITENOISETRUTHFULL.getKey());

        // 22-Vibes
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_A_NEW_DAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_A_NEW_DAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_RED_SKIES.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_RED_SKIES.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ANOTHER_DAY.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ANOTHER_DAY.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AFTER.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_AFTER.getKey());

        // 23-Cut Up Sections
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ALL_I_WANT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ALL_I_WANT.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_REFRESH_SQUEEZED.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_REFRESH_SQUEEZED.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_07_101FITNESS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_07_101FITNESS.getKey());


        // Finite Time
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_FINITE_TIME.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.DISC_FRAGMENT_FINITE_TIME.getKey());

        // Lynx
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LYNX.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.DISC_FRAGMENT_LYNX.getKey());

        // Achievement
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_ACHIEVEMENT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.DISC_FRAGMENT_ACHIEVEMENT.getKey());

        // Farvel
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_FARVEL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_FARVEL.getKey());

        // History Magic
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_HISTORY_MAGIC.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.DISC_FRAGMENT_HISTORY_MAGIC.getKey());

        // Pnemia
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PNEMIA.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_PNEMIA.getKey());

        // Xorri
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_XORRI.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_XORRI.getKey());

        // Clairvoyance
        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNISON.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_UNISON.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LITTLE_TO_NO_MEANING.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_LITTLE_TO_NO_MEANING.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CONFLICTING_IDEAS.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CONFLICTING_IDEAS.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CLAIRVOYANCE.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_CLAIRVOYANCE.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_BESTILL.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_BESTILL.getKey());

        this.tag((ItemTags.MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_REACHING_OUT.getKey());

        this.tag((ItemTags.CREEPER_DROP_MUSIC_DISCS))
                .add(Resonanceitems.MUSIC_DISC_REACHING_OUT.getKey());






    }
}
