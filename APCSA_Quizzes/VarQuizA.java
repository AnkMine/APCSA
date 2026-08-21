//Calculates the area and circumference of a circle
public class VarQuizA {

    //main method
    public static void main (String[] args)
    {
        //creates variables pi and radius
        double pi;
        int radius;

        //assigns pi and radius values
        pi = 3.14;
        radius = 10;

        //prints variables pi and radisu
        System.out.println("pi: " + pi + "\nradius: " + radius);

        //creates and assigns variable area
        double area;
        area = (pi * radius * radius);

        //prints the area of the circle
        System.out.println("The area of the circle is equal to " + area);

        //creates and assigns variable circumference
        double circumference;
        circumference = (2 * pi * radius);

        //prints the circumference
        System.out.println("The circumference is equal to " + circumference);

    }

}