import java.util.Scanner;

public class MathGame {

    //creating main method
    public static void main(String[] args) {
    
        //creates scanner system
        Scanner scanner = new Scanner(System.in);

        //creates variable to control whether the calculator is running
        boolean keepRunning = true;


        //Creating an array to display the choices
        String[] choices = {
            "Quadratic evalulation: f(a, b, c, x) = ax^2+bx+c", 
            "Addition: f(a, b) = a + b" , 
            "Subtraction: f(a, b) = a - b", 
            "Division: f(a, b) = a / b",
            "Area of Circle: A = pi * r^2",
            "Exit Calculator"
        };

        while(keepRunning) {
            
            //uses makeBold helper function to bold the text
            System.out.println(makeBold("\n\n\t\tMath Game\n\n"));

            //Displays the array to the user
            for (int i = 0; i < choices.length; i++) {

                System.out.println("\n " + (i + 1) + ". " + choices[i]);
            }

            //uses helper function to get input from user and to confirm input is a valid integer
            int selection = getValidInt(scanner, "\nSelect a calculation above by typing its corresponding number: ");

            // creates variables a, b, c, and x to avoid a compile error
            double a;
            double b;
            double c;
            double x;

            // Quadratic Expression evaluation
            if (selection == 1) {
                System.out.println(makeBold("\n --- Quadratic expression evaluation: f(a, b, c, x) = ax^2 + bx + c ---\n"));

                // uses helper function to ask user to input the value of a, b, c, and x
                // uses helper function to confirm input is a number
                a = getValidDouble(scanner, "a");
                b = getValidDouble(scanner, "b");
                c = getValidDouble(scanner, "c");
                x = getValidDouble(scanner, "x");

                //calculate the value of the quadratic expression
                System.out.println("\nThe result of f(" + x + ") = " + ((a * Math.pow(x, 2)) + (b * x) + c));

            }


            // Addition expression evaluation
            if ( selection == 2) {
                System.out.println(makeBold("\n --- Addition expression evaluation: f(a, b) = a + b ---\n"));

                // uses helper function to ask user to input the value of a, b
                // uses helper function to confirm input is a number
                a = getValidDouble(scanner, "a");
                b = getValidDouble(scanner, "b");

                //calculate the value of the addition expression
                System.out.println("\nThe result of f(" + a + ", " + b + ") = " + (a+b));
            }


            // Subtraction expression evaluation
            if ( selection == 3) {
                System.out.println(makeBold("\n --- Subtraction expression evaluation: f(a, b) = a - b ---\n"));

                // uses helper function to ask user to input the value of a, b
                // uses helper function to confirm input is a number
                a = getValidDouble(scanner, "a");
                b = getValidDouble(scanner, "b");

                //calculate the value of the subtraction expression
                System.out.println("\nThe result of f(" + a + ", " + b + ") = " + (a-b));
            }

            // Division expression evaluation
            if ( selection == 4) {
                System.out.println(makeBold("\n --- Division expression evaluation: f(a, b) = a / b ---\n"));

                // uses helper function to ask user to input the value of a, b
                // uses helper function to confirm input is a number
                a = getValidDouble(scanner, "a");
                b = getValidDouble(scanner, "b");

                // while loop to make sure b is not 0
                while (b == 0) {
                    System.out.println(makeBold("\t\t\tError: ")  + "cannot divide by zero. Please enter a non-zero number for b.");
                    b = getValidDouble(scanner, "b");
                }

                //calculate the value of the division expression
                System.out.println("\nThe result of f(" + a + ", " + b + ") = " + (a/b));
            }

            // Area of Circle evaluation
            if ( selection == 5) {
                System.out.println(makeBold("\n --- Area of circle evaluation: A = pi * r^2 ---\n"));

                // uses helper function to ask user to input the value of r
                // uses helper function to confirm input is a number
                double r = getValidDouble(scanner, "r");

                while (r < 0) {
                    System.out.println((makeBold("\t\t\tError: "))  + "radius cannot be negative. Please enter a positive number for r.");
                    r = getValidDouble(scanner, "r");
                }

                //calculate the value of the area of a circle
                System.out.println("\nThe area of the circle is equal to " + (Math.PI * Math.pow(r, 2)));
            }

            // Kill the calculator
            if ( selection == 6) {
                System.out.println(makeBold("\n\n\tThank you for playing Math Game.\n\n"));
                //change value of keepRuning, thus terminating the calculator
                keepRunning = false;
            } else if (selection > 6 || selection < 1) {
                // requires user to type in a valid option
                System.out.println("Error: Choice out of range. Please select a number between 1 and 6.");
            } else {
                //allows user to press enter to continue using the calculator
                //allows user to review answer prior to seeing the main menu
                System.out.println("\nPress Enter to return to the main menu: ");
                scanner.nextLine();
                scanner.nextLine();
            }

        }

        scanner.close();
    }

    //creating a helper method to assist with checking validity of user input (for doubles)
    public static double getValidDouble(Scanner scanner, String variableName) {
        System.out.print("Enter value for " + variableName + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println(makeBold("Error:") + "Invalid input. Please enter a number. ");
            scanner.next();
            System.out.print("Enter value for " + variableName + ": ");
        }
        return scanner.nextDouble();
    }

    //creating a helper method to assis with checking valididty of user input (for integers)
    public static int getValidInt(Scanner scanner, String promptMessage) {
        System.out.print(promptMessage);
        while (!scanner.hasNextInt()) {
            System.out.println(makeBold("Error:") + "Invalid input. Please enter a whole number from the menu.");
            scanner.next();
            System.out.print(promptMessage);
        }
        return scanner.nextInt();
    }

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }

}