package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView txtList;
    List<String> arrayList;
    Button btnThem,btnSua;
    EditText editText;
    int vitri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DeclareAgrument();
        ListViewWork();



    }

    private void ListViewWork() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayList
        );

        txtList.setAdapter(arrayAdapter);



        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(editText.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

        txtList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editText.setText(arrayList.get(position));
                vitri = position;
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.set(vitri,editText.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

        txtList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayList.remove(position);
                arrayAdapter.notifyDataSetChanged();

                return false;
            }
        });
    }


    private void DeclareAgrument(){
        txtList = (ListView) findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        btnSua = (Button) findViewById(R.id.btnSua);
        btnThem = (Button) findViewById(R.id.btnThem);
        editText = (EditText) findViewById(R.id.editText);

        arrayList.add("PHP");
        arrayList.add("Laravel");
        arrayList.add("java");
    }


}