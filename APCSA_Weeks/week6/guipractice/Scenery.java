import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Scenery extends JPanel {
	private int x, y;
        
        // Constructor that initializes instance variables, etc.
	public Scenery() {
		setFocusable(true);  // set to true by default, so really don't need this.
		setLayout(null);  /* Allows us to control the positioning of components on 
		                     the panel. If not set to null, BorderLayout is the default layout. */
		x = 400;
		y = 200;
	}

        // Sets up the dimensions of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

        // Contains calls to methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);           // DO NOT REMOVE THIS. You MUST call the superclass paintComponent(Graphics) to clear the background.
        sky(g);

        for(int i = 100; i < 800; i += 100) {
            drawTree(g, i, 225);
        }

        ground(g);
        lake(g);
        sun(g);

    }


    private void sky(Graphics g) {
        Color colorBlue = new Color(0, 0, 255);
        g.setColor(colorBlue);
        g.fillRect(0, 0, 800, 200);

        Color colorWhite = new Color(255, 255, 255);
        g.setColor(colorWhite);
        g.fillOval(90, 90, 50, 50);
        g.fillOval(500, 120, 50, 50);
        g.fillOval(700, 150, 50, 50);

    }

    private void drawTree(Graphics g, int x1, int y1) {
        Color colorGreen = new Color(0, 255, 0);
        Color colorBrown = new Color(150, 75, 0);
        g.setColor(colorGreen);
        g.fillOval((x1-5), y1, 25, 25);
        g.setColor(colorBrown);
        g.fillRect(x1, (y1+25), 10, 50);
    }

    private void ground(Graphics g) {
        Color colorBrown = new Color(150, 75, 0);
        g.setColor(colorBrown);
        g.fillRect(0, 500, 700, 600);
    }
    
    private void lake(Graphics g) {
        Color colorBlue = new Color(0, 0, 255);
        g.setColor(colorBlue);
        g.fillOval(710, 500, 85, 100);
    }

    private void sun(Graphics g) {
        Color colorYellow = new Color(255, 255, 0);
        g.setColor(colorYellow);
        g.fillOval(10, 10, 40, 40);
    }

}
