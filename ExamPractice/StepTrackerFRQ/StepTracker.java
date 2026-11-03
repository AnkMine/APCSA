public class StepTracker {

    private int minStepsThreshold;
    private int totalSteps;
    private int totalDays;
    private int activeDaysCount;

    public StepTracker(int minSteps) {
        this.minStepsThreshold = minSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDaysCount = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minStepsThreshold) {
            activeDaysCount++;
        }
    }

    public int activeDays() {
        return activeDaysCount;
    }

    public double averageSteps() {
        if(totalDays == 0) {
            return 0.0;
        }

        return (double) totalSteps / totalDays;

    }
}