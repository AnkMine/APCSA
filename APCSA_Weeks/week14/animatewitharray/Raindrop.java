import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class Raindrop{
	
        // Instance variables
	private int x, y;
	private Color blue;
	private int[] xArray, yArray;
	
        // Constructor to initialize instance variables and instantiate the arrays and color
	public Raindrop(int x, int y){
		this.x = x;
		this.y = y;
		xArray = new int[3];
		yArray = new int[3];
		blue = new Color(0,125,255);
	}
	
        // Draw a Raindrop
	public void drawRaindrop(Graphics g) {
		xArray[0] = x;
		xArray[1] = x+5;
		xArray[2] = x+10;

		yArray[0] = y+5;
		yArray[1] = y-10;
		yArray[2] = y+5;

		g.setColor(blue);
		g.fillOval(x, y, 10, 15);
		g.fillPolygon(xArray, yArray, 3);
	}

	// move the raindrop down
	public void moveRaindrop() {
		if( y >= 600) {
			y = 0;
			x = (int)(Math.random() * 790);
		} else {
			y += 3;
		}
	}
	
	
}
