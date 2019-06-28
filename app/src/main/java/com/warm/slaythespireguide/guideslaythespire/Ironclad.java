package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Ironclad extends AppCompatActivity {

    CardView Ironclad_tactics_button;
    CardView Ironclad_cards_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironclad);

        Ironclad_tactics_button = (CardView) findViewById(R.id.Ironclad_tactics_button);
        Ironclad_cards_button = (CardView) findViewById(R.id.Ironclad_cards_button);

        Ironclad_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad_tactics();
            }
        });

        Ironclad_cards_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad_cards();
            }
        });
    }

    public void openIronclad_tactics(){
        Intent intent = new Intent(this, Strategy_ironclad.class);
        startActivity(intent);
    }
    public void openIronclad_cards(){
        Intent intent1 = new Intent(this, Strategy_ironclad.class);
        startActivity(intent1);
    }
}
