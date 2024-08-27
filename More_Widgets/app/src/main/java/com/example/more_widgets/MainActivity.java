package com.example.more_widgets;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//    CheckBox checkbox;
    RadioGroup radiogroup;
    TimePicker timePicker;
    DatePicker datePicker;
    Button btn;
    int progress = 0;
    ProgressBar progressbar;
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
//        checkbox = findViewById(R.id.checkbox);
//        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
//                if(ischecked){
//                    Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        radiogroup = findViewById(R.id.radiogroup);
//        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                RadioButton radiobutton = findViewById(checkedId);
//                Toast.makeText(MainActivity.this,
//                        "You Selected "+radiobutton.getText().toString(),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//        Spinner spinner = findViewById(R.id.spinner);
//        String[] courses = {"Java", "C++", "Kotlin", "Python", "Html&Css"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_item, courses
//        );
//        spinner.setAdapter(adapter);
//        timePicker = findViewById(R.id.timePicker);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
//                Toast.makeText(MainActivity.this,
//                        "Hour: "+hourOfDay + " minute: "+minute,
//                        Toast.LENGTH_LONG).show();
//            }
//        });
//        datePicker = findViewById(R.id.datePicker);
//        btn = findViewById(R.id.btn);
//        String day = "Day "+datePicker.getDayOfMonth();
//        String month = "Month "+(datePicker.getMonth()+1);
//        String year = "Year "+datePicker.getYear();
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,
//                        day +" "+month+" "+year,
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
        btn = findViewById(R.id.btn);
        progressbar = findViewById(R.id.progressbar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progress = progress+10;
                progressbar.setProgress(progress);
            }
        });
    }
}