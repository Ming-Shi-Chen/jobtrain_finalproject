package com.example.finalproject.ui.user;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> editTextId;


    public UserViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is user fragment");
        editTextId = new MutableLiveData<>();


    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getId(){
        return editTextId;
    }
}