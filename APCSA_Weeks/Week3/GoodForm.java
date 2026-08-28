// this code will compile. Even though it was in 1 line of code, there were semicolons to seperate each statement.

// import the Scanner class
import java.util.Scanner;

// this class calculates the area of a circle given the radius inputed by the user
public class GoodForm { 
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("I will calculate the area of a circle. Please provide a radius: ");

        // declare variables for radius, pi, and area
        double radius = keyboard.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;

        // print the area of a circle in a string
        System.out.println("The area of this circle is " + area); 
    }
}