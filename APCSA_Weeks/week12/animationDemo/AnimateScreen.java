import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

// This code will move a rectangle across the screen, left to right
public class AnimateScreen extends JPanel {

    // Instance variables
    private Triangle triObj1, triObj2;
   
    // Constructor
    public AnimateScreen() {
       setFocusable(true);
       setLayout(null);
       // instantiate instance variables
       triObj1 = new Triangle(75, 100, new Color(255, 0, 255));
       triObj2 = new Triangle(150, 150, new Color(0, 255, 0));

    }

    // Set the dimension of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

    // Call methods that will draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        triObj1.drawTriangle(g);
        triObj2.drawTriangle(g);
       
	}
    
    /* This runs until you exit your JPanel. A try catch exception handler is needed in case
       an exception is thrown during the pause. Copy this code exactly as is. You will add calls to your methods 
       that move your objects. */
    public void animate(){
        while(true){
            //pause for .01 second
            try {
                Thread.sleep(10);    // 10 milliseconds
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // Add the code that "moves" your objects here.
            triObj1.moveRight();
            triObj2.moveDown();
           
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}
