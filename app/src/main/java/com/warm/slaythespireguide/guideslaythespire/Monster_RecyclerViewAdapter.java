package com.warm.slaythespireguide.guideslaythespire;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Monster_RecyclerViewAdapter extends RecyclerView.Adapter<Monster_RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "Monster_RecyclerViewAda";

    private ArrayList<Integer> monsterImageList = new ArrayList<>();
    private ArrayList<String> monsterNameList = new ArrayList<>();
    private ArrayList<String> monsterHPList = new ArrayList<>();
    private Context mContext;

    public Monster_RecyclerViewAdapter(Context mContext, ArrayList<Integer> monsterImageList, ArrayList<String> monsterNameList, ArrayList<String> monsterHP) {
        this.monsterImageList = monsterImageList;
        this.monsterNameList = monsterNameList;
        this.monsterHPList = monsterHP;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.monster_single_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
      
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext)
                .asBitmap()
                .load(monsterImageList.get(i))
                .into(viewHolder.single_monsterImage);

        viewHolder.single_monsterName.setText(monsterNameList.get(i));
        viewHolder.single_monsterHP.setText(monsterHPList.get(i));

//        viewHolder.monster_list_single_layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: clicked on: " + monsterImageList.get(i));
//                Intent intent = new Intent(mContext, MonsterDetail.class);
//                Bundle bundle = new Bundle();
//                bundle.putInt("monster_image", monsterImageList.get(i));
//                bundle.putString("monster_name", monsterNameList.get(i));
//                intent.putExtras(bundle);
//                mContext.startActivity(intent);
//
//                Toast.makeText(mContext, monsterImageList.get(i), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return monsterImageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView single_monsterImage;
        TextView single_monsterName;
        TextView single_monsterHP;
        RelativeLayout monster_list_single_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            single_monsterImage = itemView.findViewById(R.id.monster_single_img);
            single_monsterName = itemView.findViewById(R.id.monster_single_name);
            single_monsterHP = itemView.findViewById(R.id.monster_single_hp);
            monster_list_single_layout = itemView.findViewById(R.id.monster_list_single_layout);
        }
    }
}
