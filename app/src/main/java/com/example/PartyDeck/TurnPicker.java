package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TurnPicker extends AppCompatActivity {

    private Button submit;
    private Button pick;
    private Button clear;
    private TextView outputText;
    private TextInputLayout names;
    private TextView namePicked;
    ArrayList<String> nameList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_picker);
        submit = (Button) findViewById(R.id.button);
        pick = (Button) findViewById(R.id.button3);
        clear = (Button) findViewById(R.id.button2);
        outputText = (TextView) findViewById((R.id.textView6));
        names = (TextInputLayout) findViewById(R.id.textInputLayout);
        namePicked = (TextView) findViewById(R.id.textView7);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = names.getEditText().getText().toString();
                nameList.add(text);
                String namesTogether = "";
                for (int i = 0; i < nameList.size(); i++) {
                    namesTogether = namesTogether + nameList.get(i) + " ";
                }
                outputText.setText(namesTogether);
            }
        });

        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int upper = nameList.size();
                int choice = rand.nextInt(upper);
                String nameChosen = nameList.get(choice);
                nameList.remove(choice);
                String namesTogether = "";
                for (int i = 0; i < nameList.size(); i++) {
                    namesTogether = namesTogether + nameList.get(i) + "   ";
                }
                outputText.setText(namesTogether);
                namePicked.setText(nameChosen);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameList.clear();
                String cleared = " ";
                outputText.setText(cleared);
                namePicked.setText(cleared);
            }
        });
    }
}