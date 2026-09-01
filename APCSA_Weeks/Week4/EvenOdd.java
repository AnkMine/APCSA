import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {

        // declaring a new scanner
        Scanner sc = new Scanner(System.in);

        // asking user for input
        System.out.println("Enter a number: ");


        // settings number to the user's input
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}