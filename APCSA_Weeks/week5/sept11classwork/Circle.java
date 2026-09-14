// this imports the scanner class
import java.util.Scanner;

public class Circle {

    // this creates an instance of a Scanner class
    Scanner sc = new Scanner(System.in);

    // creates and assigns 2 private variables
    private double pi = 7;
    private double radius = 0;

    // this method asks user for the radius and stores it in the "radius" variable
    public void setRadius() {
        System.out.println("Enter a value for the radius: ");
        radius = sc.nextDouble();
    }

    // this method prints the area of the circle using the "radius" and "pi" variables
    public void printArea() {
        System.out.println("\nThe area is of the circle is: " + (Math.pow(radius, 2) * pi) + "\n");
    }
}