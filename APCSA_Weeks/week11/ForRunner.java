// this class prints numbers 1-25 three different ways using each type of loop
public class ForRunner {

    // main method
    public static void main(String[] args) {

        // for loop counts 1-25, prints each number followed by a comma except the last
        for(int i = 1; i <= 25; i++) {
            System.out.print(i);
            // prints comma and space only if not the last number
            if (i != 25) {
                System.out.print(", ");
            }
        }
        // moves to next line after the row is printed
        System.out.println();

        // while loop counts down 25-1, prints each number followed by a comma except the last
        int j = 25;
        while(j >= 1) {

            System.out.print(j);
            // prints comma and space only if not the last number
            if (j != 1) {
                System.out.print(", ");
            }
            j--;
        }
        
        // moves to next line after the row is printed
        System.out.println();

        // do-while loop counts up 1-25, prints each number followed by a comma except the last
        int k = 1;
        do {
            System.out.print(k);
            // prints comma and space only if not the last number
            if (k != 25) {
                System.out.print(", ");
            }
            k++;
        } while(k <= 25);

        // moves to next line after the row is printed
        System.out.println();
    }
}