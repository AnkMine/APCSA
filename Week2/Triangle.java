// calculate area of triangle
public class Triangle {

    public static void main (String[] args)
    {
        // create variables
        int base;
        int height;
        double area;

        // set variables to a value
        base = 7;
        height = 11;

        // print variables and their value
        System.out.println("base = " + base + "\nheight = " + height);

        // calculate area of triangle
        area = (double) (base * height)/2;
        
        //Allows integers to be printed without the ".0" and doubles to be printed with decimal value
        /*
        if (area == (int) area)
        {
            System.out.println("The area of the triangle is equal to " + (int) area);
        }
        else
        {
            System.out.println("The area of the triangle is equal to " + area);
        }
        */      

        //print area of the triangle
        System.out.println("The area of the triangle is equal to " + area);
    }
}