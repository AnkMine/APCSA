// imports the Scanner class
import java.util.Scanner;

// this class gets and ensures the user inputs an integer greater than 5
public class WhichWhile {

    // main method
    public static void main(String[] args) {

        // create new instance of scanner class
        Scanner sc = new Scanner(System.in);

        String promptMessage = "Enter an integer greater than 5: ";
        System.out.print(promptMessage);

        // get and ensure userInt is an integer > 5
        int userInt = 0;
        while (userInt <= 5) {
            // checks if the input is an integer and if it is greater than 5, else prints error and re prompts
            if (sc.hasNextInt()) {
                userInt = sc.nextInt();
                if (userInt <= 5) {
                    System.out.println("Error: The integer must be greater than 5.");
                    System.out.print(promptMessage);
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer greater than 5.");
                sc.next();
                System.out.print(promptMessage);
            }
        }




        // prints the value inputted by the user
        System.out.println("\nThe value inputted is: " + userInt);
    }
}
