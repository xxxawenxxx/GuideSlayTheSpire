package com.warm.slaythespireguide.guideslaythespire;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class Card_Main_ViewHolder extends GroupViewHolder {
    private ImageView cardImg;
    private TextView cardName;
    private TextView cardCost;
    private TextView cardDesc;
    private ImageView arrow;

    public Card_Main_ViewHolder(View itemView) {
        super(itemView);

        cardImg = itemView.findViewById(R.id.card_image);
        cardName = itemView.findViewById(R.id.card_name);
        cardCost = itemView.findViewById(R.id.card_main_cost);
        cardDesc = itemView.findViewById(R.id.card_main_desc);
        arrow = itemView.findViewById(R.id.arrow);
    }

    public void bind(Card_Main card_main) {
        cardImg.setImageResource(card_main.getImage());
        cardName.setText(card_main.getTitle());
        cardCost.setText(card_main.getCost());
        cardDesc.setText(card_main.getDesc());
    }

}
