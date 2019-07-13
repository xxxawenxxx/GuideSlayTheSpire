package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Strategy_silent extends AppCompatActivity {

    private AdView adView;
    Button poison_button;
    Button block_button;
    Button shiv_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_silent);

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        poison_button = (Button) findViewById(R.id.poison_button);
        block_button = (Button) findViewById(R.id.block_button);
        shiv_button = (Button) findViewById(R.id.shiv_button);

        poison_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoison();
            }
        });
        block_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBlock();
            }
        });
        shiv_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShiv();
            }
        });

    }

    public void openPoison(){
        Intent intent = new Intent(this, Silent_poison_build.class);
        startActivity(intent);
    }
    public void openBlock(){
        Intent intent1 = new Intent(this, Silent_block_build.class);
        startActivity(intent1);
    }
    public void openShiv(){
        Intent intent2 = new Intent(this, Silent_shiv_build.class);
        startActivity(intent2);
    }

}
