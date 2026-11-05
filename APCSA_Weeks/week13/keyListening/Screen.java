import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Screen extends JPanel implements KeyListener {

	// instance variables
	private Player player;
	private Color black;

	public Screen(){
		setFocusable(true); 
		setLayout(null);

		// instantiate the player and color
		player = new Player(700, 300);
		black = new Color(0, 0, 0);

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

		drawBackground(g);

		// draw the player
		player.draw(g);

	} 
	// color the background
	private void drawBackground(Graphics g) {
		g.setColor(black);
		g.fillRect(0, 0, 800, 600);
	}
	
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == 39) {
			player.moveRight();
		} else if (e.getKeyCode() == 37) {
			player.moveLeft();
		} else if (e.getKeyCode() == 38) {
			player.moveUp();
		} else if (e.getKeyCode() == 40) {
			player.moveDown();
		}

		repaint();
	}

	// You must have method signatures for all methods that are
	// part of an interface.
	@Override
	public void keyReleased(KeyEvent e){}

	@Override
	public void keyTyped(KeyEvent e){}
	

}


