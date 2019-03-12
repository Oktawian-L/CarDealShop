package com.example.argho.labproject;

import java.util.ArrayList;

public class DataRepo {
    Item item;
    ArrayList<Item> itemList = new ArrayList<>();

    public DataRepo() {
        item = new Item(3);
        for (int i = 1; i <= item.MAX_STRENGTH; i++) {
            itemList.add(new Item(i));

            
        }
    }

    public Item getItem() { return item; }

    public Item getItem(int i) { return itemList.get(i); }
}
