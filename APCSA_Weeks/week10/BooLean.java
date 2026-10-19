// import scanner class
import java.util.Scanner;

// this class runs a random number points game in terminal

public class BooLean {

    // static vars so calcPrintPoints(); can see and update them across rounds
    static int userPoints = 20;

    // contains all the point messages, index matches the points earned or lost
    static String[] pointsWon = {"you lost 1 point", "you win 1 point", "you win 2 points", "you win 3 points", "you win 10 points"};

    // main method
    public static void main(String[] args) {

        // create new instance of scanner class
        Scanner sc = new Scanner(System.in);

        // roll vars
        int num1;
        int num2;

        // game loop, runs until user says no to playing again
        do {

            // generates two random numbers between 1-10; *10 gives 0-9 so +1 shifts it up
            num1 = (int)(Math.random()*10+1);
            num2 = (int)(Math.random()*10+1);

            // prints the roll for the user to see
            System.out.println("\n" + num1 + " and " + num2);

            // below if, else if statements check the roll from highest payout to lowest so 5,5 pays 10 and not 3
            if (num1 == 5 && num2 == 5) {

                calcPrintPoints(4, 10);

            } else if (num1 == num2) {

                calcPrintPoints(3, 3);
            } else if (num1 % 2 == 0 || num2 % 2 == 0) {

                calcPrintPoints(2, 1);

            } else if (num1 > 3 || num2 > 3) {

                calcPrintPoints(1, 1);
            } else {

                calcPrintPoints(0, -1);
            }

            // asking user for input
            System.out.println("Would you like to keep playing (y/n)?");

            // settings decision to the user's input
            String userDecision = sc.next();

            // if user wants to play again loop continues, else break out of loop and program ends
            if (userDecision.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }



        } while (true);
    }

    // this method takes in the index of the message to print and the points to add or subtract, updates userPoints and prints both
    public static void calcPrintPoints(int index, int addPoints) {

        // addPoints is negative only for the lose case, so subtracting it takes points away
        if (addPoints < 0) {
            userPoints -= addPoints;
        } else {
            userPoints += addPoints;
        }

        System.out.println("\n" + pointsWon[index] + "\n\nYour current point value is " + userPoints);
    }
}
