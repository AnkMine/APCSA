import javax.swing.JFrame;

// this class creates the frame and shows the game window
public class Runner {

    // main method
    public static void main(String[] args) {

        // create the frame object with the game title
        JFrame frame = new JFrame("Cyber Defender");

        // it terminates the program when you close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create panel and add it to the frame
        Screen panel = new Screen();

        frame.add(panel);
        frame.pack();

        // it makes the window visible
        frame.setVisible(true);

    }
}
