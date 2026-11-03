public class Runner {

    public static void main(String[] args) {

        ForPractice forObj = new ForPractice();

        forObj.printEven(25);

        int val = forObj.findNum(9, 20, 7);
        ifFound(val);

        val = forObj.findNum(12, 21, 11);
        ifFound(val);
    }

    public static void ifFound(int val) {
        if (val != -1) {
            System.out.println("The number that was found was " + val);
        } else {
            System.out.println("A number was not found");
        }
    }
}

class ForPractice {

    public void printEven(int arg) {
        for(int i = 1; i <= arg; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int findNum(int start, int end, int divisor) {
        int foundValue = -1;
    
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                foundValue = i;
                break; 
            }
        }

        return foundValue;
    }
}