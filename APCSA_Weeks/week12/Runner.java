public class Runner {

    public static void main(String [] args) {
        ForTest ftest = new ForTest();

        int param = 5;
        int fact = ftest.getFactorial(param);

        System.out.println("The factorial of " + param + " is " + fact + ".");
    }
    
}

class ForTest {

    public int getFactorial(int arg) {
        int fact = 1;
        for(int i = 1; i <= arg; i++) {
            fact *= i;
        }
        return fact;
    }
}

// A for loop is the best choice for 
// implementing a factorial because the exact number of iterations needed is already known beforehand
// allowing the initialization, condition, and increment in a single line of code