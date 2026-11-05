public class Runner {

    // main method
    public static void main(String[] args) {

        ForPractice forObj = new ForPractice();

        forObj.printEven(25);

        // finds a number then passes the value returned by findNum(); to ifFound();, same comment applies to both calls
        int val = forObj.findNum(9, 20, 7);
        ifFound(val);

        val = forObj.findNum(12, 21, 11);
        ifFound(val);
    }

    // this method takes in a value and prints whether a number was found or not
    public static void ifFound(int val) {
        if (val != -1) {
            System.out.println("The number that was found was " + val);
        } else {
            System.out.println("A number was not found");
        }
    }
}

// practice class with for loop methods
class ForPractice {

    // prints all even numbers up to arg using a for loop
    public void printEven(int arg) {
        for(int i = 1; i <= arg; i++) {
            // skips odd numbers
            if(i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // finds the first number between start and end divisible by divisor
    public int findNum(int start, int end, int divisor) {
        // -1 means no number found yet
        int foundValue = -1;
    
        for (int i = start; i <= end; i++) {
            // stops loop once first match is found
            if (i % divisor == 0) {
                foundValue = i;
                break; 
            }
        }

        return foundValue;
    }
}