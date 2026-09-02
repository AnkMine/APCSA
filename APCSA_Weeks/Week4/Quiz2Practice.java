// imports the scanner class
import java.util.Scanner;

// this class allows the user to calculate the area and perimeter of a rectangle given inputed values
public class Quiz2Practice {
    public static void main(String [] args ) {

        // creates a new scanner object
        Scanner sc = new Scanner(System.in);

        // asks the user to input the value for lenght
        System.out.println("\nPlease enter a value for the length: ");
        double length = sc.nextDouble();

        // checks if the user's input is valid
        while(length < 0) {
            System.out.println("\n\t\tPlease enter a positive value or 0 for the length: ");
            length = sc.nextDouble();
        }


        // asks the user to input the value for height
        System.out.println("\nPlease enter a value for the height: ");
        double height = sc.nextDouble();

        // checks if the user's input is valid
        while(height < 0) {
            System.out.println("\n\t\tPlease enter a positive value or 0 for the height: ");
            height = sc.nextDouble();
        }

        // declare variable choice
        int choice;
        
        // this while loop allows the user to input a valid input to calculate the area or perimeter of the rectangle
        while(true) {
            System.out.println("\nWould you like to calculate the area or perimeter of a rectangle? Type 1 for area and 2 for perimeter: ");
            choice = sc.nextInt();

            if (choice == 1) {
                // calculate area
                double area = height * length;
                System.out.println("The area of rectangle with length: " + length + " and " + "height " + height + " is: " + area);
                break;  // this breaks the loop
            } else if (choice == 2) {
                // calculate perimeter
                double perimeter = (2 * height) + (2 * length);
                System.out.println("The perimeter of rectangle with length: " + length + " and " + "height " + height + " is: " + perimeter);
                break;
            } else {
                System.out.println("\n\t\tError: Invalid input. Please enter 1 for area or 2 for perimeter.");
                continue; // this goes to the next iteration of the loop
            }

        }

        sc.close();

        System.out.println("\n\n\t\t\tThank you for calculating!");
        
    }
}