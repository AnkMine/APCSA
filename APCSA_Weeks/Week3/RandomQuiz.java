import java.util.Arrays;
import java.util.Scanner;

public class RandomQuiz {

    public static void main(String[] args) {
        
        // this array is for all questions conversion related
        // contains answers and custonWrongmessages for each question
        String[][] conversion = {
            {"Binary to base-10: What is 101 in base-10?", "5", "Incorrect! 101 in binary is 1100101."},
            {"Fahrenheit to Celsius: What is 32F in Celsius?", "0", "Incorrect! 32°F is the freezing point of water, which is 0°C."},
            {"Mile to Kilometers: How many KM is 1 Mile (rounded to nearest whole number)?", "1", "Incorrect! 1 mile is approximately 1.61 km (1 rounded)."}
        };

        // this array is for all questions trivia related
        // contains answers and custonWrongmessages for each question
        String[][] trivia = {
            {"Video Game: What mascot is known as the Blue Blur?", "Sonic", "Incorrect! The fast blue hedgehog is Sonic."},
            {"History: In which year did World War II end?", "1945", "Incorrect! WWII ended in 1945."},
            {"Celebrity: What is the real name of the pop star Lady Gaga?", "Stefani", "Incorrect! Lady Gaga's real name is Stefani Joanne Angelina Germanotta."},
            {"Music: Which British rock band sang 'Bohemian Rhapsody'?", "Queen", "Incorrect! 'Bohemian Rhapsody' was written and performed by Queen."}
        };

        // this array for ALL questions
        String [][] bothLists = new String[conversion.length + trivia.length][3];

    
        // these lines copy the data in the conversion and trivia arrays into the bothLists array
        System.arraycopy(conversion, 0, bothLists, 0, conversion.length);
        System.arraycopy(trivia, 0, bothLists, conversion.length, trivia.length);

        // this line declares a new scanner object
        Scanner sc = new Scanner(System.in);

        // this creates a selected question for the user
        String[][] selectedQuestions;

        // Pick type of questions based on user input
        while (true) {
            // makes sure the user has a valid input (a number)
            int userAnswer = getValidInt(sc, "Enter 1 for Conversions, 2 for Trivia, 3 for Both: ");

            // depending on user input, decide what lines of code to excecute
            if (userAnswer == 1) {
                selectedQuestions = conversion;
                break;
            } else if (userAnswer == 2) {
                selectedQuestions = trivia;
                break;
            } else if (userAnswer == 3) {
                selectedQuestions = bothLists;
                break;
            } else {
                System.out.println("Please enter 1, 2, or 3.");
                continue;
            }
        }

        // declares score variable as 0 and integer
        int score = 0;

        // a for loop to scroll through questions, allow for user input
        // prints congrats or incorrect message for each question based on user input
        for (int i = 0; i < selectedQuestions.length; i++) {
            // declares variables with value of the current question, correct answer, or incorrect message
            String question = selectedQuestions[i][0];
            String correctAnswer = selectedQuestions[i][1];
            String customWrongMessage = selectedQuestions[i][2];

            String userResponse;

            if (isNumeric(correctAnswer)) {
                // Use getValidInt for numeric questions
                int numericInput = getValidInt(sc, "\n" + question + "\nYour answer (number): ");
                userResponse = String.valueOf(numericInput);
            } else {
                // Use sc.next() for single-word questions
                System.out.println("\n" + question);
                System.out.print("Your answer (text): ");
                userResponse = sc.next();
            }

            // prints the question and asks the user for an answer
            System.out.println("\n" + question);
            System.out.print("Your answer: ");
            String userResponse = sc.next();

            // Compare user answer, making sure case does not matter in answer
            if (userResponse.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println(customWrongMessage);
            }
        }

        System.out.println("\nQuiz finished! Your score: " + score + "/" + selectedQuestions.length);
        
    }


    // Helper method to check if a String is a number
    public static boolean isNumeric(String str) {
        // if there is an error java creates an exception and won't fail
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getValidInt(Scanner scanner, String promptMessage) {
        System.out.print(promptMessage);
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter a whole number.");
            scanner.next();
            System.out.print(promptMessage);
        }
        return scanner.nextInt();
    }

}