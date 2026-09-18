public class Triangle {
    
    //instance variables
    private int base;
    private int height;

    //default constructor
    public Triangle()
    {
        base = 0;
        heigth = 0;
    }
    
    //constructor that sets instance variables to parameters
    public Triangle(int baseT, int heightT)
    {
        base = baseT;
        height = heightT;
    }

    //prints and calculates area
    public void printArea()
    {
        System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + (1/2 * base * height));
    }

}