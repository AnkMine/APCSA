import java.util.Scanner;

// this class runs an item list menu in terminal
public class Runner {


    // main method
    public static void main(String[] args) {

        // creates array of Item objects with 8 slots
        Item[] itemArray = new Item[8];

        // creates and stores each item in the array
        itemArray[0] = new Item("Book", 25.99);
        itemArray[1] = new Item("Mouse", 15.49);
        itemArray[2] = new Item("Headphones", 104.99);
        itemArray[3] = new Item("Computer", 2897.55);
        itemArray[4] = new Item("Water Bottle", 35.55);
        itemArray[5] = new Item("Keyboard", 45.95);
        itemArray[6] = new Item("Watch", 65.79);
        itemArray[7] = new Item("Chair", 9.89);

        Scanner sc = new Scanner(System.in);
        // creates and assigns boolean for handling while loop functions
        boolean running = true;
        // game loop
        while(running) {
            // gets menu choice from user using helper method
            int choice = getUserMenuChoice(sc);
            // if user chose to quit program
            if (choice == 4) { 
                System.out.println("Goodbye");
                running = false;

            // prints all items in the array
            } else if (choice == 1) {
                for(int i = 0; i < itemArray.length; i++) {
                    System.out.println("Item Name: " + itemArray[i].getName() + "\tPrice: " + itemArray[i].getPrice());
                }
                

            // finds item by price
            } else if (choice == 2) {
                System.out.println("\nGive me a price in the form of (xx.xx) for an item: ");
                while(!sc.hasNextDouble()) {
                    sc.next();
                    System.out.println("\t\t\tError! Enter an price in the form of (xx.xx)!!!");
                    System.out.print("\nGive me a price in the form of (xx.xx) for an item: ");
                }
                
                double userPrice = sc.nextDouble();
                sc.nextLine();

                // found flag tracks whether a matching item was printed
                boolean found = false;
                for (Item item : itemArray) {
                    if (userPrice == item.getPrice()) {
                        System.out.println("Item Name: " + item.getName() + "\tPrice: " + item.getPrice());
                        found = true;
                    }
                }

                // if no item matched the price print below:
                if(!found) {
                    System.out.println("No item found with the price: " + userPrice);
                }

            // finds item by name
            } else if (choice == 3) {
                System.out.print("\nGive me a name for an item: ");
                String userName = sc.next();
                sc.nextLine();

                boolean found = false;
                for (Item item: itemArray) {
                    if (userName.equals(item.getName())) {
                        System.out.println("Item Name: " + item.getName() + "\tPrice: " + item.getPrice());
                        found = true;
                    }
                }

                // if no item matched the name print the below:
                if(!found) {
                    System.out.println("No item found with the name: " + userName);
                }
            }
        }

        sc.close();
    }
 
    // this method takes in a Scanner and ensures the user enters a valid menu choice
    public static int getUserMenuChoice(Scanner sc) {
        // contains all the menu choices to be printed out
        String[] choices = {
            "Print Items",
            "Find Items by Price",
            "Find Items by Name",
            "Exit the program"
        };

        System.out.println("\n\tItem List: \n");
        // prints menu choices 1-4
        for(int i = 1; i < choices.length+1; i++) {
            System.out.println("\t" + i + ": " + choices[i-1]);
        }

        System.out.print("\nType an integer (1-4) based on the menu above: ");
        // ensures user input is an int and the int is in between 1-4
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.println("\t\t\tError! Enter an integer (1-4)!!!");
            System.out.print("\nType an integer (1-4) based on the menu above: ");
        }

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
}