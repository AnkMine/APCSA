// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		// The output is "'newline' 'newline' Test1 [cursor on new line]" 
		// We then declare an integer 'i' and assign it to 0, 
		// we then check if it is greater than 10 then follow code in for-block (print value of "i" and then print a space)
		// then add 1 to i, following the step, then check if i is less than 10
		// then follow code in for-block (print value of "i" and then print a space)
		// we repeat steps 8/9 until the condition (i<10) is false and then we print a newline
		System.out.println("\n\nTest1");
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		// The output is "'newline' 'newline' Test2 [cursor on new line]" 
		// We then declare an integer 'i' and assign it to 15
		// we then check if it is greater than 2 then follow code in for-block (print value of "i" and then print a space)
		// then subtract 1 from i, following the step, then check if i is greater than 2
		// then follow code in for-block (print value of "i" and then add a space)
		// we repeat steps 21/22 until the condition (i>2) is false and then we print a newline
		System.out.println("\n\nTest2");
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		// The output is "'newline' 'newline' Test3 [cursor on new line]"
		// We then declare an integer 'i' and assign it to 0
		// we then check if it is less than or equal to a parameter 'max' then follow code in for-block (print value of "i" and then print a space)
		// then add 5 to i, following the step, then check if i less than or equal to 'max'
		// then follow code in for-block (print value of "i" and then add a space)
		// we repeat steps 35/36 until the condition (i<=max) is false and then we print a newline
		System.out.println("\n\nTest3");
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		// The output is "'newline' 'newline' Test4 [cursor on new line]"
		// We then declare an integer 'i' and assign it to parameter 'max'
		// we then check if it is greater than parameter 'min' then follow code in for-block (print value of "i" and then print a space)
		// then subtract 2 from i, following the step, then check if i greater than parameter 'min'
		// then follow code in for-block (print value of "i" and then add a space)
		// we repeat steps 49/50 until the condition (i>min) is false and then we print a newline
		System.out.println("\n\nTest4");
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	// We use a for-loop when we want to print stuff multiple times with less lines of code. Let's say we want to draw a row of grass, 
	// instead of having lots of drawLine(); with confusing numbers, we could have a for loop which is simpler to read, and position the object around faster

}