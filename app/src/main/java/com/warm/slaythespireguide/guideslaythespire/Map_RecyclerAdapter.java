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

public class Map_RecyclerAdapter extends RecyclerView.Adapter<Map_RecyclerAdapter.ViewHolder>{

    private ArrayList<Integer> mapImageList = new ArrayList<>();
    private ArrayList<String> mapNameList = new ArrayList<>();
    private ArrayList<String> mapDescList = new ArrayList<>();
    private Context mContext;

    public Map_RecyclerAdapter(Context mContext, ArrayList<Integer> mapImageList, ArrayList<String> mapNameList, ArrayList<String> mapDescList) {
        this.mapImageList = mapImageList;
        this.mapNameList = mapNameList;
        this.mapDescList = mapDescList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.map_single_item, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(mContext)
                .asBitmap()
                .load(mapImageList.get(i))
                .into(viewHolder.single_mapImage);

        viewHolder.single_mapName.setText(mapNameList.get(i));
        viewHolder.single_mapDesc.setText(mapDescList.get(i));
    }

    @Override
    public int getItemCount() {
        return mapNameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView single_mapImage;
        TextView single_mapName;
        TextView single_mapDesc;
        RelativeLayout single_mapLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            single_mapImage = itemView.findViewById(R.id.maps_single_img);
            single_mapName = itemView.findViewById(R.id.maps_single_name);
            single_mapDesc = itemView.findViewById(R.id.maps_single_desc);
            single_mapLayout = itemView.findViewById(R.id.maps_list_single_layout);
        }
    }
}
