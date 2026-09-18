public class Rectangle {

    // creates private integer variables
    private int length, width;

    // default constructor that sets length and width to 0
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // initialization constructor that sets length and width to parameters: l and w
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // method that prints the area using private integer variables
    public void printArea() { 
        System.out.println("The area with length " + length + " width " + width + " is " + (length * width));
    }
}