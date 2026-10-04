// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	
		// Panel Dimensions
		private static final int PANEL = 800;
		private static final int PANELH = 600;
		private static final int HORIZONY = 350;
		
		// Scene Configurations
		private String timeOfDay;
		private String season;

		// Active Scene Colors
		private Color treeTrunkColor;
		private Color grassColor;

		// Color Palette
		private Color skyBlue;
		private Color skyDarkBlue;
		private Color grassGreen;
		private Color grassFall;
		private Color snowWhite;
		
		private Color winterTrunkBrown;
		private Color fallTrunkBrown;
		private Color springTrunkBrown;
		
		private Color leafOrange;
		private Color foliageGreen;
		private Color houseWood;
		private Color flowerPink;
		private Color ladybugRed;
		private Color caterpillarGreen;
	
	public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we start using buttons.
        setLayout(null);    // setting to null allows you to control the layout of the JPanel.
        
        // add any initialization code to the constructor
		this.timeOfDay = timeOfDay;
		this.season = season;

		initializeColors();
		configureSeasonColors();
		
		
	}

	// setting c
	private void initializeColors() {
		// sky & ground
        skyBlue = new Color(79, 163, 238);
        skyDarkBlue = new Color(0, 0, 139);
        grassGreen = new Color(93, 178, 77);
        grassFall = new Color(125, 105, 57);
        snowWhite = new Color(211, 211, 211);

        // trees & wood
        winterTrunkBrown = new Color(80, 70, 65);
        fallTrunkBrown = new Color(95, 60, 35);
        springTrunkBrown = new Color(115, 78, 48);
        houseWood = new Color(133, 94, 66);
        leafOrange = new Color(230, 132, 14);

        // plants & animal colors
        foliageGreen = new Color(16, 127, 52);
        flowerPink = new Color(255, 105, 180);
        ladybugRed = new Color(231, 24, 9);
        caterpillarGreen = new Color(20, 107, 71);
	}

	// configuring season colors
	private void configureSeasonColors() {
		if (season.equalsIgnoreCase("winter")) {

            treeTrunkColor = winterTrunkBrown;
            grassColor = snowWhite;
        } else if (season.equalsIgnoreCase("fall")) {

            treeTrunkColor = fallTrunkBrown;
            grassColor = grassFall;
        } else { // code for spring

            treeTrunkColor = springTrunkBrown;
            grassColor = grassGreen;
        }

	}


	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(PANELW, PANELH);  // max size 1920 (width) by 1080 (height)
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

		drawSky(g);
		drawGround(g);
		drawTrees(g);
		drawHouse(g);

		//Foreground
		drawFlowers(g, 100, 500);
		drawFlowers(g, 300, 500);
		drawLadybug(g, 450, 410);
		drawCaterpillar(g, 530, 405);

	}

	private void drawSky(Graphics g) {
		// changing scene based on day/night
		if (timeOfDay.equalsIgnoreCase("day")) {
			g.setColor(skyBlue);
			g.fillRect(0, 0, PANELW, HORIZONY);
			g.setColor(Color.YELLOW);
			g.fillOval(30, 20, 75, 75);
		} else {
			g.setColor(skyDarkBlue);
        	g.fillRect(0, 0, PANELW, HORIZONY);

			g.setColor(Color.WHITE);
			g.fillArc(30, 20, 85, 85, 115, 200);

			g.setColor(Color.YELLOW);
			int starW = 6;
			int starH = 6;
			int numberOfStars = 15;
			for (int i = 0; i < numberOfStars; i++) {
				int starX = (int) (Math.random() * (PANELW + 1));
				int starY = (int) (Math.random() * (HORIZONY + 1));
				g.fillOval(starX, starY, starW, starH);
			}
		}
	}

	private void drawGround(Graphics g) {
		g.setColor(grassColor);
		g.fillRect(0, HORIZONY, PANELW, PANELH - HORIZONY);
	}

	private void drawRowsOfTrees(Graphics g) {
		int numberOfTrees = 10;   
		int startX = 400;   
		int spacingX = 125;   
		int spacingY = 150;

		int currentTreeX = startX;
		int currentTreeY = HORIZONY;    

		for (int i = 0; i < numberOfTrees; i++) {

			drawTree(g, currentTreeX, currentTreeY);
			currentTreeX += spacingX;
			
			// After drawing the 5th tree, move to the second row
			if (i == 4) {     
				currentTreeX = startX;
				currentTreeY += spacingY;
			}
		}
	}

	private void drawTree(Graphics g, int x, y) {

		
		
		int trunkW = 20;
		int trunkH = 50;
		int treeCrownSize = 50;
		// tree trunk
		g.setColor(treeTrunkColor);
		g.fillRect(x, y, trunkW, trunkH);

		if (season.equalsIgnoreCase("winter")) {
			// left main branch
			g.drawLine(x, y + 10, x - 10, y - 30);

			// right main branch
			g.drawLine(x + trunkW, y + 10, x + 35, y - 25);

			// secondary branches
			g.drawLine(x + 10, y, x + 10, y - 45);
			g.drawLine(x + 3, y + 25, x - 20, y - 10);
			g.drawLine(x + 17, y + 25, x + 45, y - 5);
		} else if (season.equalsIgnoreCase("fall")) {
			g.setColor(leafOrange);
			g.fillOval(x - 15, y - 45, treeCrownSize, treeCrownSize);
		} else { //code for spring
			g.setColor(foliageGreen);
			g.fillOval(x - 15, y - 45, treeCrownSize, treeCrownSize);
		}

	}


	private void drawHouse(Graphics g) {


		// main walls
		g.setColor(houseWood);
		g.fillRect(100, 400, 200, 150);
		
		// house outline
		g.setColor(Color.BLACK);
		g.drawRect(100, 400, 200, 150);

		// Modern Overhanging Roof
		g.setColor(Color.BLACK);
		g.fillRect(80, 380, 240, 20);
		
		// Roof Outline
		g.setColor(Color.BLACK);
		g.drawRect(80, 380, 240, 20);

		// door
		g.setColor(springTrunkBrown);
		g.fillRect(180, 470, 40, 80);
			// door outline
		g.setColor(Color.BLACK);
		g.drawRect(180, 470, 40, 80);
			// doorknob
		g.setColor(Color.YELLOW);
		g.fillOval(212, 510, 6, 6);


		// window
		g.setColor(snowWhite);
		g.fillRect(180, 415, 40, 40);
			// window lines
		g.setColor(Color.BLACK);
		g.drawLine(200, 415, 200, 455);
		g.drawLine(180, 435, 220, 435);
	
	}

	private void drawFlowers(Graphics g, int x, int y) {
		
		// stem
		g.setColor(foliageGreen);
    	g.fillRect(x - 3, y, 6, 60);
    
		// leaves
		g.fillOval(x - 15, y + 20, 15, 10); // Left leaf
		g.fillOval(x + 3, y + 30, 15, 10);  // Right leaf

		// petals
		int petalSize = 20;
		g.setColor(Color.YELLOW);
		g.fillOval(x - 15, y - 25, petalSize, petalSize); // Top-left petal
		g.fillOval(x - 5,  y - 25, petalSize, petalSize); // Top-right petal
		g.fillOval(x - 20, y - 15, petalSize, petalSize); // Left petal
		g.fillOval(x + 0,  y - 15, petalSize, petalSize); // Right petal
		g.fillOval(x - 10, y - 5, petalSize, petalSize);  // Bottom petal

		// central circle
		g.setColor(flowerPink);
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
		int spotRadius = 6;
		g.fillOval(x + 8, y + 15, spotRadius, spotRadius);
		g.fillOval(x + 15, y + 35, spotRadius, spotRadius);
		g.fillOval(x + 36, y + 15, spotRadius, spotRadius);
		g.fillOval(x + 29, y + 35, spotRadius, spotRadius);

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
		int segmentCount = 6;
		int spacing = 35;
		int size = 45;

		// body segments
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

		// head & outline
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
		int antennaTipRadius = 6;
			// left
		g.drawLine(headX + 20, headY, headX + 10, headY - 15);
		g.fillOval(headX + 7, headY - 20, antennaTipRadius, antennaTipRadius);
			// right
		g.drawLine(headX + 35, headY, headX + 45, headY - 15);
		g.fillOval(headX + 42, headY - 20, antennaTipRadius, antennaTipRadius);
	}



    
}