package com.example.udemy_frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blackBtn, redBtn, yellowBtn, purpleBtn, greenBtn;
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
        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int checkedBtnId = view.getId();
        if(checkedBtnId == R.id.blackBtn){
            PlaySound(R.raw.black);
        }else if(checkedBtnId == R.id.greenBtn){
            PlaySound(R.raw.green);
        }else if(checkedBtnId == R.id.purpleBtn){
            PlaySound(R.raw.purple);
        }else if(checkedBtnId == R.id.redBtn){
            PlaySound(R.raw.red);
        } else if (checkedBtnId == R.id.yellowBtn) {
            PlaySound(R.raw.yellow);
        }

    }
    public void PlaySound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this, id
        );
        mediaPlayer.start();
    }
}