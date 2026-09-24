import javax.swing.JFrame;
import java.util.Scanner;

// Runner that can be used with JPanel Graphics
public class Runner {
	public static void main( String args[] ) {
        
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Scenery Project");

        // Ask the user for a time of day and season
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter 'day' or 'night' : ");
        String timeOfDay = sc.next();
        
        while (!timeOfDay.equalsIgnoreCase("day") && !timeOfDay.equalsIgnoreCase("night")) {
            // no need to clear input buffer
            System.out.print("\n\t\t\t Invalid input. Please enter 'day' or 'night' : ");
            timeOfDay = sc.next();
        }

        System.out.print("\nPlease enter a season 'winter', 'spring', or 'fall' : ");
        String season = sc.next();

        while (!season.equalsIgnoreCase("winter") && !season.equalsIgnoreCase("spring") && !season.equalsIgnoreCase("fall")) {
            // no need to clear input buffer
            System.out.print("\n\t\t\t Invalid input. Please enter 'winter', 'spring', or 'fall' : ");
            season = sc.next();
        }
        
        


        //Create the JPanel object and add it to the frame
        Scenery canvas = new Scenery(timeOfDay, season);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}