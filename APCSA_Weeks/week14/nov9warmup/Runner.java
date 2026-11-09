public class Runner {

    public static void main(String[] args) {

        ArrayTest array = new ArrayTest(5);

        array.printArr();

        int sum = array.getSum();
        System.out.println("The sum is " + sum);
    
    }
}