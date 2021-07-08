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

public class WorkoutActivity extends Activity {
    Intent intent;
    Button startButton;
    Button newButton;
    ListView workoutList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_activity);
        startButton = findViewById(R.id.startButton1);
        intent = new Intent(this, WorkoutTypesActivity.class);

        startButton.setOnClickListener(v -> {
            startActivity(intent);
        });

    }
}
