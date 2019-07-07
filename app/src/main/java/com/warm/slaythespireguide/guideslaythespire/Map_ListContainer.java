package com.warm.slaythespireguide.guideslaythespire;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class Map_ListContainer extends AppCompatActivity {
    private static final String TAG = "Map_ListContainer";

    // data variable
    private ArrayList<Integer> mapImg = new ArrayList<>();
    private ArrayList<String> mapName = new ArrayList<>();
    private ArrayList<String> mapDesc = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_list_container);

        initBitmap();
    }

    private void initBitmap() {
        prepareData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.monster_list_container);
        Map_RecyclerAdapter adapter = new Map_RecyclerAdapter(this, mapImg, mapName, mapDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void prepareData() {
        mapImg.clear();
        mapName.clear();
        mapDesc.clear();

        mapImg.add(R.drawable.maps_event_button);
        mapName.add("Unknown");
        mapDesc.add(getString(R.string.maps_unknown_desc));

        mapImg.add(R.drawable.maps_shop_button);
        mapName.add("Merchant");
        mapDesc.add(getString(R.string.maps_shop_desc));

        mapImg.add(R.drawable.maps_treasure_button);
        mapName.add("Treasure");
        mapDesc.add(getString(R.string.maps_treasure_desc));

        mapImg.add(R.drawable.maps_rest_button);
        mapName.add("Rest");
        mapDesc.add(getString(R.string.maps_rest_desc));

        mapImg.add(R.drawable.maps_enemy_button);
        mapName.add("Enemy");
        mapDesc.add(getString(R.string.maps_enemy_desc));

        mapImg.add(R.drawable.maps_elite_icon);
        mapName.add("Elite");
        mapDesc.add(getString(R.string.maps_elite_desc));

        mapImg.add(R.drawable.maps_boss_button);
        mapName.add("Boss");
        mapDesc.add(getString(R.string.maps_boss_desc));

    }

}