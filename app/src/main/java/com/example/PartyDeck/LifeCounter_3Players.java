package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeCounter_3Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter3_players);

        TextView p3_player1_life = (TextView)findViewById(R.id.p3_player1_life);
        TextView p3_player2_life = (TextView)findViewById(R.id.p4_player2_life);
        TextView p3_player3_life = (TextView)findViewById(R.id.p4_player3_life);

        Button p3_player1_minus = (Button)findViewById(R.id.p3_player1_minus);
        Button p3_player1_plus = (Button)findViewById(R.id.p3_player1_plus);

        Button p3_player2_minus = (Button)findViewById(R.id.p4_player2_minus);
        Button p3_player2_plus = (Button)findViewById(R.id.p4_player2_plus);

        Button p3_player3_minus = (Button)findViewById(R.id.p4_player3_minus);
        Button p3_player3_plus = (Button)findViewById(R.id.p4_player3_plus);

        Bundle extras = getIntent().getExtras();
        int startingLifePoints = extras.getInt("startingLifeTotals");

        p3_player1_life.setText(Integer.toString(startingLifePoints));
        p3_player2_life.setText(Integer.toString(startingLifePoints));
        p3_player3_life.setText(Integer.toString(startingLifePoints));


        p3_player1_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player1_life.getText().toString());
                int newLife = player_currLife - 1;
                p3_player1_life.setText(Integer.toString(newLife));
            }
        });

        p3_player1_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player1_life.getText().toString());
                int newLife = player_currLife + 1;
                p3_player1_life.setText(Integer.toString(newLife));
            }
        });

        p3_player2_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player2_life.getText().toString());
                int newLife = player_currLife - 1;
                p3_player2_life.setText(Integer.toString(newLife));
            }
        });

        p3_player2_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player2_life.getText().toString());
                int newLife = player_currLife + 1;
                p3_player2_life.setText(Integer.toString(newLife));
            }
        });

        p3_player3_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player3_life.getText().toString());
                int newLife = player_currLife - 1;
                p3_player3_life.setText(Integer.toString(newLife));
            }
        });

        p3_player3_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(p3_player3_life.getText().toString());
                int newLife = player_currLife + 1;
                p3_player3_life.setText(Integer.toString(newLife));
            }
        });
    }
}