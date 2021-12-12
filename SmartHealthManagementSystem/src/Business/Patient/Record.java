/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class Record {
    private float breatheRate;
    private int movementClock;
    private int workoutTime;
    private int totTime;
    private float heartrate;
    private float systalicBP;
    private float weight;
    private Date date;
    private String isNormal;
    private int standTime;

    public float getbreatheRate() {
        return breatheRate;
    }

    public void setbreatheRate(float breatheRate) {
        this.breatheRate = breatheRate;
    }

    public int getmovementClock() {
        return movementClock;
    }

    public void setmovementClock(int movementClock) {
        this.movementClock = movementClock;
    }

    public int getworkoutTime() {
        return workoutTime;
    }

    public void setworkoutTime(int workoutTime) {
        this.workoutTime = workoutTime;
    }

    public int gettotTime() {
        return totTime;
    }

    public void settotTime(int totTime) {
        this.totTime = totTime;
    }

    public float getheartrate() {
        return heartrate;
    }

    public void setheartrate(float heartrate) {
        this.heartrate = heartrate;
    }

    public float getsystalicBP() {
        return systalicBP;
    }

    public void setsystalicBP(float systalicBP) {
        this.systalicBP = systalicBP;
    }

    public float getweight() {
        return weight;
    }

    public void setweight(float weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getisNormal() {
        return isNormal;
    }

    public void setisNormal(String isNormal) {
        this.isNormal = isNormal;
    }

    public int getStandTime() {
        return standTime;
    }

    public void setStandTime(int standTime) {
        this.standTime = standTime;
    }

    public String getneedsToWorkout() {
        return needsToWorkout;
    }

    public void setneedsToWorkout(String needsToWorkout) {
        this.needsToWorkout = needsToWorkout;
    }
    private String needsToWorkout;
}
