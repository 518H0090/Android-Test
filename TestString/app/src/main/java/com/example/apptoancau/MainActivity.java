package com.example.apptoancau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtThongtin;
    Button btnxacnhan;
    EditText editName,editEmail,editSDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = editName.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editSDT.getText().toString();

                txtThongtin.setText(hoten + "\t" + email + "\t" + phone);
            }
        });
    }

    private void AnhXa() {
        txtThongtin = (TextView) findViewById(R.id.textShow);
        btnxacnhan = (Button) findViewById(R.id.button);
        editName = (EditText) findViewById(R.id.editName);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSDT = (EditText) findViewById(R.id.editSDT);
    }
}