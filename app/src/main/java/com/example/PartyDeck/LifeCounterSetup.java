package com.example.PartyDeck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class LifeCounterSetup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_counter_setup);

        Button startLifeCounter = (Button)findViewById(R.id.startLifeCounter);

        EditText _numOfPlayers = (EditText)findViewById(R.id.numOfPlayers);
        EditText _startingLifeTotals = (EditText)findViewById(R.id.startingLifeTotals);

        startLifeCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numOfPlayers = Integer.parseInt(_numOfPlayers.getText().toString());
                int startingLifeTotals = Integer.parseInt(_startingLifeTotals.getText().toString());

                Intent intent = new Intent();

                Bundle bundle = new Bundle();
                bundle.putInt("startingLifeTotals", startingLifeTotals);

                intent.putExtras(bundle);

                // change setIntent activity based on number of players
                switch (numOfPlayers){
                    case 2:
                        intent.setClass(LifeCounterSetup.this, LifeCounter_2Players.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.setClass(LifeCounterSetup.this, LifeCounter_3Players.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setClass(LifeCounterSetup.this, LifeCounter_4Players.class);
                        startActivity(intent);
                        break;
                }


            }
        });
    }
}