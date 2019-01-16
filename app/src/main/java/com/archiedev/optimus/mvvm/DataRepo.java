package com.archiedev.optimus.mvvm;

import java.util.ArrayList;

public class DataRepo {

    Item mItem;
    ArrayList<Item> mList =  new ArrayList();

    DataRepo()
    {
        mItem = new Item(3);
        for (int i = 1;i<= mItem.MaxStrength;i++)
            mList.add(new Item(i));

    }

    public Item getmItem() {
        return mItem;
    }

    public ArrayList<Item> getmList() {
        return mList;
    }

    public void setmItem(Item mItem) {
        this.mItem = mItem;
    }

    public void setmList(ArrayList<Item> mList) {
        this.mList = mList;
    }
}
