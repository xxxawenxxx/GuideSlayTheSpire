package com.warm.slaythespireguide.guideslaythespire;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Potion_RecyclerViewAdapter extends RecyclerView.Adapter<Potion_RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "Relic_RecyclerViewAdapt";

    private ArrayList<Integer> potionImgList = new ArrayList<>();
    private ArrayList<String> potionNameList = new ArrayList<>();
    private ArrayList<String> potionDescList = new ArrayList<>();
    private Context mContext;

    public Potion_RecyclerViewAdapter(Context mContext, ArrayList<Integer> potionImgList, ArrayList<String> potionNameList, ArrayList<String> potionDescList) {
        this.potionImgList = potionImgList;
        this.potionNameList = potionNameList;
        this.potionDescList = potionDescList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.potion_single_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Glide.with(mContext)
                .asBitmap()
                .load(potionImgList.get(i))
                .into(viewHolder.potionSingleImg);

        viewHolder.potionSingleName.setText(potionNameList.get(i));
        viewHolder.potionSingleDesc.setText(potionDescList.get(i));
    }

    @Override
    public int getItemCount() {
        return potionImgList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView potionSingleImg;
        TextView potionSingleName;
        TextView potionSingleDesc;
        RelativeLayout potionSingleLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            potionSingleImg = itemView.findViewById(R.id.potion_single_img);
            potionSingleName = itemView.findViewById(R.id.potion_single_name);
            potionSingleDesc = itemView.findViewById(R.id.potion_single_desc);
            potionSingleLayout = itemView.findViewById(R.id.potion_list_single_layout);
        }
    }

}
