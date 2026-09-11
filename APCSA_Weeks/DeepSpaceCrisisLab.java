import java.util.Scanner;
import java.util.Arrays;


public class DeepSpaceCrisisLab { 
    public static void main(String [] args) {

        // question arrays
        // object arrays allow storage or multiple data types

        Object[][] orbitalEasy = {
            {"If a satellite completes 1 orbit every 90 minutes, how many full orbits will it complete in a 24-hour day?", 16, "Incorrect. In 24 hours (1,440 minutes), dividing by 90 gives 16 full orbits!"},
            {"A probe travels at a steady speed of 8 km/s. How far does it travel in 10 seconds?", 80, "Incorrect. Speed times time gives 8 km/s * 10 s = 80 km!"},
            {"If a space station's altitude is 400 km above Earth and the Earth's radius is 6,371 km, what is the station's orbital radius from Earth's center?", 6771, "Incorrect. Add the altitude to Earth's radius: 6,371 + 400 = 6,771 km!"},
            {"An alien ship uses 25% of its fuel tank to reach low orbit. If it started with 800 liters, how many liters are left?", 600, "Incorrect. 25% of 800 is 200 liters used, leaving 600 liters in the tank!"},
            {"A communication satellite needs 3 rockets for positioning. How many total rockets are needed for a constellation of 12 satellites?", 36, "Incorrect. 12 satellites times 3 rockets each equals 36 rockets!"},
            {"If a Martian rover drives 12 meters per hour, how many hours will it take to travel 120 meters across a crater?", 10, "Incorrect. Distance divided by speed gives 120 / 12 = 10 hours!"}
        };


        Object[][] orbitalHard = {
            {"Using Kepler's Third Law (T^2 = a^3), if a distant planet is 4 AU away from its star, what is its orbital period in Earth years?", 8, "Incorrect. 4 cubed is 64, and the square root of 64 gives an orbital period of 8 years!"},
            {"A satellite in a circular orbit has a speed of 7 km/s. How many kilometers does it cover in a single 90-minute orbit?", 37800, "Incorrect. 90 minutes is 5,400 seconds. 7 km/s * 5,400 s = 37,800 km!"},
            {"If Earth's orbital speed is roughly 30 km/s and a comet travels at 42 km/s at the same distance, what is the percentage difference in their speeds relative to Earth's speed?", 40, "Incorrect. The difference is 12 km/s. (12 / 30) * 100 gives a 40% difference!"}
        };

        Object[][] alienEasy = {
            {
                "Which real planet in our solar system is nicknamed the 'Red Planet' and frequently featured in alien stories?",
                "Mars",
                new String[]{"Venus", "Mars", "Jupiter", "Saturn"},
                "Incorrect. Mars is known as the Red Planet!"
            },
            {
                "In Sci-Fi folklore, what shape are classic alien spacecraft usually reported to be?",
                "Flying Saucers",
                new String[]{"Pyramids", "Cubes", "Flying Saucers", "Spheres"},
                "Incorrect. The classic shape is a Flying Saucer (or disc)!"
            },
            {
                "What famous 1977 NASA mission sent a Golden Record into space containing sounds and images of Earth for potential aliens?",
                "Voyager",
                new String[]{"Apollo", "Voyager", "Hubble", "Pioneer"},
                "Incorrect. The Voyager probes carry the Golden Record!"
            },
            {
                "Which satellite or moon in our solar system is famous for having a subsurface ocean often suggested for alien microbial life?",
                "Europa",
                new String[]{"The Moon", "Titan", "Europa", "Phobos"},
                "Incorrect. Jupiter's moon Europa is famous for its subsurface ocean!"
            },
            {
                "What color are the classic pop-culture aliens often called 'Little ___ Men'?",
                "Green",
                new String[]{"Blue", "Red", "Green", "Purple"},
                "Incorrect. Pop culture often calls them 'Little Green Men'!"
            },
            {
                "What hypothetical mega-structure, built around a star by advanced aliens, is designed to harvest all of its energy?",
                "Dyson Sphere",
                new String[]{"Dyson Sphere", "O'Neill Cylinder", "Ringworld", "Stanford Torus"},
                "Incorrect. That concept is known as a Dyson Sphere!"
            }
        };

        Object[][] alienHard = {
            {
                "What is the name of the famous 1961 mathematical equation used to estimate the number of active, communicative alien civilizations in the Milky Way?",
                "Drake Equation",
                new String[]{"Fermi Paradox", "Drake Equation", "Kardashev Scale", "Hawking Formula"},
                "Incorrect. It is called the Drake Equation!"
            },
            {
                "In 1977, Ohio State University's Big Ear radio telescope picked up a strong 72-second narrow-band signal that remains an unexplained alien candidate. What was it named?",
                "Wow! Signal",
                new String[]{"Arecibo Message", "Wow! Signal", "Seti Prime", "Cosmic Beacon"},
                "Incorrect. Astronomer Jerry Ehman wrote 'Wow!' on the printout, naming it the Wow! Signal!"
            },
            {
                "What is the name of the interstellar object discovered passing through our solar system in 2017, which some scientists speculated might be an alien lightsail?",
                "'Oumuamua",
                new String[]{"Borisov", "'Oumuamua", "Ceres", "Halley"},
                "Incorrect. The object was named 'Oumuamua!"
            }
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
            printQuestion(easySet[i], i + 1);

            if (checkAnswer(sc, easySet[i])) {
                System.out.println(makeBold("\t\t\tCorrect!"));
                scoreCounter++;
            } else {
                System.out.println("\t\t\t" + easySet[i][easySet[i].length - 1]);
            }
        }


        if (scoreCounter == 3) {
            System.out.println("\nCongrats! You have moved on to harder questions after completing the above with acceptable accuracy.\n");

            for (int i = 0; i < 3; i++) {
                printQuestion(hardSet[i], i + 1);

                if (checkAnswer(sc, hardSet[i])) {
                    System.out.println(makeBold("\t\t\tCorrect!"));
                    scoreCounter++;
                } else {
                    System.out.println("\t\t\t" + hardSet[i][hardSet[i].length - 1]);
                }
            }
        } else {
            for (int i = 3; i < 6; i++) {
                printQuestion(easySet[i], i + 1);

                if (checkAnswer(sc, easySet[i])) {
                    System.out.println(makeBold("\t\t\tCorrect!"));
                    scoreCounter++;
                } else {
                    System.out.println("\t\t\t" + easySet[i][easySet[i].length - 1]);
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

    // this prints the multiple choice questions by checking length of question array to ensure only the letters are printed for multiple choice questions
    public static void printQuestion(Object[] questionRow, int questionNum) {

        System.out.println("\nQuestion " + questionNum + ": " + questionRow[0]);

        if (questionRow.length > 3 && questionRow[2] instanceof String[]) {
            String[] options = (String[]) questionRow[2];
            char optionChar = 'A';
            for (String option : options) {
                System.out.println("   " + optionChar + ") " + option);
                optionChar++;
            }
        }
        System.out.print("Your answer: ");
    }

    // allows use of nextInt() or nextLine() depending on the type of correctAnswer (int, or str)
    public static boolean checkAnswer(Scanner sc, Object[] questionRow) {

        Object[] correctAnswer = questionRow[1];



        if (correctAnswer instanceof Integer) { // if correct answer is an integer follow to line 141 if not, go to else if
            try { // allows java to execute code that may give an error
                int userInt = sc.nextInt();
                sc.nextLine();
                return userInt = (Integer) correctAnswer; // return true if the inputed answer by user is correct

            } catch (Exception e) { // this "catches" a possible error and excecute the following lines
                sc.nextLine();
                return false;
            }
        }


        if (correctAnswer instanceof String) { // if correct answer is a string, then excecutes following lines, if not goes to the return false; statement
            
            String userInput = sc.nextLine().trim();
            return userInput.equalsIgnoreCase( (String) correctAnswer); // return true if the inputed answer by user is correct
        }

        // Checks for letter choices on multiple-choice questions
        if (questionRow.length > 3 && questionRow[2] instanceof String[]) {
            String[] options = (String[]) questionRow[2];

            if (userInput.length() == 1) {
                char choice = Character.toUpperCase(userInput.charAt(0));
                int optionIndex = choice - 'A';
                if (optionIndex >= 0 && optionIndex < options.length) {
                    return options[optionIndex].equalsIgnoreCase((String) correctAnswer);
                }
            }
        }

        
        
        // Checks direct string matches if the user types out the full option
        return userInput.equalsIgnoreCase((String) correctAnswer);
    }

    

    //creating a helper method to assist with bolding text
    public static String makeBold(String text) {
        String boldCode = "\033[1m";
        String resetCode = "\033[0m";
        return boldCode + text + resetCode;
    }
}