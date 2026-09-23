public class Runner {

    public static void main(String [] args) {


        // this initializes the default constructor from "Rectangle.java" and the reference varible is "rect1"
        Rectangle rect1 = new Rectangle();

        // calls printArea(); method using rect1
        rect1.printArea();

        // this initializes the initalization constructor from "Rectangle.java", adds parameters, and the reference varible is "rect2"
        Rectangle rect2 = new Rectangle(5, 3);

        // calls printArea(); method using rect2
        rect2.printArea();

        // this initializes the default constructor from "Triangle.java" and the reference varible is "triangle1"
        Triangle triangle1 = new Triangle();
        
        // calls printArea(); method using triangle
        triangle1.printArea();

        // this initializes the default constructor from "Triangle.java", adds parameters, and the reference varible is "triangle1"
        Triangle triangle2 = new Triangle(5, 3);
        
        // calls printArea(); method using triangle2
        triangle2.printArea();
    }
}