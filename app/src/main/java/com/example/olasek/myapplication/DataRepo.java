package com.example.olasek.myapplication;

import java.util.ArrayList;

public class DataRepo {
    Item mItem;
    ArrayList<Item> mIlist = new ArrayList<>();

    DataRepo()
    {
        mItem = new Item(3);
        for (int i = 1; i<= mItem.MaxStrength; i++)
        {
            mIlist.add(new Item(i));
        }
    }

    public Item getmItem() {
        return mItem;
    }

    public ArrayList<Item> getmIlist() {
        return mIlist;
    }

    public void setmItem(Item mItem) {
        this.mItem = mItem;
    }

    public void setmIlist(ArrayList<Item> mIlist) {
        this.mIlist = mIlist;
    }
}
