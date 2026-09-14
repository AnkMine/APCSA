public class Radius {
    
    private double pi = 3.14;

    public void printArea(double radius) {
        double area = (Math.pow(radius, 2) * pi);
        System.out.println("The area of a circle is: " + area);
    }

    public void printCir(double radius) {
        double cir = (2 * pi * radius);
        System.out.println("The circumference of the circle is: " + cir);
    }

    public void printConeVol(double radius, double height) {
        double coneVol = (pi * Math.pow(radius, 2) * (height/3.0));
        System.out.println("The volume of the cone is: " + coneVol);

    }
}