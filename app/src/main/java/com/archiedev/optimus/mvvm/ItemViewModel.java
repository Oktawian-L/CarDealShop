package com.archiedev.optimus.mvvm;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class ItemViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    DataRepo repo;
    int currItem = 0;
    public MutableLiveData<String> LDItemS;
    public MutableLiveData<Item> LDItem;
    public MutableLiveData<List<Item>> LDList;

    ItemViewModel(){
        repo = new DataRepo();
    }
    public MutableLiveData<Item> getLDItem()
    {
        if(LDItem == null) {
            LDItem = new MutableLiveData<>();
            loadItem();
        }
        return LDItem;
    }

    private void loadItem() {
        LDItem.setValue(repo.getmItem());
    }
    void setNewItem()
    {
        repo.getmItem().setIname("nazwa1");
        repo.getmItem().setIdescription("opis");
        repo.getmItem().setIstrength(0);
        LDItem.setValue(repo.getmItem());
    }

}
