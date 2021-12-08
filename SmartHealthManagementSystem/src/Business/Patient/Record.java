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
    private float respiratoryRate;
    private int moveTime;
    private int excerciseTime;
    private int totalTime;
    private float heartRate;
    private float systolicBloodPressure;
    private float weightInPounds;
    private Date date;
    private String normalOrNot;
    private int standTime;

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(int moveTime) {
        this.moveTime = moveTime;
    }

    public int getExcerciseTime() {
        return excerciseTime;
    }

    public void setExcerciseTime(int excerciseTime) {
        this.excerciseTime = excerciseTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNormalOrNot() {
        return normalOrNot;
    }

    public void setNormalOrNot(String normalOrNot) {
        this.normalOrNot = normalOrNot;
    }

    public int getStandTime() {
        return standTime;
    }

    public void setStandTime(int standTime) {
        this.standTime = standTime;
    }

    public String getNeedMoreExcerciseOrNot() {
        return needMoreExcerciseOrNot;
    }

    public void setNeedMoreExcerciseOrNot(String needMoreExcerciseOrNot) {
        this.needMoreExcerciseOrNot = needMoreExcerciseOrNot;
    }
    private String needMoreExcerciseOrNot;
}
