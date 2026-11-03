public class Runner {

    public static void main(String[] args) {
        // Test StepTracker

        StepTracker tr = new StepTracker(10000);
        System.out.println("A day with at least 10,000 steps is Active");
        System.out.println("Number of Active Days are: " + tr.activeDays());
        System.out.println("Average Steps are: " + tr.averageSteps());

        System.out.println("\naddDailySteps(9000) and addDailySteps(5000)");
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println("Number of Active Days are: " + tr.activeDays());
        System.out.println("Average Steps are: " + tr.averageSteps());

        System.out.println("\naddDailySteps(13000)");
        tr.addDailySteps(13000);
        System.out.println("Number of Active Days are: " + tr.activeDays());
        System.out.println("Average Steps are: " + tr.averageSteps());

        System.out.println("\naddDailySteps(23000)and addDailySteps(1111)");
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println("Number of Active Days are: " + tr.activeDays());
        System.out.println("Average Steps are: " + tr.averageSteps());
    }
}