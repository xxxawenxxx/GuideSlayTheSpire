package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Characters extends AppCompatActivity {

    ImageView ironclad_button;
    ImageView silent_button;
    ImageView defect_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        ironclad_button = (ImageView) findViewById(R.id.ironclad_button);
        silent_button = (ImageView) findViewById(R.id.silent_button);
        defect_button = (ImageView) findViewById(R.id.defect_button);

        ironclad_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad();
            }
        });
        silent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSilent();
            }
        });
        defect_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefect();
            }
        });
    }


    public void openIronclad(){
        Intent intent = new Intent(this, Ironclad.class);
        startActivity(intent);
    }
    public void openSilent(){
        Intent intent1 = new Intent(this, Silent.class);
        startActivity(intent1);
    }
    public void openDefect(){
        Intent intent2 = new Intent(this, Defect.class);
        startActivity(intent2);
    }
}
