package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Timer extends AppCompatActivity {

    CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        TextView textView = (TextView) findViewById(R.id.textView);
        Button reset = (Button) findViewById(R.id.resetTimer);
        Button back = (Button) findViewById(R.id.backTimer);

        Bundle bundle = getIntent().getExtras();

        int hours = bundle.getInt("hours");
        int minutes = bundle.getInt("minutes");
        int seconds = bundle.getInt("seconds");

        long milliseconds = (long) ((hours * 3600 + minutes * 60 + seconds)*1000);

        timer = new CountDownTimer(milliseconds, 1000) {
            public void onTick(long millisUntilFinished) {
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
            }
            public void onFinish() {
                textView.setText("00:00:00");
            }
        }.start();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
                timer = new CountDownTimer(milliseconds, 1000) {
                    public void onTick(long millisUntilFinished) {
                        NumberFormat f = new DecimalFormat("00");
                        long hour = (millisUntilFinished / 3600000) % 24;
                        long min = (millisUntilFinished / 60000) % 60;
                        long sec = (millisUntilFinished / 1000) % 60;
                        textView.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));
                    }
                    public void onFinish() {
                        textView.setText("00:00:00");
                    }
                }.start();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timer.this, TimerSetup.class);
                startActivity(intent);
            }
        });
    }
}