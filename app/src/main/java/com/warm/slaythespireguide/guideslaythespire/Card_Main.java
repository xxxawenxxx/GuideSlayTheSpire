package com.warm.slaythespireguide.guideslaythespire;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Card_Main extends ExpandableGroup<Card_Upgrade> {
    private final Integer image;
    private final String cost;
    private final String desc;

    public Card_Main(Integer image, String name, String cost, String desc, List<Card_Upgrade> items) {
        super(name, items);
        this.image = image;
        this.cost = cost;
        this.desc = desc;
    }

    public Integer getImage() {
        return image;
    }

    public String getCost() {
        return cost;
    }

    public String getDesc() {
        return desc;
    }
}
