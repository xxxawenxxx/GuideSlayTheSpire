package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Defect extends AppCompatActivity {

    CardView Defect_tactics_button;
    CardView Defect_cards_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defect);

        Defect_tactics_button = (CardView) findViewById(R.id.Defect_tactics_button);
        Defect_cards_button = (CardView) findViewById(R.id.Defect_cards_button);

        Defect_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefect_tactics();
            }
        });

        Defect_cards_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefect_cards();
            }
        });

    }


    public void openDefect_tactics(){
        Intent intent = new Intent(this, Strategy_defect.class);
        startActivity(intent);
    }
    public void openDefect_cards(){
        Intent intent1 = new Intent(this, Strategy_defect.class);
        startActivity(intent1);
    }

}
