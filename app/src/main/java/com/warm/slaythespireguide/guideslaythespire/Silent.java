package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Silent extends AppCompatActivity {

    CardView Silent_tactics_button;
    CardView Silent_cards_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silent);

        Silent_tactics_button = (CardView) findViewById(R.id.Silent_tactics_button);
        Silent_cards_button = (CardView) findViewById(R.id.Silent_cards_button);

        Silent_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSilent_tactics();
            }
        });

        Silent_cards_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSilent_cards();
            }
        });

    }

    public void openSilent_tactics(){
        Intent intent = new Intent(this, Strategy_silent.class);
        startActivity(intent);
    }
    public void openSilent_cards(){
        Intent intent1 = new Intent(this, Strategy_silent.class);
        startActivity(intent1);
    }



}
