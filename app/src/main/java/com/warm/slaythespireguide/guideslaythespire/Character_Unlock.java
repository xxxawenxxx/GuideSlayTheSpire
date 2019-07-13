package com.warm.slaythespireguide.guideslaythespire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Character_Unlock extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getIntent().hasExtra("CHARACTER")) {
            String character_name = getIntent().getStringExtra("CHARACTER");

            switch (character_name) {
                case "IRONCLAD":
                    setContentView(R.layout.unlock_ironclad);
                    break;
                case "SILENT":
                    setContentView(R.layout.unlock_silent);
                    break;
                case "DEFECT":
                    setContentView(R.layout.unlock_defect);
                    break;
                default:
                    setContentView(R.layout.unlock_ironclad);
            }
        }
    }
}
