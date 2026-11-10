// this class prints a multiplication grid with special cells
public class GridPattern {

    // main method
    public static void main(String[] args) {

        // generate a random number between 4 and 10 inclusive
        int rand = (int)(Math.random()*7)+4;

        System.out.println("Grid for a " + rand + " by " + rand + " table");

        // outer loop prints each row
        for(int i = 1; i <= rand; i++) {

            // inner loop prints each column
            for(int j = 1; j <= rand; j++) {

                // calculates the product of the row and column numbers
                int product = i * j;

                // checks if product is divisible by 4 and prints the special cell instead
                if (product % 4 == 0) {
                    System.out.print("--\t");
                    continue;
                }

                // checks if product is greater than 20 which means later columns will be too
                if (product > 20) {
                    System.out.print("Max\t");
                    break;
                }

                // prints the product
                System.out.print(product + "\t");

            }

            System.out.println();

        }
    }
    
}