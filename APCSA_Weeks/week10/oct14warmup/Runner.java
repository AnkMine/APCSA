// this class runs the Pythagorean class and prints the value of c
public class Runner {

    // main method
    public static void main(String[] args) {

        // this initializes the default constructor from "Pythagorean.java" and the reference variable is "pythag"
        Pythagorean pythag = new Pythagorean();

        // calls findC(); method using pythag and passes 5 and 12 as a and b
        double variable = pythag.findC(5, 12);

        // prints the value of c in a right triangle
        System.out.println("The value of c in a right triangle is: " + variable);

    }

}

// class accessible in this file
class Pythagorean {

    // method that calculates the hypotenuse using the pythagorean thm given a and b
    public static double findC(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

}
