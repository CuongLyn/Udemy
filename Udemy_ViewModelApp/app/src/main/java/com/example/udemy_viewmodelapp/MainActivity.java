package com.example.udemy_viewmodelapp;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.udemy_viewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    MyViewModel viewModel;
    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );
        viewModel = new ViewModelProvider(this)
                .get(MyViewModel.class);
        mainBinding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.increaseCounter();

            }
        });
        mainBinding.numberTxt.setText(""+viewModel.getCounter());
        //Observing the LiveData
        viewModel.getCounter().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer counter) {
                        mainBinding.numberTxt.setText(""+counter);
                    }
                });
    }
}