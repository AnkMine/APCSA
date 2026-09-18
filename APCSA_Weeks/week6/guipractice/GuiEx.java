import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

// Class that sets up the JPanel and draws on the panel
public class GuiEx extends JPanel {
	private int x, y;
        
        // Constructor that initializes instance variables, etc.
	public GuiEx() {
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
        drawOval(g);
	
	}

	// draw an oval
	private void drawOval(Graphics g) {
			Color colorRed = new Color(128, 128, 0);
	g.setColor(colorRed);
	g.fillOval(x,y,100,100);
	}

}
