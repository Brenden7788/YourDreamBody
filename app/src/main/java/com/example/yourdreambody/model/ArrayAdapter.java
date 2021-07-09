package com.example.yourdreambody.model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yourdreambody.R;

public class ArrayAdapter extends android.widget.ArrayAdapter<Workout> {

    private static final String Tag = "WorkoutListAdapter";
    private Context mContext;
    private int mResource;

    public ArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Workout> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        int pushup = getItem(position).getPushup();
        int squats = getItem(position).getSquats();
        int jumpingjack = getItem(position).getJumpingjack();
        int situp = getItem(position).getSitup();
        int burpees = getItem(position).getBurpees();
        int plank = getItem(position).getPlank();
        int mountainclimber = getItem(position).getMountainclimber();
        int crunches = getItem(position).getCrunches();
        int skipping = getItem(position).getSkipping();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.workoutListViewText);

        tvName.setText(name);

        return convertView;
    }
}
