public class Animal {
	private String animalType, animalName = "no name";
	private int age;
	
	//default constructor that initializes animalType and age
	public Animal() {
		animalType = "dog";
		age = 5;
	}
	
	//initialization constructor that accepts parameters to initialize animalType and age
	public Animal(String animalT, int animalAge) {
		animalType = animalT;
		age = animalAge;
	}

    public Animal(String animalType, int age, String animalName) {
        this.animalType = animalType;
        this.age = age;
        this.animalName = animalName;
        
    }
	
	//set animalName to the passed in parameter
	public void setName(String name) {
		animalName = name;
	}
	
	// Print the animal type and age
	public void printInfo() {
		System.out.println("The animal's type is " + animalType + ".");
		System.out.println("The animal's age is " + age + ".");
		System.out.println("The animal's name is " + animalName + ".\n");
	}
}