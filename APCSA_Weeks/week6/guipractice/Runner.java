import javax.swing.JFrame;
public class Runner {

	public static void main( String args[] ) {
        //(1) What parameter is passed to the constructor of JFrame? What does it do?
        JFrame frame = new JFrame("Draw Circle");

        //Create JPanel object and add it to the frame
        Scenery canvas = new Scenery();
        frame.add(canvas);

        //(2) What do you think this command does?
            // it terminates the program when you close the window
		//Comment the code out and test it.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //(3) What happens when you remove the code below?
            // it opens the window, but only has the 3; close, minimize, and full screen buttons
        //Comment the code out and test it.
        frame.pack();

        //(4) What does setVisible do? What happens when you remove the code below?
            // it makes the window visible and if I remove it, the window opens, but you cannot see it
        //Comment the code out and test it.
        frame.setVisible(true);

    }

}
