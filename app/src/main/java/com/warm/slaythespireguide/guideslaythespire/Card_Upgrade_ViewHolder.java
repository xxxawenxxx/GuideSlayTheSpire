package com.warm.slaythespireguide.guideslaythespire;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class Card_Upgrade_ViewHolder extends ChildViewHolder {
    private TextView card_upgradeDesc;
    private TextView card_upgradeCost;

    public Card_Upgrade_ViewHolder(View itemView) {
        super(itemView);
        card_upgradeDesc = itemView.findViewById(R.id.card_upgrade_desc);
        card_upgradeCost = itemView.findViewById(R.id.card_upgrade_cost);
    }

    public void bind(Card_Upgrade card_upgrade) {
        card_upgradeDesc.setText(card_upgrade.desc);
        card_upgradeCost.setText(card_upgrade.cost);
    }
}
