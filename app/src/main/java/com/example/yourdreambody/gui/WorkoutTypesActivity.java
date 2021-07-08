package com.example.yourdreambody.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.yourdreambody.R;

public class WorkoutTypesActivity extends Activity {
    Button submit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_types);

        submit = findViewById(R.id.submitButton);
        intent = new Intent(this, WorkoutActivity.class);

        submit.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}