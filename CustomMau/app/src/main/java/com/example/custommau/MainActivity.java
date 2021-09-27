package com.example.custommau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);

        imageView.setImageLevel(5000);

        ClipDrawable clipDrawable = (ClipDrawable) imageView.getDrawable();

        CountDownTimer countDownTimer = new CountDownTimer(10000,600) {
            @Override
            public void onTick(long millisUntilFinished) {
                imageView.setImageLevel(clipDrawable.getLevel() + 1000);
                if(clipDrawable.getLevel() >= 10000){
                    imageView.setImageLevel(0);
                    this.cancel();
                }
            }

            @Override
            public void onFinish() {

            }
        };


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start();
            }
        });
    }
}