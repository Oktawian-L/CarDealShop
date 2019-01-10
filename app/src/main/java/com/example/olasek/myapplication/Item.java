package com.example.olasek.myapplication;

import android.widget.ImageView;

public class Item {
    int MaxStrength = 5;
    String iname;
    ImageView iimage;
    String idescription;
    int istregth;
    boolean iactivity;

    Item(int i){
        iname = "name"+1;
        iimage = null;
        idescription = "dexc";
        istregth = i%(MaxStrength+1);
        iactivity = true;
    }
    /*public  void setIname(String name){this.iname = iname;}
    public void setIstreght (int streght ){this.istregth = streght;}
    public void setIdescription (String dsc ){this.idescription = desc;}

    public String getIname() {return ian}*/

    public ImageView getIimage() {
        return iimage;
    }

    public String getIdescription() {
        return idescription;
    }

    public int getIstregth() {
        return istregth;
    }

    public boolean isIactivity() {
        return iactivity;
    }

    public int getMaxStrength() {

        return MaxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        MaxStrength = maxStrength;
    }

    public void setIimage(ImageView iimage) {
        this.iimage = iimage;
    }
    public void setDesc(String dewsc) {
        this.idescription = dewsc;
    }

    public void setIname(String iname2) {
        this.iname = iname2;
    }
    public void setIstregth(int istregth) {
        this.istregth = istregth;
    }

    public void setIactivity(boolean iactivity) {
        this.iactivity = iactivity;
    }
}
