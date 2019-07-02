package com.warm.slaythespireguide.guideslaythespire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelicMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relic_menu);

        Button common = (Button) findViewById(R.id.relic_menu_common);
        Button uncommon = (Button) findViewById(R.id.relic_menu_uncommon);
        Button rare = (Button) findViewById(R.id.relic_menu_rare);
        Button boss = (Button) findViewById(R.id.relic_menu_boss);
        Button shop = (Button) findViewById(R.id.relic_menu_shop);
        Button event = (Button) findViewById(R.id.relic_menu_event);
        Button character = (Button) findViewById(R.id.relic_menu_characterspecific);

        common.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "common");
                startActivity(intent);
            }
        });

        uncommon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "uncommon");
                startActivity(intent);
            }
        });

        rare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "rare");
                startActivity(intent);
            }
        });

        boss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "boss");
                startActivity(intent);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "shop");
                startActivity(intent);
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "event");
                startActivity(intent);
            }
        });

        character.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelicMenu.this, RelicListContainer.class);
                intent.putExtra("relic_type", "character");
                startActivity(intent);
            }
        });

    }
}
