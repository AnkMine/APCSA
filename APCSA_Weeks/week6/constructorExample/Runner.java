public class Runner {

	public static void main(String args[]) {


                //Comment: this initializes the default constructor in Animal.java and the reference variable is "animal1"
		Animal animal1 = new Animal();
                //Comment: this initializes the initializion constructor in Animal.java, add parameters, and the reference variable is "animal2"
		Animal animal2 = new Animal("cat", 7);
                //Comment: this initializes the initialization construction in Animal.java, adds different parameters, and the reference variable is "animal3"
		Animal animal3 = new Animal("goat", 2);
                //Comment: this initializes the initialization construction in Animal.java, adds different parameters, and the reference variable is "animal3"
        Animal animal4 = new Animal("dog", 10, "Doggy");
		
                //Comment: this uses the reference variable to reference the default constructor and calls the printInfo(); method in Animal.java
		animal1.printInfo();


                //Comment: this uses a reference variable to reference the initialization constructor and calls the setName(); and printInfo(); methods in Animal.java
		animal2.setName("Roco");
		animal2.printInfo();


                //Comment: this uses a reference variable to reference the initialization constructor and calls the setName(); and printInfo(); methods in Animal.java
		animal3.setName("Fluffy");
		animal3.printInfo();

                //Comment: this uses a reference variable to reference the initialization constructor and calls printInfo(); method in Animal.java
        animal4.printInfo();


	}
}
