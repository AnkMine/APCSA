public class Square {

    private int side = 7;

    public void changeSide() {
        side = 5;
    }

    public void printArea() {
        System.out.println("\nThe area is of the square is: " + (Math.pow(side, 2)));
    }
}