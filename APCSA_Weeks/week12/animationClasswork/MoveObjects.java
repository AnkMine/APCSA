import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


// This code will move a rectangle across the screen, left to right
public class MoveObjects extends JPanel {

    // Instance variables
    private Color skyBlue;
    private static final int PANELW = 800;
	private static final int PANELH = 600;
	private static final int HORIZONY = 350;

    // Constructor
    public MoveObjects() {
        setFocusable(true);
        setLayout(null);

        skyBlue = new Color(79, 163, 238);

    }


    // Set the dimension of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(PANELW,PANELH);
	}


    // Call methods that will draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        
        drawSky(g);
        drawGround(g);

       
	}

    
    public void drawSky(Graphics g) {
        	
            // light sky
			g.setColor(skyBlue);
			g.fillRect(0, 0, PANELW, HORIZONY);
				// sun
			g.setColor(Color.YELLOW);
			g.fillOval(30, 20, 75, 75);
    }

    private void drawGround(Graphics g) {
		g.setColor(grassColor);
		g.fillRect(0, HORIZONY, PANELW, PANELH - HORIZONY);
	}

    /* This runs until you exit your JPanel. A try catch exception handler is needed in case
       an exception is thrown during the pause. Add calls to your move methods 
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
           
            
            /* Repaint the graphics drawn. You MUST have this in your code
              because each time an object is moved, the panel needs to 
              be updated. */
            repaint();
        }
    }
}
