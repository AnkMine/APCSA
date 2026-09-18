// import java Scanner class
import java.util.Scanner;


// main runner class
public class Runner {

    // main method
    public static void main(String [] args) {

        // instantiate new Scanner object
        Scanner sc = new Scanner(System.in);

        // creates 2 new instances of Animal class
        Animal aObj1 = new Animal();
        Animal aObj2 = new Animal();

        // asks user for input of "animalType1" and "animalAge"
        System.out.println("Enter the animal type: ");
        String animalType1 = sc.nextLine();

        System.out.println("Enter the age of the animal: ");
        int animalAge = sc.nextInt();

        // calls methods using instances of Animal classes
        aObj1.setVariables(animalType1, animalAge);
        aObj1.printInfo();

        aObj2.setVariables("Horse", 7);
        aObj2.printInfo();

        System.out.println();

        
    }
}