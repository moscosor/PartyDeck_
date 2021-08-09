package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DiceRolling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_rolling);

        Bundle bundle = getIntent().getExtras();

        int numberOfDice = bundle.getInt("numberOfDice");
        int numberOfSides = bundle.getInt("numberOfSides");

        roll(numberOfSides, numberOfDice);

        Button reroll = (Button) findViewById(R.id.reroll);
        Button back = (Button) findViewById(R.id.backButtonRolling);

        reroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll(numberOfSides, numberOfDice);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiceRolling.this, DiceRollingSetup.class);
                startActivity(intent);
            }
        });
    }

    private void roll(int sides, int dice){
        String output = "";
        int rolledResult;
        for (int i = 0; i < dice; i++) {
            rolledResult = getRandomInteger(1,sides);
            output += rolledResult + "   ";
        }

        TextView outputText = (TextView) findViewById(R.id.diceRollResult);
        outputText.setText(output);
    }

    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
}