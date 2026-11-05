import javax.swing.JFrame;


public class Runner { 


	// main method
	public static void main(String args[]){


		// creates the frame, adds the drawing panel, and shows the window
		JFrame frame = new JFrame("Slot Machine");
		 
		Screen sc = new Screen();
		frame.add(sc);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		 
	}
}
