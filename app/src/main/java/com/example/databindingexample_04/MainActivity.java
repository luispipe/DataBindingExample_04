package com.example.databindingexample_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.databindingexample_04.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewModelExample viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflar la vista
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //ViewModelProvider--> genera instancias del viewModel dentro del activity o fragment
        viewModel= new ViewModelProvider(this).get(ViewModelExample.class);

        //Actualizamos el modelo de datos asociado al activity
        binding.setViewModelX(viewModel);

        //Restablecer el cilo de vida de los datos
        binding.setLifecycleOwner(this);

    }
}