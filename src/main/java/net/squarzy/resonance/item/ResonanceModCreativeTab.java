package net.squarzy.resonance.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.painting.ResonancePaintingVariants;

public class ResonanceModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Resonance.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RESONANCE = CREATIVE_MODE_TABS.register("resonance",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.get()))
                    .title(Component.translatable("Resonance"))
                    .displayItems((itemDisplayParameters, pOutput) -> {

                        pOutput.accept(Moditems.MUSIC_DISC_IRREAL.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SPACE_PINBALL.get());
                        pOutput.accept(Moditems.MUSIC_DISC_UNDERWATER_WERE_OKAY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NEW_REALIZATION.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NEVERMIND.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SYNTHLINE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_XASD.get());
                        pOutput.accept(Moditems.MUSIC_DISC_CHRONOLOGY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_PINWHEEL.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NOME_DA_MUSICA.get());
                        pOutput.accept(Moditems.MUSIC_DISC_TAKEAGUESS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_WAY_WAY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_I_THINK_ITS_OVER.get());
                        pOutput.accept(Moditems.MUSIC_DISC_EDENIC_GREEN_PLUS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_CRYSTALLINE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ROULETTE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_LOOKING_FORWARD.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SKYSAIL.get());
                        pOutput.accept(Moditems.MUSIC_DISC_DISCOVERY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_IN_BETWEEN_YEARS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_DRIFTER.get());
                        pOutput.accept(Moditems.MUSIC_DISC_THER.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HEALS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_STAR_LEVEL_II.get());
                        pOutput.accept(Moditems.MUSIC_DISC_STAR_LEVEL.get());
                        pOutput.accept(Moditems.MUSIC_DISC_GLASS_PRISM.get());
                        pOutput.accept(Moditems.MUSIC_DISC_UNDERWATER.get());
                        pOutput.accept(Moditems.MUSIC_DISC_I_SWEAR.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HELLO_EARTH.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HAZY_TRIP.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HYPNOSIS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_CALIGULA.get());
                        pOutput.accept(Moditems.MUSIC_DISC_BLISS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_MIND_MIRAGE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_FINE_YOU.get());
                        pOutput.accept(Moditems.MUSIC_DISC_PUNCH_YOUR_FACE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_LOST_AND_LOST.get());
                        pOutput.accept(Moditems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_EARTHBOUND.get());
                        pOutput.accept(Moditems.MUSIC_DISC_TRANSIENT_FEELING.get());
                        pOutput.accept(Moditems.MUSIC_DISC_CHROME.get());
                        pOutput.accept(Moditems.MUSIC_DISC_UNCONSIOUS_RECOLLECTS_II.get());
                        pOutput.accept(Moditems.MUSIC_DISC_MIZUMI.get());
                        pOutput.accept(Moditems.MUSIC_DISC_TRANQUILITY_PATH.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ARCADIA_TOWN.get());
                        pOutput.accept(Moditems.MUSIC_DISC_DREAM_PORT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_CHIC_SOLITUDE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SUPERFICIALISM.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SEEKING_TRUTH.get());
                        pOutput.accept(Moditems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION.get());
                        pOutput.accept(Moditems.MUSIC_DISC_UNIT_1644.get());
                        pOutput.accept(Moditems.MUSIC_DISC_TMIASFOR_CREEP.get());
                        pOutput.accept(Moditems.MUSIC_DISC_DRIVE_SLOW.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NO_FUTURE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ARE_YOU_SAD_ENOUGH.get());
                        pOutput.accept(Moditems.MUSIC_DISC_AQUA_PURA.get());
                        pOutput.accept(Moditems.MUSIC_DISC_U_KNOW.get());
                        pOutput.accept(Moditems.MUSIC_DISC_SEGA.get());
                        pOutput.accept(Moditems.MUSIC_DISC_A_NEW_DAY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_RED_SKIES.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ANOTHER_DAY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ALL_I_WANT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_REFRESH_SQUEEZED.get());
                        pOutput.accept(Moditems.MUSIC_DISC_FINITE_TIME.get());
                        pOutput.accept(Moditems.DISC_FRAGMENT_FINITE_TIME.get());
                        pOutput.accept(Moditems.MUSIC_DISC_LYNX.get());
                        pOutput.accept(Moditems.DISC_FRAGMENT_LYNX.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ACHIEVEMENT.get());
                        pOutput.accept(Moditems.DISC_FRAGMENT_ACHIEVEMENT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_FARVEL.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
