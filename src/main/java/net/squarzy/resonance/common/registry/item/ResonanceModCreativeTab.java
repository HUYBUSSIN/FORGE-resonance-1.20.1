package net.squarzy.resonance.common.registry.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;


public class ResonanceModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Resonance.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RESONANCE = CREATIVE_MODE_TABS.register("resonance",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Resonanceitems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.get()))
                    .title(Component.translatable("Resonance"))
                    .displayItems((itemDisplayParameters, pOutput) -> {

                        // 1-Yes Da Da Da
                        pOutput.accept(Resonanceitems.MUSIC_DISC_IRREAL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SPACE_PINBALL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNDERWATER_WERE_OKAY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ITS_CHANGED.get());
                        // 2-19999
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NEW_REALIZATION.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NEVERMIND.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SYNTHLINE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_DREAM_PLACE_II.get());
                        // 3-New Twilight Vol.1
                        pOutput.accept(Resonanceitems.MUSIC_DISC_XASD.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CHRONOLOGY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_PINWHEEL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SKUNK.get());
                        // 4-Dated New Aesthetics
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NOME_DA_MUSICA.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_TAKEAGUESS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NOCTURNE_BUTTON_PRESSES.get());
                        // 5-How to See Through Walls?
                        pOutput.accept(Resonanceitems.MUSIC_DISC_WAY_WAY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_I_THINK_ITS_OVER.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NEW_MIDSTS_ACID.get());
                        // 6-Empty Hiding World
                        pOutput.accept(Resonanceitems.MUSIC_DISC_EDENIC_GREEN_PLUS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CRYSTALLINE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ROULETTE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_MANY_YEARS.get());
                        // 7-Magic Peaks
                        pOutput.accept(Resonanceitems.MUSIC_DISC_LOOKING_FORWARD.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SKYSAIL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_DISCOVERY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NEBLINA.get());
                        // 8-Red Twilight
                        pOutput.accept(Resonanceitems.MUSIC_DISC_IN_BETWEEN_YEARS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_DRIFTER.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_THER.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_PACIFIC.get());
                        // 9-In the Worlde
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HEALS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_STAR_LEVEL_II.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_STAR_LEVEL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_32K.get());
                        // 10-Glass Prism
                        pOutput.accept(Resonanceitems.MUSIC_DISC_GLASS_PRISM.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNDERWATER.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_I_SWEAR.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SEE_YOU.get());
                        // 11-Enchanted Instrumentals and Whispers
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HELLO_EARTH.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HAZY_TRIP.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HYPNOSIS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_WASTING_TIME.get());
                        // 12-One Hundred Mornings
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CALIGULA.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_BLISS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_MIND_MIRAGE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_RITUALS.get());
                        // 13-Nostalgi Gaius
                        pOutput.accept(Resonanceitems.MUSIC_DISC_FINE_YOU.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_PUNCH_YOUR_FACE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_LOST_AND_LOST.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ONE_DAY.get());
                        // 14-Gradient Horizont
                        pOutput.accept(Resonanceitems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_EARTHBOUND.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_TRANSIENT_FEELING.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_MOTION.get());
                        // 15-Optimized
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CHROME.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS_II.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_MIZUMI.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS.get());
                        // 16-Plume Valley
                        pOutput.accept(Resonanceitems.MUSIC_DISC_TRANQUILITY_PATH.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ARCADIA_TOWN.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_DREAM_PORT.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HIGHWIND_PRAIRIE.get());
                        // 17-Pale Meditation
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CHIC_SOLITUDE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SUPERFICIALISM.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SEEKING_TRUTH.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_TALKING_AND_TALKING.get());
                        // 18-Vitas of Chaos
                        pOutput.accept(Resonanceitems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNIT_1644.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_TMIASFOR_CREEP.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_PROMYSHLENNYI.get());
                        // 19-Reflections
                        pOutput.accept(Resonanceitems.MUSIC_DISC_DRIVE_SLOW.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_NO_FUTURE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ARE_YOU_SAD_ENOUGH.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CHASING_THE_SUN.get());
                        // 20-Nematophy
                        pOutput.accept(Resonanceitems.MUSIC_DISC_AQUA_PURA.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_U_KNOW.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_SEGA.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_WHITENOISETRUTHFULL.get());
                        // 21-Vibes
                        pOutput.accept(Resonanceitems.MUSIC_DISC_A_NEW_DAY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_RED_SKIES.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ANOTHER_DAY.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_AFTER.get());
                        // 22-Cut Up Sections
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ALL_I_WANT.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_REFRESH_SQUEEZED.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_07_101FITNESS.get());
                        // Finite Time
                        pOutput.accept(Resonanceitems.MUSIC_DISC_FINITE_TIME.get());
                        pOutput.accept(Resonanceitems.DISC_FRAGMENT_FINITE_TIME.get());
                        // Lynx
                        pOutput.accept(Resonanceitems.MUSIC_DISC_LYNX.get());
                        pOutput.accept(Resonanceitems.DISC_FRAGMENT_LYNX.get());
                        // Achievement
                        pOutput.accept(Resonanceitems.MUSIC_DISC_ACHIEVEMENT.get());
                        pOutput.accept(Resonanceitems.DISC_FRAGMENT_ACHIEVEMENT.get());
                        // Farvel
                        pOutput.accept(Resonanceitems.MUSIC_DISC_FARVEL.get());
                        // History Magic
                        pOutput.accept(Resonanceitems.MUSIC_DISC_HISTORY_MAGIC.get());
                        pOutput.accept(Resonanceitems.DISC_FRAGMENT_HISTORY_MAGIC.get());
                        // Pnemia
                        pOutput.accept(Resonanceitems.MUSIC_DISC_PNEMIA.get());
                        // Xorri
                        pOutput.accept(Resonanceitems.MUSIC_DISC_XORRI.get());
                        // Clairvoyance
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CLAIRVOYANCE.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_CONFLICTING_IDEAS.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_BESTILL.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_UNISON.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_REACHING_OUT.get());
                        pOutput.accept(Resonanceitems.MUSIC_DISC_LITTLE_TO_NO_MEANING.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
