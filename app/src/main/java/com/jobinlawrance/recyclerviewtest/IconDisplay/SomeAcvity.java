package com.jobinlawrance.recyclerviewtest.IconDisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jobinlawrance.recyclerviewtest.R;

import java.util.ArrayList;
import java.util.List;

public class SomeAcvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_acvity);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));

        SomeAdapter adapter = new SomeAdapter();
        recyclerView.setAdapter(adapter);

        List<String> stringList = new ArrayList<>();
        stringList.add("John");
        stringList.add("Mary");
        stringList.add("Joseph");
        stringList.add("krishna");
        stringList.add("John");
        stringList.add("John");
        stringList.add("John");

        adapter.setStringList(stringList);
        adapter.notifyDataSetChanged();

    }
}
