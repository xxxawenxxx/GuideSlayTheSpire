package com.warm.slaythespireguide.guideslaythespire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class RelicListContainer extends AppCompatActivity {
    private static final String TAG = "RelicListContainer";
    private AdView adView;

    // data variable
    private ArrayList<Integer> relicImg = new ArrayList<>();
    private ArrayList<String> relicName = new ArrayList<>();
    private ArrayList<String> relicDesc = new ArrayList<>();
    private TextView containerHeader;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);
        containerHeader = findViewById(R.id.container_header);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: started");

        if (getIntent().hasExtra("relic_type")) {
            String relicType = getIntent().getStringExtra("relic_type");
            initBitmap(relicType);
        }
    }

    private void initBitmap(String relicType) {
        prepareData(relicType);
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.monster_list_container);
        Relic_RecyclerViewAdapter adapter = new Relic_RecyclerViewAdapter(this, relicImg, relicName, relicDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void prepareData(String relicType) {
        Log.d(TAG, "prepareData: preparing data..");

        // Clear ArrayList
        relicImg.clear();
        relicName.clear();
        relicDesc.clear();

        // =============================
        // COMMON
        // =============================
        if (relicType.equals("common")) {
            containerHeader.setText("Common Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_common_anchor);
            relicName.add("Anchor");
            relicDesc.add(getString(R.string.anchor_desc));

            relicImg.add(R.drawable.relic_common_ancientteaset);
            relicName.add("Ancient Tea Set");
            relicDesc.add(getString(R.string.teaset_desc));

            relicImg.add(R.drawable.relic_common_artofwar);
            relicName.add("Art of War");
            relicDesc.add(getString(R.string.artofwar_desc));

            relicImg.add(R.drawable.relic_common_bagofmarble);
            relicName.add("Bag of Marble");
            relicDesc.add(getString(R.string.bagofmarble_desc));

            relicImg.add(R.drawable.relic_common_bagofprepare);
            relicName.add("Bag of Preparation");
            relicDesc.add(getString(R.string.bagofpreparation_desc));

            relicImg.add(R.drawable.relic_common_bloodvial);
            relicName.add("Blood Vial");
            relicDesc.add(getString(R.string.bloodvial_desc));

            relicImg.add(R.drawable.relic_common_bronzescale);
            relicName.add("Bronze Scale");
            relicDesc.add(getString(R.string.bronzescales_desc));

            relicImg.add(R.drawable.relic_common_centennialpuzzle);
            relicName.add("Centennial Puzzle");
            relicDesc.add(getString(R.string.centennialpuzzle_desc));

            relicImg.add(R.drawable.relic_common_datadisk);
            relicName.add("Data Disk");
            relicDesc.add(getString(R.string.datadisk_desc));

            relicImg.add(R.drawable.relic_common_dreamcatcher);
            relicName.add("Dream Catcher");
            relicDesc.add(getString(R.string.dreamcatcher_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_common_happyflower);
            relicName.add("Happy Flower");
            relicDesc.add(getString(R.string.happyflower_desc));

            relicImg.add(R.drawable.relic_common_juzubracelet);
            relicName.add("Juzu Bracelet");
            relicDesc.add(getString(R.string.suzubracelet_desc));

            relicImg.add(R.drawable.relic_common_lantern);
            relicName.add("Lantern");
            relicDesc.add(getString(R.string.lantern_desc));

            relicImg.add(R.drawable.relic_common_mawbank);
            relicName.add("Maw Bank");
            relicDesc.add(getString(R.string.mawbank_desc));

            relicImg.add(R.drawable.relic_common_oddlysmoothstone);
            relicName.add("Oddly Smooth Stone");
            relicDesc.add(getString(R.string.oddlysmoothstone_desc));

            relicImg.add(R.drawable.relic_common_omamori);
            relicName.add("Omamori");
            relicDesc.add(getString(R.string.omamori_desc));

            relicImg.add(R.drawable.relic_common_orichalcum);
            relicName.add("Orichalcum");
            relicDesc.add(getString(R.string.orichalcum_desc));

            relicImg.add(R.drawable.relic_common_pennib);
            relicName.add("Pen Nib");
            relicDesc.add(getString(R.string.pennib_desc));

            relicImg.add(R.drawable.relic_common_potionbelt);
            relicName.add("Potion Belt");
            relicDesc.add(getString(R.string.potionbelt_desc));

            relicImg.add(R.drawable.relic_common_preservedinsect);
            relicName.add("Preserved Insect");
            relicDesc.add(getString(R.string.preservedinsect_desc));

            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_common_redskull);
            relicName.add("Red Skull");
            relicDesc.add(getString(R.string.redskull_desc));

            relicImg.add(R.drawable.relic_common_regalpilow);
            relicName.add("Regal Pillow");
            relicDesc.add(getString(R.string.regalpillow_desc));

            relicImg.add(R.drawable.relic_common_smilingmask);
            relicName.add("Smiling Mask");
            relicDesc.add(getString(R.string.smilingmask_desc));

            relicImg.add(R.drawable.relic_common_snakeskull);
            relicName.add("Snecko Skull");
            relicDesc.add(getString(R.string.sneckoskull_desc));

            relicImg.add(R.drawable.relic_common_strawberry);
            relicName.add("Strawberry");
            relicDesc.add(getString(R.string.strawberry_desc));

            relicImg.add(R.drawable.relic_common_theboot);
            relicName.add("The Boot");
            relicDesc.add(getString(R.string.theboot_desc));

            relicImg.add(R.drawable.relic_common_tinychest);
            relicName.add("Tiny Chest");
            relicDesc.add(getString(R.string.tinychest_desc));

            relicImg.add(R.drawable.relic_common_vajra);
            relicName.add("Vajra");
            relicDesc.add(getString(R.string.vajra_desc));

            relicImg.add(R.drawable.relic_common_warpaint);
            relicName.add("War Paint");
            relicDesc.add(getString(R.string.warpaint_desc));

            relicImg.add(R.drawable.relic_common_whetstone);
            relicName.add("Whetstone");
            relicDesc.add(getString(R.string.whetstone_desc));

            // ------------------------------------------ 30
        }

        // =============================
        // UNCOMMON
        // =============================
        else if (relicType.equals("uncommon")) {
            containerHeader.setText("Uncommon Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_uncommon_bluecandle);
            relicName.add("Blue Candle");
            relicDesc.add(getString(R.string.bluecandle_desc));

            relicImg.add(R.drawable.relic_uncommon_bottledflame);
            relicName.add("Bottled Flame");
            relicDesc.add(getString(R.string.bottledflame_desc));

            relicImg.add(R.drawable.relic_uncommon_bottledlightning);
            relicName.add("Bottled Lightning");
            relicDesc.add(getString(R.string.bottledlightning_desc));

            relicImg.add(R.drawable.relic_uncommon_bottledtornado);
            relicName.add("Bottled Tornado");
            relicDesc.add(getString(R.string.bottledtornado_desc));

            relicImg.add(R.drawable.relic_uncommon_darkstonependant);
            relicName.add("Darkstone Periapt");
            relicDesc.add(getString(R.string.darkstoneperiapt_desc));

            relicImg.add(R.drawable.relic_uncommon_frozenegg);
            relicName.add("Frozen Egg");
            relicDesc.add(getString(R.string.frozenegg_desc));

            relicImg.add(R.drawable.relic_uncommon_moltenegg);
            relicName.add("Molten Egg");
            relicDesc.add(getString(R.string.moltenegg_desc));

            relicImg.add(R.drawable.relic_uncommon_toxicegg);
            relicName.add("Toxic Egg");
            relicDesc.add(getString(R.string.toxicegg_desc));

            relicImg.add(R.drawable.relic_uncommon_goldplatedcables);
            relicName.add("Gold Plated Cables");
            relicDesc.add(getString(R.string.goldplatedcable_desc));

            relicImg.add(R.drawable.relic_uncommon_gremlinhorn);
            relicName.add("Gremlin Horn");
            relicDesc.add(getString(R.string.gremlinhorn_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_uncommon_kunai);
            relicName.add("Kunai");
            relicDesc.add(getString(R.string.kunai_desc));

            relicImg.add(R.drawable.relic_uncommon_letteropener);
            relicName.add("Letter Opener");
            relicDesc.add(getString(R.string.letteropener_desc));

            relicImg.add(R.drawable.relic_uncommon_matryoshka);
            relicName.add("Matryoshka");
            relicDesc.add(getString(R.string.matryoshka_desc));

            relicImg.add(R.drawable.relic_uncommon_meatonthebone);
            relicName.add("Meat on the Bone");
            relicDesc.add(getString(R.string.meatonthebone_desc));

            relicImg.add(R.drawable.relic_uncommon_mercuryhourglass);
            relicName.add("Mercury Hourglass");
            relicDesc.add(getString(R.string.mercuryhourglass_desc));

            relicImg.add(R.drawable.relic_uncommon_mummifiedhand);
            relicName.add("Mummified Hand");
            relicDesc.add(getString(R.string.mummifiedhand_desc));

            relicImg.add(R.drawable.relic_uncommon_ninjascroll);
            relicName.add("Ninja Scroll");
            relicDesc.add(getString(R.string.ninjascroll_desc));

            relicImg.add(R.drawable.relic_uncommon_ornamentalfan);
            relicName.add("Ornamental Fan");
            relicDesc.add(getString(R.string.ornamentalfan_desc));

            relicImg.add(R.drawable.relic_uncommon_pantograph);
            relicName.add("Pantograph");
            relicDesc.add(getString(R.string.pantograph_desc));

            relicImg.add(R.drawable.relic_uncommon_paperkrane);
            relicName.add("Paper Krane");
            relicDesc.add(getString(R.string.paperkrane_desc));

            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_uncommon_paperphrog);
            relicName.add("Paper Phrog");
            relicDesc.add(getString(R.string.paperphrog_desc));

            relicImg.add(R.drawable.relic_uncommon_pear);
            relicName.add("Pear");
            relicDesc.add(getString(R.string.pear_desc));

            relicImg.add(R.drawable.relic_uncommon_questioncard);
            relicName.add("Question Card");
            relicDesc.add(getString(R.string.questioncard_desc));

            relicImg.add(R.drawable.relic_uncommon_runicdedocahedron);
            relicName.add("Runic Dodecahedron");
            relicDesc.add(getString(R.string.runicdodecahedron_desc));

            relicImg.add(R.drawable.relic_uncommon_selformingclay);
            relicName.add("Self-Forming Clay");
            relicDesc.add(getString(R.string.selfformingclay_desc));

            relicImg.add(R.drawable.relic_uncommon_shuriken);
            relicName.add("Shuriken");
            relicDesc.add(getString(R.string.shuriken_desc));

            relicImg.add(R.drawable.relic_uncommon_singingbowl);
            relicName.add("Singing Bowl");
            relicDesc.add(getString(R.string.singingbowl_desc));

            relicImg.add(R.drawable.relic_uncommon_sundial);
            relicName.add("Sundial");
            relicDesc.add(getString(R.string.sundial_desc));

            relicImg.add(R.drawable.relic_uncommon_symbioticvirus);
            relicName.add("Symbiotic Virus");
            relicDesc.add(getString(R.string.symbioticvirus_desc));

            relicImg.add(R.drawable.relic_uncommon_thecourier);
            relicName.add("The Courier");
            relicDesc.add(getString(R.string.thecourier_desc));

            // ------------------------------------------ 30
        }

        // =============================
        // RARE
        // =============================
        else if (relicType.equals("rare")) {
            containerHeader.setText("Rare Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Bird-Faced Urn");
            relicDesc.add(getString(R.string.birdfacedurn_desc));

            relicImg.add(R.drawable.relic_rare_calipers);
            relicName.add("Calipers");
            relicDesc.add(getString(R.string.calipers_desc));

            relicImg.add(R.drawable.relic_rare_championbelt);
            relicName.add("Champion Belt");
            relicDesc.add(getString(R.string.championbelt_desc));

            relicImg.add(R.drawable.relic_rare_charonashes);
            relicName.add("Charon's Ashes");
            relicDesc.add(getString(R.string.charonsashes_desc));

            relicImg.add(R.drawable.relic_rare_deadbranch);
            relicName.add("Dead Branch");
            relicDesc.add(getString(R.string.deadbranch_desc));

            relicImg.add(R.drawable.relic_rare_duvudoll);
            relicName.add("Du-Vu Doll");
            relicDesc.add(getString(R.string.duvudoll_desc));

            relicImg.add(R.drawable.relic_rare_emotionchip);
            relicName.add("Emotion Chip");
            relicDesc.add(getString(R.string.emotionchip_desc));

            relicImg.add(R.drawable.relic_rare_fossilizedhelix);
            relicName.add("Fossilized Helix");
            relicDesc.add(getString(R.string.fossilizedhelix_desc));

            relicImg.add(R.drawable.relic_rare_gamblingchip);
            relicName.add("Gambling Chip");
            relicDesc.add(getString(R.string.gamblingchip_desc));

            relicImg.add(R.drawable.relic_rare_ginger);
            relicName.add("Ginger");
            relicDesc.add(getString(R.string.ginger_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_rare_girya);
            relicName.add("Girya");
            relicDesc.add(getString(R.string.girya_desc));

            relicImg.add(R.drawable.relic_rare_icecream);
            relicName.add("Ice Cream");
            relicDesc.add(getString(R.string.icecream_desc));

            relicImg.add(R.drawable.relic_rare_incenseburner);
            relicName.add("Incense Burner");
            relicDesc.add(getString(R.string.incenseburner_desc));

            relicImg.add(R.drawable.relic_rare_magicflower);
            relicName.add("Magic Flower");
            relicDesc.add(getString(R.string.magicflower_desc));

            relicImg.add(R.drawable.relic_rare_mango);
            relicName.add("Mango");
            relicDesc.add(getString(R.string.mango_desc));

            relicImg.add(R.drawable.relic_rare_nunchaku);
            relicName.add("Nunchaku");
            relicDesc.add(getString(R.string.nunchaku_desc));

            relicImg.add(R.drawable.relic_rare_oldcoin);
            relicName.add("Old Coin");
            relicDesc.add(getString(R.string.oldcoin_desc));

            relicImg.add(R.drawable.relic_rare_peacpipe);
            relicName.add("Peace Pipe");
            relicDesc.add(getString(R.string.peacepipe_desc));

            relicImg.add(R.drawable.relic_rare_pocketwatch);
            relicName.add("Pocketwatch");
            relicDesc.add(getString(R.string.pocketwatch_desc));

            relicImg.add(R.drawable.relic_rare_prayerwheel);
            relicName.add("Prayer Wheel");
            relicDesc.add(getString(R.string.prayerwheel_desc));

            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_rare_shovel);
            relicName.add("Shovel");
            relicDesc.add(getString(R.string.shovel_desc));

            relicImg.add(R.drawable.relic_rare_stonecalendar);
            relicName.add("Stone Calendar");
            relicDesc.add(getString(R.string.stonecalendar_desc));

            relicImg.add(R.drawable.relic_rare_thespecimen);
            relicName.add("The Specimen");
            relicDesc.add(getString(R.string.rarespecimen_desc));

            relicImg.add(R.drawable.relic_rare_threadandneedle);
            relicName.add("Thread and Needle");
            relicDesc.add(getString(R.string.threadandneedle_desc));

            relicImg.add(R.drawable.relic_rare_tingsha);
            relicName.add("Tingsha");
            relicDesc.add(getString(R.string.tingsha_desc));

            relicImg.add(R.drawable.relic_rare_torii);
            relicName.add("Torii");
            relicDesc.add(getString(R.string.torii_desc));

            relicImg.add(R.drawable.relic_rare_toughbandage);
            relicName.add("Tough Bandages");
            relicDesc.add(getString(R.string.toughbandages_desc));

            relicImg.add(R.drawable.relic_rare_turnip);
            relicName.add("Turnip");
            relicDesc.add(getString(R.string.turnip_desc));

            relicImg.add(R.drawable.relic_rare_unceasingtop);
            relicName.add("Unceasing Top");
            relicDesc.add(getString(R.string.unceasingtop_desc));

            relicImg.add(R.drawable.relic_rare_wingboots);
            relicName.add("Wing Boots");
            relicDesc.add(getString(R.string.wingboots_desc));

            // ------------------------------------------ 30
        }

        // =============================
        // BOSS
        // =============================
        else if (relicType.equals("boss")) {
            containerHeader.setText("Boss Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_boss_astrolabe);
            relicName.add("Astrolabe");
            relicDesc.add(getString(R.string.astrolabe_desc));

            relicImg.add(R.drawable.relic_boss_blackblood);
            relicName.add("Black Blood");
            relicDesc.add(getString(R.string.blackblood_desc));

            relicImg.add(R.drawable.relic_boss_blackstar);
            relicName.add("Black Star");
            relicDesc.add(getString(R.string.blackstar_desc));

            relicImg.add(R.drawable.relic_boss_bustedcrown);
            relicName.add("Busted Crown");
            relicDesc.add(getString(R.string.bustedcrown_desc));

            relicImg.add(R.drawable.relic_boss_callingbell);
            relicName.add("Calling Bell");
            relicDesc.add(getString(R.string.callingbell_desc));

            relicImg.add(R.drawable.relic_boss_coffeedripper);
            relicName.add("Coffee Dripper");
            relicDesc.add(getString(R.string.coffeedripper_desc));

            relicImg.add(R.drawable.relic_boss_cursedkey);
            relicName.add("Cursed Key");
            relicDesc.add(getString(R.string.cursedkey_desc));

            relicImg.add(R.drawable.relic_boss_ectoplasm);
            relicName.add("Ectoplasm");
            relicDesc.add(getString(R.string.ectoplasm_desc));

            relicImg.add(R.drawable.relic_boss_emptycage);
            relicName.add("Empty Cage");
            relicDesc.add(getString(R.string.emptycage_desc));

            relicImg.add(R.drawable.relic_boss_eternalfeather);
            relicName.add("Eternal Feather");
            relicDesc.add(getString(R.string.eternalfeather_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_boss_frozencore);
            relicName.add("Frozen Core");
            relicDesc.add(getString(R.string.frozencore_desc));

            relicImg.add(R.drawable.relic_boss_fusionhammer);
            relicName.add("Fusion Hammer");
            relicDesc.add(getString(R.string.fusionhammer_desc));

            relicImg.add(R.drawable.relic_boss_hoveringkite);
            relicName.add("Hovering Kite");
            relicDesc.add(getString(R.string.hoveringkite_desc));

            relicImg.add(R.drawable.relic_boss_inserter);
            relicName.add("Inserter");
            relicDesc.add(getString(R.string.inserter_desc));

            relicImg.add(R.drawable.relic_boss_lizardtail);
            relicName.add("Lizard Tail");
            relicDesc.add(getString(R.string.lizardtail_desc));

            relicImg.add(R.drawable.relic_boss_markofpain);
            relicName.add("Mark of Pain");
            relicDesc.add(getString(R.string.markofpain_desc));

            relicImg.add(R.drawable.relic_boss_nuclearbattery);
            relicName.add("Nuclear Battery");
            relicDesc.add(getString(R.string.nuclearbattery_desc));

            relicImg.add(R.drawable.relic_boss_orrery);
            relicName.add("Orrery");
            relicDesc.add(getString(R.string.orrery_desc));

            relicImg.add(R.drawable.relic_boss_pandoraboz);
            relicName.add("Pandora's Box");
            relicDesc.add(getString(R.string.pandorasbox_desc));

            relicImg.add(R.drawable.relic_boss_philosopherstone);
            relicName.add("Philosopher's Stone");
            relicDesc.add(getString(R.string.philosopherstone_desc));

            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_boss_ringoftheserpent);
            relicName.add("Ring of the Serpent");
            relicDesc.add(getString(R.string.ringoftheserpent_desc));

            relicImg.add(R.drawable.relic_boss_runiccube);
            relicName.add("Runic Cube");
            relicDesc.add(getString(R.string.runiccube_desc));

            relicImg.add(R.drawable.relic_boss_runicdome);
            relicName.add("Runic Dome");
            relicDesc.add(getString(R.string.runicdome_desc));

            relicImg.add(R.drawable.relic_boss_runicpyramid);
            relicName.add("Runic Pyramid");
            relicDesc.add(getString(R.string.runicpyramid_desc));

            relicImg.add(R.drawable.relic_boss_sneckoeyes);
            relicName.add("Snecko Eye");
            relicDesc.add(getString(R.string.sneckoeye_desc));

            relicImg.add(R.drawable.relic_boss_sozu);
            relicName.add("Sozu");
            relicDesc.add(getString(R.string.sozu_desc));

            relicImg.add(R.drawable.relic_boss_tinyhouse);
            relicName.add("Tiny House");
            relicDesc.add(getString(R.string.tinyhouse_desc));

            relicImg.add(R.drawable.relic_boss_velvetchoker);
            relicName.add("Velvet Choker");
            relicDesc.add(getString(R.string.velvetchoker_desc));

            relicImg.add(R.drawable.relic_boss_whitebeaststatue);
            relicName.add("White Beast Statue");
            relicDesc.add(getString(R.string.whitebeaststatue_desc));

            relicImg.add(R.drawable.relic_boss_wristblade);
            relicName.add("Wrist Blade");
            relicDesc.add(getString(R.string.wristblade_desc));

            // ------------------------------------------ 30
        }

        // =============================
        // SHOP
        // =============================
        else if (relicType.equals("shop")) {
            containerHeader.setText("Shop Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_shop_brimstone);
            relicName.add("Brimstone");
            relicDesc.add(getString(R.string.brimstone_desc));

            relicImg.add(R.drawable.relic_shop_cauldron);
            relicName.add("Cauldron");
            relicDesc.add(getString(R.string.cauldron_desc));

            relicImg.add(R.drawable.relic_shop_chemicalx);
            relicName.add("Chemical X");
            relicDesc.add(getString(R.string.chemicalx_desc));

            relicImg.add(R.drawable.relic_shop_clockworksouvenir);
            relicName.add("Clockwork Souvenir");
            relicDesc.add(getString(R.string.clockworksouvenir_desc));

            relicImg.add(R.drawable.relic_shop_dollysmirror);
            relicName.add("Dolly's Mirror");
            relicDesc.add(getString(R.string.dollysmirros_desc));

            relicImg.add(R.drawable.relic_shop_frozeneye);
            relicName.add("Frozen Eye");
            relicDesc.add(getString(R.string.frozeneye_desc));

            relicImg.add(R.drawable.relic_shop_handdrill);
            relicName.add("Hand Drill");
            relicDesc.add(getString(R.string.handdrill_desc));

            relicImg.add(R.drawable.relic_shop_leeswaffle);
            relicName.add("Lee's Waffle");
            relicDesc.add(getString(R.string.leeswaffle_desc));

            relicImg.add(R.drawable.relic_shop_mealticket);
            relicName.add("Meal Ticket");
            relicDesc.add(getString(R.string.mealticket_desc));

            relicImg.add(R.drawable.relic_shop_medicalkit);
            relicName.add("Medical Kit");
            relicDesc.add(getString(R.string.medicalkit_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_shop_membershipcard);
            relicName.add("Membership Card");
            relicDesc.add(getString(R.string.membershipcard_desc));

            relicImg.add(R.drawable.relic_shop_orangepellets);
            relicName.add("Orange Pellets");
            relicDesc.add(getString(R.string.orangepellets_desc));

            relicImg.add(R.drawable.relic_shop_prismaticshard);
            relicName.add("Prismatic Shard");
            relicDesc.add(getString(R.string.prismaticshard_desc));

            relicImg.add(R.drawable.relic_shop_runicapacitor);
            relicName.add("Runic Capacitor");
            relicDesc.add(getString(R.string.runiccapacitor_desc));

            relicImg.add(R.drawable.relic_shop_lingofcourage);
            relicName.add("Sling of Courage");
            relicDesc.add(getString(R.string.slingofcourage_desc));

            relicImg.add(R.drawable.relic_shop_strangespoon);
            relicName.add("Strange Spoon");
            relicDesc.add(getString(R.string.strangespoon_desc));

            relicImg.add(R.drawable.relic_shop_theabacus);
            relicName.add("The Abacus");
            relicDesc.add(getString(R.string.theabacus_desc));

            relicImg.add(R.drawable.relic_shop_toolbox);
            relicName.add("Toolbox");
            relicDesc.add(getString(R.string.toolbox_desc));

            relicImg.add(R.drawable.relic_shop_toyornithopter);
            relicName.add("Toy Ornithopter");
            relicDesc.add(getString(R.string.toyornithopter_desc));

            relicImg.add(R.drawable.relic_shop_twistedfunnel);
            relicName.add("Twisted Funnel");
            relicDesc.add(getString(R.string.twistedfunnel_desc));

            // ------------------------------------------ 20
        }

        // =============================
        // EVENT
        // =============================
        else if (relicType.equals("event")) {
            containerHeader.setText("Event Relics");
            // ------------------------------------------
            relicImg.add(R.drawable.relic_event_bloodyidol);
            relicName.add("Bloody Idol");
            relicDesc.add(getString(R.string.bloodyidol_desc));

            relicImg.add(R.drawable.relic_event_cultistheadpice);
            relicName.add("Cultist Headpiece");
            relicDesc.add(getString(R.string.cultistheadpiece_desc));

            relicImg.add(R.drawable.relic_event_enchiridion);
            relicName.add("Enchiridion");
            relicDesc.add(getString(R.string.enchiridion_desc));

            relicImg.add(R.drawable.relic_event_faceofcleric);
            relicName.add("Face of Cleric");
            relicDesc.add(getString(R.string.faceofcleric_desc));

            relicImg.add(R.drawable.relic_event_goldenidol);
            relicName.add("Golden Idol");
            relicDesc.add(getString(R.string.goldenidol_desc));

            relicImg.add(R.drawable.relic_event_gremlinvisage);
            relicName.add("Gremlin Visage");
            relicDesc.add(getString(R.string.gremlinvisage_desc));

            relicImg.add(R.drawable.relic_event_markofthebloom);
            relicName.add("Mark of the Bloom");
            relicDesc.add(getString(R.string.markofthebloom_desc));

            relicImg.add(R.drawable.relic_event_mutagenicstrength);
            relicName.add("Mutagenic Strength");
            relicDesc.add(getString(R.string.mutagenicstrength_desc));

            relicImg.add(R.drawable.relic_event_nlothgift);
            relicName.add("N'loth's Gift");
            relicDesc.add(getString(R.string.nlothsgift_desc));

            relicImg.add(R.drawable.relic_event_nlothhungryface);
            relicName.add("N'loth's Hungry Face");
            relicDesc.add(getString(R.string.nlothshungryface_desc));

            // ------------------------------------------ 10
            relicImg.add(R.drawable.relic_event_necronomicon);
            relicName.add("Necronomicon");
            relicDesc.add(getString(R.string.necronomicon_desc));

            relicImg.add(R.drawable.relic_event_neowlament);
            relicName.add("Neow's Lament");
            relicDesc.add(getString(R.string.neowslament_desc));

            relicImg.add(R.drawable.relic_event_nilrycodex);
            relicName.add("Nilry's Codex");
            relicDesc.add(getString(R.string.nilryscodex_desc));

            relicImg.add(R.drawable.relic_event_oddmushroom);
            relicName.add("Odd Mushroom");
            relicDesc.add(getString(R.string.oddmushroom_desc));

            relicImg.add(R.drawable.relic_event_redmask);
            relicName.add("Red Mask");
            relicDesc.add(getString(R.string.redmask_desc));

            relicImg.add(R.drawable.relic_event_spiritpoop);
            relicName.add("Spirit Poop");
            relicDesc.add(getString(R.string.spiritpoop_desc));

            relicImg.add(R.drawable.relic_event_ssserpenthead);
            relicName.add("Ssserpent Head");
            relicDesc.add(getString(R.string.ssserpenthead_desc));

            relicImg.add(R.drawable.relic_event_warpedtongs);
            relicName.add("Warped Tongs");
            relicDesc.add(getString(R.string.warpedtongs_desc));

            // ------------------------------------------ 20
        }

        // =============================
        // CHARACTER SPECIFIC
        // =============================
        else if (relicType.equals("character")) {
            containerHeader.setText("Character Specific Relics");
            // ------------------------------------------
            // Ironclad
            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_starter_burningblood);
            relicName.add("Burning Blood");
            relicDesc.add(getString(R.string.burningblood_desc));

            relicImg.add(R.drawable.relic_common_redskull);
            relicName.add("Red Skull");
            relicDesc.add(getString(R.string.redskull_desc));

            relicImg.add(R.drawable.relic_uncommon_paperphrog);
            relicName.add("Paper Phrog");
            relicDesc.add(getString(R.string.paperphrog_desc));

            relicImg.add(R.drawable.relic_uncommon_selformingclay);
            relicName.add("Self-Forming Clay");
            relicDesc.add(getString(R.string.selfformingclay_desc));

            relicImg.add(R.drawable.relic_rare_championbelt);
            relicName.add("Champion Belt");
            relicDesc.add(getString(R.string.championbelt_desc));

            relicImg.add(R.drawable.relic_rare_charonashes);
            relicName.add("Charon's Ashes");
            relicDesc.add(getString(R.string.charonsashes_desc));

            relicImg.add(R.drawable.relic_boss_blackblood);
            relicName.add("Black Blood");
            relicDesc.add(getString(R.string.blackblood_desc));

            relicImg.add(R.drawable.relic_boss_markofpain);
            relicName.add("Mark of Pain");
            relicDesc.add(getString(R.string.markofpain_desc));

            relicImg.add(R.drawable.relic_boss_runiccube);
            relicName.add("Runic Cube");
            relicDesc.add(getString(R.string.runiccube_desc));

            relicImg.add(R.drawable.relic_shop_brimstone);
            relicName.add("Brimstone");
            relicDesc.add(getString(R.string.brimstone_desc));

            // ------------------------------------------ 20
            // Silent
            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_starter_ringofthesnake);
            relicName.add("Ring of the Snake");
            relicDesc.add(getString(R.string.ringofthesnake_desc));

            relicImg.add(R.drawable.relic_common_snakeskull);
            relicName.add("Snecko Skull");
            relicDesc.add(getString(R.string.sneckoskull_desc));

            relicImg.add(R.drawable.relic_uncommon_ninjascroll);
            relicName.add("Ninja Scroll");
            relicDesc.add(getString(R.string.ninjascroll_desc));

            relicImg.add(R.drawable.relic_uncommon_paperkrane);
            relicName.add("Paper Krane");
            relicDesc.add(getString(R.string.paperkrane_desc));

            relicImg.add(R.drawable.relic_rare_thespecimen);
            relicName.add("The Specimen");
            relicDesc.add(getString(R.string.rarespecimen_desc));

            relicImg.add(R.drawable.relic_rare_tingsha);
            relicName.add("Tingsha");
            relicDesc.add(getString(R.string.tingsha_desc));

            relicImg.add(R.drawable.relic_rare_toughbandage);
            relicName.add("Tough Bandages");
            relicDesc.add(getString(R.string.toughbandages_desc));

            relicImg.add(R.drawable.relic_boss_hoveringkite);
            relicName.add("Hovering Kite");
            relicDesc.add(getString(R.string.hoveringkite_desc));

            relicImg.add(R.drawable.relic_boss_ringoftheserpent);
            relicName.add("Ring of the Serpent");
            relicDesc.add(getString(R.string.ringoftheserpent_desc));

            relicImg.add(R.drawable.relic_boss_wristblade);
            relicName.add("Wrist Blade");
            relicDesc.add(getString(R.string.wristblade_desc));

            relicImg.add(R.drawable.relic_shop_twistedfunnel);
            relicName.add("Twisted Funnel");
            relicDesc.add(getString(R.string.twistedfunnel_desc));

            // ------------------------------------------ 20
            // Defect
            // ------------------------------------------ 20
            relicImg.add(R.drawable.relic_starter_crackedcore);
            relicName.add("Cracked Core");
            relicDesc.add(getString(R.string.crackedcore_desc));

            relicImg.add(R.drawable.relic_common_datadisk);
            relicName.add("Data Disk");
            relicDesc.add(getString(R.string.datadisk_desc));

            relicImg.add(R.drawable.relic_uncommon_goldplatedcables);
            relicName.add("Gold-Plated Cables");
            relicDesc.add(getString(R.string.goldplatedcable_desc));

            relicImg.add(R.drawable.relic_uncommon_symbioticvirus);
            relicName.add("Symbiotic Virus");
            relicDesc.add(getString(R.string.symbioticvirus_desc));

            relicImg.add(R.drawable.relic_rare_emotionchip);
            relicName.add("Emotion Chip");
            relicDesc.add(getString(R.string.emotionchip_desc));

            relicImg.add(R.drawable.relic_boss_frozencore);
            relicName.add("Frozen Core");
            relicDesc.add(getString(R.string.frozencore_desc));

            relicImg.add(R.drawable.relic_boss_inserter);
            relicName.add("Inserter");
            relicDesc.add(getString(R.string.inserter_desc));

            relicImg.add(R.drawable.relic_boss_nuclearbattery);
            relicName.add("Nuclear Battery");
            relicDesc.add(getString(R.string.nuclearbattery_desc));

            relicImg.add(R.drawable.relic_shop_runicapacitor);
            relicName.add("Runic Capacitor");
            relicDesc.add(getString(R.string.runiccapacitor_desc));
        }
    }


}
