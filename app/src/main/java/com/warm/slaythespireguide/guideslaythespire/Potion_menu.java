package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Potion_menu extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potion_menu);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        Button common = findViewById(R.id.potion_menu_common);
        Button uncommon = findViewById(R.id.potion_menu_uncommon);
        Button rare = findViewById(R.id.potion_menu_rare);

        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Potion_menu.this, Potion_ListContainer.class);
                intent.putExtra("potion_type", "common");
                startActivity(intent);
            }
        });

        uncommon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Potion_menu.this, Potion_ListContainer.class);
                intent.putExtra("potion_type", "uncommon");
                startActivity(intent);
            }
        });

        rare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Potion_menu.this, Potion_ListContainer.class);
                intent.putExtra("potion_type", "rare");
                startActivity(intent);
            }
        });
    }
}
