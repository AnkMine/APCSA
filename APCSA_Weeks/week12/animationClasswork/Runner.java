import javax.swing.JFrame;


public class Runner {
	public static void main( String args[] ) {
        
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("Animate Classwork");


        //Create the JPanel object and add it to the frame
         MoveObjects obj = new MoveObjects();


        
        frame.add(obj);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        // Add a call to your animate method


       


        
    }
}
