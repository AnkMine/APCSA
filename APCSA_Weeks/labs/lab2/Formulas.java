public class Formulas {


    private double pi = 3.14;
    private double gravity = 9.8;


    public void areaTriangle(double b, double h) {
        double area = 0.5 * b * h;
        System.out.println("The area of a triangle with base " + b + " and height " + h + " is " + makeBold(area + "") + ".");
    }


    public void areaCircle(double r) {
        double area = pi * Math.pow(r, 2);
        System.out.println("The area of a circle with radius " + r + " is " + makeBold(area + "") + ".");
    }


    public void volCylinder(double r, double h) {
        double volume = pi * Math.pow(r, 2) * h;
        System.out.println("The volume of a cylinder with radius " + r + " and height " + h + " is " + makeBold(volume + "") + ".");
    }


    public void volSphere(double r) {
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        System.out.println("The volume of a sphere with radius " + r + " is " + makeBold(volume + "") + ".");
    }


    public void areaTrapezoid(double a, double b, double h) {
        double area = 0.5 * (a + b) * h;
        System.out.println("The area of a trapezoid with bases " + a + " and " + b + " and height " + h + " is " + makeBold(area + "") + ".");
    }


    public void pythagThm(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of a right triangle with leg lengths " + a + " and " + b + " is " + makeBold(c + "") + ".");
    }


    public void distanceForm(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + makeBold(d + "") + ".");
    }


    public void quadraticForm(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (root1 == root2) {
            System.out.println("The quadratic equation with coefficients a=" + a + ", b=" + b + ", c=" + c + " has one solution: x = " + makeBold(root1 + "") + ".");
        } else {
            System.out.println("The quadratic equation with coefficients a=" + a + ", b=" + b + ", c=" + c + " has solutions x = " + makeBold(root1 + "") + " and x = " + makeBold(root2 + "") + ".");
        }
    }


    public void slopeLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        System.out.println("The slope of the line passing through (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + makeBold(m + "") + ".");
    }


    public void lawCos(double a, double b, double theta) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(theta))));
        System.out.println("The third side of a triangle with sides " + a + " and " + b + " and an included angle of " + theta + " degrees is " + makeBold(c + "") + ".");
    }


    public void gravPotenEnergy(double m, double h) {
        double pe = m * gravity * h;
        System.out.println("The gravitational potential energy of an object with mass " + m + " kg at a height of " + h + " meters is " + makeBold(pe + "") + " Joules.");
    }


    public void weight(double m) {
        double w = m * gravity;
        System.out.println("The weight of an object with mass " + m + " kg is " + makeBold(w + "") + " Newtons.");
    }


    public void kineticEnergy(double m, double v) {
        double ke = 0.5 * m * Math.pow(v, 2);
        System.out.println("The kinetic energy of an object with mass " + m + " kg moving at " + v + " m/s is " + makeBold(ke + "") + " Joules.");
    }


    public void newtonSecondLaw(double m, double a) {
        double f = m * a;
        System.out.println("The force on an object with mass " + m + " kg accelerating at " + a + " m/s^2 is " + makeBold(f + "") + " Newtons.");
    }


    public void OhmLaw(double i, double r) {
        double v = i * r;
        System.out.println("The voltage across a circuit with current " + i + " Amps and resistance " + r + " Ohms is " + makeBold(v + "") + " Volts.");
    }

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }

}