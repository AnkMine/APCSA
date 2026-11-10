// this class runs the ArrayTest class and prints the array and its sum
public class Runner {

    // main method
    public static void main(String[] args) {

        // this initializes the initialization constructor from "ArrayTest.java" with a length of 5 and the reference variable is "array"
        ArrayTest array = new ArrayTest(5);

        // calls printArr(); method using array
        array.printArr();

        int sum = array.getSum();
        System.out.println("The sum is " + sum);
    
    }
}