public class Runner{
	public static void main(String[] args){
		//(1) Where is Chicken coming from?
		Chicken chicken = new Chicken();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//(2) What is the significance of the variable chicken?
		//(3) Where is speak() coming from and what does it do?
		chicken.speak();
		chicken.speak();
		chicken.speak();     


		Dog.speak();
		Dog.sayName();
		Dog.favColor();

		
		Cat.speak();
		Cat.sayName();
		Cat.favColor();
 	}
 	
}