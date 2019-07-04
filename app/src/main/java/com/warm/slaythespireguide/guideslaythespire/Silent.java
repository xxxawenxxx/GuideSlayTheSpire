package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Silent extends AppCompatActivity {

    CardView Silent_tactics_button;
    CardView Silent_UnlockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silent);

        Silent_tactics_button = findViewById(R.id.Silent_tactics_button);
        Silent_UnlockButton = findViewById(R.id.Silent_unlock_button);

        Silent_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSilent_tactics();
            }
        });

        Silent_UnlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_SilentUnlock();
            }
        });

    }

    public void openSilent_tactics(){
        Intent intent = new Intent(this, Strategy_silent.class);
        startActivity(intent);
    }
    public void open_SilentUnlock(){
        Intent intent = new Intent(this, Character_Unlock.class);
        intent.putExtra("CHARACTER", "SILENT");
        startActivity(intent);
    }



}
