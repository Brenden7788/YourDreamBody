package com.example.yourdreambody.gui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yourdreambody.R;
import com.example.yourdreambody.model.Workout;

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
    Integer pushCounter1 = 0;
    Integer squatCounter1 = 0;
    Integer jumpingCounter1 = 0;
    Integer sittupCounter1 = 0;
    Integer buerpeeCounter1 = 0;
    Integer plankCounter1 = 0;
    Integer mountainCounter1 = 0;
    Integer crunchesCounter1 = 0;
    Integer skippingCounter1 = 0;
    EditText etName;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_types);

        submit = findViewById(R.id.submitButton);
        intent = new Intent(this, WorkoutActivity.class);


        //Buttons
        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.plus2);
        plus3 = findViewById(R.id.plus3);
        plus4 = findViewById(R.id.plus4);
        plus5 = findViewById(R.id.plus5);
        plus6 = findViewById(R.id.plus6);
        plus7 = findViewById(R.id.plus7);
        plus8 = findViewById(R.id.plus8);
        plus9 = findViewById(R.id.plus9);

        minus1 = findViewById(R.id.minus1);
        minus2 = findViewById(R.id.minus2);
        minus3 = findViewById(R.id.minus3);
        minus4 = findViewById(R.id.minus4);
        minus5 = findViewById(R.id.minus5);
        minus6 = findViewById(R.id.minus6);
        minus7 = findViewById(R.id.minus7);
        minus8 = findViewById(R.id.minus8);
        minus9 = findViewById(R.id.minus9);

        //Labels
        pushCounter = findViewById(R.id.pushCount);
        squatCounter = findViewById(R.id.squatCounter);
        jumpingCounter = findViewById(R.id.jumpCounterCounter);
        sittupCounter = findViewById(R.id.situpCounter);
        buerpeeCounter = findViewById(R.id.burpeesCounter);
        plankCounter = findViewById(R.id.plankCounter);
        mountainCounter = findViewById(R.id.mountainCounter);
        crunchesCounter = findViewById(R.id.crunchesCounter);
        skippingCounter = findViewById(R.id.skippingCounter);

        etName = findViewById(R.id.editTextTextWorkoutName);
        name = etName.getText().toString();

        //intent
        submit.setOnClickListener(v -> {
            name = etName.getText().toString();

            intent.putExtra("name", name);
            intent.putExtra("pushup", pushCounter1);
            intent.putExtra("squat", squatCounter1);
            intent.putExtra("jumping", jumpingCounter1);
            intent.putExtra("situp", sittupCounter1);
            intent.putExtra("buerpee", buerpeeCounter1);
            intent.putExtra("plank", plankCounter1);
            intent.putExtra("mountain", mountainCounter1);
            intent.putExtra("crunches", crunchesCounter1);
            intent.putExtra("skipping", skippingCounter1);

            startActivity(intent);

          /*  WorkoutActivity.addWorkout(new Workout(name, pushCounter1, squatCounter1,jumpingCounter1,sittupCounter1,buerpeeCounter1,plankCounter1, mountainCounter1, crunchesCounter1, skippingCounter1));
            finish();*/
        });

        //pushups
        plus1.setOnClickListener(v -> {
            pushCounter1++;
            refresh();
        });

        minus1.setOnClickListener(v -> {
            pushCounter1--;
            refresh();
        });

        //squats
        plus2.setOnClickListener(v -> {
            squatCounter1++;
            refresh();
        });

        minus2.setOnClickListener(v -> {
            squatCounter1--;
            refresh();
        });
        //hampelmann
        plus3.setOnClickListener(v -> {
            jumpingCounter1++;
            refresh();
        });

        minus3.setOnClickListener(v -> {
            jumpingCounter1--;
            refresh();
        });

        //situp
        plus4.setOnClickListener(v -> {
            sittupCounter1++;
            refresh();
        });

        minus4.setOnClickListener(v -> {
            sittupCounter1--;
            refresh();
        });

        //buerpee
        plus5.setOnClickListener(v -> {
            buerpeeCounter1++;
            refresh();
        });

        minus5.setOnClickListener(v -> {
            buerpeeCounter1--;
            refresh();
        });

        //plank
        plus6.setOnClickListener(v -> {
            plankCounter1++;
            refresh();
        });

        minus6.setOnClickListener(v -> {
            plankCounter1--;
            refresh();
        });

        //mountainClimber
        plus7.setOnClickListener(v -> {
            mountainCounter1++;
            refresh();
        });

        minus7.setOnClickListener(v -> {
            mountainCounter1--;
            refresh();
        });

        //crunches
        plus8.setOnClickListener(v -> {
            crunchesCounter1++;
            refresh();
        });

        minus8.setOnClickListener(v -> {
            crunchesCounter1--;
            refresh();
        });

        //seilspringen
        plus9.setOnClickListener(v -> {
            skippingCounter1++;
            refresh();
        });

        minus9.setOnClickListener(v -> {
            skippingCounter1--;
            refresh();
        });


    }


    //refresh labels
    public void refresh() {
        pushCounter.setText(pushCounter1.toString());
        squatCounter.setText(squatCounter1.toString());
        jumpingCounter.setText(jumpingCounter1.toString());
        sittupCounter.setText(sittupCounter1.toString());
        buerpeeCounter.setText(buerpeeCounter1.toString());
        plankCounter.setText(plankCounter1.toString());
        mountainCounter.setText(mountainCounter1.toString());
        crunchesCounter.setText(crunchesCounter1.toString());
        skippingCounter.setText(skippingCounter1.toString());
    }
}