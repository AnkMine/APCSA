public class Animal {

    // creates 2 private variables of types String and integers
    private String animalType;
    private int age;

    // this method assigns the private variables
    public void setVariables(String type, int ageVar) {
        animalType = type;
        age = ageVar;
    }

    // this method prints the private variables
    public void printInfo() {
        System.out.println("\nThe " + animalType + " is: " + age + " yrs old.");
    }
}