public class Runner {

    // main method
    public static void main(String [] args) {
        ForTest ftest = new ForTest();

        // declare variable as argument for getFactorial()
        int param = 5;

        // declare fact variable to store return value of getFactorial()
        int fact = ftest.getFactorial(param);

        // prints full sentence with value of "fact"
        System.out.println("The factorial of " + param + " is " + fact + ".");
    }
    
}

// class to return a factorial given an argument
class ForTest {

    public int getFactorial(int arg) {
        int fact = 1;

        // calculates factorial of arg and stores it in integer variable fact
        for(int i = 1; i <= arg; i++) {
            fact *= i;
        }
        return fact;
    }
}

// A for loop is ideal for implementing factorials 
// because the exact number of iterations is known beforehand. 
// This keeps the loop's initialization, condition, and increment organized on a single line.