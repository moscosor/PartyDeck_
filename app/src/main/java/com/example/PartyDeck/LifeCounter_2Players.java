package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeCounter_2Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter2_players);

        TextView player1_life = (TextView)findViewById(R.id.player1_life);
        TextView player2_life = (TextView)findViewById(R.id.player2_life);

        Button player1_minus = (Button)findViewById(R.id.player1_minus);
        Button player1_plus = (Button)findViewById(R.id.player1_plus);

        Button player2_minus = (Button)findViewById(R.id.player2_minus);
        Button player2_plus = (Button)findViewById(R.id.player2_plus);

        Bundle extras = getIntent().getExtras();
        int startingLifePoints = extras.getInt("startingLifeTotals");

        player1_life.setText(Integer.toString(startingLifePoints));
        player2_life.setText(Integer.toString(startingLifePoints));


        player1_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(player1_life.getText().toString());
                int newLife = player_currLife - 1;
                player1_life.setText(Integer.toString(newLife));
            }
        });

        player1_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(player1_life.getText().toString());
                int newLife = player_currLife + 1;
                player1_life.setText(Integer.toString(newLife));
            }
        });

        player2_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(player2_life.getText().toString());
                int newLife = player_currLife - 1;
                player2_life.setText(Integer.toString(newLife));
            }
        });

        player2_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player_currLife = Integer.parseInt(player2_life.getText().toString());
                int newLife = player_currLife + 1;
                player2_life.setText(Integer.toString(newLife));
            }
        });
    }
}