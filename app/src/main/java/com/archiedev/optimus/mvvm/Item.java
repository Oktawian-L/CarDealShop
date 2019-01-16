package com.archiedev.optimus.mvvm;

import android.widget.ImageView;

public class Item {

    int MaxStrength = 5;
    String iname;
    ImageView iimage;
    String idescription;
    int istrength;
    boolean iactivity;

    Item (int i)
    {
        iname = "name";
        iimage = null;
        idescription = "opis";
        istrength = i%(MaxStrength+1);
        iactivity = true;
    }

    public int getMaxStrength() {
        return MaxStrength;
    }

    public String getIname() {
        return iname;
    }

    public ImageView getIimage() {
        return iimage;
    }

    public String getIdescription() {
        return idescription;
    }

    public int getIstrength() {
        return istrength;
    }

    public boolean isIactivity() {
        return iactivity;
    }

    public void setMaxStrength(int maxStrength) {
        MaxStrength = maxStrength;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public void setIimage(ImageView iimage) {
        this.iimage = iimage;
    }

    public void setIdescription(String idescription) {
        this.idescription = idescription;
    }

    public void setIstrength(int istrength) {
        this.istrength = istrength;
    }

    public void setIactivity(boolean iactivity) {
        this.iactivity = iactivity;
    }
}
