package com.example.yourdreambody.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.yourdreambody.R;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, WorkoutActivity.class);

        startButton =findViewById(R.id.button);

        startButton.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}