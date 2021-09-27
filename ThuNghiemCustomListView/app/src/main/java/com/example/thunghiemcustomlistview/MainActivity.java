package com.example.thunghiemcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<HaHa> haHaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        haHaList = new ArrayList<HaHa>();

        haHaList.add(new HaHa("PHP", 20, R.mipmap.ic_launcher));
        haHaList.add(new HaHa("JAVA", 50, R.mipmap.ic_launcher_round));

        HaHaAdapter haHaAdapter = new HaHaAdapter(
                MainActivity.this,
                R.layout.layout_android_haha,
                haHaList
        );

        listView.setAdapter(haHaAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                haHaList.remove(position);
                haHaAdapter.notifyDataSetChanged();

                return false;
            }
        });
    }
}