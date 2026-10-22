public class ForRunner {

    public static void main(String[] args) {

        for(int i = 1; i <= 25; i++) {
            System.out.print(i);
            if (i != 25) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int j = 25;
        while(j >= 1) {

            System.out.print(j);
            if (j != 1) {
                System.out.print(", ");
            }
            j--;
        }
        System.out.println();

        int k = 1;
        do {
            System.out.print(k);
            if (k != 25) {
                System.out.print(", ");
            }
            k++;
        } while(k <= 25);
        System.out.println();
    }
}