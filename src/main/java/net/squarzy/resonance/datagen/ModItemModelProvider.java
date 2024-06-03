package net.squarzy.resonance.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.squarzy.resonance.Resonance;
import net.squarzy.resonance.item.Moditems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Resonance.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        simpleItem(Moditems.MUSIC_DISC_IRREAL);
        simpleItem(Moditems.MUSIC_DISC_SPACE_PINBALL);
        simpleItem(Moditems.MUSIC_DISC_NEW_REALIZATION);
        simpleItem(Moditems.MUSIC_DISC_NEVERMIND);
        simpleItem(Moditems.MUSIC_DISC_XASD);
        simpleItem(Moditems.MUSIC_DISC_CHRONOLOGY);
        simpleItem(Moditems.MUSIC_DISC_NOME_DA_MUSICA);
        simpleItem(Moditems.MUSIC_DISC_TAKEAGUESS);
        simpleItem(Moditems.MUSIC_DISC_WAY_WAY);
        simpleItem(Moditems.MUSIC_DISC_WHOS_COUNTING_THE_DAYS);
        simpleItem(Moditems.MUSIC_DISC_EDENIC_GREEN_PLUS);
        simpleItem(Moditems.MUSIC_DISC_CRYSTALLINE);
        simpleItem(Moditems.MUSIC_DISC_LOOKING_FORWARD);
        simpleItem(Moditems.MUSIC_DISC_SKYSAIL);
        simpleItem(Moditems.MUSIC_DISC_IN_BETWEEN_YEARS);
        simpleItem(Moditems.MUSIC_DISC_DRIFTER);
        simpleItem(Moditems.MUSIC_DISC_HEALS);
        simpleItem(Moditems.MUSIC_DISC_STAR_LEVEL_II);
        simpleItem(Moditems.MUSIC_DISC_GLASS_PRISM);
        simpleItem(Moditems.MUSIC_DISC_UNDERWATER);
        simpleItem(Moditems.MUSIC_DISC_HELLO_EARTH);
        simpleItem(Moditems.MUSIC_DISC_HAZY_TRIP);
        simpleItem(Moditems.MUSIC_DISC_CALIGULA);
        simpleItem(Moditems.MUSIC_DISC_BLISS);
        simpleItem(Moditems.MUSIC_DISC_FINE_YOU);
        simpleItem(Moditems.MUSIC_DISC_PUNCH_YOUR_FACE);
        simpleItem(Moditems.MUSIC_DISC_A_CRY_IN_THE_DISTANCE);
        simpleItem(Moditems.MUSIC_DISC_EARTH_BOUND);
        simpleItem(Moditems.MUSIC_DISC_CHROME);
        simpleItem(Moditems.MUSIC_DISC_UNCONSIOUS_RECOLLECTS_II);
        simpleItem(Moditems.MUSIC_DISC_TRANQUILITY_PATH);
        simpleItem(Moditems.MUSIC_DISC_ARCADIA_TOWN);
        simpleItem(Moditems.MUSIC_DISC_CHIC_SOLITUDE);
        simpleItem(Moditems.MUSIC_DISC_SUPERFICIALISM);
        simpleItem(Moditems.MUSIC_DISC_AERODYNAMIC_DISSEMINATION);
        simpleItem(Moditems.MUSIC_DISC_UNIT_1644);
        simpleItem(Moditems.MUSIC_DISC_DRIVE_SLOW);
        simpleItem(Moditems.MUSIC_DISC_NO_FUTURE);
        simpleItem(Moditems.MUSIC_DISC_AQUA_PURA);
        simpleItem(Moditems.MUSIC_DISC_U_KNOW);
        simpleItem(Moditems.MUSIC_DISC_A_NEW_DAY);
        simpleItem(Moditems.MUSIC_DISC_RED_SKIES);
        simpleItem(Moditems.MUSIC_DISC_ALL_I_WANT);
        simpleItem(Moditems.MUSIC_DISC_FINITE_TIME);
        simpleItem(Moditems.MUSIC_DISC_LYNX);



    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Resonance.MOD_ID, "item/" + item.getId().getPath()));
    }
}


