public class ArrayDemo {

    public static void main(String[] args) {

        // Demo1, integer array of size 5 using hard lines of code to append random numbers and printing the array
        System.out.println("Demo1: ");

        int[] demo1 = new int[5];

        demo1[0] = (int)(Math.random()*20) + 1;
        demo1[1] = (int)(Math.random()*20) + 1;
        demo1[2] = (int)(Math.random()*20) + 1;
        demo1[3] = (int)(Math.random()*20) + 1;
        demo1[4] = (int)(Math.random()*20) + 1;

        System.out.print(demo1[0] + " " + demo1[1] + " " + demo1[2] + " " + demo1[3] + " " + demo1[4] + " ");


        // Demo2, integer array of size 25 using for loops for appending numbers and printing the array
        System.out.println("\nDemo2: ");

        int[] demo2 = new int[25];

        for(int i = 0; i < demo2.length; i++) {
            demo2[i] = (int)(Math.random() * 9) + 1;
        }

        for(int i = 0; i < demo2.length; i++) {
            System.out.print(demo2[i] + " ");
        }

        //Demo3, string array of size 5 with words and using while loop to print the array
        System.out.println("\nDemo3: ");

        String[] demo3 = new String[5];
        demo3 = new String[]{"fruit", "computer", "mice", "apple", "hello"};

        int i = 0;
        while (i < demo3.length) {
            System.out.println(demo3[i]);
            i++;
        }
    }
}