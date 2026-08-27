// import java Scanner class
import java.util.Scanner;

public class TriviaGame {

    public static void main(String[] args) {
        // create new scanner object
        Scanner sc = new Scanner(System.in);

        // declares score and assigns it 0
        int score = 0;

        // creates questions array
        String[] questions = {
            "What is the capital of France",
            "What is the scientific name of the Northern Light?",
            "What is the closest planet to the Sun?",
            "What type of celestial body is Pluto currently classified as?",
            "Do humans breath oxygen?",
            "Who wrote the tragedy play Romeo and Juliet?"
        };

        // makes an array with the answers to the questions
        String[] answers = {
            "paris",
            "aurora borealis",
            "mercury",
            "dwarf planet",
            "yes",
            "william shakespeare"
        };

        // scrolls through each question, asks user for input, and checks the input with the answer
        for(int i = 0; i < questions.length; i++) {
            // prints the question
            System.out.println("\n" + questions[i]);
            System.out.println("\nYour answer is: ");
            
            // asks user for answer and makes sure input buffer only has answer in lowerCase
            String userAnswer = sc.nextLine().trim().toLowerCase();

            //checks if answer is correct or wrong

            if (userAnswer.equals(answers[i])) {
                // if answer is correct print below:

                System.out.println("\nYou got it right! Good job!");
                score ++;
                System.out.println(makeBold("\nScore: ") + score);

            } else {
                // if answer is wrong print the below:
                System.out.println("\nSorry, the answer was wrong. The correct answer was: " + makeBold(answers[i] + ""));
                System.out.println(makeBold("\nScore: ") + score);
            }
        }

        //prints final score
        System.out.println("\nYour final score was: " + makeBold(score + "\n"));
        System.out.println("Good job!");

        sc.close();

    }

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }
}