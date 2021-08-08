package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "myApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ListItem> list = new ArrayList<ListItem>();

        String[] buttonNames = {"Dice Rolling a joint", "Coin Flipping", "Turn Picker", "Life Counter", "Timer", "Tournament Mode"};

        int[] images = {R.drawable.dice_img, R.drawable.coin_flip_img, R.drawable.turn_picker_img, R.drawable.life_counter_img, R.drawable.timer_img, R.drawable.bracket_img};

        for(int i = 0; i < buttonNames.length; i++){
            ListItem item = new ListItem();
            item.image = BitmapFactory.decodeResource(getResources(), images[i]);;
            item.name = buttonNames[i];
            list.add(item);
        }

        GridItemAdapter adapter = new GridItemAdapter(this, 0, list);

        GridView gridView = (GridView)findViewById(R.id.gridViewId);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.v("Test", "view: " + view);
                Log.v("Test", "ID: " + l);
                Log.v("Test", "Feature Name " + buttonNames[position]);
                String name = buttonNames[position];

                Intent intent;

                switch (name){
                    case "Dice Rolling":
                        intent = new Intent(MainActivity.this, DiceRollingSetup.class);
                        startActivity(intent);
                        break;

                    case "Coin Flipping":

                        break;

                    case "Turn Picker":

                        break;

                    case "Life Counter":
                        intent = new Intent(MainActivity.this, LifeCounterSetup.class);
                        startActivity(intent);
                        break;

                    case "Timer":

                        break;
                }
            }
        });

    }
}