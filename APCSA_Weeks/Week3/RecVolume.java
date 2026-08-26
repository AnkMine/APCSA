// import Scanner class
import java.util.Scanner;

// this public class calculates the volume of a rectangular prism
public class RecVolume {

    public static void main(String[] args) {
        // This declares a new scanner, "sc"
        Scanner sc = new Scanner(System.in);

        // declares and assigns width, length, and height variables to the user input while making sure the user input is valid
        double width = getValidDouble(sc, "width");
        double length = getValidDouble(sc, "length");
        double height = getValidDouble(sc, "height");

        sc.close();

        double volume = (Math.round(width*length*height * 100.0)/100.0);

        //print the values of dimensions, then print the volume
        System.out.println("\nThe volume of a rectangular prism with width " + width + " , length " + length + ", and height of " + height + " is "+ volume + " cubed.\n");




    }



    //creating a helper method to assist with checking validity of user input (for doubles)
    public static double getValidDouble(Scanner sc, String variableName) {
        while (true) {
            //asks user for input
            System.out.print("\nEnter value for " + variableName + ": ");

            // this if statement makes sure that the input is a number
            if (!sc.hasNextDouble()) {

                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number or 0.");
                sc.next();
                continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
            }

            //stores value of input in a local variable
            double value = sc.nextDouble();

            // this if statement makes sure that the input is a positive number or 0
            if (value < 0) {
                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number or 0.");
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