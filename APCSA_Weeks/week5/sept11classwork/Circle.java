import java.util.Scanner;

public class Circle {

    Scanner sc = new Scanner(System.in);

    private double pi = 7;
    private double radius = 0;

    public void setRadius() {
        System.out.println("Enter a value for the radius: ");
        radius = sc.nextDouble();
    }

    public void printArea() {
        System.out.println("The area is of the circle is: " + (Math.pow(radius, 2) * pi));
    }
}