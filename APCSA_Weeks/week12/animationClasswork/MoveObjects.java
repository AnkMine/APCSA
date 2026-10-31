import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


// This code will move a rectangle across the screen, left to right
public class MoveObjects extends JPanel {

    // Instance variables
    private Color skyBlue;
    private Color grassGreen;
    private static final int PANELW = 800;
	private static final int PANELH = 600;
	private static final int HORIZONY = 350;
    private int cloud1X = 200;
    private int cloud2X = 500;

    // Constructor
    public MoveObjects() {
        setFocusable(true);
        setLayout(null);

        skyBlue = new Color(79, 163, 238);
        grassGreen = new Color(93, 178, 77);

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
		g.setColor(grassGreen);
		g.fillRect(0, HORIZONY, PANELW, PANELH - HORIZONY);
	}

    private void drawClouds(Graphics g) {
        g.setColor(Color.WHITE);
        

        g.fillOval(cloud1X, 100, 60, 40);
        g.fillOval(cloud1X + 25, 85, 70, 50);
        g.fillOval(cloud1X + 65, 95, 60, 40);
        g.fillRect(cloud1X + 25, 115, 75, 25);


        g.fillOval(cloud2X, 150, 50, 35);
        g.fillOval(cloud2X + 20, 135, 65, 45);
        g.fillOval(cloud2X + 60, 145, 50, 35);
        g.fillRect(cloud2X + 20, 160, 65, 20);
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
