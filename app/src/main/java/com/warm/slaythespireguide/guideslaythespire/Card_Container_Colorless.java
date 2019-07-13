package com.warm.slaythespireguide.guideslaythespire;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Collections;

public class Card_Container_Colorless extends AppCompatActivity {
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
        containerHeader.setText("Colorless Cards");

        RecyclerView recyclerView = findViewById(R.id.card_recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Card_Main> cards_Colorless = new ArrayList<>();
        ArrayList<Integer> card_Colorless_Image = new ArrayList<>();
        ArrayList<Card_Upgrade> cards_upgrade_Colorless = new ArrayList<>();

        initResource();
        clearAll(cards_Colorless, card_Colorless_Image, cards_upgrade_Colorless);

        initCardImage(card_Colorless_Image);
        initUpgradedCard(cards_upgrade_Colorless, card_cost_upgrade_list, card_desc_upgrade_list);

        for (int i = 0; i < card_name_list.length; i++) {
            cards_Colorless.add(new Card_Main(
                    card_Colorless_Image.get(i),
                    card_name_list[i],
                    card_cost_list[i],
                    card_desc_list[i],
                    Collections.singletonList(cards_upgrade_Colorless.get(i))
            ));
        }

        Card_Adapter adapter = new Card_Adapter(cards_Colorless);
        recyclerView.setAdapter(adapter);
    }

    private void initResource() {
        Resources resource = getResources();
        card_name_list = resource.getStringArray(R.array.card_colorless_name);
        card_cost_list = resource.getStringArray(R.array.card_colorless_cost);
        card_desc_list = resource.getStringArray(R.array.card_colorless_desc);
        card_cost_upgrade_list = resource.getStringArray(R.array.card_colorless_cost_upgrade);
        card_desc_upgrade_list = resource.getStringArray(R.array.card_colorless_desc_upgrade);
    }

    private void clearAll(ArrayList<Card_Main> cards_colorless, ArrayList<Integer> card_colorless_image, ArrayList<Card_Upgrade> cards_upgrade_colorless) {
        cards_colorless.clear();
        card_colorless_image.clear();
        cards_upgrade_colorless.clear();
    }

    private void initUpgradedCard(ArrayList<Card_Upgrade> cards_upgrade_colorless, String[] card_cost_upgrade_list, String[] card_desc_upgrade_list) {
        for (int x = 0; x < card_cost_upgrade_list.length; x++) {
            cards_upgrade_colorless.add(new Card_Upgrade(card_cost_upgrade_list[x], card_desc_upgrade_list[x]));
        }
    }

    private void initCardImage(ArrayList<Integer> card_colorless_image) {
        card_colorless_image.add(R.drawable.apparation);
        card_colorless_image.add(R.drawable.bite);
        card_colorless_image.add(R.drawable.jax);
        card_colorless_image.add(R.drawable.ritual_dagger);
        card_colorless_image.add(R.drawable.shiv);
        card_colorless_image.add(R.drawable.bandageup);
        card_colorless_image.add(R.drawable.blind);
        card_colorless_image.add(R.drawable.darkshackles);
        card_colorless_image.add(R.drawable.deepbreath);
        card_colorless_image.add(R.drawable.discovery);

        card_colorless_image.add(R.drawable.dramaticentrance);
        card_colorless_image.add(R.drawable.enlightenment);
        card_colorless_image.add(R.drawable.finesse);
        card_colorless_image.add(R.drawable.flashofsteel);
        card_colorless_image.add(R.drawable.forethought);
        card_colorless_image.add(R.drawable.goodinstincts);
        card_colorless_image.add(R.drawable.impatience);
        card_colorless_image.add(R.drawable.jackofalltrades);
        card_colorless_image.add(R.drawable.madness);
        card_colorless_image.add(R.drawable.mindblast);

        card_colorless_image.add(R.drawable.panacea);
        card_colorless_image.add(R.drawable.panic_button);
        card_colorless_image.add(R.drawable.purity);
        card_colorless_image.add(R.drawable.swiftstrike);
        card_colorless_image.add(R.drawable.trip);
        card_colorless_image.add(R.drawable.apotheosis);
        card_colorless_image.add(R.drawable.chrysalis);
        card_colorless_image.add(R.drawable.hand_of_greed);
        card_colorless_image.add(R.drawable.magnetism);
        card_colorless_image.add(R.drawable.masterofstrategy);

        card_colorless_image.add(R.drawable.mayhem);
        card_colorless_image.add(R.drawable.metamorphosis);
        card_colorless_image.add(R.drawable.panache);
        card_colorless_image.add(R.drawable.sadisticnature);
        card_colorless_image.add(R.drawable.secrettechnique);
        card_colorless_image.add(R.drawable.secretweapon);
        card_colorless_image.add(R.drawable.the_bomb);
        card_colorless_image.add(R.drawable.thinkingahead);
        card_colorless_image.add(R.drawable.transmutation);
        card_colorless_image.add(R.drawable.violence);
    }
}
