public class Radius {
    
    // creates instance variable
    private double pi = 3.14;

    // method that calculates and prints the area of a circle given a parameter
    public void printArea(double radius) {
        double area = (Math.pow(radius, 2) * pi);
        System.out.println("The area of a circle is: " + area);
    }

    // method that calculates and prints the circumference of a circle given a parameter
    public void printCir(double radius) {
        double cir = (2 * pi * radius);
        System.out.println("The circumference of the circle is: " + cir);
    }

    // method that calculates and prints the volume of a cone given a parameter
    public void printConeVol(double radius, double height) {
        double coneVol = (pi * Math.pow(radius, 2) * (height/3.0));
        System.out.println("The volume of the cone is: " + coneVol);

    }
}