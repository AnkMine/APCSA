// import Scanner class
import java.util.Scanner;


public class MathLibrary {

    public static void main(String[] args) {

        boolean keepRunning = true;

        Scanner sc = new Scanner(System.in);
        String [] formulas = {
                "Volume of Cylinder",
                "Quadratic Formula",
                "Pythagorean Theorem",
                "Exit Program"
            };

        while (keepRunning) {

            //Displays the array to the user
            for (int i = 0; i < formulas.length; i++) {

                System.out.println("\n " + (i + 1) + ". " + formulas[i]);
            }

            int choice = getValidInt(sc, "\nEnter a number 1 through 4 depending what you want to do: ");

            if (choice == 1) {
                // Volume of Cylinder
                System.out.println(makeBold("\n\t\tCalculating the volume of a cylinder"));
                
                // ask for radius and volume from user, check if valid input
                double radius = getValidDouble(sc, "radius");
                double height = getValidDouble(sc, "height");

                // calculate volume
                double volume = Math.PI * Math.pow(radius, 2) * height;

                // print radius, height, and volume
                System.out.println("\n\t\t\tThe volume of a cylinder with radius " + radius + " and height " + height + " is " + makeBold(volume + ""));

            } else if (choice == 2) {

                // Quadratic Formula
                System.out.println(makeBold("\n\t\tSolving the Quadratic formula"));

                // ask for a, b, and c from user, check if valid input
                System.out.println("Enter value for a: ");

                double a = sc.nextDouble();

                while (true) {
                    // this if statement makes sure that the input is a nonzero number
                    if (a == 0) {
                        System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a nonzero number.");
                        sc.next();
                        continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
                    } else {
                        break;
                    }
                }

                double b = getValidDouble(sc, "b");
                double c = getValidDouble(sc, "c");


                
                // calculate discriminant and set it to a double
                double discriminant = Math.pow(b, 2) - 4 * a * c;

                if (discriminant >= 0) {

                // Real roots
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The real roots are " + makeBold(x1 + "") + " and " + makeBold(x2 + ""));
                } else {

                    // Complex roots
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);

                    String root1 = ("(" + realPart + " + " + imaginaryPart + "i" + ")");
                    String root2 = ("(" + realPart + " - " + imaginaryPart + "i" + ")");

                    System.out.println("The complex roots are " + makeBold(root1) + " and " + makeBold(root2));
                }
                

            } else if (choice == 3) {

                // Pythagorean Therorem
                System.out.println(makeBold("Solving the Pythagorean Theorem"));

                // ask for a, b, and c from user, check if valid input
                double a = getValidDouble(sc, "a");
                double b = getValidDouble(sc, "b");

                double pythagThm = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

                System.out.println("The value of c is " + makeBold(pythagThm + ""));

                

            } else if (choice == 4) {
                
                // kill the program
                System.out.println(makeBold("\n\t\tQuitting...\n"));
                keepRunning = false;
            } else {
                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number between 1 and 4.");
                continue;
            }

            
        
        }
        

        sc.close();


    }




    //creating a helper method to assist with checking validity of user input (for doubles)
    public static double getValidDouble(Scanner sc, String variableName) {
        while (true) {
            //asks user for input
            System.out.print("\nEnter value for " + variableName + ": ");

            // this if statement makes sure that the input is a number
            if (!sc.hasNextDouble()) {

                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number.");
                sc.next();
                continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
            }

            //stores value of input in a local variable
            double value = sc.nextDouble();

            // this if statement makes sure that the input is a positive number
            if (value < 0) {
                System.out.println(makeBold("\n\t\tError:") + " Invalid input. Please enter a positive number.");
                continue; // skips rest of the loop and starts next iteration to make sure each input is correct on all levels
            }

            return value;
        }
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