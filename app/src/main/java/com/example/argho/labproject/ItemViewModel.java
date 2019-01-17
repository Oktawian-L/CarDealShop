package com.example.argho.labproject;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class ItemViewModel extends ViewModel {
    DataRepo repo;

    int currentItem = 0;

    public MutableLiveData<String> LDItemS;
    public MutableLiveData<Item> liveDataItem;
    public MutableLiveData<List<Item>> LDList;

    ItemViewModel() { repo = new DataRepo(); }

    public MutableLiveData<Item> getLiveDataItem() {
        if (liveDataItem == null) {
            liveDataItem = new MutableLiveData<>();
            loadItem();
        }

        return liveDataItem;
    }

    private void loadItem() {
        liveDataItem.setValue(repo.getItem());
    }

    void setNewItem() {
        repo.getItem().setItemName("Zombie");
        repo.getItem().setItemDesctiprion("Unknown");
        repo.getItem().setItemStrength(0);
        liveDataItem.setValue(repo.getItem());
    }
}
