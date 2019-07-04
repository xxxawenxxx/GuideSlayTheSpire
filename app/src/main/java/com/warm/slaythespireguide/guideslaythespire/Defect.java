package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Defect extends AppCompatActivity {

    CardView Defect_tactics_button;
    CardView Defect_UnlockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defect);

        Defect_tactics_button = findViewById(R.id.Defect_tactics_button);
        Defect_UnlockButton = findViewById(R.id.Defect_unlock_button);

        Defect_tactics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefect_tactics();
            }
        });

        Defect_UnlockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_DefectUnlock();
            }
        });

    }


    public void openDefect_tactics(){
        Intent intent = new Intent(this, Strategy_defect.class);
        startActivity(intent);
    }
    public void open_DefectUnlock(){
        Intent intent = new Intent(this, Character_Unlock.class);
        intent.putExtra("CHARACTER", "DEFECT");
        startActivity(intent);
    }

}
