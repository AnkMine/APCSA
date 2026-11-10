public class ArrayDemo {

    public static void main(String[] args) {

        // demo1, integer array of size 5 using hard lines of code
        System.out.println("Demo1: ");

        int[] demo1 = new int[5];

        // append elements of the array
        demo1[0] = (int)(Math.random()*20) + 1;
        demo1[1] = (int)(Math.random()*20) + 1;
        demo1[2] = (int)(Math.random()*20) + 1;
        demo1[3] = (int)(Math.random()*20) + 1;
        demo1[4] = (int)(Math.random()*20) + 1;

        // print elements of the array
        System.out.print(demo1[0] + " " + demo1[1] + " " + demo1[2] + " " + demo1[3] + " " + demo1[4] + " ");


        // demo2, integer array of size 25 using for loops
        System.out.println("\nDemo2: ");

        int[] demo2 = new int[25];

        // append numbers using for loop
        for(int i = 0; i < demo2.length; i++) {
            demo2[i] = (int)(Math.random() * 9) + 1;
        }

        // print elements of array
        for(int i = 0; i < demo2.length; i++) {
            System.out.print(demo2[i] + " ");
        }

        // demo3, string array of size 5 with words and using while loops
        System.out.println("\nDemo3: ");

        // declared demo3, assigned an array of type string with 5 elements
        String[] demo3 = new String[5];
        demo3 = new String[]{"fruit", "computer", "mice", "apple", "hello"};

        // print elements of array
        int i = 0;
        while (i < demo3.length) {
            System.out.println(demo3[i]);
            i++;
        }
    }
}