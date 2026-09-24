// practice with overloaded methods and the 'this' keyword
public class Overloaded{
        // instance variables
	private int age;
	private String name;
	
        // constructors that initialize instance variables
	public Overloaded(){
		this.age = 0;
		this.name = "blank";
	}
	

	public Overloaded(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	// print the instance variables
	public void print() {
			System.out.print("The name is " + name);
			System.out.println(" and the age is " + age);
	}

    // overloaded update that allows user to update the instance variables
	public void update(String name, int age){
		this.name = name;
		this.age = age;
		this.print();

	}
	
    // overloaded update that allows user to update the age instance variable
	public void update(int age){
		this.age = age;
		print();
    }
	
    // overloaded update that allows user to update the name instance variable
	public void update(String name){
		this.name = name;
		print();
	}

}
