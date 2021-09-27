package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    List<Image> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = (GridView) findViewById(R.id.gridview);
        imageList = new ArrayList<Image>();

        imageList.add(new Image("Grid 1",R.drawable.grid1));
        imageList.add(new Image("Grid 2",R.drawable.grid2));
        imageList.add(new Image("Grid 3",R.drawable.grid3));
        imageList.add(new Image("Grid 4",R.drawable.grid4));
        imageList.add(new Image("Grid 5",R.drawable.grid5));

        ImageAdapter adapter = new ImageAdapter(
                MainActivity.this,
                R.layout.custom_gridview,
                imageList
        );

        gridview.setAdapter(adapter);
    }
}