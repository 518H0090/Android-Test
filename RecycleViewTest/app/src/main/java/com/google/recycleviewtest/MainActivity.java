package com.google.recycleviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NameAdapter nameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        nameAdapter = new NameAdapter(this);

        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);

        nameAdapter.setData(getListName());
        recyclerView.setAdapter(nameAdapter);
    }

    private List<Name> getListName() {
        List<Name> names = new ArrayList<>();
        for (int i = 0; i <  6 ; i++){
            names.add(new Name("Name" + i,i));
        }

        return names;
    }
}