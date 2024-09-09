package net.squarzy.resonance.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.common.registry.item.Resonanceitems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Resonance.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // 1-Yes Da Da Da
        simpleItem(Resonanceitems.MUSIC_DISC_IRREAL);
        simpleItem(Resonanceitems.MUSIC_DISC_SPACE_PINBALL);
        simpleItem(Resonanceitems.MUSIC_DISC_UNDERWATER_WERE_OKAY);
        simpleItem(Resonanceitems.MUSIC_DISC_ITS_CHANGED);
        // 2-19999
        simpleItem(Resonanceitems.MUSIC_DISC_NEW_REALIZATION);
        simpleItem(Resonanceitems.MUSIC_DISC_NEVERMIND);
        simpleItem(Resonanceitems.MUSIC_DISC_SYNTHLINE);
        simpleItem(Resonanceitems.MUSIC_DISC_DREAM_PLACE_II);
        // 3-New Twilight Vol.1
        simpleItem(Resonanceitems.MUSIC_DISC_XASD);
        simpleItem(Resonanceitems.MUSIC_DISC_CHRONOLOGY);
        simpleItem(Resonanceitems.MUSIC_DISC_PINWHEEL);
        simpleItem(Resonanceitems.MUSIC_DISC_SKUNK);
        // 4-Dated New Aesthetics
        simpleItem(Resonanceitems.MUSIC_DISC_NOME_DA_MUSICA);
        simpleItem(Resonanceitems.MUSIC_DISC_TAKEAGUESS);
        simpleItem(Resonanceitems.MUSIC_DISC_HOW_HE_FOUND_THE_WORLD_ALL_STRANGE_AND_THE_WORLD_FOUND_HIM_STRANGE_LIKEWISE);
        simpleItem(Resonanceitems.MUSIC_DISC_NOCTURNE_BUTTON_PRESSES);
        // 5-How to See Through Walls
        simpleItem(Resonanceitems.MUSIC_DISC_WAY_WAY);
        simpleItem(Resonanceitems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS);
        simpleItem(Resonanceitems.MUSIC_DISC_I_THINK_ITS_OVER);
        simpleItem(Resonanceitems.MUSIC_DISC_NEW_MIDSTS_ACID);
        // 6-Empty Hiding World
        simpleItem(Resonanceitems.MUSIC_DISC_EDENIC_GREEN_PLUS);
        simpleItem(Resonanceitems.MUSIC_DISC_CRYSTALLINE);
        simpleItem(Resonanceitems.MUSIC_DISC_ROULETTE);
        simpleItem(Resonanceitems.MUSIC_DISC_MANY_YEARS);
        // 7-Magic Peaks
        simpleItem(Resonanceitems.MUSIC_DISC_LOOKING_FORWARD);
        simpleItem(Resonanceitems.MUSIC_DISC_SKYSAIL);
        simpleItem(Resonanceitems.MUSIC_DISC_DISCOVERY);
        simpleItem(Resonanceitems.MUSIC_DISC_NEBLINA);
        // 8-Red Twilight
        simpleItem(Resonanceitems.MUSIC_DISC_IN_BETWEEN_YEARS);
        simpleItem(Resonanceitems.MUSIC_DISC_DRIFTER);
        simpleItem(Resonanceitems.MUSIC_DISC_THER);
        simpleItem(Resonanceitems.MUSIC_DISC_PACIFIC);
        // 9-In the Worlde
        simpleItem(Resonanceitems.MUSIC_DISC_HEALS);
        simpleItem(Resonanceitems.MUSIC_DISC_STAR_LEVEL_II);
        simpleItem(Resonanceitems.MUSIC_DISC_STAR_LEVEL);
        simpleItem(Resonanceitems.MUSIC_DISC_32K);
        // 10-Glass Prism
        simpleItem(Resonanceitems.MUSIC_DISC_GLASS_PRISM);
        simpleItem(Resonanceitems.MUSIC_DISC_UNDERWATER);
        simpleItem(Resonanceitems.MUSIC_DISC_I_SWEAR);
        simpleItem(Resonanceitems.MUSIC_DISC_SEE_YOU);
        // 11-Enchanted Instrumentals and Whispers
        simpleItem(Resonanceitems.MUSIC_DISC_HELLO_EARTH);
        simpleItem(Resonanceitems.MUSIC_DISC_HAZY_TRIP);
        simpleItem(Resonanceitems.MUSIC_DISC_HYPNOSIS);
        simpleItem(Resonanceitems.MUSIC_DISC_WASTING_TIME);
        // 12-One Hundred Mornings
        simpleItem(Resonanceitems.MUSIC_DISC_CALIGULA);
        simpleItem(Resonanceitems.MUSIC_DISC_BLISS);
        simpleItem(Resonanceitems.MUSIC_DISC_MIND_MIRAGE);
        simpleItem(Resonanceitems.MUSIC_DISC_RITUALS);
        // 13-Nostalgi Gaius
        simpleItem(Resonanceitems.MUSIC_DISC_FINE_YOU);
        simpleItem(Resonanceitems.MUSIC_DISC_PUNCH_YOUR_FACE);
        simpleItem(Resonanceitems.MUSIC_DISC_LOST_AND_LOST);
        simpleItem(Resonanceitems.MUSIC_DISC_ONE_DAY);
        // 14-Gradient Horizont
        simpleItem(Resonanceitems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE);
        simpleItem(Resonanceitems.MUSIC_DISC_EARTHBOUND);
        simpleItem(Resonanceitems.MUSIC_DISC_TRANSIENT_FEELING);
        simpleItem(Resonanceitems.MUSIC_DISC_MOTION);
        // 15-Optimized
        simpleItem(Resonanceitems.MUSIC_DISC_CHROME);
        simpleItem(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS_II);
        simpleItem(Resonanceitems.MUSIC_DISC_MIZUMI);
        simpleItem(Resonanceitems.MUSIC_DISC_UNCONSCIOUS_RECOLLECTS);
        // 16-Plume Valley
        simpleItem(Resonanceitems.MUSIC_DISC_TRANQUILITY_PATH);
        simpleItem(Resonanceitems.MUSIC_DISC_ARCADIA_TOWN);
        simpleItem(Resonanceitems.MUSIC_DISC_DREAM_PORT);
        simpleItem(Resonanceitems.MUSIC_DISC_HIGHWIND_PRAIRIE);
        // 17-Pale Meditations
        simpleItem(Resonanceitems.MUSIC_DISC_CHIC_SOLITUDE);
        simpleItem(Resonanceitems.MUSIC_DISC_SUPERFICIALISM);
        simpleItem(Resonanceitems.MUSIC_DISC_SEEKING_TRUTH);
        simpleItem(Resonanceitems.MUSIC_DISC_TALKING_AND_TALKING);
        // 18-Vitas of Chaos
        simpleItem(Resonanceitems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION);
        simpleItem(Resonanceitems.MUSIC_DISC_UNIT_1644);
        simpleItem(Resonanceitems.MUSIC_DISC_TMIASFOR_CREEP);
        simpleItem(Resonanceitems.MUSIC_DISC_PROMYSHLENNYI);
        // 19-Reflections
        simpleItem(Resonanceitems.MUSIC_DISC_DRIVE_SLOW);
        simpleItem(Resonanceitems.MUSIC_DISC_NO_FUTURE);
        simpleItem(Resonanceitems.MUSIC_DISC_ARE_YOU_SAD_ENOUGH);
        simpleItem(Resonanceitems.MUSIC_DISC_CHASING_THE_SUN);
        // 20-Nematophy
        simpleItem(Resonanceitems.MUSIC_DISC_AQUA_PURA);
        simpleItem(Resonanceitems.MUSIC_DISC_U_KNOW);
        simpleItem(Resonanceitems.MUSIC_DISC_SEGA);
        simpleItem(Resonanceitems.MUSIC_DISC_WHITENOISETRUTHFULL);
        // 21-Vibes
        simpleItem(Resonanceitems.MUSIC_DISC_A_NEW_DAY);
        simpleItem(Resonanceitems.MUSIC_DISC_RED_SKIES);
        simpleItem(Resonanceitems.MUSIC_DISC_ANOTHER_DAY);
        simpleItem(Resonanceitems.MUSIC_DISC_AFTER);
        // 22-Cut Up Sections
        simpleItem(Resonanceitems.MUSIC_DISC_ALL_I_WANT);
        simpleItem(Resonanceitems.MUSIC_DISC_REFRESH_SQUEEZED);
        simpleItem(Resonanceitems.MUSIC_DISC_07_101FITNESS);
        // Finite Time
        simpleItem(Resonanceitems.MUSIC_DISC_FINITE_TIME);
        simpleItem(Resonanceitems.DISC_FRAGMENT_FINITE_TIME);
        // Lynx
        simpleItem(Resonanceitems.MUSIC_DISC_LYNX);
        simpleItem(Resonanceitems.DISC_FRAGMENT_LYNX);
        // Achievement
        simpleItem(Resonanceitems.MUSIC_DISC_ACHIEVEMENT);
        simpleItem(Resonanceitems.DISC_FRAGMENT_ACHIEVEMENT);
        // Farvel
        simpleItem(Resonanceitems.MUSIC_DISC_FARVEL);
        // History Magic
        simpleItem(Resonanceitems.MUSIC_DISC_HISTORY_MAGIC);
        simpleItem(Resonanceitems.DISC_FRAGMENT_HISTORY_MAGIC);
        // Pnemia
        simpleItem(Resonanceitems.MUSIC_DISC_PNEMIA);
        // Xorri
        simpleItem(Resonanceitems.MUSIC_DISC_XORRI);
        // Clairvoyance
        simpleItem(Resonanceitems.MUSIC_DISC_UNISON);
        simpleItem(Resonanceitems.MUSIC_DISC_LITTLE_TO_NO_MEANING);
        simpleItem(Resonanceitems.MUSIC_DISC_CONFLICTING_IDEAS);
        simpleItem(Resonanceitems.MUSIC_DISC_CLAIRVOYANCE);
        simpleItem(Resonanceitems.MUSIC_DISC_BESTILL);
        simpleItem(Resonanceitems.MUSIC_DISC_REACHING_OUT);




    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Resonance.MOD_ID, "item/" + item.getId().getPath()));
    }
}


