package com.example.udemy_databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }
    public void onButton1Clicked(View view){
        Toast.makeText(context,
                "First Button is CLicked",
                Toast.LENGTH_LONG).show();
    }
}
