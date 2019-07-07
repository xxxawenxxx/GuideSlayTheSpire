package com.warm.slaythespireguide.guideslaythespire;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Card_Container_Status extends AppCompatActivity {
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

        containerHeader = findViewById(R.id.container_header);
        containerHeader.setText("Status Cards");

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Card_Main> cards_Status = new ArrayList<>();
        ArrayList<Integer> card_Status_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Status = new ArrayList<>();

        initResource();
        clearAll(cards_Status, card_Status_Image, cards_upgrade_Status);

        initCardImage(card_Status_Image);
        initUpgradedCard(cards_upgrade_Status, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Status.add(new Card_Main(
                    card_Status_Image.get(i),
                    card_name_list[i],
                    card_cost_list[i],
                    card_desc_list[i],
                    Collections.singletonList(cards_upgrade_Status.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Status);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_status_name);
        card_cost_list = resource.getStringArray(R.array.card_status_cost);
        card_desc_list = resource.getStringArray(R.array.card_status_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_status_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_status_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> cards_status, ArrayList<Integer> card_status_image, ArrayList<Card_Upgrade> cards_upgrade_status) {
        cards_status.clear();
        card_status_image.clear();
        cards_upgrade_status.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_status, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_status.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_status_image) {
        card_status_image.add(R.drawable.status_burn);
        card_status_image.add(R.drawable.status_dazed);
        card_status_image.add(R.drawable.status_wound);
        card_status_image.add(R.drawable.status_slimed);
        card_status_image.add(R.drawable.status_void);
    }
}
