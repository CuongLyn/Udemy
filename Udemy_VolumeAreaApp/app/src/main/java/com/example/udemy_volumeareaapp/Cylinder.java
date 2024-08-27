package com.example.udemy_volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cylinder extends AppCompatActivity {
    TextView title, result;
    EditText height, radius;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        title = findViewById(R.id.textView1);
        result = findViewById(R.id.txt_result);
        height = findViewById(R.id.edt_height);
        radius = findViewById(R.id.edt_radius);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r = Integer.parseInt(radius.getText().toString());
                int h = Integer.parseInt(height.getText().toString());
                double volume = 3.14159*r*r*h;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}