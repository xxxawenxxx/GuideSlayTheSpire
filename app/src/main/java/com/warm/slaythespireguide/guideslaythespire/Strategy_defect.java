package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Strategy_defect extends AppCompatActivity {

    Button frost_button;
    Button barrage_button;
    Button zero_energy_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_defect);

        frost_button = (Button) findViewById(R.id.frost_button);
        barrage_button = (Button) findViewById(R.id.barrage_button);
        zero_energy_button = (Button) findViewById(R.id.zero_energy_button);

        frost_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrost();
            }
        });
        barrage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBarrage();
            }
        });
        zero_energy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZeroEnergy();
            }
        });

    }

    public void openFrost(){
        Intent intent = new Intent(this, Defect_frost_build.class);
        startActivity(intent);
    }
    public void openBarrage(){
        Intent intent1 = new Intent(this, Defect_barrage_build.class);
        startActivity(intent1);
    }
    public void openZeroEnergy(){
        Intent intent2 = new Intent(this, Defect_zeroenergy_build.class);
        startActivity(intent2);
    }

}
