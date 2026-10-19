import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        MathTest math = new MathTest();
        Scanner sc = new Scanner(System.in);

        int userNumerator = getValidInteger(sc, "Enter an integer numerator: ");
        int userDenominator = getValidNonZeroInteger(sc, "Enter an non-zero integer denominator: ");

        math.divide(userNumerator, userDenominator);
        
        int userX1 = getValidInteger(sc, "Enter an integer x1: ");
        int userY1 = getValidInteger(sc, "Enter an integer y1: ");
        int userX2 = getValidInteger(sc, "Enter an integer x2: ");
        int userY2 = getValidInteger(sc, "Enter an integer y2: ");


        math.slope(userX1, userY1, userX2, userY2);

        sc.close();

    }


    private static int getValidInteger(Scanner sc, String prompt) {
        int userInput;
        do {
            System.out.println(prompt);

            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                sc.nextLine();
                return userInput;
            }

            System.out.println("Error. Please enter a valid integer");
            sc.nextLine();

        } while(true);

    }

    private static int getValidNonZeroInteger(Scanner sc, String prompt) {
        int userInput;
        do {
            System.out.println(prompt);

            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                sc.nextLine();
                if (userInput != 0) {
                    return userInput;
                }
            } else {
                sc.nextLine();
            }

            System.out.println("Error. Please enter a non-zero integer");

        } while(true);
    }




}

class MathTest {

    public void divide(int numerator, int denominator) {
        System.out.println("The quotient is " + (double)numerator/denominator);
    }

    public void slope(int x1, int y1, int x2, int y2) {
        double slope = ((double)(y2-y1))/(x2-x1);
        System.out.println("The slope is " + slope);
    }
}