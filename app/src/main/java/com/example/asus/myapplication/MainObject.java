package com.example.asus.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by asus on 9/22/2017.
 */

public class MainObject implements Parcelable {

    String string1;
    String string2;
    String string3;
    String string4;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.string1);
        dest.writeString(this.string2);
        dest.writeString(this.string3);
        dest.writeString(this.string4);
    }

    public MainObject(String mString1, String mString2, String mString3, String mString4) {
        this.string1 = mString1;
        this.string2 = mString2;
        this.string3 = mString3;
        this.string4 = mString4;
    }

    protected MainObject(Parcel in) {
        this.string1 = in.readString();
        this.string2 = in.readString();
        this.string3 = in.readString();
        this.string4 = in.readString();
    }

    public static final Parcelable.Creator<MainObject> CREATOR = new Parcelable.Creator<MainObject>() {
        @Override
        public MainObject createFromParcel(Parcel source) {
            return new MainObject(source);
        }

        @Override
        public MainObject[] newArray(int size) {
            return new MainObject[size];
        }
    };
}
