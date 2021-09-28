package com.example.menumoi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_demo, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuSetting:
                Toast.makeText(this, "bạn chọn setting", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuShare:
                Toast.makeText(this, "bạn chọn share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuSearch:
                Toast.makeText(this, "bạn chọn search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuPhone:
                Toast.makeText(this, "bạn chọn phone", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuExit:
                Toast.makeText(this, "bạn chọn exit", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuEmail:
                Toast.makeText(this, "bạn chọn email", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}