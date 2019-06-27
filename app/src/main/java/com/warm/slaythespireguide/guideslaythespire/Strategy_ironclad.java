package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Strategy_ironclad extends AppCompatActivity {

    Button defend_button;
    Button strength_button;
    Button rupture_button;
    Button searing_button;
    Button zero_mana_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_ironclad);

        defend_button = (Button) findViewById(R.id.defend_button);
        strength_button = (Button) findViewById(R.id.strength_button);
        rupture_button = (Button) findViewById(R.id.rupture_button);
        searing_button = (Button) findViewById(R.id.searing_button);
        zero_mana_button = (Button) findViewById(R.id.zero_mana_button);

        defend_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefend();
            }
        });
        strength_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStrength();
            }
        });
        rupture_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRupture();
            }
        });
        searing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearing();
            }
        });
        zero_mana_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZero();
            }
        });


    }

    public void openDefend(){
        Intent intent = new Intent(this, Ironclad_defend_build.class);
        startActivity(intent);
    }
    public void openStrength(){
        Intent intent1 = new Intent(this, Ironclad_strat.class);
        startActivity(intent1);
    }
    public void openRupture(){
        Intent intent2 = new Intent(this, Ironclad_rupture_build.class);
        startActivity(intent2);
    }
    public void openSearing(){
        Intent intent3 = new Intent(this, Ironclad_searing_build.class);
        startActivity(intent3);
    }
    public void openZero(){
        Intent intent4 = new Intent(this, Ironclad_zeromana_build.class);
        startActivity(intent4);
    }


}
