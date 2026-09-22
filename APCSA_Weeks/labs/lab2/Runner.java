import java.util.Scanner;

public class Runner {

    public static void main(String [] args) {
        
        // contains all the formula choices to be printed out
        String[] formulaChoices = {
            "Area of a Triangle                     A = 1/2 * b * h",
            "Area of a Circle                       A = pi * r^2",
            "Volume of a Cylinder                   V = pi * r^2 * h",
            "Volume of a Sphere                     V = 4/3 * pi * r^3",
            "Area of a Trapezoid                    A = 1/2 * (a + b) * h",
            "Pythagorean Theorem                    c = sqrt(a^2 + b^2)",
            "Distance Formula                       d = sqrt((x2 - x1)^2 + (y2 - y1)^2)",
            "Quadratic Formula (real, complex #s)   x = (-b +- sqrt(b^2 - 4ac)) / (2a)",
            "Slope of a Line                        m = (y2 - y1) / (x2 - x1)",
            "Law of Cosines                         c = sqrt(a^2 + b^2 - 2ab * cos(theta))",
            "Gravitational Potential Energy         PE = m * g * h",
            "Weight                                 W = m * g",
            "Kinetic Energy                         KE = 1/2 * m * v^2",
            "Newton's Second Law                    F = m * a",
            "Ohm's Law                              V = I * R",
            "QUIT PROGRAM                           QUIT"
        };

        System.out.println("\n\n\n\n==========================================================================");
        System.out.println("NO.   FORMULA NAME                        EQUATION");
        System.out.println("==========================================================================");
        
        // for loop that prints the formulas in a table format with input #s printed prior to each row
        for (int i = 0; i < formulaChoices.length; i++) {

            if (i + 1 < 10) {
                System.out.print("[ " + (i + 1) + "]  ");
            } else {
                System.out.print("[" + (i + 1) + "]  ");
            }
            
            System.out.println(formulaChoices[i]);
        }

        System.out.println("==========================================================================\n\n\n\n");

        // creates new Scanner and Formulas instances
        Scanner sc = new Scanner(System.in);
        Formulas f = new Formulas();

        // creates and assigns boolean for handling while loop functions
        boolean running = true;


        String formulaPrompt = "Please enter an integer corresponding to the equation you would like to solve (1-16): ";

        System.out.println(formulaPrompt);

        int choice;

        // game loop
        while (running) {
            
            choice = sc.nextInt();
            // gets user input for formula prompt betwen 1-16
            while (choice < 1 || choice > 16) {
                
                

                System.out.print(formulaPrompt);
                
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 16) {
                        System.out.println("Invalid entry. Please enter an integer between 1 and 16.");
                    }
                } else {
                    sc.next(); // clears input buffer to use again for .nextInt();
                    System.out.println("Invalid entry. Please enter an integer between 1 and 16.");
                }
            }

            

            // instead of going through a long if, else if, and else chain; quitting the program would be faster if it is at the top (doesn't really matter for this small of a program)
            if (choice == 16) { 
                System.out.println(makeBold("\n\t\t\t\t\tQuitting..."));
                // quits program
                running = false;
            } else {

                // prints user formula choice
                System.out.println("\t\t\t" + makeBold(formulaChoices[choice-1] + ""));

                // below if, else if statements allow user to enter inputs corresponding to their formula chosen and calculate it
                if (choice == 1) {
                    // Area of Triangle

                    double b = getNonNegativeDouble(sc, "Enter base: ");
                    double h = getNonNegativeDouble(sc, "Enter height: ");
                    f.areaTriangle(b, h);

                } else if (choice == 2) {
                    // Area of Circle
                    double r = getNonNegativeDouble(sc, "Enter radius: ");
                    f.areaCircle(r);

                } else if (choice == 3) {
                    // Volume of Cylinder
                    double r = getNonNegativeDouble(sc, "Enter radius: ");
                    double h = getNonNegativeDouble(sc, "Enter height: ");
                    f.volCylinder(r, h);
                    
                } else if (choice == 4) {
                    // Volume of Sphere
                    double r = getNonNegativeDouble(sc, "Enter radius: ");
                    f.volSphere(r);
                    
                } else if (choice == 5) {
                    // Area of Trapezoid
                    double a = getNonNegativeDouble(sc, "Enter base a: ");
                    double b = getNonNegativeDouble(sc, "Enter base b: ");
                    double h = getNonNegativeDouble(sc, "Enter height: ");
                    f.areaTrapezoid(a, b, h);
                    
                } else if (choice == 6) {
                    // Pythag thm
                    double a = getNonNegativeDouble(sc, "Enter leg a: ");
                    double b = getNonNegativeDouble(sc, "Enter b: ");
                    f.pythagThm(a, b);
                    
                } else if (choice == 7) {
                    // Distance formula
                    double x1 = getDouble(sc, "Enter x1: ");
                    double y1 = getDouble(sc, "Enter y1: ");
                    double x2 = getDouble(sc, "Enter x2: ");
                    double y2 = getDouble(sc, "Enter y2: ");
                    f.distanceForm(x1, y1, x2, y2);
                    
                } else if (choice == 8) {
                    // Quadratic Formula
                    double a = getNonEqualDouble(sc, "Enter 'a' (cannot be 0): ", 0);
                    double b = getDouble(sc, "Enter b: ");
                    double c = getDouble(sc, "Enter c: ");
                    f.quadraticForm(a, b, c);
                    
                } else if (choice == 9) {
                    // Slope of a Line
                    double x1 = getDouble(sc, "Enter x1: ");
                    double y1 = getDouble(sc, "Enter y1: ");
                    double x2 = getNonEqualDouble(sc, "Enter x2: ", x1);
                    double y2 = getDouble(sc, "Enter y2: ");
                    f.slopeLine(x1, y1, x2, y2);
                    
                } else if (choice == 10) {
                    // Law of Cosines
                    double a = getNonNegativeDouble(sc, "Enter side a: ");
                    double b = getNonNegativeDouble(sc, "Enter side b: ");
                    double theta = getNonNegativeDouble(sc, "Enter angle theta (in degrees): ");
                    f.lawCos(a, b, theta);

                } else if (choice == 11) {
                    // Gravitational Potentional Energy
                    double m = getNonNegativeDouble(sc, "Enter mass (kg): ");
                    double h = getNonNegativeDouble(sc, "Enter height (meters): ");
                    f.gravPotenEnergy(m, h);

                } else if (choice == 12) {
                    // Weight
                    double m = getNonNegativeDouble(sc, "Enter mass (kg): ");
                    f.weight(m);

                } else if (choice == 13) {
                    // Kinetic Energy
                    double m = getNonNegativeDouble(sc, "Enter mass (kg): ");
                    double v = getNonNegativeDouble(sc, "Enter velocity (m/s): ");
                    f.kineticEnergy(m, v);

                } else if (choice == 14) {
                    // Newton's 2nd Law
                    double m = getNonNegativeDouble(sc, "Enter mass (kg): ");
                    double a = getDouble(sc, "Enter acceleration (m/s^2): ");
                    f.newtonSecondLaw(m, a);

                } else if (choice == 15) {
                    // Ohm's Law
                    double i = getNonNegativeDouble(sc, "Enter current (A): ");
                    double r = getNonNegativeDouble(sc, "Enter resistance (Ohms): ");
                    f.OhmLaw(i, r);
                }
            }

            System.out.println();
        }

        sc.close();

    }


    public static double getDouble(Scanner sc, String prompt) {
        System.out.println(prompt);
        while(!sc.hasNextDouble()) {
            System.out.println("\t\t\tInvalid entry. Please enter a number.");
            sc.next();
            System.out.print(prompt);
        }

        return sc.nextDouble();
    }

    public static double getNonNegativeDouble(Scanner sc, String prompt) {
        double val = getDouble(sc, prompt);
        while (val < 0) {
            System.out.println("\t\t\tValue must be greater than or equal to 0.");
            val = getDouble(sc, prompt);
        }

        return val;
    }

    public static double getNonEqualDouble(Scanner sc, String prompt, double badValue) {
        double val = getDouble(sc, prompt);
        while (val == badValue) {
            System.out.println("\t\t\tValue cannot equal " + badValue + ",");
            val = getDouble(sc, prompt);
        }

        return val;
    }


    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }

}