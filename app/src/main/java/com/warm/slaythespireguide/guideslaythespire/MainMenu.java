package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.google.android.gms.ads.MobileAds;

public class MainMenu extends AppCompatActivity {

    CardView Character_button;
    CardView Ascension_button;
    CardView Gameplay_button;
    CardView Monster_button;
    CardView Relic_button;
    CardView Potion_button;
    CardView Map_button;
    CardView Card_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        Character_button = findViewById(R.id.Character_button);
        Ascension_button = findViewById(R.id.Ascension_button);
        Gameplay_button = findViewById(R.id.Gameplay_button);
        Monster_button = findViewById(R.id.Monster_button);
        Relic_button = findViewById(R.id.Relics_button);
        Potion_button = findViewById(R.id.Potion_button);
        Map_button = findViewById(R.id.Maps_button);
        Card_button = findViewById(R.id.Card_button);

        Character_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCharacter();
            }
        });

        Ascension_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAscensions();
            }
        });

        Gameplay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameplay();
            }
        });

        Monster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonster();
            }
        });

        Relic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRelic();
            }
        });

        Potion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPotion();
            }
        });

        Map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        Card_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard();
            }
        });
    }

    private void openCard() {
        Intent intent = new Intent (this, Cards_menu.class);
        startActivity(intent);
    }

    private void openMap() {
        Intent intent = new Intent (this, Map_ListContainer.class);
        startActivity(intent);
    }

    private void openRelic() {
        Intent intent = new Intent (this, RelicMenu.class);
        startActivity(intent);
    }

    private void openMonster() {
        Intent intent = new Intent (this, monster_main_menu.class);
        startActivity(intent);
    }

    public void openCharacter(){
        Intent intent = new Intent(this, Characters.class);
        startActivity(intent);
    }
    public void openAscensions(){
        Intent intent1 = new Intent(this, Ascensions.class);
        startActivity(intent1);
    }
    public void openGameplay(){
        Intent intent2 = new Intent(this, Gameplay.class);
        startActivity(intent2);
    }

    public void openPotion(){
        Intent intent3 = new Intent(this, Potion_menu.class);
        startActivity(intent3);
    }

}
