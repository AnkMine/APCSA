public class Square {

    // creates new private variable and assigns it integer 7
    private int side = 7;

    // this method reassigns the "side" variable to 5
    public void changeSide() {
        side = 5;
    }

    // this method prints the area of a square using the "side" variable
    public void printArea() {
        System.out.println("\nThe area is of the square is: " + (Math.pow(side, 2)));
    }
}