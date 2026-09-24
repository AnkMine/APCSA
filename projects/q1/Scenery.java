// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
	// instance variables
	private String timeOfDay, season;
	private Color lightBlue, grassGreen, yellow, orange, darkBlue, treeBrown, flowerPink, leafGreen, stemGreen;
	
	public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;

		lightBlue = new Color(173, 216, 230);
		grassGreen = new Color(124, 252, 0);
		darkBlue = new Color(0, 0, 139);
		mustardYellow = new Color(204, 153, 08);
		orange = new Color(255, 165, 0);
		treeBrown = new Color(107, 73, 43);
		leafGreen = new Color(48, 183, 0);
		stemGreen = new Color(173, 200, 117);
		flowerPink = new Color(227, 91, 137)''

		
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
	// CHECKING ERRONEOUS INPUT IN RUNNER.JAVA
	private void drawBackground(Graphics g) { 
		// Draw a background for either a day or night scene
		if (timeOfDay.equalsIgnoreCase("day")) {
			g.setColor(lightBlue);
			g.fillRect(0, 0, 800, 250);
			g.setColor(yellow);
			g.fillOval(30, 20, 75, 75);
		} 
		/*
		else {
			// add drawing for nighttime
		}

		if (season.equalsIgnoreCase("fall")) {

		} else if (season.equalsIgnoreCase("winter")) {

		} else {
			// add code for spring
		}


		g.setColor(green);
		g.fillRect(0, 350, 800, 250);

		*/

		drawTree(g, 40, 400, 30, 370);
	}

	private void drawTree(Graphics g, Graphics2D g2d, int trunkX, int trunkY, int branchX2, int branchY2) {
		// draw trunk below
		g.setColor(treeBrown);
		g.fillRect(trunkX, trunkY, 10, 45);

		// draw branches below
		g2d.drawLine(trunkX, trunkY, branchX2, branchY2);
	}


	private void drawHouse(Graphics g) {

	}

	private void drawFlowers(Graphics g) {
		
		g.setColor(stemGreen);

		g.setColor(leafGreen);

		g.setColor(yellow);


		// draw leafs
		// draw stem
		// draw petals (w/ yellow)
		// draw central thing (w/ pink)
	}

	private void drawLadybug(Graphics g) {
		// draw red body
		// draw black head
		// draw center division line
		// draw spots
	}

	private void drawCaterpillar(Graphics g) {
		// draw overlapping ovals using for loops
		// draw head
		// draw eyes
	}



    
}