package net.squarzy.resonance.item;

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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.MUSIC_DISC_19999.get()))
                    .title(Component.translatable("Resonance"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(Moditems.MUSIC_DISC_19999.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NEW_TWILIGHT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_DATED_NEW_AESTHETICS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_HOW_TO_SEE_THROUGH_WALLS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_EMPTY_HIDING_WORLD.get());
                        pOutput.accept(Moditems.MUSIC_DISC_MAGIC_PEAKS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_RED_TWILIGHT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_IN_THE_WORLDE.get());
                        pOutput.accept(Moditems.MUSIC_DISC_GLASS_PRISM.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ENCHANTED_INSTRUMENTALS_AND_WHISPERS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_ONE_HUNDRED_MORNINGS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NOSTAlGI_GAIUS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_GRADIENT_HORIZONT.get());
                        pOutput.accept(Moditems.MUSIC_DISC_OPTIMIZED.get());
                        pOutput.accept(Moditems.MUSIC_DISC_PLUME_VALLEY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_PALE_MEDITATIONS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_VISTA_OF_CHAOS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_REFLECTIONS.get());
                        pOutput.accept(Moditems.MUSIC_DISC_NEMATOPHY.get());
                        pOutput.accept(Moditems.MUSIC_DISC_VIBES.get());
                        pOutput.accept(Moditems.MUSIC_DISC_FINITE_TIME.get());
                        pOutput.accept(Moditems.MUSIC_DISC_FINITE_TIME.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
