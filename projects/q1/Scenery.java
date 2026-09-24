// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
	// instance variables
	private String timeOfDay;
	private Color blue, green, yellow;
	public Scenery(String timeOfDay) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		blue = new Color(0, 0, 255);
		green = new Color(0, 255, 0);
		yellow = new Color(255, 255, 0);

		
	}


	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);  // max size 1920 (width) by 1080 (height)
	}



    /* Call all of your drawing methods from paintComponent(Graphics). You must pass the Graphics reference variable, g, to your
       draw methods. */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   // DO NOT REMOVE THIS LINE


		// Create a method for each item that you draw
		drawBackground(g);


	}


    // Make methods that are just called from within this class private
	private void drawBackground(Graphics g) {
		// Draw a background for either a day or night scene
		if (timeOfDay.equalsIgnoreCase("day")) {
			g.setColor(blue);
			g.fillRect(0, 0, 800, 350);
			g.setColor(yellow);
			g.fillOval(100, 50, 75, 75);
		}

		g.setColor(green);
		g.fillRect(0, 350, 800, 250);
	}
    
}