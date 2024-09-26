package com.example.udemy_sportsappphan20;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // 1- Adapter View
    private RecyclerView recyclerView;
    // 2- Data Source
    private List<Sport> sportList;
    // 3- Adapter
    private CustomAdapter myAdapter;
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
        recyclerView = findViewById(R.id.recyclerView);
        sportList = new ArrayList<>();
        Sport sp1 = new Sport("Football", R.drawable.football);
        Sport sp2 = new Sport("VolleyBall", R.drawable.volley);
        Sport sp3 = new Sport("BasketBall", R.drawable.basketball);
        Sport sp4 = new Sport("Tennis", R.drawable.tennis);
        Sport sp5 = new Sport("Ping Pong", R.drawable.ping);

        sportList.add(sp1);
        sportList.add(sp2);
        sportList.add(sp3);
        sportList.add(sp4);
        sportList.add(sp5);

        myAdapter = new CustomAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);




    }
}