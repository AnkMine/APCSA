import java.util.Scanner;


public class NextLineIssue {
    // ask the user for some information and then print.
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner keyBoard = new Scanner(System.in);


        // Ask the user their name
        System.out.print("What is your first name? " );
        String fName = keyBoard.next();
        System.out.print("What is your last name? " );
        String lName = keyBoard.next();

        keyBoard.nextLine();


        // Ask the user their address
        System.out.print("\nWhat is your street address? ");
        String streetAddr = keyBoard.nextLine();
        System.out.print("\nWhat is your city, state and zipcode? ");
        String cityStZip = keyBoard.nextLine();


        // Print the address
        System.out.println(fName + " " + lName);
        System.out.println(streetAddr);
        System.out.println(cityStZip);
         
        // Close the Scanner connection
        keyBoard.close();


    }


}
