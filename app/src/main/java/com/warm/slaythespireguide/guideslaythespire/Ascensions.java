package com.warm.slaythespireguide.guideslaythespire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Ascensions extends AppCompatActivity {

    int[] images = {R.drawable.number0, R.drawable.number1, R.drawable.number2, R.drawable.number3, R.drawable.number4, R.drawable.number5, R.drawable.number6,
            R.drawable.number7, R.drawable.number8, R.drawable.number9,R.drawable.number10, R.drawable. number11, R.drawable.number12,R.drawable.number13,
            R.drawable.number14, R.drawable.number15, R.drawable.number16,R.drawable.number17, R.drawable.number18, R.drawable.number19, R.drawable.number20


    };

    String[] version = {"No modifiers","Elites spawn more often", "Normal enemies are deadlier", "Elites are deadlier", "Bosses are deadlier", "Heal less after Boss battles", "Start each run damaged", "Normal enemies are tougher",
            "Elites are tougher", "Bosses are tougher","Ascender/'s Bane", "Less Potion slots", "Upgraded cards appears less often","Poor Bosses","Lower Max HP",
            "Unfavorable Events", "Shops are more costly", "Normal enemies have more challenging movesets and abilities","Elite enemies have more challenging movesets and abilities", "Boss enemies have more challenging movesets and abilities", "Fight 2 bosses at the end of Act 3"



    };

    String[] versionNumber = {"No modifiers","Spawns more elites on maps", "Normal enemies deal more damage", "Elite enemies deal more damage", "Boss enemies deal more damage", "Heal 75% of missing Health", "HP -10%", "Normal enemies have more HP",
            "Elite enemies have more HP", "Boss enemies have more HP", "Start run with Ascender/'s Bane in your deck", "2 Potions slot", "50% less upgraded cards", "Boss drop less gold (25% less)", "-5 HP (Ironclad) and -4 HP (Defect and Silent)",
            "More disadvantages Events spawn", "Shop will charge more gold", "Normal enemies have more abilities", "Elite enemies have more abilities", "Boss enemies have more abilities", "2 Bosses on the end of the run (Act 3)"

    };

    ListView lView;

    ListAdapter lAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascensions);

        lView = (ListView) findViewById(R.id.list_ascensions);

        lAdapter = new ListAdapter(Ascensions.this, version, versionNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Ascensions.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
