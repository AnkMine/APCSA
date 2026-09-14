// main runner class
public class Runner {

    public static void main(String[] args ) {
        // instantiates a new square object
        Square square = new Square();

        // runs methods from Square.java
        square.printArea();
        square.changeSide();
        square.printArea();

        // instantiates a new circle object
        Circle circle = new Circle();

        // runs methods from Circle.java
        circle.printArea();
        circle.setRadius();
        circle.printArea();
    
    
    
    }
}