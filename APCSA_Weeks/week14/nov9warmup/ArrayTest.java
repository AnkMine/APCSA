public class ArrayTest {

    private int[] numArr;

    public ArrayTest(int numArrLength) {
        this.numArr = new int[numArrLength];
        
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 9) + 1;
        }
    }

    public void printArr() {
        System.out.print("\nThe " + numArr.length + " elements are: ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }

        System.out.println();
    }

    public int getSum() {
        int sum = 0;
        
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }

}