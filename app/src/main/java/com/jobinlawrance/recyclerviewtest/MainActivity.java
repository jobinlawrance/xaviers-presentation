package com.jobinlawrance.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpLayout();
    }

    private void setUpLayout() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DummyAdapter adapter = new DummyAdapter();
        recyclerView.setAdapter(adapter);

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i < 1000; i++) {
            integers.add(i);
        }

        adapter.setIntegers(integers);
    }
}
