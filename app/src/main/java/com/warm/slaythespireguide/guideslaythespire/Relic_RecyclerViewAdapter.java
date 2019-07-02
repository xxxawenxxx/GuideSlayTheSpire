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

public class Relic_RecyclerViewAdapter extends RecyclerView.Adapter<Relic_RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "Relic_RecyclerViewAdapt";

    private ArrayList<Integer> relicImgList = new ArrayList<>();
    private ArrayList<String> relicNameList = new ArrayList<>();
    private ArrayList<String> relicDescList = new ArrayList<>();
    private Context mContext;

    public Relic_RecyclerViewAdapter(Context mContext, ArrayList<Integer> relicImgList, ArrayList<String> relicNameList, ArrayList<String> relicDescList) {
        this.relicImgList = relicImgList;
        this.relicNameList = relicNameList;
        this.relicDescList = relicDescList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.relic_single_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Glide.with(mContext)
                .asBitmap()
                .load(relicImgList.get(i))
                .into(viewHolder.relicSingleImg);

        viewHolder.relicSingleName.setText(relicNameList.get(i));
        viewHolder.relicSingleDesc.setText(relicDescList.get(i));
    }

    @Override
    public int getItemCount() {
        return relicImgList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView relicSingleImg;
        TextView relicSingleName;
        TextView relicSingleDesc;
        RelativeLayout relicSingleLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            relicSingleImg = itemView.findViewById(R.id.relic_single_img);
            relicSingleName = itemView.findViewById(R.id.relic_single_name);
            relicSingleDesc = itemView.findViewById(R.id.relic_single_desc);
            relicSingleLayout = itemView.findViewById(R.id.relic_list_single_layout);
        }
    }
}
