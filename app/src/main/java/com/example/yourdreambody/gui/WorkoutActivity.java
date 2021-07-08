package com.example.yourdreambody.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yourdreambody.R;
import com.example.yourdreambody.model.Workout;

public class WorkoutActivity extends Activity {
    Intent intent;
    Intent intent1;
    Button startButton;
    Button newButton;
    ListView workoutList;
    Workout workout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_activity);

        startButton = findViewById(R.id.startButton1);
        intent = new Intent(this, WorkoutTypesActivity.class);

        newButton = findViewById(R.id.newButton);
        intent1 = new Intent(this, ExcerciseActivity.class);

        startButton.setOnClickListener(v -> {
            startActivity(intent1);
        });

        newButton.setOnClickListener(v -> {
            startActivity(intent);
        });

    }
}
