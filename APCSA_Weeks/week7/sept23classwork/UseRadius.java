public class UseRadius {

    // instance variables
    private double pi;
    private double radius;
    private double volume;

    // default constructor
    public UseRadius() {
        radius = 0;
        pi = 3.14;
        volume = 0;
    }

    // initialization constructor
    public UseRadius(double radius) {
        this.radius = radius;
        this.pi = 3.14;
        this.volume = 0;
    }

    // calculating volume using instance variables
    private void calcVol() {
        this.volume = (1.33 * radius * radius * radius * pi);
    }

    // print volume of sphere by calling calcVol();
    public void printVol() {
        calcVol();
        System.out.println("\nThe volume of sphere is: " + volume);
    }

    // prints volume of cylinder using parameters and instance variables
    public void printVol(double radius, double height) {
        volume = pi * Math.pow(radius, 2) * height;
        System.out.println("\nThe volume of the cylinder is: " + volume);
    }

    // prints area of circle using instance variables
    public void printArea() {
        double area = pi * this.radius * this.radius;
        System.out.println("\nThe area of the circle is: " + area);
    }

    // prints area of circle using parameters and instance variables
    public void printArea(double radius) {
        double area = pi * Math.pow(radius, 2);
        System.out.println("\nThe area of the circle is: " + area);
    }




}