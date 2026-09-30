// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
	// instance variables
	private String timeOfDay, season;
	// types of colors
	private Color skyBlue, grassGreen, skyDarkBlue, darkGreyBrown, deepGoldenBrown, freshWarmBrown, greyWhite, white, yellow, darkWood, black, pink, red, flowerGreen, treeLeafOrange, grassFall;


	// color instance variable for different shapes
	private Color tree, grass;
	
	public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;

		skyBlue = new Color(79, 163, 238);
		grassGreen = new Color(93, 178, 77);
		grassFall = new Color(125, 105, 57);
		skyDarkBlue = new Color(0, 0, 139);

		yellow = new Color(240, 243, 53);
		greyWhite = new Color(211, 211, 211);
		white = new Color(255, 255, 255);
		black = new Color(0, 0, 0);

		darkWood = new Color(133, 94, 66);
		
		pink = new Color(255, 105, 180);
		flowerGreen = new Color(16, 127, 52);

		red = new Color(231, 24, 9);
		

		darkGreyBrown = new Color(80, 70, 65);
		deepGoldenBrown = new Color(95, 60, 35);
		freshWarmBrown = new Color(115, 78, 48);
		treeLeafOrange = new Color(230, 132, 14);

		if (season.equalsIgnoreCase("winter")) {

			tree = darkGreyBrown;
			grass = greyWhite;

		} else if (season.equalsIgnoreCase("fall")) {

			tree = deepGoldenBrown;
			grass = grassFall;
		} else { // code for spring

			tree = freshWarmBrown;
			grass = grassGreen;
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



		// Create a method for each item that you draw
		drawBackground(g);


	}


    // Make methods that are just called from within this class private
	// CHECKING ERRONEOUS INPUT IN RUNNER.JAVA
	private void drawBackground(Graphics g) { 
		// Draw a background for either a day or night scene
		
		// changing scene based on day/night
		if (timeOfDay.equalsIgnoreCase("day")) {
			g.setColor(skyBlue);
			g.fillRect(0, 0, 800, 350);
			g.setColor(yellow);
			g.fillOval(30, 20, 75, 75);
		} else {
			g.setColor(skyDarkBlue);
        	g.fillRect(0, 0, 800, 350);

			g.setColor(white);
			g.fillArc(30, 20, 85, 85, 115, 200);
		}


		// grass logic

		g.setColor(grass);
		g.fillRect(0, 350, 800, 250);


		// tree logic

		int numberOfTrees = 10;   
		int startX = 400;   
		int spacingX = 125;   
		int spacingY = 150;

		int currentTreeX = startX;
		int currentTreeY = 350;    

		for (int i = 0; i < numberOfTrees; i++) {      

			drawTree(g, currentTreeX, currentTreeY, currentTreeX - 10, currentTreeY - 30);     
			

			currentTreeX += spacingX;     
			
			// After drawing the 5th tree (index 4), move to the second row
			if (i == 4) {     
				currentTreeX = startX;          // Reset X
				currentTreeY += spacingY;       // Shift Y down to create the second row
			}
		}

		// house logic

		drawHouse(g);

		drawFlowers(g, 100, 500);

		drawFlowers(g, 300, 500);

	}

	private void drawTree(Graphics g, int trunkX, int trunkY, int branchX2, int branchY2) {

		
		
		int trunkWidth = 20;
		int trunkHeight = 50;
		// tree trunk
		g.setColor(tree);
		g.fillRect(trunkX, trunkY, trunkWidth, trunkHeight);

		if (season.equalsIgnoreCase("winter")) {
			// left main branch
			g.drawLine(trunkX, trunkY + 10, branchX2, branchY2);

			// right main branch
			g.drawLine(trunkX + trunkWidth, trunkY + 10, branchX2 + 45, branchY2 + 5);

			// secondary branches
			g.drawLine(trunkX + 10, trunkY, branchX2 + 20, branchY2 - 15);
			g.drawLine(trunkX + 3, trunkY + 25, branchX2 - 10, branchY2 + 20);
			g.drawLine(trunkX + 17, trunkY + 25, branchX2 + 55, branchY2 + 25);
		} else if (season.equalsIgnoreCase("fall")) {
			g.setColor(treeLeafOrange);
			g.fillOval(trunkX - 15, trunkY - 45, 50, 50);
		} else { //code for spring
			g.setColor(flowerGreen);
			g.fillOval(trunkX - 15, trunkY - 45, 50, 50);
		}

	}


	private void drawHouse(Graphics g) {


		// main walls
		g.setColor(darkWood);
		g.fillRect(100, 400, 200, 150); // Width 200, Height 150
		
		// house outline
		g.setColor(black);
		g.drawRect(100, 400, 200, 150);

		// Modern Overhanging Roof
		g.setColor(black);
		g.fillRect(80, 380, 240, 20);
		
		// Roof Outline
		g.setColor(black);
		g.drawRect(80, 380, 240, 20);

		// front door
		g.setColor(freshWarmBrown);
		g.fillRect(180, 470, 40, 80);
		
		// door outline
		g.setColor(black);
		g.drawRect(180, 470, 40, 80);
		
		// yellow doorknob
		g.setColor(yellow);
		g.fillOval(212, 510, 6, 6);


		// window
		g.setColor(greyWhite);
		g.fillRect(180, 415, 40, 40);

		g.setColor(black);
		g.drawLine(200, 415, 200, 455);
		g.drawLine(180, 435, 220, 435);
	
	}

	private void drawFlowers(Graphics g, int x, int y) {
		
		// stem
		g.setColor(flowerGreen);
    	g.fillRect(x - 3, y, 6, 60);
    
		// leaves
		g.fillOval(x - 15, y + 20, 15, 10); // Left leaf
		g.fillOval(x + 3, y + 30, 15, 10);  // Right leaf

		// petals
		g.setColor(yellow);
		g.fillOval(x - 15, y - 25, 20, 20); // Top-left petal
		g.fillOval(x - 5,  y - 25, 20, 20); // Top-right petal
		g.fillOval(x - 20, y - 15, 20, 20); // Left petal
		g.fillOval(x + 0,  y - 15, 20, 20); // Right petal
		g.fillOval(x - 10, y - 5, 20, 20);  // Bottom petal

		// central circle
		g.setColor(pink);
		g.fillOval(x - 7, y - 17, 14, 14);
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