public class Runner {

    public static void main(String[] args) {

        QuizPractice arrObj = new QuizPractice(5);

        arrObj.print();

        int evenNum = arrObj.getEven();
        if (evenNum == -1) {
            System.out.println("An even number wasn't found in the array.");
        } else {
            System.out.println("The last even number in the array was, " + evenNum);
        }
    }
}