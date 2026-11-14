import javax.swing.JFrame;

// Create a JFrame and add a JPanel to create a rainy day scene
public class Runner {
	public static void main( String[] args ){
		JFrame frame = new JFrame("Rainy Day");
		
		Screen panel = new Screen();
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		panel.animate();
			
	}
}
