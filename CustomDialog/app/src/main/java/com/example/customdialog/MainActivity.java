package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLogin = (TextView) findViewById(R.id.textLogin);

        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogLogin();
            }
        });
    }

    private void DialogLogin(){
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom);
        dialog.setCanceledOnTouchOutside(false);

        EditText editName = (EditText) dialog.findViewById(R.id.editName);
        EditText editPass = (EditText) dialog.findViewById(R.id.editPass);
        Button btnDong = (Button) dialog.findViewById(R.id.btnDong);
        Button btnHuy = (Button) dialog.findViewById(R.id.btnHuy);

        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editName.getText().toString();
                String password = editPass.getText().toString();

                if(username.equals("haha") && password.equals("1223")){
                    Toast.makeText(MainActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}