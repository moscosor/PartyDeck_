package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeCounter_4Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter4_players);

        TextView p4_player1_life = (TextView)findViewById(R.id.p4_player1_life);
        TextView p4_player2_life = (TextView)findViewById(R.id.p4_player2_life);
        TextView p4_player3_life = (TextView)findViewById(R.id.p4_player3_life);
        TextView p4_player4_life = (TextView)findViewById(R.id.p4_player4_life);

        Button p4_player1_minus = (Button)findViewById(R.id.p4_player1_minus);
        Button p4_player1_plus = (Button)findViewById(R.id.p4_player1_plus);

        Button p4_player2_minus = (Button)findViewById(R.id.p4_player2_minus);
        Button p4_player2_plus = (Button)findViewById(R.id.p4_player2_plus);

        Button p4_player3_minus = (Button)findViewById(R.id.p4_player3_minus);
        Button p4_player3_plus = (Button)findViewById(R.id.p4_player3_plus);

        Button p4_player4_minus = (Button)findViewById(R.id.p4_player4_minus);
        Button p4_player4_plus = (Button)findViewById(R.id.p4_player4_plus);

        Bundle extras = getIntent().getExtras();
        int startingLifePoints = extras.getInt("startingLifeTotals");

        p4_player1_life.setText(Integer.toString(startingLifePoints));
        p4_player2_life.setText(Integer.toString(startingLifePoints));
        p4_player3_life.setText(Integer.toString(startingLifePoints));
        p4_player4_life.setText(Integer.toString(startingLifePoints));


        p4_player1_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player1_life.getText().toString());
                int newLife = player_currLife - 1;
                p4_player1_life.setText(Integer.toString(newLife));
            }
        });

        p4_player1_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player1_life.getText().toString());
                int newLife = player_currLife + 1;
                p4_player1_life.setText(Integer.toString(newLife));
            }
        });

        p4_player2_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player2_life.getText().toString());
                int newLife = player_currLife - 1;
                p4_player2_life.setText(Integer.toString(newLife));
            }
        });

        p4_player2_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player2_life.getText().toString());
                int newLife = player_currLife + 1;
                p4_player2_life.setText(Integer.toString(newLife));
            }
        });

        p4_player3_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player3_life.getText().toString());
                int newLife = player_currLife - 1;
                p4_player3_life.setText(Integer.toString(newLife));
            }
        });

        p4_player3_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player3_life.getText().toString());
                int newLife = player_currLife + 1;
                p4_player3_life.setText(Integer.toString(newLife));
            }
        });

        p4_player4_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player4_life.getText().toString());
                int newLife = player_currLife - 1;
                p4_player4_life.setText(Integer.toString(newLife));
            }
        });

        p4_player4_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p4_player4_life.getText().toString());
                int newLife = player_currLife + 1;
                p4_player4_life.setText(Integer.toString(newLife));
            }
        });

    }
}