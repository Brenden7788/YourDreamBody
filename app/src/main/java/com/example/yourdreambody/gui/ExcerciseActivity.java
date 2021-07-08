package com.example.yourdreambody.gui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.yourdreambody.R;

public class ExcerciseActivity extends Activity {

    Intent intent;
    Button next;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise);

        intent = new Intent(this, WorkoutActivity.class);
        next = findViewById(R.id.nextButton);
        stop = findViewById(R.id.stopButton);

        next.setOnClickListener(v -> {
            startActivity(intent);
        });

        stop.setOnClickListener(v -> {
            startActivity(intent);
        });


    }
}