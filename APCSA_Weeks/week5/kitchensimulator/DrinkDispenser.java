public class DrinkDispenser {

    
    // this method randomly generates a double that is the level of syrup and prints a message depending on that number
    public void checkSyrup() {
        double level = Math.random() * 100;

        double percent = Math.round(level * 100) / 100.0;

        if (level >= 30) {
            System.out.println("The syrup levels are good and are at " + percent + "%.");
        } else {
            System.out.println("The syrup levels are at a critical low level and are at " + percent + "%.");
        }

    }

    // this method randomly generates an integer between 0 and 50 inclusive and prints a message depending on that interger
    public void checkIce() {

        int weight = (int) (Math.random() * 51);

        if (weight >= 15) {
            System.out.println("The ice bin is full and is " + weight + "pounds");
        } else {
            System.out.println("The ice bin low and is " + weight + "pounds");
        }

    }

    // this method randomly generates an integer between 1 and 10 inclusive
    public void numDrinks() {

        int drinks = (int) (Math.random() * 10) + 1;

        if (drinks >= 4) {
            System.out.println("There are " + drinks + " and the customer will need a drink carrier.");
        } else {
            System.out.println("There are " + drinks + ".");
        }
    }


}