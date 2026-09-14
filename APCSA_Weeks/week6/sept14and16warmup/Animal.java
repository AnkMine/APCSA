public class Animal {

    // creates 2 private variables of types String and integers
    private String animalType;
    private int age;

    // this method assigns the private variables
    public void setVariables() {
        animalType = "dog";
        age = 5;
    }

    // this method prints the private variables
    public void printInfo() {
        System.out.println("The " + animalType + " is: " + age + " yrs old.");
    }
}