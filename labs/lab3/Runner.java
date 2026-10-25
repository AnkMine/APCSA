// import scanner class
import java.util.Scanner;

// this class runs the virtual pet simulator in terminal
public class Runner {

    // main method
    public static void main(String[] args) {

        // creates pet object and scanner
        String petName = "Garfield";
        Pet petObj = new Pet(petName, "Cat", 30, 70, false);
        Scanner sc = new Scanner(System.in);


        // contains all the menu choices to be printed out
        String[] gameMenu = {
            "Exit",
            "Take your pet for a walk",
            "Feed your pet",
            "Play with your pet",
            "Wake up your pet or have a pet go to sleep",
            "Get the status of your pet",
            "Take your pet to the vet",
            "A photo of your pet"
        };

        
        // game control vars
        int userGameChoice;
        int userChoice;
        boolean running = true;

        // game loop
        while(running) {
            userGameChoice = printGameMenu(sc, gameMenu, petObj);

            // handles menu choice from user
            if (userGameChoice == 0) {
                running = false;
            } else {

                // walks pet
                if(userGameChoice == 1) {

                    userChoice = getValidInt(sc, "Enter the number of miles, between 1 and 5, your pet will walk: ", 1, 5);
                    petObj.goOnWalk(userChoice);

                // feeds pet
                } else if(userGameChoice == 2) {

                    userChoice = getValidInt(sc, "Enter an amount between 3 and 10 where a higher number is a more significant meal while a lower is a snack: ", 3, 10);
                    petObj.feed(userChoice);

                // plays with pet
                } else if(userGameChoice == 3) {

                    userChoice = getValidInt(sc, "Enter the number of minutes, between 10 and 20, you want your pet to play: ", 10, 20);
                    boolean played = petObj.play(userChoice);
                    if (!played) {
                        System.out.println("\n" + petObj.makeBold(petName) + "refused to play because they are either sleeping or too hungry!");
                    } else {
                        System.out.println("\nYou played with " + petObj.makeBold(petName));
                    }

                // toggles pet sleep
                } else if(userGameChoice == 4) {

                    petObj.toggleSleep();
                    
                // gets pet status
                } else if(userGameChoice == 5) {
                    
                    System.out.println(petObj.getStatus());
                    
                // sends pet to vet
                } else if(userGameChoice == 6) {

                    userChoice = getValidInt(sc, "Enter a number, between 1 and 5, indicating the severity of the visit: ", 1, 5);
                    petObj.vetVisit(userChoice);

                // shows pet photo
                } else if(userGameChoice == 7) {
                    
                    petObj.takePhoto();

                }


                // checks if pet needs attention after action
                boolean care = petObj.needsCare();
                if (care) {
                    System.out.println("\n\n\t\t\tYOUR PET NEEDS IMMEDIATE ATTENTION!!");
                }

                // waits for user to return to menu
                System.out.println("\nPlease press Enter to return to the menu: ");
                sc.nextLine();
            } // no need for else as error-handling is already complete

            
        }

        // prints final status and quits program
        System.out.println("\n\n" + petObj.getStatus());
        System.out.println("\n\n\n\t\t\tThanks for playing!\n\n");
        sc.close();
    }

    // this method takes in a Scanner, prompt, min, and max and ensures the user enters a valid int
    public static int getValidInt(Scanner sc, String prompt, int min, int max) {
        // stores user choice and valididty flag
        int choice = 0;
        boolean isValid = false;
        
        // loops until valid integer is entered
        while (!isValid) {
            System.out.println(prompt);

            // checks if input is an int
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();

                // checks if choice is within range
                if ((choice >= min && choice <= max) || (min == max)) {
                    isValid = true;
                }

            } else {
                // clears invalid input
                sc.nextLine();
            }

            
            // prints error if input is still invalid
            if (!isValid) {
                if (min == max) {
                    System.out.println("\t\t\tError. Please enter a valid integer ");
                } else {
                    System.out.println("\t\t\tError. Please enter a valid integer between: " + min + " and " + max);
                }
            }
        }

        return choice;
    }


    // prints game menu and returns valid menu choice
    public static int printGameMenu(Scanner sc, String[] gameMenu, Pet petObj) {

        System.out.println(petObj.makeBold("\n-------------Virtual Pet Simulator-------------"));
        System.out.println("\n\nYou now have a new pet! You can do many things with your pet! Look at the menu below and folow the instructions and your pet's stats: \n\n\n");
        System.out.println(petObj.getStatus() + "\n\n\n");
        
        // prints each menu option
        for(int i = 0; i < gameMenu.length; i++) {
            System.out.println(petObj.makeBold(i + ") ") + gameMenu[i]);
        }

        // asks user for valid menu choice
        return getValidInt(sc, "\n\nEnter a number 0-7 depending on the above menu option you choose: ", 0, 7);

    }
}