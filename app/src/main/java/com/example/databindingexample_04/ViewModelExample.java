package com.example.databindingexample_04;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class ViewModelExample extends ViewModel {

    public ObservableField<String> message= new ObservableField<>("Hola");

    public void updateMessage(){
        message.set("Hola, DataBinding");
    }


}
