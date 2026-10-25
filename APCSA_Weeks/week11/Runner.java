// import scanner class
import java.util.Scanner;

// this class runs a math simulator in terminal
public class Runner {

    // main method
    public static void main(String[] args) {
        // creates MathTest object and scanner
        MathTest math = new MathTest();
        Scanner sc = new Scanner(System.in);

        // gets numerator and non-zero denominator from user
        int userNumerator = getValidInteger(sc, "Enter an integer numerator: ");
        int userDenominator = getValidNonZeroInteger(sc, "Enter an non-zero integer denominator: ");

        // calls divide(); method using the user inputs
        math.divide(userNumerator, userDenominator);
        // extra print line to make terminal clearer for user
        System.out.println();
        
        // gets the x and y coordinates of two points from user
        int userX1 = getValidInteger(sc, "Enter an integer x1: ");
        int userY1 = getValidInteger(sc, "Enter an integer y1: ");
        int userX2 = getValidInteger(sc, "Enter an integer x2: ");
        int userY2 = getValidInteger(sc, "Enter an integer y2: ");


        // calls slope(); method using the two points
        math.slope(userX1, userY1, userX2, userY2);

        // closes scanner
        sc.close();

    }

    // this method takes in a Scanner and a prompt and ensures the user enters a valid integer
    private static int getValidInteger(Scanner sc, String prompt) {
        // stores user input and validity flag
        int userInput = 0;
        boolean isValid = false;

        // loops until a valid integer is entered
        while(!isValid) { 
            // prints the prompt
            System.out.println(prompt);

            // checks if input is an int, grabs it, and clears input buffer
            if(sc.hasNextInt()) { 
                userInput = sc.nextInt();
                sc.nextLine();
                isValid = true; // exits loop on next check
            } else {
                // clears invalid input
                sc.nextLine();
            }

            // prints error if input was not a valid integer
            if (!isValid) {
                System.out.println("Error. Please enter a valid integer");
            }

        }

        return userInput;

    }

    // this method takes in a Scanner and a prompt and ensures the user enters a valid non-zero integer
    private static int getValidNonZeroInteger(Scanner sc, String prompt) {
        // stores user input and validity flag
        int userInput = 0;
        boolean isValid = false;
        // loops until a valid non-zero integer is entered
        while(!isValid) {

            // prints the prompt
            System.out.println(prompt);

            // checks if input is an int, then makes sure it is not 0 before marking valid
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                sc.nextLine();
                
                if (userInput != 0) {
                    isValid = true; // exits loop on next check
                }
            } else {
                sc.nextLine();
            }

            // prints error if input was not a valid non-zero integer
            if (!isValid) {
                System.out.println("Error. Please enter a non-zero integer");
            }
        }

        return userInput;

    }




}

// helper class that performs the math operations
class MathTest {

    // method that calculates and prints the quotient given a numerator and denominator
    public void divide(int numerator, int denominator) {

        // casts numerator to double so the division is decimal not integer division
        System.out.println("The quotient is " + (double)numerator/denominator);
    }

    // method that calculates and prints the slope given two points
    public void slope(int x1, int y1, int x2, int y2) {

        // calculating slope using rise over run formula, cast to double for decimal answer
        double slope = ((double)(y2-y1))/(x2-x1);
        System.out.println("The slope is " + slope);
    }
}