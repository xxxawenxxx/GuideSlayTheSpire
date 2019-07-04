package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Ironclad extends AppCompatActivity {

    CardView Ironclad_tactics_button;
    CardView Ironclad_UnlockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironclad);

        Ironclad_tactics_button = findViewById(R.id.Ironclad_tactics_button);
        Ironclad_UnlockButton = findViewById(R.id.Ironclad_unlock_button);

        Ironclad_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad_tactics();
            }
        });

        Ironclad_UnlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_IroncladUnlock();
            }
        });
    }

    public void openIronclad_tactics(){
        Intent intent = new Intent(this, Strategy_ironclad.class);
        startActivity(intent);
    }
    public void open_IroncladUnlock(){
        Intent intent = new Intent(this, Character_Unlock.class);
        intent.putExtra("CHARACTER", "IRONCLAD");
        startActivity(intent);
    }
}
