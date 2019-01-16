package com.archiedev.optimus.mvvm;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ItemFragment extends Fragment {

    private ItemViewModel mViewModel;
    private ViewDataBinding binding;

    public static ItemFragment newInstance() {
        return new ItemFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.item_fragment, container, false);
        binding = DataBindingUtil.inflate(inflater,R.layout.item_fragment,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ItemViewModel.class);
        // TODO: Use the ViewModel
        final Observer<Item> ItemObserver = new Observer<Item>() {
            @Override
            public void onChanged(@Nullable final Item newItem) {
                ((TextView)getActivity().findViewById(R.id.iname)).setText(newItem.iname);
                ((RatingBar)getActivity().findViewById(R.id.ratingBar)).setRating(newItem.istrength);
                ((TextView)getActivity().findViewById(R.id.idesc)).setText(newItem.idescription);


            }
        };
        mViewModel.getLDItem().observe(this,ItemObserver);

        ((Button)getActivity().findViewById(R.id.button)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mViewModel.setNewItem();
            }
        });

    }

}
