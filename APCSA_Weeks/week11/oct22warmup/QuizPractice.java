public class QuizPractice {

    // return the factorial of the argument passed in
    public int factorial(int arg) {

        // declaring product variable and assigning it 1
        int product = 1;

        while(arg > 1) { // ensuring no multiplication greater than 1

            // multiplying product by current count value
            product *= arg;

            // subtracting 1 to arg
            arg--;
        }

        // returning the answer
        return product;

    }

    // prints numbers from 5 through the number past in, counting by 5
    public void countUpBy5(int max) {

        // declaring count variable and assigning it 5
        int count = 5;
        do {
            // printing current count value on same line and adding 5 to it
            System.out.print(count + " ");
            count += 5;
        } while (count <= max); // ensuring count is less than parameter of function


        System.out.println();
    }
}