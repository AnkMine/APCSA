// class that holds an int array and can print it or sum it
public class ArrayTest {

    // declare private instance variables
    private int[] numArr;

    // initialization constructor, creates the array and fills it with random numbers
    public ArrayTest(int numArrLength) {
        this.numArr = new int[numArrLength];
        
        // random number 1 to 9 inclusive, math.random times 9 gives 0-8 so +1 shifts it up
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 9) + 1;
        }
    }

    // method that prints all the elements in the array on one line
    public void printArr() {
        System.out.print("\nThe " + numArr.length + " elements are: ");
        // scrolls through each element and prints it on the same line
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }

        System.out.println();
    }

    // method that calculates and returns the sum of all elements in the array
    public int getSum() {
        int sum = 0;
        
        // scrolls through each element and adds it to sum
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }

}