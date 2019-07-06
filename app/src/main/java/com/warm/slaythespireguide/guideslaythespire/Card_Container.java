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

public class Card_Container extends AppCompatActivity {

    String[] card_name_list;
    String[] card_cost_list;
    String[] card_desc_list;
    String[] card_cost_upgrade_list;
    String[] card_desc_upgrade_list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_recyclercontainer);

        View ironcladView = findViewById(R.id.card_recycler_root);
        ironcladView.setBackgroundColor(Color.parseColor("#e36d6d"));

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Card_Main> cards_Ironclad = new ArrayList<>();
        ArrayList<Integer> card_Ironclad_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Ironclad = new ArrayList<>();

        initResource();
        clearAll(cards_Ironclad, card_Ironclad_Image, cards_upgrade_Ironclad);

        initCardImage(card_Ironclad_Image);
        initUpgradedCard(cards_upgrade_Ironclad, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Ironclad.add(new Card_Main(
                card_Ironclad_Image.get(i),
                card_name_list[i],
                card_cost_list[i],
                card_desc_list[i],
                Collections.singletonList(cards_upgrade_Ironclad.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Ironclad);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_ironclad_name);
        card_cost_list = resource.getStringArray(R.array.card_ironclad_cost);
        card_desc_list = resource.getStringArray(R.array.card_ironclad_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_ironclad_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_ironclad_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> cards_ironclad, ArrayList<Integer> card_ironclad_image, ArrayList<Card_Upgrade> cards_upgrade_ironclad) {
        cards_ironclad.clear();
        card_ironclad_image.clear();
        cards_upgrade_ironclad.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_ironclad, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_ironclad.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_ironclad_image) {

        card_ironclad_image.add(R.drawable.bash);
        card_ironclad_image.add(R.drawable.defend);
        card_ironclad_image.add(R.drawable.strike);
        card_ironclad_image.add(R.drawable.ironclad_anger);
        card_ironclad_image.add(R.drawable.armament);
        card_ironclad_image.add(R.drawable.bodyslam);
        card_ironclad_image.add(R.drawable.clash);
        card_ironclad_image.add(R.drawable.ironclad_cleave);
        card_ironclad_image.add(R.drawable.clothesline);
        card_ironclad_image.add(R.drawable.flex);
        card_ironclad_image.add(R.drawable.havoc);
        card_ironclad_image.add(R.drawable.headbutt);
        card_ironclad_image.add(R.drawable.heavy_blade);
        card_ironclad_image.add(R.drawable.iron_wave);
        card_ironclad_image.add(R.drawable.perfected_strike);
        card_ironclad_image.add(R.drawable.pommel_strike);
        card_ironclad_image.add(R.drawable.shrug_it_off);
        card_ironclad_image.add(R.drawable.sword_boomerang);
        card_ironclad_image.add(R.drawable.thunderclap);
        card_ironclad_image.add(R.drawable.true_grit);
        card_ironclad_image.add(R.drawable.twin_strike);
        card_ironclad_image.add(R.drawable.warcry);
        card_ironclad_image.add(R.drawable.wild_strike);
        card_ironclad_image.add(R.drawable.battle_trance);
        card_ironclad_image.add(R.drawable.ironclad_bloodforblood);
        card_ironclad_image.add(R.drawable.bloodletting);
        card_ironclad_image.add(R.drawable.burning_pact);
        card_ironclad_image.add(R.drawable.carnage);
        card_ironclad_image.add(R.drawable.combust);
        card_ironclad_image.add(R.drawable.corruption);
        card_ironclad_image.add(R.drawable.disarm);
        card_ironclad_image.add(R.drawable.dropkick);
        card_ironclad_image.add(R.drawable.dual_wield);
        card_ironclad_image.add(R.drawable.entrench);
        card_ironclad_image.add(R.drawable.evolve);
        card_ironclad_image.add(R.drawable.feel_no_pain);
        card_ironclad_image.add(R.drawable.fire_breathing);
        card_ironclad_image.add(R.drawable.flame_barrier);
        card_ironclad_image.add(R.drawable.ghostly_armor);
        card_ironclad_image.add(R.drawable.hemokinesis);
        card_ironclad_image.add(R.drawable.infernal_blade);
        card_ironclad_image.add(R.drawable.inflame);
        card_ironclad_image.add(R.drawable.intimidate);
        card_ironclad_image.add(R.drawable.metallicize);
        card_ironclad_image.add(R.drawable.power_through);
        card_ironclad_image.add(R.drawable.pummel);
        card_ironclad_image.add(R.drawable.rage);
        card_ironclad_image.add(R.drawable.ironclad_rampage);
        card_ironclad_image.add(R.drawable.reckless_charge);
        card_ironclad_image.add(R.drawable.rupture);
        card_ironclad_image.add(R.drawable.searing_blow);
        card_ironclad_image.add(R.drawable.second_wind);
        card_ironclad_image.add(R.drawable.seeing_red);
        card_ironclad_image.add(R.drawable.sentinel);
        card_ironclad_image.add(R.drawable.sever_soul);
        card_ironclad_image.add(R.drawable.shockwave);
        card_ironclad_image.add(R.drawable.spot_weakness);
        card_ironclad_image.add(R.drawable.uppercut);
        card_ironclad_image.add(R.drawable.ironclad_whirlwind);
        card_ironclad_image.add(R.drawable.barricade);
        card_ironclad_image.add(R.drawable.ironclad_berserk);
        card_ironclad_image.add(R.drawable.bludgeon);
        card_ironclad_image.add(R.drawable.brutality);
        card_ironclad_image.add(R.drawable.dark_embrace);
        card_ironclad_image.add(R.drawable.demon_form);
        card_ironclad_image.add(R.drawable.double_tap);
        card_ironclad_image.add(R.drawable.ironclad_exhume);
        card_ironclad_image.add(R.drawable.ironclad_feed);
        card_ironclad_image.add(R.drawable.fiend_fire);
        card_ironclad_image.add(R.drawable.immolate);
        card_ironclad_image.add(R.drawable.impervious);
        card_ironclad_image.add(R.drawable.ironclad_juggernaut);
        card_ironclad_image.add(R.drawable.limit_break);
        card_ironclad_image.add(R.drawable.ironclad_offering);
        card_ironclad_image.add(R.drawable.reaper);


    }



}
