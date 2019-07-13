package com.warm.slaythespireguide.guideslaythespire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class monster_list_container extends AppCompatActivity {
    private AdView adView;
    private static final String TAG = "monster_list_container";

    // data vars
    private ArrayList<String> monsterNames = new ArrayList<>();
    private ArrayList<Integer> monsterImages = new ArrayList<>();
    private ArrayList<String> monsterHP = new ArrayList<>();
    private TextView containerHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);

        containerHeader = findViewById(R.id.container_header);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        getIncomingIntent();
    }

    // Get extra intent data
    private void getIncomingIntent() {
        if(getIntent().hasExtra("monster_type")) {

            String monster_type = getIntent().getStringExtra("monster_type");
            initImageBitmaps(monster_type);
        }
    }

    // Prepare data & init recyclerview
    private void initImageBitmaps(String monster_type) {
        prepareData(monster_type);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.monster_list_container);
        Monster_RecyclerViewAdapter adapter = new Monster_RecyclerViewAdapter(this, monsterImages, monsterNames, monsterHP);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void prepareData(String monster_type) {
        // Clearing ArrayList monster data
        monsterImages.clear();
        monsterNames.clear();

        // Add monster data
        if (monster_type.equals("act1")) {
            containerHeader.setText("ACT 1 Monsters");
            monsterImages.add(R.drawable.monster_act1_cultist);
            monsterNames.add("Cultist");
            monsterHP.add("48-56");
            monsterImages.add(R.drawable.monster_act1_jawworm);
            monsterNames.add("Jaw Worm");
            monsterHP.add("40-46");
            monsterImages.add(R.drawable.monster_act1_louse_green);
            monsterNames.add("Green Louse");
            monsterHP.add("11-18");
            monsterImages.add(R.drawable.monster_act1_louse_red);
            monsterNames.add("Red Louse");
            monsterHP.add("10-16");
            monsterImages.add(R.drawable.monster_act1_acidslime_s);
            monsterNames.add("Acid Slime S");
            monsterHP.add("8-13");
            monsterImages.add(R.drawable.monster_act1_acidslime_m);
            monsterNames.add("Acid Slime M");
            monsterHP.add("28-34");
            monsterImages.add(R.drawable.monster_act1_acidslime_l);
            monsterNames.add("Acid Slime L");
            monsterHP.add("65-72");
            monsterImages.add(R.drawable.monster_act1_spikeslime_s);
            monsterNames.add("Spike Slime S");
            monsterHP.add("10-15");
            monsterImages.add(R.drawable.monster_act1_spikeslime_m);
            monsterNames.add("Spike Slime M");
            monsterHP.add("28-34");
            monsterImages.add(R.drawable.monster_act1_spikeslime_l);
            monsterNames.add("Spike Slime L");
            monsterHP.add("64-73");
            monsterImages.add(R.drawable.monster_act1_slaver_blue);
            monsterNames.add("Blue Slaver");
            monsterHP.add("46-52");
            monsterImages.add(R.drawable.monster_act1_slaver_red);
            monsterNames.add("Red Slaver");
            monsterHP.add("46-52");
            monsterImages.add(R.drawable.monster_act1_fungibeast);
            monsterNames.add("Fungi Beast");
            monsterHP.add("22-28");
            monsterImages.add(R.drawable.monster_act1_madgremlin);
            monsterNames.add("Mad Gremlin");
            monsterHP.add("20-25");
            monsterImages.add(R.drawable.monster_act1_shieldgremlin);
            monsterNames.add("Shield Gremlin");
            monsterHP.add("12-17");
            monsterImages.add(R.drawable.monster_act1_sneakygremlin);
            monsterNames.add("Sneaky Gremlin");
            monsterHP.add("10-15");
            monsterImages.add(R.drawable.monster_act1_fatgremlin);
            monsterNames.add("Fat Gremlin");
            monsterHP.add("13-18");
            monsterImages.add(R.drawable.monster_act1_wizardgremlin);
            monsterNames.add("Wizard Gremlin");
            monsterHP.add("23-26");
            monsterImages.add(R.drawable.monster_act1_looter);
            monsterNames.add("Looter");
            monsterHP.add("44-50");
        }
        else if (monster_type.equals("act2")) {
            containerHeader.setText("ACT 2 Monsters");
            monsterImages.add(R.drawable.monster_act2_sphericguardian);
            monsterNames.add("Spheric Guardian");
            monsterHP.add("20");
            monsterImages.add(R.drawable.monster_act2_chosen);
            monsterNames.add("Chosen");
            monsterHP.add("95-103");
            monsterImages.add(R.drawable.monster_act2_byrd);
            monsterNames.add("Byrd");
            monsterHP.add("25-33");
            monsterImages.add(R.drawable.monster_act2_mugger);
            monsterNames.add("Mugger");
            monsterHP.add("48-54");
            monsterImages.add(R.drawable.monster_act2_shelledparasite);
            monsterNames.add("Shelled Parasite");
            monsterHP.add("68-75");
            monsterImages.add(R.drawable.monster_act2_snakeplant);
            monsterNames.add("Snake Plant");
            monsterHP.add("75-82");
            monsterImages.add(R.drawable.monster_act2_snecko);
            monsterNames.add("Snecko");
            monsterHP.add("114-125");
            monsterImages.add(R.drawable.monster_act2_centurion);
            monsterNames.add("Centurion");
            monsterHP.add("76-83");
            monsterImages.add(R.drawable.monster_act2_mystic);
            monsterNames.add("Mystic");
            monsterHP.add("48-58");
        }
        else if (monster_type.equals("act3")) {
            containerHeader.setText("ACT 3 Monsters");
            monsterImages.add(R.drawable.monster_act3_darkling);
            monsterNames.add("Darkling");
            monsterHP.add("48-59");
            monsterImages.add(R.drawable.monster_act3_orbwalker);
            monsterNames.add("Orb Walker");
            monsterHP.add("90-102");
            monsterImages.add(R.drawable.monster_act3_spiker);
            monsterNames.add("Spiker");
            monsterHP.add("42-60");
            monsterImages.add(R.drawable.monster_act3_exploder);
            monsterNames.add("Exploder");
            monsterHP.add("30-35");
            monsterImages.add(R.drawable.monster_act3_repulsor);
            monsterNames.add("Repulsor");
            monsterHP.add("29-38");
            monsterImages.add(R.drawable.monster_act3_maw);
            monsterNames.add("Maw");
            monsterHP.add("300");
            monsterImages.add(R.drawable.monster_act3_writhingmass);
            monsterNames.add("Writhing Mass");
            monsterHP.add("160-175");
            monsterImages.add(R.drawable.monster_act3_spiregrowth);
            monsterNames.add("Spire Growth");
            monsterHP.add("170-190");
            monsterImages.add(R.drawable.monster_act3_transient);
            monsterNames.add("Transient");
            monsterHP.add("999");
        }
        else if (monster_type.equals("elites")) {
            containerHeader.setText("Elite Monsters");
            monsterImages.add(R.drawable.monster_elite_sentry);
            monsterNames.add("Sentry x3");
            monsterHP.add("38-45");
            monsterImages.add(R.drawable.monster_elite_gremlinnob);
            monsterNames.add("Gremlin Nob");
            monsterHP.add("82-90");
            monsterImages.add(R.drawable.monster_elite_lavagulin);
            monsterNames.add("Lavagulin");
            monsterHP.add("109-115");
            monsterImages.add(R.drawable.monster_elite_book);
            monsterNames.add("Book of Stabbing");
            monsterHP.add("160-172");
            monsterImages.add(R.drawable.monster_elite_gremlinleader);
            monsterNames.add("Gremlin Leader");
            monsterHP.add("140-155");
            monsterImages.add(R.drawable.monster_elite_slaverleader);
            monsterNames.add("Task Master");
            monsterHP.add("54-64");
            monsterImages.add(R.drawable.monster_elite_nemesis);
            monsterNames.add("Nemesis");
            monsterHP.add("185-200");
            monsterImages.add(R.drawable.monster_elite_gianthead);
            monsterNames.add("Giant Head");
            monsterHP.add("500-520");
            monsterImages.add(R.drawable.monster_elite_reptomancer);
            monsterNames.add("Reptomancer");
            monsterHP.add("180-200");
            monsterImages.add(R.drawable.monster_elite_spirespear);
            monsterNames.add("Spire Spear");
            monsterHP.add("160-180");
            monsterImages.add(R.drawable.monster_elite_spireshield);
            monsterNames.add("Spire Shield");
            monsterHP.add("110-125");
        }
        else if (monster_type.equals("bosses")) {
            containerHeader.setText("Boss Monsters");
            monsterImages.add(R.drawable.monster_boss_slime);
            monsterNames.add("Slime Boss");
            monsterHP.add("140-150");
            monsterImages.add(R.drawable.monster_boss_guardian);
            monsterNames.add("Guardian");
            monsterHP.add("240-250");
            monsterImages.add(R.drawable.monster_boss_hexaghost);
            monsterNames.add("Hexaghost");
            monsterHP.add("250-264");
            monsterImages.add(R.drawable.monster_boss_bronzeautomoton);
            monsterNames.add("Bronze Automaton");
            monsterHP.add("300-320");
            monsterImages.add(R.drawable.monster_boss_champ);
            monsterNames.add("The Champ");
            monsterHP.add("420-440");
            monsterImages.add(R.drawable.monster_boss_collector);
            monsterNames.add("The Collector");
            monsterHP.add("282-300");
            monsterImages.add(R.drawable.monster_boss_timeeater);
            monsterNames.add("Time Eater");
            monsterHP.add("456-480");
            monsterImages.add(R.drawable.monster_boss_awakened);
            monsterNames.add("Awakened One");
            monsterHP.add("300-320 x2");
            monsterImages.add(R.drawable.monster_boss_donu);
            monsterNames.add("Donu");
            monsterHP.add("250-265");
            monsterImages.add(R.drawable.monster_boss_deca);
            monsterNames.add("Deca");
            monsterHP.add("250-265");
            monsterImages.add(R.drawable.monster_boss_corruptheart);
            monsterNames.add("Corrupt Heart");
            monsterHP.add("750-800");
        } 
        else {
            Log.d(TAG, "prepareData: failed");
        }

    }

}
