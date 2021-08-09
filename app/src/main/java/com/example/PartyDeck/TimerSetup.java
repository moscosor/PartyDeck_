package com.example.PartyDeck;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TimerSetup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_setup);

        Button setupButton = (Button) findViewById(R.id.startTimer);
        Button back = (Button) findViewById(R.id.back);

        EditText hours = (EditText) findViewById(R.id.hours);
        EditText minutes = (EditText) findViewById(R.id.minutes);
        EditText seconds = (EditText) findViewById(R.id.seconds);

        setupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (hours.getText().toString().equals("")){
                    hours.setText("0");
                }
                if (minutes.getText().toString().equals("")){
                    minutes.setText("0");
                }
                if (seconds.getText().toString().equals("")){
                    seconds.setText("0");
                }
                int sendH = Integer.parseInt(hours.getText().toString());
                int sendM = Integer.parseInt(minutes.getText().toString());
                int sendS = Integer.parseInt(seconds.getText().toString());

                Intent intent = new Intent(TimerSetup.this, Timer.class);
                Bundle bundle = new Bundle();
                bundle.putInt("hours", sendH);
                bundle.putInt("minutes", sendM);
                bundle.putInt("seconds", sendS);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimerSetup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}