import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

// This class creates and draws a rainy day scene on a JPanel
public class Screen extends JPanel implements KeyListener{

	// Declare a Raindrop object
	private Raindrop[] rain;
	private Tree[] tree;
	private boolean raining;

	private static final int PANELW = 800;
	private static final int PANELH = 600;
	private static final int HORIZONY = 350;
	private static final int minDistance = 50;


	private Color skyBlue;
	private Color grassGreen;
	private Color darkSkyBlue;

	private int[] treeX, treeY;
	private int numberOfTrees = 10;
	private int attempts; // variable to ensure that trees are drawn no matter what, even if there is no space

	// Constructor that initializes a Screen object
	public Screen() {
        setLayout(null);
        setFocusable(true);
		addKeyListener(this);
		

		// instantiate the Raindrop array and raining flag
		rain = new Raindrop[100];
		int x, y;
		for (int i = 0; i < rain.length; i++) {
			x = (int)(Math.random() * 790);
			y = (int)(Math.random() * 590);
			rain[i] = new Raindrop(x, y);
		}
		raining = true;

		// instantiate tree arrays
		tree = new Tree[numberOfTrees];
		treeX = new int[numberOfTrees];
		treeY = new int[numberOfTrees];

		// instantiate colors
		skyBlue = new Color(79, 163, 238);
		grassGreen = new Color(93, 178, 77);
		darkSkyBlue = new Color(19, 130, 212);

		

		// the below for loop assigns a random (x,y) coordinate for each tree ensuring that no tree is too close to one another
		for (int i = 0; i < numberOfTrees; i++) {
			int candidateX, candidateY;
			boolean tooClose;

			do {
				tooClose = false;
				candidateX = (int)(Math.random() * (PANELW - 10));
				candidateY = (int)(Math.random() * 211) + 370;

				for (int j = 0; j < i; j++) {
					double distance = Math.hypot(candidateX - treeX[j], candidateY - treeY[j]);
					if (distance < minDistance) {
						tooClose = true;
						break;
					}
				}

				attempts++;
				if (attempts > 100) {
					break;
				}
			} while (tooClose);

			treeX[i] = candidateX;
			treeY[i] = candidateY;
		}

		
		
		

		skyBlue = new Color(79, 163, 238);
		grassGreen = new Color(93, 178, 77);

		raining = true;
		
	}
	
	// JPanel method that sets the size of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(PANELW, PANELH);
	}

	// JPanel method that invokes methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		drawSky(g);
		drawGround(g);
		drawForest(g);
		
		// draw the rain
		if (raining) {
			for (Raindrop each : rain) {
				each.drawRaindrop(g);
			}
		}
	}

	private void drawSky(Graphics g) {
		if (raining) {
			g.setColor(darkSkyBlue);
		} else {
			g.setColor(skyBlue);
		}

		
		g.fillRect(0, 0, PANELW, HORIZONY);
		g.setColor(Color.YELLOW);
		g.fillOval(30, 20, 75, 75);
		
	}

	private void drawGround(Graphics g) {
		g.setColor(grassGreen);
		g.fillRect(0, HORIZONY, PANELW, PANELH - HORIZONY);
	}

	private void drawForest(Graphics g) {

		for (int i = 0; i < numberOfTrees; i++) {
			tree[i] = new Tree(treeX[i], treeY[i]);
			tree[i].drawTree(g);
		}

	}


	// Method runs continuously to simulate object movement
	public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			// Add move methods here
			if (raining) {
				for (Raindrop each: rain) {
				each.moveRaindrop();
				}
			}
			
			//repaint the graphics drawn
			repaint();
		}

	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 32) {
			raining = !raining;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	
	
}
