package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<Employee> employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        employeeList = new ArrayList<>();

        employeeList.add(new Employee("JAVA", 20, R.mipmap.ic_launcher));
        employeeList.add(new Employee("PHP", 30, R.mipmap.ic_launcher_round));

        employeeAdapter adapter = new employeeAdapter(
                MainActivity.this,
                R.layout.layout_have_employee,
                employeeList
        );

        listView.setAdapter(adapter);
    }
}