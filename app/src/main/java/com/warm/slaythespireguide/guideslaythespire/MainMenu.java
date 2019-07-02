package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    CardView Character_button;
    CardView Ascension_button;
    CardView Gameplay_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Character_button = (CardView) findViewById(R.id.Character_button);
        Ascension_button = (CardView) findViewById(R.id.Ascension_button);
        Gameplay_button = (CardView) findViewById(R.id.Gameplay_button);
        

        // TEST COMMIT

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

}
