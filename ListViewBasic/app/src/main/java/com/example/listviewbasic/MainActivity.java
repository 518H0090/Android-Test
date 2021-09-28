package com.example.listviewbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> listTest;
    Button btnThem,btnSua;
    EditText editText;
    int vitri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        listTest = new ArrayList<String>();
        btnThem = (Button) findViewById(R.id.btnThem);
        btnSua = (Button) findViewById(R.id.btnSua);
        editText = (EditText) findViewById(R.id.editText);

        listTest.add("JAVA");
        listTest.add("PHP");
        listTest.add("C++");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                listTest
        );

        listView.setAdapter(adapter);

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String arrayItem = editText.getText().toString();
                listTest.add(arrayItem);
                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editText.setText(listTest.get(position));
                vitri = position;
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listTest.set(vitri,editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                listTest.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}