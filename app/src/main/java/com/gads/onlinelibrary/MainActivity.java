package com.gads.onlinelibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> mystring = new ArrayList<>();
        mystring.add("History");
        mystring.add("Education");
        mystring.add("Physics");
        mystring.add("Mathematics");
        mystring.add("English");
        mystring.add("Computers");
        mystring.add("Chemistry");
        mystring.add("Art");
        mystring.add("Business");
        mystring.add("Government");
        mystring.add("Biology");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        SubjectsAdapter adapter = new SubjectsAdapter(mystring);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}