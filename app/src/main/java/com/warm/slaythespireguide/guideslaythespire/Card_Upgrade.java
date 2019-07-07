package com.warm.slaythespireguide.guideslaythespire;

import android.os.Parcel;
import android.os.Parcelable;

public class Card_Upgrade implements Parcelable {
    public final String desc;
    public final String cost;

    public Card_Upgrade(String cost, String desc) {
        this.cost = cost;
        this.desc = desc;
    }

    protected Card_Upgrade(Parcel in) {
        desc = in.readString();
        cost = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cost);
        dest.writeString(desc);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Card_Upgrade> CREATOR = new Creator<Card_Upgrade>() {
        @Override
        public Card_Upgrade createFromParcel(Parcel in) {
            return new Card_Upgrade(in);
        }

        @Override
        public Card_Upgrade[] newArray(int size) {
            return new Card_Upgrade[size];
        }
    };
}
