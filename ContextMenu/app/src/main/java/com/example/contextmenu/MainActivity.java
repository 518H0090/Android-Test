package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout manhinh;
    Button btnMau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMau = (Button) findViewById(R.id.buttonMau);
        manhinh = (ConstraintLayout) findViewById(R.id.manHinh);

        //đăng ký view cho Context Menu
        registerForContextMenu(btnMau);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context,menu);
        menu.setHeaderTitle("Chọn Màu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.maudo:
                Toast.makeText(this, "đỏ", Toast.LENGTH_SHORT).show();
                manhinh.setBackgroundColor(Color.RED);
                break;
            case R.id.mauxanh:
                Toast.makeText(this, "xanh", Toast.LENGTH_SHORT).show();
                manhinh.setBackgroundColor(Color.GREEN);
                break;
            case R.id.mauvang:
                Toast.makeText(this, "vàng", Toast.LENGTH_SHORT).show();
                manhinh.setBackgroundColor(Color.YELLOW);
                break;
        }

        return super.onContextItemSelected(item);
    }
}