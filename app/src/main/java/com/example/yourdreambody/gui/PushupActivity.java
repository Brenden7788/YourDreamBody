package com.example.yourdreambody.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.yourdreambody.R;

public class PushupActivity extends Activity implements SensorEventListener {

    private Intent intent;
    private Intent intent2;
    private Button next;
    private Button stop;
    private TextView pushup;
    private Integer pushupfromworkout;
    private Integer pushupfromworkout1;

    private Integer squat;
    private Integer jump;
    private Integer situp;
    private Integer buerpee;
    private Integer plank;
    private Integer mountain;
    private Integer crunches;
    private Integer skipping;

    private double currentVal;
    private double minVal = 5;
    private double maxVal = 8;

    private SensorManager sensorManager;
    private Sensor proximity;

    private boolean check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);


        intent = new Intent(this, WorkoutActivity.class);

        intent2 = new Intent(this, ExcerciseActivity.class);

        next = findViewById(R.id.nextButton1);
        stop = findViewById(R.id.stopButton1);
        pushup = findViewById(R.id.excercisepush);

        pushupfromworkout = getIntent().getIntExtra("pushup", 0);
        squat = getIntent().getIntExtra("squat", 0);
        jump = getIntent().getIntExtra("jumping", 0);
        situp = getIntent().getIntExtra("situp", 0);
        buerpee = getIntent().getIntExtra("buerpee", 0);
        plank = getIntent().getIntExtra("plank", 0);
        mountain = getIntent().getIntExtra("mountain", 0);
        crunches = getIntent().getIntExtra("crunches", 0);
        skipping = getIntent().getIntExtra("skipping", 0);
        pushupfromworkout1 = -1;


        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        proximity = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sensorManager.registerListener(this, proximity, SensorManager.SENSOR_DELAY_NORMAL);

        pushup.setText("Liegenstütze:" + pushupfromworkout1 + "von " + pushupfromworkout);

        next.setOnClickListener(v -> {
            if (squat != 0 || jump != 0 || situp != 0 || buerpee != 0 || plank != 0 || mountain != 0 || crunches != 0 || skipping != 0) {
                intent2.putExtra("squat", squat);
                intent2.putExtra("jumping", jump);
                intent2.putExtra("situp", situp);
                intent2.putExtra("buerpee", buerpee);
                intent2.putExtra("plank", plank);
                intent2.putExtra("mountain", mountain);
                intent2.putExtra("crunches", crunches);
                intent2.putExtra("skipping", skipping);
                startActivity(intent2);
            } else {
                startActivity(intent);
            }

        });

        stop.setOnClickListener(v -> {
            startActivity(intent);
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        currentVal = Math.round(event.values[0] * 100) / 100.0;
        if (currentVal <= minVal && check == true) {
            check = false;
        }
        if (currentVal >= maxVal && check == false) {
            pushupfromworkout1++;
            check = true;
        }
        pushup.setText("Liegenstütze:" + pushupfromworkout1 + "von " + pushupfromworkout);
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}