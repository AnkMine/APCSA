// imports the Scanner class
import java.util.Scanner;

// this class prints #s in loops and then gets and ensures user input for a custom count
public class Runner {

    // main method
    public static void main(String [] args) {

        // prints #s from 1 to 12 by 1
        int num1 = 1;
        while(num1 <= 12) {
            System.out.print(num1 + " ");
            num1++;
        }
        System.out.println();

        // prints #s from 2 to 20 by 2
        int num2 = 2;
        while(num2 <= 20) {
            System.out.print(num2 + " ");
            num2 += 2;
        }
        System.out.println();

        // prints #s from 15 to -10 by 5
        int num3 = 15;
        while(num3 >= -10) {
            System.out.print(num3 + " ");
            num3 -= 5;
        }
        System.out.println();

        // create new instance of scanner class
        Scanner sc = new Scanner(System.in);

        // get and ensure userInt is an integer > 20
        String promptMessage1 = "Enter an integer greater than 20: ";
        System.out.print(promptMessage1);
        while (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer greater than 20.");
            sc.next();
            System.out.print(promptMessage1);
        }

        int userInt = sc.nextInt();

        // ensure userInt is greater than 20
        while(userInt <= 20) {
            System.out.println("Error: The number must be greater than 20.");
            System.out.print(promptMessage1);
            while (!sc.hasNextInt()) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                sc.next(); 
                System.out.print(promptMessage1);
            }
            userInt = sc.nextInt();
        }

        // get and ensure userStep is a positive integer
        String promptMessage2 = "Enter a positive integer for what the loop must count by: ";
        System.out.print(promptMessage2);
        while (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer to count by:");
            sc.next();
            System.out.print(promptMessage2);
        }

        int userStep = sc.nextInt();

        // Ensure step is greater than 0
        while (userStep <= 0) {
            System.out.println("Error: The step must be greater than 0.");
            System.out.print(promptMessage2);
            while (!sc.hasNextInt()) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                sc.next();
                System.out.print(promptMessage2);
            }
            userStep = sc.nextInt();
        }

        // counts from 0 to userInt by userStep and prints each number on the same line
        int currentCount = 0;
        while (currentCount <= userInt) {
            System.out.print(currentCount + " ");
            currentCount += userStep;
        }
        System.out.println();

        sc.close();
    }
}
