import java.util.Scanner;
import java.util.Arrays;


public class DeepSpaceCrisisLab { 
    public static void main(String [] args) {

        // question arrays

        String[][] orbitalEasyQuestions = {
            {"If a satellite completes 1 orbit every 90 minutes, how many full orbits will it complete in a 24-hour day?", "16", "Incorrect. In 24 hours (1,440 minutes), dividing by 90 gives 16 full orbits!"},
            {"A probe travels at a steady speed of 8 km/s. How far does it travel in 10 seconds?", "80 km", "Incorrect. Speed times time gives 8 km/s * 10 s = 80 km!"},
            {"If a space station's altitude is 400 km above Earth and the Earth's radius is 6,371 km, what is the station's orbital radius from Earth's center?", "6771 km", "Incorrect. Add the altitude to Earth's radius: 6,371 + 400 = 6,771 km!"},
            {"An alien ship uses 25% of its fuel tank to reach low orbit. If it started with 800 liters, how many liters are left?", "600", "Incorrect. 25% of 800 is 200 liters used, leaving 600 liters in the tank!"},
            {"A communication satellite needs 3 rockets for positioning. How many total rockets are needed for a constellation of 12 satellites?", "36", "Incorrect. 12 satellites times 3 rockets each equals 36 rockets!"},
            {"If a Martian rover drives 12 meters per hour, how many hours will it take to travel 120 meters across a crater?", "10", "Incorrect. Distance divided by speed gives 120 / 12 = 10 hours!"}
        };

        String[][] orbitalHardQuestions = {
            {"Using Kepler's Third Law (T^2 = a^3), if a distant planet is 4 AU away from its star, what is its orbital period in Earth years?", "8", "Incorrect. 4 cubed is 64, and the square root of 64 gives an orbital period of 8 years!"},
            {"A satellite in a circular orbit has a speed of 7 km/s. How many kilometers does it cover in a single 90-minute orbit?", "37800 km", "Incorrect. 90 minutes is 5,400 seconds. 7 km/s * 5,400 s = 37,800 km!"},
            {"If Earth's orbital speed is roughly 30 km/s and a comet travels at 42 km/s at the same distance, what is the percentage difference in their speeds relative to Earth's speed?", "40%", "Incorrect. The difference is 12 km/s. (12 / 30) * 100 gives a 40% difference!"}
        };

        String[][] AlienEasyQuestions = {
            {"Which real planet in our solar system is nicknamed the 'Red Planet' and frequently featured in alien stories?", "Mars", "Incorrect. Mars is known as the Red Planet!"},
            {"In Sci-Fi folklore, what shape are classic alien spacecraft usually reported to be?", "Flying Saucers", "Incorrect. The classic shape is a Flying Saucer (or disc)!"},
            {"What famous 1977 NASA mission sent a Golden Record into space containing sounds and images of Earth for potential aliens?", "Voyager", "Incorrect. The Voyager probes carry the Golden Record!"},
            {"Which satellite or moon in our solar system is famous for having a subsurface ocean often suggested for alien microbial life?", "Europa", "Incorrect. Jupiter's moon Europa is famous for its subsurface ocean!"},
            {"What color are the classic pop-culture aliens often called 'Little ___ Men'?", "Green", "Incorrect. Pop culture often calls them 'Little Green Men'!"},
            {"What hypothetical mega-structure, built around a star by advanced aliens, is designed to harvest all of its energy?", "Dyson Sphere", "Incorrect. That concept is known as a Dyson Sphere!"}
        };

        String[][] AlienHardQuestions = {
            {"What is the name of the famous 1961 mathematical equation used to estimate the number of active, communicative alien civilizations in the Milky Way?", "Drake Equation", "Incorrect. It is called the Drake Equation!"},
            {"In 1977, Ohio State University's Big Ear radio telescope picked up a strong 72-second narrow-band signal that remains an unexplained alien candidate. What was it named?", "Wow! Signal", "Incorrect. Astronomer Jerry Ehman wrote 'Wow!' on the printout, naming it the Wow! Signal!"},
            {"What is the name of the interstellar object discovered passing through our solar system in 2017, which some scientists speculated might be an alien lightsail?", "'Oumuamua", "Incorrect. The object was named 'Oumuamua!"}
        };

        String[] missionOptions = {
            "orbital",
            "alien"
        }

        String[] missionLevel = {
            "easy",
            "hard"
        }

        // create scanner object
        Scanner sc = new Scanner(System.in);

        String mission = getValidString(sc, "Please enter a mission stream: ", missionOptions);
        String level = getValidString(sc, "Please enter a level: ", missionLevel);

        int score = 0;

        if (mission.equalsIgnoreCase(missionOptions[0])) {

            if (level.equalsIgnoreCase(missionLevel[0])) {
                String [][] selectedQuestions = orbitalEasyQuestions;

                for (int i = 0; i < selectedQuestions; i++) {
                    String question = selectedQuestions[i][0];
                    String correctAnswer = selectedQuestions[i][1];
                    String customWrongMessage = selectedQuestions[i][2];

                    String userInput = getValidString(sc, question);
                    if (userInput.equalsIgnoreCase(correctAnswer)) {
                        score ++;
                        System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                    } else {
                        System.out.println(customWrongMessage);
                    }

                    if (score == 3) {
                        String [][] selectedQuestions = orbitalHardQuestions;

                        for (int i = 0; i < selectedQuestions; i++) {
                            String question = selectedQuestions[i][0];
                            String correctAnswer = selectedQuestions[i][1];
                            String customWrongMessage = selectedQuestions[i][2];

                            String userInput = getValidString(sc, question);
                            if (userInput.equalsIgnoreCase(correctAnswer)) {
                                score ++;
                                System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                            } else {
                                System.out.println(customWrongMessage);
                            }
                        }
                    }
                }

            } else /* missionLevel1 */ {
                String [][] selectedQuestions = orbitalHardQuestions;

                for (int i = 0; i < selectedQuestions; i++) {
                    String question = selectedQuestions[i][0];
                    String correctAnswer = selectedQuestions[i][1];
                    String customWrongMessage = selectedQuestions[i][2];

                    String userInput = getValidString(sc, question);
                    if (userInput.equalsIgnoreCase(correctAnswer)) {
                        score ++;
                        System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                    } else {
                        System.out.println(customWrongMessage);
                    }
                }

            }

        } else /* missionOption1 */ {

            if (level.equalsIgnoreCase(missionLevel[0])) {
                String [][] selectedQuestions = alienEasyQuestions;

                for (int i = 0; i < selectedQuestions; i++) {
                    String question = selectedQuestions[i][0];
                    String correctAnswer = selectedQuestions[i][1];
                    String customWrongMessage = selectedQuestions[i][2];

                    String userInput = getValidString(sc, question);
                    if (userInput.equalsIgnoreCase(correctAnswer)) {
                        score ++;
                        System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                    } else {
                        System.out.println(customWrongMessage);
                    }

                    if (score == 3) {
                        String [][] selectedQuestions = AlienHardQuestions;

                        for (int i = 0; i < selectedQuestions; i++) {
                            String question = selectedQuestions[i][0];
                            String correctAnswer = selectedQuestions[i][1];
                            String customWrongMessage = selectedQuestions[i][2];

                            String userInput = getValidString(sc, question);
                            if (userInput.equalsIgnoreCase(correctAnswer)) {
                                score ++;
                                System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                            } else {
                                System.out.println(customWrongMessage);
                            }
                        }
                    }
                }

            } else /* missionLevel1 */ {
                String [][] selectedQuestions = alienHardQuestions;

                for (int i = 0; i < selectedQuestions; i++) {
                    String question = selectedQuestions[i][0];
                    String correctAnswer = selectedQuestions[i][1];
                    String customWrongMessage = selectedQuestions[i][2];

                    String userInput = getValidString(sc, question);
                    if (userInput.equalsIgnoreCase(correctAnswer)) {
                        score ++;
                        System.out.println("You got it correct! Good job!" + "\nScore: " + score);

                    } else {
                        System.out.println(customWrongMessage);
                    }
                }

            }

        }

        System

    }

    public static int getValidInt(Scanner sc, String promptMessage) {
        int intInput;

        while (true) {

            System.out.print(promptMessage);

            if (sc.hasNextInt()) {
                intInput = sc.nextInt();
            } else {
                System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch...");
                System.exit(1);
            }
        }

        return input;
    }

    // Helper method to check if input is a number
    public static boolean isNumeric(String str) {
        // if there is an error java creates an exception and won't fail
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String getValidString(Scanner sc, String promptMessage, String[] missionChoices) {
        while (true) {

            System.out.print(promptMessage);
            String stringInput = sc.nextLine().trim();

            for (String option : missionChoices) {
                if (stringInput.equalsIgnoreCase(option)) {
                    return stringInput;
                }
            }

            System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch...");
            System.exit(1);

        }
    }
}