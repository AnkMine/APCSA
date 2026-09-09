public class Runner{

	public static void main(String[] args){
		//(1) Where is Chicken coming from?
			// Chicken class in Chicken.java
		Chicken chicken = new Chicken();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//(2) What is the significance of the variable chicken?
			// creating an instance of the Chicken class
	
		//(3) Where is speak() coming from and what does it do?
			// from the class Chicken in Chicken.java

		chicken.speak();
		chicken.speak();
		chicken.speak();     


		dog.speak();
		dog.sayName();
		dog.favColor();

		
		cat.speak();
		cat.sayName();
		cat.favColor();

 	}
 	
}