// This class calculates the volume of a cylinder
public class CylinderVolume1 {

    public static void main(String[] args) {

        // declare radius and height variable
        int radius = 5;
        int height = 12;

        // declare volume variable, and assign it the calculation of the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("\nThe volume of a cylinder with radius " + radius + " and height " + height + " is " + volume + "\n");

    }
}