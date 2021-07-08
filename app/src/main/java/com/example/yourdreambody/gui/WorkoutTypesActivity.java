package com.example.yourdreambody.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.yourdreambody.R;

public class WorkoutTypesActivity extends Activity {
    Button submit;
    Intent intent;
    Button plus1;
    Button plus2;
    Button plus3;
    Button plus4;
    Button plus5;
    Button plus6;
    Button plus7;
    Button plus8;
    Button plus9;
    Button minus1;
    Button minus2;
    Button minus3;
    Button minus4;
    Button minus5;
    Button minus6;
    Button minus7;
    Button minus8;
    Button minus9;
    TextView pushCounter;
    TextView squatCounter;
    TextView jumpingCounter;
    TextView sittupCounter;
    TextView buerpeeCounter;
    TextView plankCounter;
    TextView mountainCounter;
    TextView crunchesCounter;
    TextView skippingCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_types);

        submit = findViewById(R.id.submitButton);
        intent = new Intent(this, WorkoutActivity.class);

        pushCounter = findViewById(R.id.pushCounter);
        squatCounter = findViewById(R.id.squatCounter);
        jumpingCounter = findViewById(R.id.jumpCounterCounter);
        sittupCounter = findViewById(R.id.situpCounter);
        buerpeeCounter = findViewById(R.id.burpeesCounter);
        plankCounter = findViewById(R.id.plankCounter);
        mountainCounter = findViewById(R.id.mountainCounter);
        crunchesCounter = findViewById(R.id.crunchesCounter);
        skippingCounter = findViewById(R.id.skippingCounter);

        submit.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}