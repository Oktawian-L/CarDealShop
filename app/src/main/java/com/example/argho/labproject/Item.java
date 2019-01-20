package com.example.argho.labproject;

import android.widget.ImageView;

public class Item {
    final static int MAX_STRENGTH = 5;
    String itemName;
    ImageView itemImage;
    String itemDesctiprion;
    int itemStrength;
    boolean itemActivity;

    public Item (int i) {
        itemName = "☺ name" + i;
        itemImage = null;
        itemDesctiprion = "Standard";
        itemStrength = i % (MAX_STRENGTH + 1);
        itemActivity = true;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ImageView getItemImage() {
        return itemImage;
    }

    public void setItemImage(ImageView itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemDesctiprion() {
        return itemDesctiprion;
    }

    public void setItemDesctiprion(String itemDesctiprion) {
        this.itemDesctiprion = itemDesctiprion;
    }

    public int getItemStrength() {
        return itemStrength;
    }

    public void setItemStrength(int itemStrength) {
        this.itemStrength = itemStrength;
    }

    public boolean isItemActivity() {
        return itemActivity;
    }

    public void setItemActivity(boolean itemActivity) {
        this.itemActivity = itemActivity;
    }
}
