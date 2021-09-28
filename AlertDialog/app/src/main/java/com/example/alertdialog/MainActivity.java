package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> arraylist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listMon);
        arraylist = new ArrayList<String>();
        addmonhoc();

        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                arraylist);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                xacNhanXoa(position);
                return false;
            }
        });
    }

    private void xacNhanXoa(int position){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("HAHA");
        dialog.setIcon(R.drawable.ic_launcher_background);
        dialog.setMessage("bạn muốn gì");
        dialog.setPositiveButton("có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                arraylist.remove(position);
                adapter.notifyDataSetChanged();
            }
        });

        dialog.setNegativeButton("không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dialog.show();
    }

    private void addmonhoc() {
        arraylist.add("Android");
        arraylist.add("Java");
        arraylist.add("PHP");
    }
}