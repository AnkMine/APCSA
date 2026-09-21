public class Profile {

    // private instance variables
    private String name;
    private int age;

    // this is default constructor (no parameters)
    public Profile() {
        this.name = "John";
        this.age = 15;
    }

    // this is the initialization constructor that takes in a new name and age as parameters
    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // this public void method takes in the id as a parameter and calls printVars
    public void printInfo(int id) {
        System.out.print("ID:" + id);
        printVars();
    }


    // this private void method prints the instance variables
    private void printVars() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}