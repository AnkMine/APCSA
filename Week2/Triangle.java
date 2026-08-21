public class Triangle {

    public static void main (String[] args)
    {
        
        int base;
        int height;
        double area;

        base = 7;
        height = 11;

        System.out.println("base = " + base + "\nheight = " + height);

        area = (double) (base * height)/2;
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
        System.out.println("The area of the triangle is equal to " + area);
    }
}