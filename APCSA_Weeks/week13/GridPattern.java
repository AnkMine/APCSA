public class GridPattern {

    public static void main(String[] args) {

        int rand = (int)(Math.random()*7)+4;

        System.out.println("Grid for a " + rand + " by " + rand + " table");

        for(int i = 1; i <= rand; i++) {

            for(int j = 1; j <= rand; j++) {

                int product = i * j;

                if (product % 4 == 0) {
                    System.out.print("--\t");
                    continue;
                }

                if (product > 20) {
                    System.out.print("Max\t");
                    break;
                }

                System.out.print(product + "\t");

            }

            System.out.println();

        }
    }
    
}