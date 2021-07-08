package com.example.yourdreambody.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.yourdreambody.R;

public class PushupActivity extends Activity {

    Intent intent;
    Button next;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);


        intent = new Intent(this, WorkoutActivity.class);
        next = findViewById(R.id.nextButton1);
        stop = findViewById(R.id.stopButton1);

        next.setOnClickListener(v -> {
            startActivity(intent);
        });

        stop.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}