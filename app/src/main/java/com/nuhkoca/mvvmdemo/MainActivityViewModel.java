package com.nuhkoca.mvvmdemo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public MutableLiveData<Integer> counter = new MutableLiveData<>();
    private int number = 0;

    public void onButtonClick() {
        counter.setValue(++number);
    }
}