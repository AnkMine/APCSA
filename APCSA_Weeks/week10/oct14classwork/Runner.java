// imports the Scanner class
import java.util.Scanner;

// this class adds up #s from 2 to 19 with a while and do while loop and then counts up and down to a user input
public class Runner {

    // main method
    public static void main(String[] args) {

        // sums even #s from 2 to 19 using a while loop
        int sumWhile = 0;
        int i = 2;
        while(i <= 19) {
            sumWhile += i;
            i++;
        }
        System.out.println("The sum is: " + sumWhile);


        // same sum as above but using a do while loop
        int sumDoWhile = 0;
        int j = 2;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= 19);
        System.out.println("The sum is: " + sumDoWhile);

        // create new instance of scanner class
        Scanner sc = new Scanner(System.in);

        // get and ensure user inputs an integer
        String promptMessage = "Enter an integer: ";
        System.out.print(promptMessage);
        while (!sc.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer.");
            sc.next();
            System.out.print(promptMessage);
        }

        int userInt = sc.nextInt();


        // counting up
        int currentUp = 1;
        do {
            System.out.print(currentUp + " ");
            currentUp++;
        } while (currentUp <= userInt);


        // counting down
        int currentDown = userInt;
        do {
            System.out.print(currentDown + " ");
            currentDown--;
        } while (currentDown >= 1);
        System.out.println();

        sc.close();

    }
}
