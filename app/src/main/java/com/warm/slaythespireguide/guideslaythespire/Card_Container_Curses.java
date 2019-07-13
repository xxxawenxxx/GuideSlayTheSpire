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

public class Card_Container_Curses extends AppCompatActivity {
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
        containerHeader.setText("Curse Cards");

//        View cursesView = findViewById(R.id.card_recycler_root);
//        cursesView.setBackgroundColor(Color.parseColor("#0f1012"));

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Card_Main> cards_Curses = new ArrayList<>();
        ArrayList<Integer> card_Curses_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Curses = new ArrayList<>();

        initResource();
        clearAll(cards_Curses, card_Curses_Image, cards_upgrade_Curses);

        initCardImage(card_Curses_Image);
        initUpgradedCard(cards_upgrade_Curses, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Curses.add(new Card_Main(
                    card_Curses_Image.get(i),
                    card_name_list[i],
                    card_cost_list[i],
                    card_desc_list[i],
                    Collections.singletonList(cards_upgrade_Curses.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Curses);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_curses_name);
        card_cost_list = resource.getStringArray(R.array.card_curses_cost);
        card_desc_list = resource.getStringArray(R.array.card_curses_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_curses_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_curses_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> cards_curses, ArrayList<Integer> card_curses_image, ArrayList<Card_Upgrade> cards_upgrade_curses) {
        cards_curses.clear();
        card_curses_image.clear();
        cards_upgrade_curses.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_curses, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_curses.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_curses_image) {
        card_curses_image.add(R.drawable.curse_ascendersbane);
        card_curses_image.add(R.drawable.curse_clumsy);
        card_curses_image.add(R.drawable.curse_decay);
        card_curses_image.add(R.drawable.curse_doubt);
        card_curses_image.add(R.drawable.curse_injury);
        card_curses_image.add(R.drawable.curse_necronomicurse);
        card_curses_image.add(R.drawable.curse_normality);
        card_curses_image.add(R.drawable.curse_pain);
        card_curses_image.add(R.drawable.curse_parasite);
        card_curses_image.add(R.drawable.curse_regret);
        card_curses_image.add(R.drawable.curse_shame);
        card_curses_image.add(R.drawable.curse_writhe);
    }
}
