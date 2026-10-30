import javax.swing.JFrame;

public class Runner {
	public static void main( String args[] ) {
        
        // Create the frame object. Give it a title appropriate to the application
        JFrame frame = new JFrame("");

        //Create the JPanel object and add it to the frame
        AnimateScreen canvas = new AnimateScreen();

        
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        canvas.animate();

       

        
    }
}