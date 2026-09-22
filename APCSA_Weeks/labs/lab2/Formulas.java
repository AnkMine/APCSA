public class Formulas {


    private double pi = 3.14;
    private double gravity = 9.8;


    public void areaTriangle(double b, double h) {
        // calculating area of triangle using parameters given and formula
        double area = 0.5 * b * h;
        System.out.println("The area of a triangle with base " + b + " and height " + h + " is " + makeBold(area + "") + ".");
    }


    public void areaCircle(double r) {
        // calculating area of circle using parameters given and formula
        double area = pi * Math.pow(r, 2);
        System.out.println("The area of a circle with radius " + r + " is " + makeBold(area + "") + ".");
    }


    public void volCylinder(double r, double h) {
        // calculating volume of cylinder using parameters given and formula
        double volume = pi * Math.pow(r, 2) * h;
        System.out.println("The volume of a cylinder with radius " + r + " and height " + h + " is " + makeBold(volume + "") + ".");
    }


    public void volSphere(double r) {
        // calculating volume sphere of cylinder using parameters given and formula
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        System.out.println("The volume of a sphere with radius " + r + " is " + makeBold(volume + "") + ".");
    }


    public void areaTrapezoid(double a, double b, double h) {
        // calculating the area of a trapezoid using parameters given and formula
        double area = 0.5 * (a + b) * h;
        System.out.println("The area of a trapezoid with bases " + a + " and " + b + " and height " + h + " is " + makeBold(area + "") + ".");
    }


    public void pythagThm(double a, double b) {
        // calculating pythagorean theorem using parameters given and formula
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of a right triangle with leg lengths " + a + " and " + b + " is " + makeBold(c + "") + ".");
    }


    public void distanceForm(double x1, double y1, double x2, double y2) {
        // calculating distance formula using parameters given and formula
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + makeBold(d + "") + ".");
    }


    public void quadraticForm(double a, double b, double c) {
        
        // calculating discriminant of quadratic formula using parameters given
        double discriminant = Math.pow(b, 2) - (4 * a * c);

       
        if (discriminant >= 0) {
            // if discriminant is positive or 0, calculate roots using real numbers
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (root1 == root2) {
                System.out.println("The quadratic equation with coefficients a=" + a + ", b=" + b + ", c=" + c + " has one solution: x = " + makeBold(root1 + "") + ".");
            } else {
                System.out.println("The quadratic equation with coefficients a=" + a + ", b=" + b + ", c=" + c + " has solutions x = " + makeBold(root1 + "") + " and x = " + makeBold(root2 + "") + ".");
            }
        } else {
            // if discriminant is negative, calculate roots using complex numbers (i)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            // Standard complex numbers format: a ± bi
            String root1 = realPart + " + " + Math.abs(imaginaryPart) + "i";
            String root2 = realPart + " - " + Math.abs(imaginaryPart) + "i";

            System.out.println("The quadratic equation with coefficients a=" + a + ", b=" + b + ", c=" + c + " has complex solutions x = " + makeBold(root1) + " and x = " + makeBold(root2) + ".");
        }
    }


    public void slopeLine(double x1, double y1, double x2, double y2) {
        // calulates slope of a line using parameters given and formula
        double m = (y2 - y1) / (x2 - x1);
        System.out.println("The slope of the line passing through (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + makeBold(m + "") + ".");
    }


    public void lawCos(double a, double b, double theta) {
        // uses law of cosine to calculate value of c using parameters given and formula
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(theta))));
        System.out.println("The third side of a triangle with sides " + a + " and " + b + " and an included angle of " + theta + " degrees is " + makeBold(c + "") + ".");
    }


    public void gravPotenEnergy(double m, double h) {
        // calculates potential energy using parameters given and formula
        double pe = m * gravity * h;
        System.out.println("The gravitational potential energy of an object with mass " + m + " kg at a height of " + h + " meters is " + makeBold(pe + "") + " Joules.");
    }


    public void weight(double m) {
        // calculates weight using parameters given and formula
        double w = m * gravity;
        System.out.println("The weight of an object with mass " + m + " kg is " + makeBold(w + "") + " Newtons.");
    }


    public void kineticEnergy(double m, double v) {
        // calculates kinetic energy using parameters given and formula
        double ke = 0.5 * m * Math.pow(v, 2);
        System.out.println("The kinetic energy of an object with mass " + m + " kg moving at " + v + " m/s is " + makeBold(ke + "") + " Joules.");
    }


    public void newtonSecondLaw(double m, double a) {
        // calculates Newton's Second Law using parameters given and formula
        double f = m * a;
        System.out.println("The force on an object with mass " + m + " kg accelerating at " + a + " m/s^2 is " + makeBold(f + "") + " Newtons.");
    }


    public void OhmLaw(double i, double r) {
        // calculates Ohm's Law using parameters given and formula
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