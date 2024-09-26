package com.example.udemy_viewmodelapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<>();
    public void increaseCounter(){
        //Retrieve the current value from LiveData
        int currentValue = counter.getValue() !=null ? counter.getValue():0;
        //Increase value by 1
        counter.setValue(currentValue+1);
    }

    public LiveData<Integer> getCounter() {
        return counter;
    }
}
