import javax.swing.JFrame;


public class Runner {
  
	public static void main(String[] args) {


		JFrame frame = new JFrame("KeyListener Demo");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create panel and add it to the frame
		Screen panel = new Screen();
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
    }
}
