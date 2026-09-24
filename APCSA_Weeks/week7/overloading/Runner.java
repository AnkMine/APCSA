public class Runner{
	
	public static void main(String[] args){
		
		// 1. What do the first two lines do? Be specific!
		Overloaded p1 = new Overloaded();
		Overloaded p2 = new Overloaded(16, "John");
		
		// 2. Explain each of the following print lines. Be specific about how the output is calculated.
		p1.print();
		p2.print();
		System.out.println();
		
	    // 3. Explain what update does
		p1.update("Ralph", 25);
		System.out.println();
		
		
        // 4. Explain what the calls to update do
		p2.update(5);
        System.out.println();

		p2.update("Henry");

        // 5. How does the compiler know which update to call?
	}
}
