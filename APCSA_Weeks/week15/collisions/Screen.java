import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



public class Screen extends JPanel implements KeyListener{

	// instance variables
	private Player player;
	private Obstacle rock;
	private Color black;

	public Screen(){
    	setFocusable(true); 
		setLayout(null);

		// instantiate player, rock and the color black
		player = new Player(700, 300);
		rock = new Obstacle(200, 100);
		black = new Color(0, 0, 0);

		// add Key listener
		addKeyListener(this);
	}

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
        return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw the background
		drawBackground(g);

		// draw the player and obstacle
		player.draw(g);
		rock.draw(g);

	} 
	
	// color the background
	private void drawBackground(Graphics g) {
		g.setColor(black);
		g.fillRect(0, 0, 800, 600);
	}
	
	@Override
	public void keyPressed(KeyEvent e){
		// testing
		System.out.println(e.getKeyCode());

		//interpret key clicks
		if (e.getKeyCode() == 38){   // up arrow
			player.moveUp();
		}

		//interpret key clicks
		if (e.getKeyCode() == 40){   // down arrow
			player.moveDown();
		} else if (e.getKeyCode() == 37){   // left arrow
			player.moveLeft();
		} else if (e.getKeyCode() == 39){   // right arrow
			player.moveRight();
		}
		player.checkCollision(rock);
		repaint();
		
	}


	// You must have method signatures for all methods that are
	// part of an interface.
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
	

}


