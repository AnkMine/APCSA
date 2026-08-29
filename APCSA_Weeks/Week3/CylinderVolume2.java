// import java Scanner class
import java.util.Scanner;

// This class calculates the volume of a cylinder with user input
public class CylinderVolume2 {

    public static void main(String[] args) {

        Scanner lengthInput = new Scanner(System.in);

        // declare radius and height variable and use helper method to get valid input from user
        double radius = getValidDouble(lengthInput, "radius");
        double height = getValidDouble(lengthInput, "height");

        // declare volume variable, and assign it the calculation of the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        // round double volume
        volume = Math.round(volume*100)/100.0;

        System.out.println(makeBold("\n\nThe volume of a cylinder") + " with radius " + radius + " and height " + height + " is " + makeBold(volume + "") + "\n");

        lengthInput.close();

    }

    //creating a helper method to assist with checking validity of user input (for doubles)
    public static double getValidDouble(Scanner lengthInput, String variableName) {
        while (true) {
            //asks user for input
            System.out.print("\nEnter value for " + variableName + ": ");

            // this if statement makes sure that the input is a number
            if (!lengthInput.hasNextDouble()) {

                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number.");
                lengthInput.next();
                continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
            }

            //stores value of input in a local variable
            double value = lengthInput.nextDouble();

            // this if statement makes sure that the input is a positive number
            if (value < 0) {
                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number.");
                continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
            }

            return value;
        }
    }

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }
}