package com.warm.slaythespireguide.guideslaythespire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class Potion_ListContainer extends AppCompatActivity {
    private static final String TAG = "Potion_ListContainer";

    // data variable
    private ArrayList<Integer> potionImg = new ArrayList<>();
    private ArrayList<String> potionName = new ArrayList<>();
    private ArrayList<String> potionDesc = new ArrayList<>();
    private TextView containerHeader;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);
        containerHeader = findViewById(R.id.container_header);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: started");

        if (getIntent().hasExtra("potion_type")) {
            String relicType = getIntent().getStringExtra("potion_type");
            initBitmap(relicType);
        }
    }

    private void initBitmap(String potionType) {
        prepareData(potionType);
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.monster_list_container);
        Potion_RecyclerViewAdapter adapter = new Potion_RecyclerViewAdapter(this, potionImg, potionName, potionDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void prepareData(String relicType) {
        Log.d(TAG, "prepareData: preparing data..");

        // Clear ArrayList
        potionImg.clear();
        potionName.clear();
        potionDesc.clear();

        if (relicType.equals("common")) {
            containerHeader.setText("Common Potions");
            potionImg.add(R.drawable.potion_common_attackpotion);
            potionName.add("Attack Potion");
            potionDesc.add(getString(R.string.attackpotion_desc));

            potionImg.add(R.drawable.potion_common_blockpotion);
            potionName.add("Block Potion");
            potionDesc.add(getString(R.string.blockpotion_desc));

            potionImg.add(R.drawable.potion_common_dexteritypotion);
            potionName.add("Dexterity Potion");
            potionDesc.add(getString(R.string.dexteritypotion_desc));

            potionImg.add(R.drawable.potion_common_energypotion);
            potionName.add("Energy Potion");
            potionDesc.add(getString(R.string.energypotion_desc));

            potionImg.add(R.drawable.potion_common_explosivepotion);
            potionName.add("Explosive Potion");
            potionDesc.add(getString(R.string.explosivepotion_desc));

            potionImg.add(R.drawable.potion_common_fearpotion);
            potionName.add("Fear Potion");
            potionDesc.add(getString(R.string.fearpotion_desc));

            potionImg.add(R.drawable.potion_common_firepotion);
            potionName.add("Fire Potion");
            potionDesc.add(getString(R.string.firepotion_desc));

            potionImg.add(R.drawable.potion_common_poisonpotion);
            potionName.add("Poison Potion");
            potionDesc.add(getString(R.string.poisonpotion_desc));

            potionImg.add(R.drawable.potion_common_powerpotion);
            potionName.add("Power Potion");
            potionDesc.add(getString(R.string.powerpotion_desc));

            potionImg.add(R.drawable.potion_common_skillpotion);
            potionName.add("Skill Potion");
            potionDesc.add(getString(R.string.skillpotion_desc));

            potionImg.add(R.drawable.potion_common_speedpotion);
            potionName.add("Speed Potion");
            potionDesc.add(getString(R.string.speedpotion_desc));

            potionImg.add(R.drawable.potion_common_steroidpotion);
            potionName.add("Steroid Potion");
            potionDesc.add(getString(R.string.steroidpotion_desc));

            potionImg.add(R.drawable.potion_common_strengthpotion);
            potionName.add("Strength Potion");
            potionDesc.add(getString(R.string.strengthpotion_desc));

            potionImg.add(R.drawable.potion_common_swiftpotion);
            potionName.add("Swift Potion");
            potionDesc.add(getString(R.string.swiftpotion_desc));

            potionImg.add(R.drawable.potion_common_weakpotion);
            potionName.add("Weak Potion");
            potionDesc.add(getString(R.string.weakpotion_desc));
        }

        else if (relicType.equals("uncommon")) {
            containerHeader.setText("Uncommon Potions");
            potionImg.add(R.drawable.potion_uncommon_liquidbronze);
            potionName.add("Liquid Bronze");
            potionDesc.add(getString(R.string.liquidbronzepotion_desc));

            potionImg.add(R.drawable.potion_uncommon_ancientpotion);
            potionName.add("Ancient Potion");
            potionDesc.add(getString(R.string.ancientpotion_desc));

            potionImg.add(R.drawable.potion_uncommon_bloodpotion);
            potionName.add("Blood Potion");
            potionDesc.add(getString(R.string.bloodpotion_desc));

            potionImg.add(R.drawable.potion_uncommon_essenceofsteel);
            potionName.add("Essence Of Steel");
            potionDesc.add(getString(R.string.essenceofsteel_desc));

            potionImg.add(R.drawable.potion_uncommon_gamblerbrew);
            potionName.add("Gambler Brew");
            potionDesc.add(getString(R.string.gamblerbrewpotion_desc));

            potionImg.add(R.drawable.potion_uncommon_ghostinajar);
            potionName.add("Ghost In a Jar");
            potionDesc.add(getString(R.string.ghostinajarpotion_desc));

            potionImg.add(R.drawable.potion_uncommon_regenpotion);
            potionName.add("Regen Potion");
            potionDesc.add(getString(R.string.regenpotion_desc));

        }

        else if (relicType.equals("rare")) {
            containerHeader.setText("Rare Potions");
            potionImg.add(R.drawable.potion_rare_fruitjuice);
            potionName.add("Fruit Juice");
            potionDesc.add(getString(R.string.fruitjuicepotion_desc));

            potionImg.add(R.drawable.potion_rare_entropicbrew);
            potionName.add("Entropic Brew");
            potionDesc.add(getString(R.string.entropicbrew_desc));

            potionImg.add(R.drawable.potion_rare_fairyinabottlepotion);
            potionName.add("Fairy In a Bottle");
            potionDesc.add(getString(R.string.fairyinbottle_desc));

            potionImg.add(R.drawable.potion_rare_smokebomb);
            potionName.add("Smoke Bomb");
            potionDesc.add(getString(R.string.smokebombpotion_desc));

            potionImg.add(R.drawable.potion_rare_sneckooil);
            potionName.add("Snecko Oil");
            potionDesc.add(getString(R.string.sneckooilpotion_desc));

        }

    }
}
