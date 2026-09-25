// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.*;


public class Scenery extends JPanel {
	
	// instance variables
	private String timeOfDay, season;
	// types of colors
	private Color lightBlue, grassGreen, yellow, orange, darkBlue, flowerPink, leafGreen, stemGreen, mustardYellow, darkGreyBrown, deepGoldenBrown, freshWarmBrown;

	// color instance variable for different shapes
	private Color tree;
	
	public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;

		lightBlue = new Color(173, 216, 230);
		grassGreen = new Color(124, 252, 0);
		darkBlue = new Color(0, 0, 139);
		mustardYellow = new Color(204, 153, 8);
		orange = new Color(255, 165, 0);
		
		leafGreen = new Color(48, 183, 0);
		stemGreen = new Color(173, 200, 117);
		flowerPink = new Color(227, 91, 137);

		darkGreyBrown = new Color(80, 70, 65);
		deepGoldenBrown = new Color(95, 60, 35);
		freshWarmBrown = new Color(115, 78, 48);

		if (season.equalsIgnoreCase("winter")) {

			tree = darkGreyBrown;
		} else if (season.equalsIgnoreCase("fall")) {

			tree = deepGoldenBrown;
		} else {

			tree = freshWarmBrown;
		}

		
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

		Graphics2D g2d = (Graphics2D) g;



		// Create a method for each item that you draw
		drawBackground(g2d);


	}


    // Make methods that are just called from within this class private
	// CHECKING ERRONEOUS INPUT IN RUNNER.JAVA
	private void drawBackground(Graphics2D g2d) { 
		// Draw a background for either a day or night scene
		if (timeOfDay.equalsIgnoreCase("day")) {
			g2d.setColor(lightBlue);
			g2d.fillRect(0, 0, 800, 250);
			g2d.setColor(yellow);
			g2d.fillOval(30, 20, 75, 75);
		} else {
			g2d.setColor(darkBlue);
        	g2d.fillRect(0, 0, 800, 250);
			// add moon
		}

	


		g2d.setColor(grassGreen);
		g2d.fillRect(0, 350, 800, 250);


		// spring
		

		// fall

		int numberOfTrees = 5;
		int startX = 80;
		int spacing = 180;

		for (int i = 0; i < numberOfTrees; i++) {
			int currentTreeX = startX + (i * spacing);
			int currentTreeY = 320; // Y-position on the grass

			drawTree(g2d, currentTreeX, currentTreeY, currentTreeX - 10, currentTreeY - 30);
		}

	}

	private void drawTree(Graphics2D g2d, int trunkX, int trunkY, int branchX2, int branchY2) {

		int trunkWidth = 20;
		int trunkHeight = 50;
		// tree trunk
		g2d.setColor(tree);
		g2d.fillRect(trunkX, trunkY, trunkWidth, trunkHeight);

		// main branches (thicker)
		g2d.setStroke(new BasicStroke(3.0f));

		// left main branch
		g2d.drawLine(trunkX, trunkY + 10, branchX2, branchY2);

		// right main branch
		g2d.drawLine(trunkX + trunkWidth, trunkY + 10, branchX2 + 45, branchY2 + 5);

		// secondary branches (thinner)
		g2d.setStroke(new BasicStroke(2.0f));

		g2d.drawLine(trunkX + 10, trunkY, branchX2 + 20, branchY2 - 15);
		g2d.drawLine(trunkX + 3, trunkY + 25, branchX2 - 10, branchY2 + 20);
		g2d.drawLine(trunkX + 17, trunkY + 25, branchX2 + 55, branchY2 + 25);

		// reset stroke
		g2d.setStroke(new BasicStroke(1.0f));
	}


	private void drawHouse(Graphics2D g2d) {

	}

	private void drawFlowers(Graphics2D g2d) {
		
		g2d.setColor(stemGreen);

		g2d.setColor(leafGreen);

		g2d.setColor(yellow);


		// draw leafs
		// draw stem
		// draw petals (w/ yellow)
		// draw central thing (w/ pink)
	}

	private void drawLadybug(Graphics2D g2d) {
		// draw red body
		// draw black head
		// draw center division line
		// draw spots
	}

	private void drawCaterpillar(Graphics2D g2d) {
		// draw overlapping ovals using for loops
		// draw head
		// draw eyes
	}



    
}