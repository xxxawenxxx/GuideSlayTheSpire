package com.warm.slaythespireguide.guideslaythespire;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

        card_ironclad_image.add(R.drawable.anger);
        card_ironclad_image.add(R.drawable.armament);
        card_ironclad_image.add(R.drawable.barricade);
        card_ironclad_image.add(R.drawable.bash);

    }



}
