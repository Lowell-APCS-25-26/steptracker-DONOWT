package org.APCSLowell;

public class StepTracker {
    private int steps; 
    private int min; 
    private int active; 
    private int days;
    public StepTracker(int activityThreshold) {
        min = activityThreshold;
        steps = 0;
        active = 0;
        days = 0;
    }
    public void addDailySteps(int stepCount) {
        if (stepCount >= min) {active++;}
        steps = steps + stepCount;
        days++;
    }
    public int activeDays() {
        return active;
    }
    public double averageSteps() {
        if (days != 0) {return (double)steps/(double)days;}
        return 0;
    }
}
