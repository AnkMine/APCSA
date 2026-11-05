public class StepTracker {

    // instance variables
    private int minStepsThreshold;
    private int totalSteps;
    private int totalDays;
    private int activeDaysCount;

    // initialization constructor, sets the min steps and zeroes the totals
    public StepTracker(int minSteps) {
        this.minStepsThreshold = minSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDaysCount = 0;
    }

    // adds todays steps to the total and counts the day as active if steps hit the threshold
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minStepsThreshold) {
            activeDaysCount++;
        }
    }

    // returns the number of active days
    public int activeDays() {
        return activeDaysCount;
    }

    // calculates the average steps per day using totalSteps and totalDays
    public double averageSteps() {
        // avoids dividing by zero when no days recorded
        if(totalDays == 0) {
            return 0.0;
        }

        return (double) totalSteps / totalDays;

    }
}