// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
	// instance variables
	private String timeOfDay, season;
	// types of colors
	private Color skyBlue, grassGreen, skyDarkBlue, darkGreyBrown, deepGoldenBrown, freshWarmBrown, greyWhite, darkWood, pink, ladybugRed, flowerGreen, treeLeafOrange, grassFall, caterpillarGreen;


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


		greyWhite = new Color(211, 211, 211);

		darkWood = new Color(133, 94, 66);
		
		pink = new Color(255, 105, 180);
		flowerGreen = new Color(16, 127, 52);

		ladybugRed = new Color(231, 24, 9);
		
		caterpillarGreen = new Color(20, 107, 71);

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
			g.setColor(Color.YELLOW);
			g.fillOval(30, 20, 75, 75);
		} else {
			g.setColor(skyDarkBlue);
        	g.fillRect(0, 0, 800, 350);

			g.setColor(Color.WHITE);
			g.fillArc(30, 20, 85, 85, 115, 200);

			g.setColor(Color.YELLOW);
			int starW = 6;
			int starH = 6;
			int numberOfStars = 15;
			for (int i = 0; i < numberOfStars; i++) {
				int starX = (int) (Math.random() * (800 + 1));
				int starY = (int) (Math.random() * (350 + 1));
				g.fillOval(starX, starY, starW, starH);
			}
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
			
			// After drawing the 5th tree, move to the second row
			if (i == 4) {     
				currentTreeX = startX;
				currentTreeY += spacingY;
			}
		}

		// house logic

		drawHouse(g);

		drawFlowers(g, 100, 500);

		drawFlowers(g, 300, 500);

		drawLadybug(g, 450, 410);

		drawCaterpillar(g);

	}

	private void drawTree(Graphics g, int trunkX, int trunkY, int branchX2, int branchY2) {

		
		
		int trunkW = 20;
		int trunkH = 50;
		// tree trunk
		g.setColor(tree);
		g.fillRect(trunkX, trunkY, trunkW, trunkH);

		if (season.equalsIgnoreCase("winter")) {
			// left main branch
			g.drawLine(trunkX, trunkY + 10, branchX2, branchY2);

			// right main branch
			g.drawLine(trunkX + trunkW, trunkY + 10, branchX2 + 45, branchY2 + 5);

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
		g.setColor(Color.BLACK);
		g.drawRect(100, 400, 200, 150);

		// Modern Overhanging Roof
		g.setColor(Color.BLACK);
		g.fillRect(80, 380, 240, 20);
		
		// Roof Outline
		g.setColor(Color.BLACK);
		g.drawRect(80, 380, 240, 20);

		// front door
		g.setColor(freshWarmBrown);
		g.fillRect(180, 470, 40, 80);
		
		// door outline
		g.setColor(Color.BLACK);
		g.drawRect(180, 470, 40, 80);
		
		// Color.YELLOW doorknob
		g.setColor(Color.YELLOW);
		g.fillOval(212, 510, 6, 6);


		// window
		g.setColor(greyWhite);
		g.fillRect(180, 415, 40, 40);
		// window lines
		g.setColor(Color.BLACK);
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
		int petalW = 20;
		int petalH = 20;
		g.setColor(Color.YELLOW);
		g.fillOval(x - 15, y - 25, petalW, petalH); // Top-left petal
		g.fillOval(x - 5,  y - 25, petalW, petalH); // Top-right petal
		g.fillOval(x - 20, y - 15, petalW, petalH); // Left petal
		g.fillOval(x + 0,  y - 15, petalW, petalH); // Right petal
		g.fillOval(x - 10, y - 5, petalW, petalH);  // Bottom petal

		// central circle
		g.setColor(pink);
		g.fillOval(x - 7, y - 17, 14, 14);
	}

	private void drawLadybug(Graphics g, int x, int y) {
		
		// Tested hardcoded x&y coordinates to find the relative spacing between components then replaced them with variables for easier repositioning

		// body
		g.setColor(ladybugRed);
		g.fillOval(x, y, 50, 60);

		// center line
		g.setColor(Color.BLACK);
		g.drawLine(x + 25, y, x + 25, y + 60);

		// spots on body
		int radius = 6;
		g.fillOval(x + 8, y + 15, radius, radius);
		g.fillOval(x + 15, y + 35, radius, radius);
		g.fillOval(x + 36, y + 15, radius, radius);
		g.fillOval(x + 29, y + 35, radius, radius);

		// legs
			// left
		g.drawLine(x - 20, y + 5, x + 10, y + 15);
		g.drawLine(x - 25, y + 25, x + 10, y + 25);
		g.drawLine(x - 20, y + 45, x + 10, y + 35);
			// right
		g.drawLine(x + 40, y + 15, x + 70, y + 5);
		g.drawLine(x + 40, y + 25, x + 75, y + 25);
		g.drawLine(x + 40, y + 35, x + 70, y + 45);

		// head
		g.fillOval(x + 13, y - 12, 24, 24);


	}

	private void drawCaterpillar(Graphics g) {

		// body segments
		int segmentCount = 6;
		int spacing = 35;
		int size = 45;
		for(int i = 0; i < segmentCount; i++) {
			int x = 530 + (i * spacing);

			int y = 405;
			if (i % 2 == 0) {
				y += 10;
			}
			g.setColor(caterpillarGreen);
			g.fillOval(x, y, size, size);

			g.setColor(Color.BLACK);
			g.drawOval(x, y, size, size);
		}

		// head vars
		int headX = 530 + (segmentCount * spacing) - 10;
		int headY = 400;
		int headSize = 50;

		// head + outline
		g.setColor(caterpillarGreen);
		g.fillOval(headX, headY, headSize, headSize);
		g.setColor(Color.BLACK);
		g.drawOval(headX, headY, headSize, headSize);

		// eyes
		int eyeSize = 10;
		int pupilSize = 4;
		g.setColor(Color.WHITE);
			// left
		g.fillOval(headX + 15, headY + 15, eyeSize, eyeSize);
			// right
		g.fillOval(headX + 30, headY + 15, eyeSize, eyeSize);

		g.setColor(Color.BLACK);
			// left
		g.fillOval(headX + 18, headY + 18, pupilSize, pupilSize);
			// right
		g.fillOval(headX + 33, headY + 18, pupilSize, pupilSize);

		// Smile
		g.drawArc(headX + 17, headY + 25, 20, 15, 180, 180);

		// Antennae
		int ovalRadius = 6;
			// left
		g.drawLine(headX + 20, headY, headX + 10, headY - 15);
		g.fillOval(headX + 7, headY - 20, ovalRadius, ovalRadius);
			// right
		g.drawLine(headX + 35, headY, headX + 45, headY - 15);
		g.fillOval(headX + 42, headY - 20, ovalRadius, ovalRadius);



		// draw overlapping ovals using for loops
		// draw head
		// draw eyes
	}



    
}