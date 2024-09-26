package com.example.udemy_databindingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.udemy_databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;
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
        Person p1 = new Person("Cuong", "cuong@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main
        );
        activityMainBinding.setPerson(p1);
        //Binding the Hanlder for CLick Event
        myClickHandler = new MyClickHandler(this);
        activityMainBinding.setCLickHandler(myClickHandler);
    }
}