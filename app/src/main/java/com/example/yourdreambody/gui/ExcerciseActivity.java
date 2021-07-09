package com.example.yourdreambody.gui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.yourdreambody.R;

public class ExcerciseActivity extends Activity {

    private Intent intent;
    private Button next;
    private Button stop;
    private TextView textView;

    private Integer squat;
    private Integer jump;
    private Integer situp;
    private Integer buerpee;
    private Integer plank;
    private Integer mountain;
    private Integer crunches;
    private Integer skipping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        intent = new Intent(this, WorkoutActivity.class);
        next = findViewById(R.id.nextButton);
        stop = findViewById(R.id.stopButton);
        textView = findViewById(R.id.excercisepush);

        squat = getIntent().getIntExtra("squat", 0);
        jump = getIntent().getIntExtra("jumping", 0);
        situp = getIntent().getIntExtra("situp", 0);
        buerpee = getIntent().getIntExtra("buerpee", 0);
        plank = getIntent().getIntExtra("plank", 0);
        mountain = getIntent().getIntExtra("mountain", 0);
        crunches = getIntent().getIntExtra("crunches", 0);
        skipping = getIntent().getIntExtra("skipping", 0);

        if (squat != 0) {
            textView.setText("Squats:" + squat);
        } else if (jump != 0 || squat == 0) {
            textView.setText("Hampelmann:" + jump);
        } else if (situp != 0 || jump == 0) {
            textView.setText("Situp:" + situp);
        } else if (buerpee != 0 || situp == 0) {
            textView.setText("Burpee:" + buerpee);
        } else if (plank != 0 || buerpee == 0) {
            textView.setText("Plank:" + plank + "min");
        } else if (mountain != 0 || plank == 0) {
            textView.setText("Mountainclimber:" + mountain);
        } else if (crunches != 0 || mountain == 0) {
            textView.setText("Crunches:" + crunches);
        } else if (skipping != 0 || crunches == 0) {
            textView.setText("Seilspringen:" + skipping);
        }


        next.setOnClickListener(v -> {
            if (textView.getText().equals("Squats:" + squat)) {
                textView.setText("Hampelmann:" + jump);
            } else if (textView.getText().equals("Hampelmann:" + jump)) {
                textView.setText("Situp:" + situp);
            } else if (textView.getText().equals("Situp:" + situp)) {
                textView.setText("Burpee:" + buerpee);
            } else if (textView.getText().equals("Burpee:" + buerpee)) {
                textView.setText("Plank:" + plank + "min");
            } else if (textView.getText().equals("Plank:" + plank + "min")) {
                textView.setText("Mountainclimber:" + mountain);
            } else if (textView.getText().equals("Mountainclimber:" + mountain)) {
                textView.setText("Crunches:" + crunches);
            } else if (textView.getText().equals("Crunches:" + crunches)) {
                textView.setText("Seilspringen:" + skipping);
            } else {
                startActivity(intent);
            }
        });

        stop.setOnClickListener(v -> {
            startActivity(intent);
        });


    }
}