package com.example.yourdreambody.gui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yourdreambody.R;
import com.example.yourdreambody.model.ArrayAdapter;
import com.example.yourdreambody.model.Workout;

import java.util.ArrayList;


public class WorkoutActivity extends Activity {
    private Intent intent;
    private Intent intent1;
    private Intent intent2;
    private Button startButton;
    private Button newButton;
    private ListView lvWorkoutList;
    private Workout workout;
    static ArrayList<Workout> workoutList = new ArrayList<>();


    String name;
    int push;
    int squat;
    int jumping;
    int situp;
    int burpee;
    int plank;
    int mountain;
    int crunches;
    int skipping;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_activity);

        startButton = findViewById(R.id.startButton1);
        intent = new Intent(this, WorkoutTypesActivity.class);

        newButton = findViewById(R.id.newButton);
        intent1 = new Intent(this, ExcerciseActivity.class);

        intent2 = new Intent(this, PushupActivity.class);

        lvWorkoutList = findViewById(R.id.workoutlist);


        if (workout == null) {

            workout = new Workout("", 0, 0, 0, 0, 0, 0, 0, 0, 0);
            workoutList.add(workout);

        }
        if (workout != null) {
            name = getIntent().getStringExtra("name");
            push = getIntent().getIntExtra("pushup", 0);
            squat = getIntent().getIntExtra("squat", 0);
            jumping = getIntent().getIntExtra("jumping", 0);
            situp = getIntent().getIntExtra("situp", 0);
            burpee = getIntent().getIntExtra("buerpee", 0);
            plank = getIntent().getIntExtra("plank", 0);
            mountain = getIntent().getIntExtra("mountain", 0);
            crunches = getIntent().getIntExtra("crunches", 0);
            skipping = getIntent().getIntExtra("skipping", 0);

            workout = new Workout(name, push, squat, jumping, situp, burpee, plank, mountain, crunches, skipping);
            workoutList.add(workout);

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.adapter_view_layout, workoutList);
            lvWorkoutList.setAdapter(arrayAdapter);
        }

        lvWorkoutList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Workout workout = (Workout) parent.getItemAtPosition(position);
                if (workout.getPushup() != 0) {
                    push = workout.getPushup();
                    intent2.putExtra("pushup", push);
                    intent2.putExtra("squat", workout.getSquats());
                    intent2.putExtra("jumping", workout.getJumpingjack());
                    intent2.putExtra("situp", workout.getSitup());
                    intent2.putExtra("buerpee", workout.getBurpees());
                    intent2.putExtra("plank", workout.getPlank());
                    intent2.putExtra("mountain", workout.getMountainclimber());
                    intent2.putExtra("crunches", workout.getCrunches());
                    intent2.putExtra("skipping", workout.getSkipping());
                    startActivity(intent2);
                } else {
                    intent1.putExtra("squat", workout.getSquats());
                    intent1.putExtra("jumping", workout.getJumpingjack());
                    intent1.putExtra("situp", workout.getSitup());
                    intent1.putExtra("buerpee", workout.getBurpees());
                    intent1.putExtra("plank", workout.getPlank());
                    intent1.putExtra("mountain", workout.getMountainclimber());
                    intent1.putExtra("crunches", workout.getCrunches());
                    intent1.putExtra("skipping", workout.getSkipping());
                    startActivity(intent1);
                }
            }
        });


        newButton.setOnClickListener(v -> {
            startActivityForResult(intent, 1234);
        });


    }


}
