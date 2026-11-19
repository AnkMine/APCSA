import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



public class Screen extends JPanel implements KeyListener{

    private static final int PANELW = ;
    private static final int PANELH = ;
    private static final int HORIZON = ;

    public Screen() {
        setFocusable(true);
        setLayout(null);

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


	}

}