import java.awt.Color;
import java.awt.Graphics;

public class Player{

	// location of the player and colors
	private int x, y;
	private Color orange;
	private Color green;

	public Player(int x, int y){
		// set up instance variables
		this.x = x;
		this.y = y;
		orange = new Color(255, 165, 0);
		green = new Color(0, 255, 0);
		
	}
	
	// draw the player
	public void draw(Graphics g) {
		g.setColor(orange);
		g.fillOval(x, y, 50, 50);
		g.setColor(green);
		g.fillRect(x-5, y+50, 60, 70);
	}

	// move the player to the right
	public void moveRight() {
		if (x < (800-55)) {
			x += 3;
		}
	}

	// move the player to the left
	public void moveLeft() {
		if (x>5) {
			x -= 3;
		}
	}

	//move the player up
	public void moveUp() {
		if (y > 5) { 
			y -= 3;
		}
	}

	// move the player down
	public void moveDown() {
		if (y < (600-55)) { 
			y += 3;
		}
	}
}
	
	