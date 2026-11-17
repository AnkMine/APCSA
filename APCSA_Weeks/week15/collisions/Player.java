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
	
	// move the player up
	public void moveUp() {
		if (y >0) {
            y-=5;
		}
		
	}

	// move the player down
	public void moveDown() {
		if(y+120 < 600) {
		   y+=5;
		}
	}

	// move the player left
	public void moveLeft() {
		if(x-5 > 0) {
	          x -= 5;
		}
	}

	// move the player right
	public void moveRight() {
		if (x+55 < 800){
		  x += 5;
		}
	}

	// check for a collision with an Obstacle
	public void checkCollision(Obstacle obs) {
		int oX = obs.getX();
		int oY = obs.getY();
		int oWidth = obs.getWidth();
		int oHeight = obs.getHeight();

		int pX = x-5;
		int pY = y;
		int pWidth = 60;
		int pHeight = 120;

		if ((pX+pWidth >= oX) && (pX <= oX+oWidth) && (pY+pHeight >= oY) && (pY <= oY+ oHeight)) {
			System.out.println("Collision!!");
		}
	}
	
}
