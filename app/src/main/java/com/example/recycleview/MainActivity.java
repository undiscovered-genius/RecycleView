package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Profile");
        titles.add("Search");
        titles.add("Security");
        titles.add("Music");

        images.add(R.drawable.ic_account_circle_black_24dp);
        images.add(R.drawable.ic_search_black_24dp);
        images.add(R.drawable.ic_security_black_24dp);
        images.add(R.drawable.ic_surround_sound_black_24dp);

        adapter = new Adapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
