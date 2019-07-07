package com.warm.slaythespireguide.guideslaythespire;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;

public class Card_Container_Silent extends AppCompatActivity {

    String[] card_name_list;
    String[] card_cost_list;
    String[] card_desc_list;
    String[] card_cost_upgrade_list;
    String[] card_desc_upgrade_list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_recyclercontainer);

//        View ironcladView = findViewById(R.id.card_recycler_root);
//        ironcladView.setBackgroundColor(Color.parseColor("#289123"));

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Card_Main> cards_Silent = new ArrayList<>();
        ArrayList<Integer> card_Silent_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Silent = new ArrayList<>();

        initResource();
        clearAll(cards_Silent, card_Silent_Image, cards_upgrade_Silent);

        initCardImage(card_Silent_Image);
        initUpgradedCard(cards_upgrade_Silent, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Silent.add(new Card_Main(
                    card_Silent_Image.get(i),
                    card_name_list[i],
                    card_cost_list[i],
                    card_desc_list[i],
                    Collections.singletonList(cards_upgrade_Silent.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Silent);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_silent_name);
        card_cost_list = resource.getStringArray(R.array.card_silent_cost);
        card_desc_list = resource.getStringArray(R.array.card_silent_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_silent_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_silent_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> card_silent, ArrayList<Integer> card_silent_image, ArrayList<Card_Upgrade> cards_upgrade_silent) {
        card_silent.clear();
        card_silent_image.clear();
        cards_upgrade_silent.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_silent, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_silent.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_defect_image) {
        card_defect_image.add(R.drawable.defend_silent);
        card_defect_image.add(R.drawable.neutralize);
        card_defect_image.add(R.drawable.strike_silent);
        card_defect_image.add(R.drawable.survivor);
        card_defect_image.add(R.drawable.acrobatics);
        card_defect_image.add(R.drawable.backflip);
        card_defect_image.add(R.drawable.bane);
        card_defect_image.add(R.drawable.bladedance);
        card_defect_image.add(R.drawable.clockandagger);
        card_defect_image.add(R.drawable.daggerspray);

        card_defect_image.add(R.drawable.daggerthrow);
        card_defect_image.add(R.drawable.silent_deadlypoison);
        card_defect_image.add(R.drawable.deflect);
        card_defect_image.add(R.drawable.dodgeandroll);
        card_defect_image.add(R.drawable.flyingknee);
        card_defect_image.add(R.drawable.outmaneuver);
        card_defect_image.add(R.drawable.piercingwail);
        card_defect_image.add(R.drawable.silent_poisonedstab);
        card_defect_image.add(R.drawable.prepared);
        card_defect_image.add(R.drawable.quickslash);

        card_defect_image.add(R.drawable.slice);
        card_defect_image.add(R.drawable.sneaky_strike);
        card_defect_image.add(R.drawable.suckerpunch);
        card_defect_image.add(R.drawable.accuracy);
        card_defect_image.add(R.drawable.alloutattack);
        card_defect_image.add(R.drawable.silent_backstab);
        card_defect_image.add(R.drawable.blur);
        card_defect_image.add(R.drawable.bouncingflask);
        card_defect_image.add(R.drawable.calculatedgamble);
        card_defect_image.add(R.drawable.caltrops);

        card_defect_image.add(R.drawable.catalyst);
        card_defect_image.add(R.drawable.choke);
        card_defect_image.add(R.drawable.concentrate);
        card_defect_image.add(R.drawable.crippling_cloud);
        card_defect_image.add(R.drawable.dash);
        card_defect_image.add(R.drawable.distraction);
        card_defect_image.add(R.drawable.endlessagony);
        card_defect_image.add(R.drawable.escapeplan);
        card_defect_image.add(R.drawable.eviscerate);
        card_defect_image.add(R.drawable.expertise);

        card_defect_image.add(R.drawable.finisher);
        card_defect_image.add(R.drawable.flechettes);
        card_defect_image.add(R.drawable.footwork);
        card_defect_image.add(R.drawable.heelhook);
        card_defect_image.add(R.drawable.infiniteblades);
        card_defect_image.add(R.drawable.silent_legsweep);
        card_defect_image.add(R.drawable.silent_masterfulstab);
        card_defect_image.add(R.drawable.noxiousfumes);
        card_defect_image.add(R.drawable.predator);
        card_defect_image.add(R.drawable.reflex);

        card_defect_image.add(R.drawable.riddlewitholes);
        card_defect_image.add(R.drawable.setup);
        card_defect_image.add(R.drawable.skewer);
        card_defect_image.add(R.drawable.silent_tactician);
        card_defect_image.add(R.drawable.terror);
        card_defect_image.add(R.drawable.wellaidplans);
        card_defect_image.add(R.drawable.athousandcuts);
        card_defect_image.add(R.drawable.adrenaline);
        card_defect_image.add(R.drawable.afterimage);
        card_defect_image.add(R.drawable.alchemize);

        card_defect_image.add(R.drawable.bullettime);
        card_defect_image.add(R.drawable.burst);
        card_defect_image.add(R.drawable.silent_corpseexplosion);
        card_defect_image.add(R.drawable.diediedie);
        card_defect_image.add(R.drawable.doppelganger);
        card_defect_image.add(R.drawable.envenom);
        card_defect_image.add(R.drawable.glassknife);
        card_defect_image.add(R.drawable.silent_grandfinale);
        card_defect_image.add(R.drawable.silent_malaise);
        card_defect_image.add(R.drawable.nightmare);

        card_defect_image.add(R.drawable.phantasmalkiller);
        card_defect_image.add(R.drawable.stormofsteel);
        card_defect_image.add(R.drawable.toolsofthetrade);
        card_defect_image.add(R.drawable.silent_unload);
        card_defect_image.add(R.drawable.silent_wraithform);
    }

}
