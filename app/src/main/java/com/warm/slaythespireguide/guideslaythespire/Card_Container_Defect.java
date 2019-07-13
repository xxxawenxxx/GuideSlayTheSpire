package com.warm.slaythespireguide.guideslaythespire;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Collections;

public class Card_Container_Defect extends AppCompatActivity {
    private AdView adView;
    String[] card_name_list;
    String[] card_cost_list;
    String[] card_desc_list;
    String[] card_cost_upgrade_list;
    String[] card_desc_upgrade_list;
    private TextView containerHeader;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_recyclercontainer);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        containerHeader = findViewById(R.id.container_header);
        containerHeader.setText("Defect Cards");

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        View defectView = findViewById(R.id.card_recycler_root);
//        defectView.setBackgroundColor(Color.parseColor("#5f9ec2"));

        ArrayList<Card_Main> cards_Defect = new ArrayList<>();
        ArrayList<Integer> card_Defect_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Defect = new ArrayList<>();

        initResource();
        clearAll(cards_Defect, card_Defect_Image, cards_upgrade_Defect);

        initCardImage(card_Defect_Image);
        initUpgradedCard(cards_upgrade_Defect, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Defect.add(new Card_Main(
                    card_Defect_Image.get(i),
                    card_name_list[i],
                    card_cost_list[i],
                    card_desc_list[i],
                    Collections.singletonList(cards_upgrade_Defect.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Defect);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_defect_name);
        card_cost_list = resource.getStringArray(R.array.card_defect_cost);
        card_desc_list = resource.getStringArray(R.array.card_defect_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_defect_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_defect_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> card_defect, ArrayList<Integer> card_defect_image, ArrayList<Card_Upgrade> cards_upgrade_defect) {
        card_defect.clear();
        card_defect_image.clear();
        cards_upgrade_defect.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_defect, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_defect.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_defect_image) {
        card_defect_image.add(R.drawable.defect_defend);
        card_defect_image.add(R.drawable.defect_dualcast);
        card_defect_image.add(R.drawable.defect_strike);
        card_defect_image.add(R.drawable.defect_zap);
        card_defect_image.add(R.drawable.defect_ballightning);
        card_defect_image.add(R.drawable.defect_barrage);
        card_defect_image.add(R.drawable.defect_beamcell);
        card_defect_image.add(R.drawable.defect_chargebattery);
        card_defect_image.add(R.drawable.defect_claw);
        card_defect_image.add(R.drawable.defect_coldsnap);

        card_defect_image.add(R.drawable.defect_compiledriver);
        card_defect_image.add(R.drawable.defect_coolheaded);
        card_defect_image.add(R.drawable.defect_gofortheyes);
        card_defect_image.add(R.drawable.defect_hologram);
        card_defect_image.add(R.drawable.defect_leap);
        card_defect_image.add(R.drawable.defect_rebound);
        card_defect_image.add(R.drawable.defect_recursion);
        card_defect_image.add(R.drawable.defect_stack);
        card_defect_image.add(R.drawable.defect_steambarrier);
        card_defect_image.add(R.drawable.defect_streamline);

        card_defect_image.add(R.drawable.defect_sweepingbeam);
        card_defect_image.add(R.drawable.defect_turbo);
        card_defect_image.add(R.drawable.defect_aggregate);
        card_defect_image.add(R.drawable.defect_autoshield);
        card_defect_image.add(R.drawable.defect_blizzard);
        card_defect_image.add(R.drawable.defect_bootsequence);
        card_defect_image.add(R.drawable.defect_bullseye);
        card_defect_image.add(R.drawable.defect_capacitor);
        card_defect_image.add(R.drawable.defect_chaos);
        card_defect_image.add(R.drawable.defect_chill);

        card_defect_image.add(R.drawable.defect_consume);
        card_defect_image.add(R.drawable.defect_darkness);
        card_defect_image.add(R.drawable.defect_defragment);
        card_defect_image.add(R.drawable.defect_doomandgloom);
        card_defect_image.add(R.drawable.defect_doubleenergy);
        card_defect_image.add(R.drawable.defect_equilibrium);
        card_defect_image.add(R.drawable.defect_ftl);
        card_defect_image.add(R.drawable.defect_forcefield);
        card_defect_image.add(R.drawable.defect_fusion);
        card_defect_image.add(R.drawable.defect_geneticalgorithm);

        card_defect_image.add(R.drawable.defect_glacier);
        card_defect_image.add(R.drawable.defect_heatsinks);
        card_defect_image.add(R.drawable.defect_helloworld);
        card_defect_image.add(R.drawable.defect_loop);
        card_defect_image.add(R.drawable.defect_melter);
        card_defect_image.add(R.drawable.defect_overclock);
        card_defect_image.add(R.drawable.defect_recycle);
        card_defect_image.add(R.drawable.defect_reinforcedbody);
        card_defect_image.add(R.drawable.defect_reprogram);
        card_defect_image.add(R.drawable.defect_ripandtear);

        card_defect_image.add(R.drawable.defect_scrape);
        card_defect_image.add(R.drawable.defect_selfrepair);
        card_defect_image.add(R.drawable.defect_skim);
        card_defect_image.add(R.drawable.defect_staticdischarge);
        card_defect_image.add(R.drawable.defect_storm);
        card_defect_image.add(R.drawable.defect_sunder);
        card_defect_image.add(R.drawable.defect_tempest);
        card_defect_image.add(R.drawable.defect_whitenoise);
        card_defect_image.add(R.drawable.defect_allforone);
        card_defect_image.add(R.drawable.defect_amplify);

        card_defect_image.add(R.drawable.defect_biasedcognition);
        card_defect_image.add(R.drawable.defect_buffer);
        card_defect_image.add(R.drawable.defect_coresurge);
        card_defect_image.add(R.drawable.defect_creativeai);
        card_defect_image.add(R.drawable.defect_echoform);
        card_defect_image.add(R.drawable.defect_electrodynamics);
        card_defect_image.add(R.drawable.defect_fission);
        card_defect_image.add(R.drawable.defect_hyperbeam);
        card_defect_image.add(R.drawable.defect_machinelearning);
        card_defect_image.add(R.drawable.defect_meteorstrike);

        card_defect_image.add(R.drawable.defect_multicast);
        card_defect_image.add(R.drawable.defect_rainbow);
        card_defect_image.add(R.drawable.defect_reboot);
        card_defect_image.add(R.drawable.defect_seek);
        card_defect_image.add(R.drawable.defect_thunderstrike);
    }
}
