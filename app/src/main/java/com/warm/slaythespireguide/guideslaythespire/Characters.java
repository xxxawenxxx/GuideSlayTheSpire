package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Characters extends AppCompatActivity {

    ImageView ironclad_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        ironclad_button = (ImageView) findViewById(R.id.ironclad_button);

        ironclad_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad();
            }
        });

    }


    public void openIronclad(){
        Intent intent = new Intent(this, Ironclad.class);
        startActivity(intent);
    }
}
