package com.example.olasek.myapplication;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class ItemViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    DataRepo repo;
    int currItem = 0;
    public MutableLiveData<String> LDItemS;
    public MutableLiveData<Item> LD1Item;
    public MutableLiveData<List<Item>> LDList;

    ItemViewModel (){repo = new DataRepo();}

    public DataRepo getRepo() {
        return repo;
    }

    public int getCurrItem() {
        return currItem;
    }

    public MutableLiveData<String> getLDItemS() {
        return LDItemS;
    }

    public MutableLiveData<Item> getLD1Item() {
       if (LD1Item == null)
       {
           LD1Item = new MutableLiveData<>();
           loadItem();
       }

        return LD1Item;
    }

    private void loadItem() {
        LD1Item.setValue(repo.getmItem());
    }

    public MutableLiveData<List<Item>> getLDList() {
        return LDList;
    }

    public void setRepo(DataRepo repo) {
        this.repo = repo;
    }

    public void setCurrItem(int currItem) {
        this.currItem = currItem;
    }

    public void setLDItemS(MutableLiveData<String> LDItemS) {
        this.LDItemS = LDItemS;
    }

    public void setLD1Item(MutableLiveData<Item> LD1Item) {
        this.LD1Item = LD1Item;
    }

    public void setLDList(MutableLiveData<List<Item>> LDList) {
        this.LDList = LDList;
    }
    void setNewItem()
    {
        repo.getmItem().setIname("Zombie");
        repo.getmItem().setDesc("Unknw");
        repo.getmItem().setIstregth(0);

    }
}
