import java.util.Scanner;
import java.util.Arrays;


public class DeepSpaceCrisisLab { 
    public static void main(String [] args) {

        // question arrays
        // object arrays allow storage or multiple data types

        Object[][] orbitalEasy = {
            {"If a satellite completes 1 orbit every 90 minutes, how many full orbits will it complete in a 24-hour day?", "16", "Incorrect. In 24 hours (1,440 minutes), dividing by 90 gives 16 full orbits!"},
            {"A probe travels at a steady speed of 8 km/s. How far does it travel in 10 seconds?", "80", "Incorrect. Speed times time gives 8 km/s * 10 s = 80 km!"},
            {"If a space station's altitude is 400 km above Earth and the Earth's radius is 6,371 km, what is the station's orbital radius from Earth's center?", "6771", "Incorrect. Add the altitude to Earth's radius: 6,371 + 400 = 6,771 km!"},
            {"An alien ship uses 25% of its fuel tank to reach low orbit. If it started with 800 liters, how many liters are left?", "600", "Incorrect. 25% of 800 is 200 liters used, leaving 600 liters in the tank!"},
            {"A communication satellite needs 3 rockets for positioning. How many total rockets are needed for a constellation of 12 satellites?", "36", "Incorrect. 12 satellites times 3 rockets each equals 36 rockets!"},
            {"If a Martian rover drives 12 meters per hour, how many hours will it take to travel 120 meters across a crater?", "10", "Incorrect. Distance divided by speed gives 120 / 12 = 10 hours!"}
        };


        Object[][] orbitalHard = {
            {"Using Kepler's Third Law (T^2 = a^3), if a distant planet is 4 AU away from its star, what is its orbital period in Earth years?", "8", "Incorrect. 4 cubed is 64, and the square root of 64 gives an orbital period of 8 years!"},
            {"A satellite in a circular orbit has a speed of 7 km/s. How many kilometers does it cover in a single 90-minute orbit?", "37800", "Incorrect. 90 minutes is 5,400 seconds. 7 km/s * 5,400 s = 37,800 km!"},
            {"If Earth's orbital speed is roughly 30 km/s and a comet travels at 42 km/s at the same distance, what is the percentage difference in their speeds relative to Earth's speed?", "40", "Incorrect. The difference is 12 km/s. (12 / 30) * 100 gives a 40% difference!"}
        };

        Object[][] alienEasy = {
            {"Which real planet in our solar system is nicknamed the 'Red Planet' and frequently featured in alien stories?", "Mars", "Incorrect. Mars is known as the Red Planet!"},
            {"In Sci-Fi folklore, what shape are classic alien spacecraft usually reported to be?", "Flying Saucers", "Incorrect. The classic shape is a Flying Saucer (or disc)!"},
            {"What famous 1977 NASA mission sent a Golden Record into space containing sounds and images of Earth for potential aliens?", "Voyager", "Incorrect. The Voyager probes carry the Golden Record!"},
            {"Which satellite or moon in our solar system is famous for having a subsurface ocean often suggested for alien microbial life?", "Europa", "Incorrect. Jupiter's moon Europa is famous for its subsurface ocean!"},
            {"What color are the classic pop-culture aliens often called 'Little ___ Men'?", "Green", "Incorrect. Pop culture often calls them 'Little Green Men'!"},
            {"What hypothetical mega-structure, built around a star by advanced aliens, is designed to harvest all of its energy?", "Dyson Sphere", "Incorrect. That concept is known as a Dyson Sphere!"}
        };

        Object[][] alienHard = {
            {"What is the name of the famous 1961 mathematical equation used to estimate the number of active, communicative alien civilizations in the Milky Way?", "Drake Equation", "Incorrect. It is called the Drake Equation!"},
            {"In 1977, Ohio State University's Big Ear radio telescope picked up a strong 72-second narrow-band signal that remains an unexplained alien candidate. What was it named?", "Wow! Signal", "Incorrect. Astronomer Jerry Ehman wrote 'Wow!' on the printout, naming it the Wow! Signal!"},
            {"What is the name of the interstellar object discovered passing through our solar system in 2017, which some scientists speculated might be an alien lightsail?", "Oumuamua", "Incorrect. The object was named 'Oumuamua!"}
        };

        Object[][] easySet;
        Object[][] hardSet;

        // create scanner object
        Scanner sc = new Scanner(System.in);


        System.out.println("\n---------------" + makeBold("Deep Space Crisis Quiz") + "---------------");

        System.out.println("\n\nPlease choose a mission stream (\"orbital\" or \"alien\"): ");
        String selection = sc.nextLine().trim();

        int scoreCounter = 0;

        if (selection.equalsIgnoreCase("orbital")) {
            easySet = orbitalEasy;
            hardSet = orbitalHard;
        } else if (selection.equalsIgnoreCase("alien")) {
            easySet = alienEasy;
            hardSet = alienHard;
        } else {
            System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch.");
            return;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nQuestion " + (i+1) + ": " + easySet[i][0]);
            System.out.println("Your answer: ");

            if (checkAnswer(equalsIgnoreCase(easySet[i][1]))) {
                System.out.println(makeBold("\t\t\tCorrect!"));
                scoreCounter++;
            } else {
                System.out.println("\t\t\t" + easySet[i][2]);
            }
            

        }

        if (scoreCounter == 3) {

            System.out.println("\nCongrats! You have moved on to more harder questions after completing the above with an acceptable accuracy.\n");

            for (int i = 0; i < 3; i++) {
                System.out.println("\nHard Question " + (i+1) + ": " + hardSet[i][0]);
                System.out.println("Your answer: ");

                if (checkAnswer(equalsIgnoreCase(hardSet[i][1]))) {
                    System.out.println(makeBold("\t\t\tCorrect!"));
                    scoreCounter++;
                } else {
                    System.out.println("\t\t\t" + hardSet[i][2]);
                }
                
            }

        } else {

            for (int i = 3; i < 6; i++) {
                System.out.println("\nQuestion " + (i+1) + ": " + easySet[i][0]);
                System.out.println("Your answer: ");

                if (checkAnswer(equalsIgnoreCase(easySet[i][1]))) {
                    System.out.println(makeBold("\t\t\tCorrect!"));
                    scoreCounter++;
                } else {
                    System.out.println("\t\t\t" + easySet[i][2]);
                }
                

            }
        }

        String[][] grade = {
            {"F", "Mission Failed — Ship lost in deep space"},
            {"F", "Mission Failed — Ship lost in deep space"},
            {"F", "Mission Failed — Ship lost in deep space"},
            {"D", "Critical Systems Damaged"},
            {"C", "Mission Sustained"},
            {"B", "Successful Orbit"},
            {"A", "Flawless Execution — Mission Aced"}
        };

        System.out.println("\n\t\t======================================");

        System.out.println("\t\t\nFinal Mission Score: " + makeBold(scoreCounter + "") + "/6");
        System.out.println("\t\t\t\tGrade: " + makeBold(grade[scoreCounter][0] + "") + "(" + grade[scoreCounter][1] + ")\n");

        sc.close();


    }

    // allows use of nextInt() or nextLine() depending on the type of correctAnswer (int, or str)
    public static boolean checkAnswer(Scanner sc, Object correctAnswer) {
        if (correctAnswer instanceof Integer) { // if correct answer is an integer follow to line 141 if not, go to else if
            try { // allows java to execute code that may give an error
                int userInt = sc.nextInt();
                sc.nextLine();
                return userInt = (Integer) correctAnswer; // return true if the inputed answer by user is correct

            } catch (Exception e) { // this "catches" a possible error and excecute the following lines
                sc.nextLine();
                return false;
            }
        } else if (correctAnswer instanceof String) { // if correct answer is a string, then excecutes following lines, if not goes to the return false; statement
            
            String userInput = sc.nextLine().trim();
            return userInput.equalsIgnoreCase( (String) correctAnswer); // return true if the inputed answer by user is correct
        }
        return false; // if any additions are there to my code, this acts as a fail-safe
    }

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }
}