package com.example.yourdreambody.model;

public class Workout {
    int pushup;
    int squats;
    int jumpingjack;
    int situp;
    int burpees;
    int plank;
    int mountainclimber;
    int crunches;
    int skipping;

    public Workout() {
    }

    public Workout(int pushup, int squats, int jumpingjack, int situp, int burpees, int plank, int mountainclimber, int crunches, int skipping) {
        this.pushup = pushup;
        this.squats = squats;
        this.jumpingjack = jumpingjack;
        this.situp = situp;
        this.burpees = burpees;
        this.plank = plank;
        this.mountainclimber = mountainclimber;
        this.crunches = crunches;
        this.skipping = skipping;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSquats() {
        return squats;
    }

    public void setSquats(int squats) {
        this.squats = squats;
    }

    public int getJumpingjack() {
        return jumpingjack;
    }

    public void setJumpingjack(int jumpingjack) {
        this.jumpingjack = jumpingjack;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getBurpees() {
        return burpees;
    }

    public void setBurpees(int burpees) {
        this.burpees = burpees;
    }

    public int getPlank() {
        return plank;
    }

    public void setPlank(int plank) {
        this.plank = plank;
    }

    public int getMountainclimber() {
        return mountainclimber;
    }

    public void setMountainclimber(int mountainclimber) {
        this.mountainclimber = mountainclimber;
    }

    public int getCrunches() {
        return crunches;
    }

    public void setCrunches(int crunches) {
        this.crunches = crunches;
    }

    public int getSkipping() {
        return skipping;
    }

    public void setSkipping(int skipping) {
        this.skipping = skipping;
    }
}
