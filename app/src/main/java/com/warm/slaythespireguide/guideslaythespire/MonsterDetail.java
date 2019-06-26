package com.warm.slaythespireguide.guideslaythespire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MonsterDetail extends AppCompatActivity {

    private static final String TAG = "MonsterDetail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_detail);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: started");
        Bundle bundle = getIntent().getExtras();
        Integer monster_image = bundle.getInt("monster_image");

        Log.d(TAG, "getIncomingIntent: image: " + monster_image);

        setImage(monster_image);

    }

    private void setImage(Integer imageUrl) {
        ImageView monster_detail_image = (ImageView) findViewById(R.id.monster_detail_image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(monster_detail_image);
    }

}
