package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "myApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap defaultImage = BitmapFactory.decodeResource(getResources(), R.drawable.default_image);

        List<ListItem> list = new ArrayList<ListItem>();

        String[] buttonNames = {"Dice Rolling", "Coin Flipping", "Turn Picker", "Life Counter", "Timer", "Tournament Mode"};

        int[] images = {R.drawable.dice_img, R.drawable.coin_flip_img, R.drawable.turn_picker_img, R.drawable.life_counter_img, R.drawable.timer_img, R.drawable.bracket_img};

        for(int i = 0; i < 6; i++){
            ListItem item = new ListItem();
            item.image = BitmapFactory.decodeResource(getResources(), images[i]);;
            item.name = buttonNames[i];
            list.add(item);
        }

        GridItemAdapter adapter = new GridItemAdapter(this, 0, list);

        GridView gridView = (GridView)findViewById(R.id.gridViewId);
        gridView.setAdapter(adapter);

    }
}