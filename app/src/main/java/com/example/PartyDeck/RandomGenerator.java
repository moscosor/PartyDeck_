package com.example.PartyDeck;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

public class RandomGenerator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] names = {
                "Leylah",
                "Banyan",
                "Collins",
                "Everhett",
                "Crosby",
                "Alison",
                "Markus",
                "Sunnie",
                "Herschel",
                "Terron",
                "Marjorie",
                "Temperance",
                "Daniela",
                "Allison",
                "Calia",
                "Ruby",
                "Daphne",
                "Makenna",
                "Elvia",
                "Wayne",
                "Jayden",
                "Akeelah",
                "Aubrie",
                "Stefania",
                "Amarii",
                "Damani",
                "Imani",
                "Bakari",
                "Branch",
                "Raghav",
                "Lorelei",
                "Kaavya",
                "Chanse",
                "Jermani",
                "Magdalen",
                "Eduardo",
                "Wayde",
                "Ivory",
                "Addelyn",
                "Dontay",
                "Krystina",
                "Evey",
                "Avalynn",
                "Azriel",
                "Eleen",
                "Jeremih",
                "Samir",
                "Averee",
                "Sia",
                "Mustafa",
                "Kim",
                "Carol",
                "Helena",
                "Zahir",
                "Jaina",
                "German",
                "Christian",
                "Priya",
                "Lakin",
                "Naveed",
                "Gertrude",
                "Rina",
                "Ervin",
                "Riggs",
                "Khai",
                "Jordan",
                "Henryk",
                "Jedediah",
                "Aram",
                "Aerilyn",
                "Jacey",
                "Winifred",
                "Aylin",
                "Achilles",
                "Noland",
                "Angeles",
                "Bryleigh",
                "Jacob",
                "Pranavi",
                "Gus",
                "Kamori",
                "Aaric",
                "Halo",
                "Christabel",
                "Yareli",
                "Aries",
                "Kei",
                "Bransyn",
                "Jayliana",
                "Khristopher",
                "Aminah",
                "Odin",
                "Harley",
                "Braden",
                "Annabella",
                "Presten",
                "Jolee",
                "Makinlee",
                "Aurie",
                "Julio",
                "Inna",
                "Onyx",
                "Haidyn",
                "Leina",
                "Kynley",
                "Lailani",
                "Kingsley",
                "Adeleine",
                "Richie",
                "Slate",
                "Blakely"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_generator);

        EditText rangeMin = (EditText) findViewById(R.id.randomNumberMin);
        EditText rangeMax = (EditText) findViewById(R.id.randomNumberMax);

        TextView randomNumText = (TextView) findViewById(R.id.randomNum);
        TextView randomNameText = (TextView) findViewById(R.id.randomName);

        Button generateRandomNum = (Button) findViewById(R.id.generateRandomNumber);
        Button generateRandomName = (Button) findViewById(R.id.generateRandomName);

        generateRandomNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(rangeMin.getText().toString());
                int max = Integer.parseInt(rangeMax.getText().toString());

                int randNum = DiceRolling.getRandomInteger(max, min);

                randomNumText.setText(Integer.toString(randNum));
            }
        });

        generateRandomName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nameIdx = DiceRolling.getRandomInteger(names.length, 0);
                String name = names[nameIdx];
                randomNameText.setText(name);
            }
        });
    }
}