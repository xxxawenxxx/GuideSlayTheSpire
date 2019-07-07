package com.warm.slaythespireguide.guideslaythespire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class monster_list_container extends AppCompatActivity {

    private static final String TAG = "monster_list_container";

    // data vars
    private ArrayList<String> monsterNames = new ArrayList<>();
    private ArrayList<Integer> monsterImages = new ArrayList<>();
    private TextView containerHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);

        containerHeader = findViewById(R.id.container_header);

        Log.d(TAG, "onCreate: started");
        getIncomingIntent();
    }

    // Get extra intent data
    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: started");
        if(getIntent().hasExtra("monster_type")) {

            String monster_type = getIntent().getStringExtra("monster_type");
            Log.d(TAG, "getIncomingIntent: got extra: " + monster_type);
            initImageBitmaps(monster_type);
        }
    }

    // Prepare data & init recylerview
    private void initImageBitmaps(String monster_type) {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        prepareData(monster_type);
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.monster_list_container);
        Monster_RecyclerViewAdapter adapter = new Monster_RecyclerViewAdapter(this, monsterImages, monsterNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void prepareData(String monster_type) {
        Log.d(TAG, "prepareData: started");
        // Clearing ArrayList monster data
        monsterImages.clear();
        monsterNames.clear();

        // Add monster data
        if (monster_type.equals("act1")) {
            containerHeader.setText("ACT 1 Monsters");
            Log.d(TAG, "prepareData: prepared: " + monster_type);
            monsterImages.add(R.drawable.monster_act1_cultist);
            monsterNames.add("Cultist");
            monsterImages.add(R.drawable.monster_act1_jawworm);
            monsterNames.add("Jaw Worm");
            monsterImages.add(R.drawable.monster_act1_louse_green);
            monsterNames.add("Green Louse");
            monsterImages.add(R.drawable.monster_act1_louse_red);
            monsterNames.add("Red Louse");
            monsterImages.add(R.drawable.monster_act1_acidslime_s);
            monsterNames.add("Acid Slime S");
            monsterImages.add(R.drawable.monster_act1_acidslime_m);
            monsterNames.add("Acid Slime M");
            monsterImages.add(R.drawable.monster_act1_acidslime_l);
            monsterNames.add("Acid Slime L");
            monsterImages.add(R.drawable.monster_act1_spikeslime_s);
            monsterNames.add("Spike Slime S");
            monsterImages.add(R.drawable.monster_act1_spikeslime_m);
            monsterNames.add("Spike Slime M");
            monsterImages.add(R.drawable.monster_act1_spikeslime_l);
            monsterNames.add("Spike Slime L");
            monsterImages.add(R.drawable.monster_act1_slaver_blue);
            monsterNames.add("Blue Slaver");
            monsterImages.add(R.drawable.monster_act1_slaver_red);
            monsterNames.add("Red Slaver");
            monsterImages.add(R.drawable.monster_act1_fungibeast);
            monsterNames.add("Fungi Beast");
            monsterImages.add(R.drawable.monster_act1_madgremlin);
            monsterNames.add("Mad Gremlin");
            monsterImages.add(R.drawable.monster_act1_shieldgremlin);
            monsterNames.add("Shield Gremlin");
            monsterImages.add(R.drawable.monster_act1_sneakygremlin);
            monsterNames.add("Sneaky Gremlin");
            monsterImages.add(R.drawable.monster_act1_fatgremlin);
            monsterNames.add("Fat Gremlin");
            monsterImages.add(R.drawable.monster_act1_wizardgremlin);
            monsterNames.add("Wizard Gremlin");
            monsterImages.add(R.drawable.monster_act1_looter);
            monsterNames.add("Looter");
        }
        else if (monster_type.equals("act2")) {
            containerHeader.setText("ACT 2 Monsters");
            monsterImages.add(R.drawable.monster_act2_sphericguardian);
            monsterNames.add("Spheric Guardian");
            monsterImages.add(R.drawable.monster_act2_chosen);
            monsterNames.add("Chosen");
            monsterImages.add(R.drawable.monster_act2_byrd);
            monsterNames.add("Byrd");
            monsterImages.add(R.drawable.monster_act2_mugger);
            monsterNames.add("Mugger");
            monsterImages.add(R.drawable.monster_act2_shelledparasite);
            monsterNames.add("Shelled Parasite");
            monsterImages.add(R.drawable.monster_act2_snakeplant);
            monsterNames.add("Snake Plant");
            monsterImages.add(R.drawable.monster_act2_snecko);
            monsterNames.add("Snecko");
            monsterImages.add(R.drawable.monster_act2_centurion);
            monsterNames.add("Centurion");
            monsterImages.add(R.drawable.monster_act2_mystic);
            monsterNames.add("Mystic");
        }
        else if (monster_type.equals("act3")) {
            containerHeader.setText("ACT 3 Monsters");
            monsterImages.add(R.drawable.monster_act3_darkling);
            monsterNames.add("Darkling");
            monsterImages.add(R.drawable.monster_act3_orbwalker);
            monsterNames.add("Orb Walker");
            monsterImages.add(R.drawable.monster_act3_spiker);
            monsterNames.add("Spiker");
            monsterImages.add(R.drawable.monster_act3_exploder);
            monsterNames.add("Exploder");
            monsterImages.add(R.drawable.monster_act3_repulsor);
            monsterNames.add("Repulsor");
            monsterImages.add(R.drawable.monster_act3_maw);
            monsterNames.add("Maw");
            monsterImages.add(R.drawable.monster_act3_writhingmass);
            monsterNames.add("Writhing Mass");
            monsterImages.add(R.drawable.monster_act3_spiregrowth);
            monsterNames.add("Spire Growth");
            monsterImages.add(R.drawable.monster_act3_transient);
            monsterNames.add("Transient");
        }
        else if (monster_type.equals("elites")) {
            containerHeader.setText("Elite Monsters");
            monsterImages.add(R.drawable.monster_elite_sentry);
            monsterNames.add("Sentry x3");
            monsterImages.add(R.drawable.monster_elite_gremlinnob);
            monsterNames.add("Gremlin Nob");
            monsterImages.add(R.drawable.monster_elite_lavagulin);
            monsterNames.add("Lavagulin");
            monsterImages.add(R.drawable.monster_elite_book);
            monsterNames.add("Book of Stabbing");
            monsterImages.add(R.drawable.monster_elite_gremlinleader);
            monsterNames.add("Gremlin Leader");
            monsterImages.add(R.drawable.monster_elite_slaverleader);
            monsterNames.add("Task Master, Blue Slaver, Red Slaver");
            monsterImages.add(R.drawable.monster_elite_nemesis);
            monsterNames.add("Nemesis");
            monsterImages.add(R.drawable.monster_elite_gianthead);
            monsterNames.add("Giant Head");
            monsterImages.add(R.drawable.monster_elite_reptomancer);
            monsterNames.add("Reptomancer");
            monsterImages.add(R.drawable.monster_elite_spirespear);
            monsterNames.add("Spire Shield, Spire Spear");
        }
        else if (monster_type.equals("bosses")) {
            containerHeader.setText("Boss Monsters");
            monsterImages.add(R.drawable.monster_boss_slime);
            monsterNames.add("Slime Boss");
            monsterImages.add(R.drawable.monster_boss_guardian);
            monsterNames.add("Guardian");
            monsterImages.add(R.drawable.monster_boss_hexaghost);
            monsterNames.add("Hexaghost");
            monsterImages.add(R.drawable.monster_boss_bronzeautomoton);
            monsterNames.add("Bronze Automaton");
            monsterImages.add(R.drawable.monster_boss_champ);
            monsterNames.add("The Champ");
            monsterImages.add(R.drawable.monster_boss_collector);
            monsterNames.add("The Collector");
            monsterImages.add(R.drawable.monster_boss_timeeater);
            monsterNames.add("Time Eater");
            monsterImages.add(R.drawable.monster_boss_awakened);
            monsterNames.add("Awakened One");
            monsterImages.add(R.drawable.monster_boss_donu);
            monsterNames.add("Donu and Deca");
            monsterImages.add(R.drawable.monster_boss_corruptheart);
            monsterNames.add("Corrupt Heart");
        } 
        else {
            Log.d(TAG, "prepareData: failed");
        }

    }

}
