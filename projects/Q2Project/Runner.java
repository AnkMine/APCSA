import javax.swing.JFrame;

// this class creates the frame and shows the game window
public class Runner {

    // main method
    public static void main(String[] args) {


        JFrame frame = new JFrame("Cyber Defender");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Screen panel = new Screen();

        frame.add(panel);
        frame.pack();


        frame.setVisible(true);

    }
}
