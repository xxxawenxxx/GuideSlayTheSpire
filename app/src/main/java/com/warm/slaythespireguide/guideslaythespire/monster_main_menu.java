package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class monster_main_menu extends AppCompatActivity {

    Button act1;
    Button act2;
    Button act3;
    Button elites;
    Button bosses;

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_main_menu);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        act1 = (Button) findViewById(R.id.monster_menu_act1);
        act2 = (Button) findViewById(R.id.monster_menu_act2);
        act3 = (Button) findViewById(R.id.monster_menu_act3);
        elites = (Button) findViewById(R.id.monster_menu_elites);
        bosses = (Button) findViewById(R.id.monster_menu_bosses);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monster_main_menu.this, monster_list_container.class);
                intent.putExtra("monster_type", "act1");
                startActivity(intent);
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monster_main_menu.this, monster_list_container.class);
                intent.putExtra("monster_type", "act2");
                startActivity(intent);
            }
        });

        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monster_main_menu.this, monster_list_container.class);
                intent.putExtra("monster_type", "act3");
                startActivity(intent);
            }
        });

        elites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monster_main_menu.this, monster_list_container.class);
                intent.putExtra("monster_type", "elites");
                startActivity(intent);
            }
        });

        bosses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(monster_main_menu.this, monster_list_container.class);
                intent.putExtra("monster_type", "bosses");
                startActivity(intent);
            }
        });
    }
}
