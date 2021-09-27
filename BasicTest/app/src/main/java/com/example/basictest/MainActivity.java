package com.example.basictest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3;
    SeekBar seekBar1,seekBar2,seekBar3;
    ImageButton btnClick;
    int score = 100;
    TextView txtScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        Check();
        RunMM(MainActivity.this);

    }

    private void setDisEnable(){
        checkBox1.setEnabled(false);
        checkBox2.setEnabled(false);
        checkBox3.setEnabled(false);
        seekBar1.setEnabled(false);
        seekBar2.setEnabled(false);
        seekBar3.setEnabled(false);
    }

    private void setEnable(){
        checkBox1.setEnabled(true);
        checkBox2.setEnabled(true);
        checkBox3.setEnabled(true);
        seekBar1.setEnabled(true);
        seekBar2.setEnabled(true);
        seekBar3.setEnabled(true);
    }

    private void Check() {
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox1.setChecked(false);
                    checkBox3.setChecked(false);
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                }
            }
        });
    }

    private void AnhXa(){
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);

        seekBar1 = (SeekBar) findViewById(R.id.seekbar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekbar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekbar3);

        btnClick = (ImageButton) findViewById(R.id.btnClick);

        txtScore = (TextView) findViewById(R.id.txtScore);

        txtScore.setText(score+"");
    }


    private void RunMM(Context context){
        CountDownTimer countDownTimer = new CountDownTimer(60000,300) {
            @Override
            public void onTick(long millisUntilFinished) {
                Random random = new Random();
                int number1 = random.nextInt(30);
                int number2 = random.nextInt(30);
                int number3 = random.nextInt(30);
                seekBar1.setProgress(seekBar1.getProgress()+number1);
                seekBar2.setProgress(seekBar2.getProgress()+number2);
                seekBar3.setProgress(seekBar3.getProgress()+number3);
                if(seekBar1.getProgress() >= seekBar1.getMax()){
                    this.cancel();
                    btnClick.setVisibility(View.VISIBLE);
                    Toast.makeText(context, "One 1 Win", Toast.LENGTH_SHORT).show();
                    if(checkBox1.isChecked()){
                        score += 5;
                    }else{
                        score -= 5;
                    }
                    txtScore.setText(score+"");
                    setEnable();
                }else if (seekBar2.getProgress() >= seekBar2.getMax()){
                    this.cancel();
                    btnClick.setVisibility(View.VISIBLE);
                    Toast.makeText(context, "Two 1 Win", Toast.LENGTH_SHORT).show();
                    if(checkBox2.isChecked()){
                        score += 5;
                    }else{
                        score -= 5;
                    }
                    txtScore.setText(score+"");
                    setEnable();
                }

                else if (seekBar3.getProgress() >= seekBar3.getMax()){
                    this.cancel();
                    Toast.makeText(context, "Three 1 Win", Toast.LENGTH_SHORT).show();
                    btnClick.setVisibility(View.VISIBLE);
                    if(checkBox3.isChecked()){
                        score += 5;
                    }else{
                        score -= 5;
                    }
                    txtScore.setText(score+"");
                    setEnable();
                }
            }

            @Override
            public void onFinish() {

            }
        };

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked()){
                    seekBar1.setProgress(0);
                    seekBar2.setProgress(0);
                    seekBar3.setProgress(0);
                    btnClick.setVisibility(View.INVISIBLE);
                    setDisEnable();
                    countDownTimer.start();
                } else{

                    Toast.makeText(MainActivity.this, "Vui lòng đặt cược", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}