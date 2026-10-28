public class Runner {

    public static void main(String[] args) {

        int total = 0;

		for(int r=0; r<2; r++) {

		   for(int c=1; c<2; c++)  {
		      total+=2; 
             }
		}
		System.out.println(total);

    }

    // it runs 'r' 2 times and 'c' 1 time, adding '2' to total each time (2times of adding 2 is 4)
}