package com.warm.slaythespireguide.guideslaythespire;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Card_Adapter extends ExpandableRecyclerViewAdapter<Card_Main_ViewHolder, Card_Upgrade_ViewHolder> {

    public Card_Adapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public Card_Main_ViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_single_mainlayout, parent, false);
        return new Card_Main_ViewHolder(v);
    }

    @Override
    public Card_Upgrade_ViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_single_childlayout, parent, false);
        return new Card_Upgrade_ViewHolder(v);
    }

    @Override
    public void onBindChildViewHolder(Card_Upgrade_ViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Card_Upgrade card_upgrade = (Card_Upgrade) group.getItems().get(childIndex);
        holder.bind(card_upgrade);
    }

    @Override
    public void onBindGroupViewHolder(Card_Main_ViewHolder holder, int flatPosition, ExpandableGroup group) {
        final Card_Main card_main= (Card_Main) group;
        holder.bind(card_main);
    }
}
