package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Cards_menu extends AppCompatActivity {

    Button Card_menu_colorless;
    Button Card_menu_curses;
    Button Card_menu_status;
    Button Card_menu_ironclad;
    Button Card_menu_silent;
    Button Card_menu_defect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards_menu);

        Card_menu_colorless = (Button) findViewById(R.id.Card_menu_colorless);
        Card_menu_curses = (Button) findViewById(R.id.Card_menu_curses);
        Card_menu_status = (Button) findViewById(R.id.Card_menu_status);
        Card_menu_ironclad = (Button) findViewById(R.id.Card_menu_ironclad);
        Card_menu_silent = (Button) findViewById(R.id.Card_menu_silent);
        Card_menu_defect = (Button) findViewById(R.id.Card_menu_defect);

        Card_menu_colorless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorless();
            }
        });

        Card_menu_curses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurses();
            }
        });

        Card_menu_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStatus();
            }
        });

        Card_menu_ironclad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIronclad();
            }
        });

        Card_menu_silent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSilent();
            }
        });

        Card_menu_defect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDefect();
            }
        });


    }



    private void openColorless() {
        Intent intent = new Intent (this, Card_Container.class);
        startActivity(intent);
    }

    private void openCurses() {
        Intent intent = new Intent (this, Card_Container.class);
        startActivity(intent);
    }

    private void openStatus() {
        Intent intent = new Intent (this, Card_Container.class);
        startActivity(intent);
    }
    private void openIronclad() {
        Intent intent = new Intent (this, Card_Container.class);
        startActivity(intent);
    }

    private void openSilent() {
        Intent intent = new Intent (this, Card_Container_Silent.class);
        startActivity(intent);
    }

    private void openDefect() {
        Intent intent = new Intent (this, Card_Container_Defect.class);
        startActivity(intent);
    }
}
