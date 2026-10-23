import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Pet petObj = new Pet("Garfield", "Cat", 30, 70, false);
        Scanner sc = new Scanner(System.in);


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

        
        int userGameChoice;
        int userChoice;

        while(true) {
            userGameChoice = printGameMenu(sc, gameMenu, petObj);

            if (userGameChoice == 0) {
                break;
            } else if(userGameChoice == 1) {

                userChoice = getValidInt(sc, "Enter the number of miles, between 1 and 5m your pet will walk: ", 1, 5);
                petObj.goOnWalk(userChoice);

            } else if(userGameChoice == 2) {

                userChoice = getValidInt(sc, "Enter an amount between 3 and 10 where a higher number is a more significant meal while a lower is a snack: ", 3, 10);
                petObj.feed(userChoice);

            } else if(userGameChoice == 3) {

                userChoice = getValidInt(sc, "Enter the number of minutes, between 10 and 20, you want your pet to play: ", 10, 20);
                petObj.play(userChoice);

            } else if(userGameChoice == 4) {

                petObj.toggleSleep();
                
            } else if(userGameChoice == 5) {    
                  
                petObj.getStatus();
                
            } else if(userGameChoice == 6) {

                userChoice = getValidInt(sc, "Enter a number, between 1 and 5, indicating the severity of the visit: ", 1, 5);
                petObj.vetVisit(userChoice);

            } else if(userGameChoice == 7) {
                
                petObj.takePhoto();

            } // no need for else as error-handling is already complete

            boolean care = petObj.needsCare();
            if (care) {
                System.out.println("\n\n\t\t\tYOUR PET NEEDS IMMEDIATE ATTENTION!!");
            }

            System.out.println("\nPlease press Enter to return to the menu: ");
            sc.nextLine();
        }

        System.out.println("\n\n" + petObj.getStatus());
        System.out.println("\n\n\n\t\t\tThanks for playing!\n\n");
        sc.close();
    }

    public static int getValidInt(Scanner sc, String propmt, int min, int max) {
        int choice;
        
        do {
            System.out.println(propmt);

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();

                if ((choice >= min && choice <= max) || (min == max)) {
                    return choice;
                }

            } else {
                sc.nextLine();
            }

            if (min == max) {
                System.out.println("\t\t\tError. Please enter a valid integer ");
            } else {
                System.out.println("\t\t\tError. Please enter a valid integer between: " + min + " and " + max);
            }

        } while(true);
    }

    public static int printGameMenu(Scanner sc, String[] gameMenu, Pet petObj) {

        System.out.println("\n-------------Virtual Pet Simulator-------------");
        System.out.println("\n\nYou now have a new pet! You can do many things with your pet! Look at the menu below and folow the instructions and your pet's stats: \n\n\n");
        System.out.println(petObj.getStatus() + "\n\n\n");
        
        for(int i = 0; i < gameMenu.length; i++) {
            System.out.println(i + ") " + gameMenu[i]);
        }

        return getValidInt(sc, "\n\nEnter a number 0-7 depending on the above menu option you choose: ", 0, 7);

    }
}