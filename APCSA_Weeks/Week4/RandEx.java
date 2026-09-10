public class RandEx {

    public static void main(String[] args) {
        // Generate 2 random numbers between 1 and 5 and assign them to respective var
        int num1 = (int) (Math.random() * 25) + 1;
        int num2 = (int) (Math.random() * 25) + 1;

        // Print those numbers
        System.out.println("The two numbers are " + num1 + " and " + num2);

        // check if those numbers are equal and print respective statement
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("The two numbers are equal");
        }

        // calculate and print the average of 2 numbers
        double average = (num1 + num2) / 2.0;
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

        // find the smaller number of the two and raise it to the 4th power
        int smaller = Math.min(num1, num2);
        double result = Math.pow(smaller, 4);
        System.out.println(smaller + " raised to the 4th power is " + result);
    }
}