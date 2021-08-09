package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class DiceRollingSetup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_rolling_setup);

        Spinner diceSpinner = (Spinner) findViewById(R.id.DiceSideSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.DiceSides, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        diceSpinner.setAdapter(adapter);

        RadioGroup diceGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Button backButton = (Button) findViewById(R.id.BackButtonDiceRolling);
        Button rollButton = (Button) findViewById(R.id.GoToRoll);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiceRollingSetup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton selectedButton = (RadioButton) findViewById(diceGroup.getCheckedRadioButtonId());
                int numberOfSides = Integer.parseInt(diceSpinner.getSelectedItem().toString());
                int numberofDice = Integer.parseInt(selectedButton.getText().toString().substring(0,1));

                Intent intent = new Intent(DiceRollingSetup.this, DiceRolling.class);
                Bundle bundle = new Bundle();
                bundle.putInt("numberOfSides", numberOfSides);
                bundle.putInt("numberOfDice", numberofDice);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        System.out.println("REEEEEEEEEEEEEEEEEEEEEEE");
    }
}