package com.warm.slaythespireguide.guideslaythespire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RelicListContainer extends AppCompatActivity {
    private static final String TAG = "RelicListContainer";

    // data variable
    private ArrayList<Integer> relicImg = new ArrayList<>();
    private ArrayList<String> relicName = new ArrayList<>();
    private ArrayList<String> relicDesc = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);

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
            relicImg.add(R.drawable.relic_uncommon_bluecandle);
            relicName.add("Blue Candle");
            relicDesc.add(getString(R.string.anchor_desc));
        }

        // =============================
        // RARE
        // =============================
        else if (relicType.equals("rare")) {
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Anchor");
            relicDesc.add("Start each combat with 10 block");
        }

        // =============================
        // BOSS
        // =============================
        else if (relicType.equals("boss")) {
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Anchor");
            relicDesc.add("Start each combat with 10 block");
        }

        // =============================
        // SHOP
        // =============================
        else if (relicType.equals("shop")) {
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Anchor");
            relicDesc.add("Start each combat with 10 block");
        }

        // =============================
        // EVENT
        // =============================
        else if (relicType.equals("event")) {
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Anchor");
            relicDesc.add("Start each combat with 10 block");
        }

        // =============================
        // CHARACTER SPECIFIC
        // =============================
        else if (relicType.equals("character")) {
            relicImg.add(R.drawable.relic_rare_birdfacedurn);
            relicName.add("Anchor");
            relicDesc.add("Start each combat with 10 block");
        }
    }


}
