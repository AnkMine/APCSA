public class LoopError {

    public static void main(String[] args) {


        // generate a random number between 5 and 25 inclusive
        int rand = (int)(Math.random()*21) + 5;
        System.out.println(rand);
        // Use a do while loop to add up all of the numbers from 1 to the random number, inclusive
        System.out.print("The sum of the numbers from 1 to " + rand + " are ");
        int sum = 0;
        do {
            sum += rand;
            rand--;
        } while (rand >= 1);


        System.out.println(sum);
    }
}