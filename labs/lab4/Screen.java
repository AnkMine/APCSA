import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Screen extends JPanel implements KeyListener {




	// instance variables
    private SlotMachine machine;


	// Initialization Constructor
	public Screen() {
        setFocusable(true);
        setLayout(null);


        // Set up KeyListening. requestFocusInWindow() directs focus to the current (this) JPanel
        this.requestFocusInWindow();
        this.addKeyListener(this);

        // instantiate/initialize objects
        machine = new SlotMachine(100);

	}


    //set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(800,600);
	}
	
    // Call the draw methods
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
        // Call the draw methods
        drawBackground(g);
        machine.drawMachine(g);
       


	}

    public void drawBackground(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 600);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        // Triggers spin when spacebar is pressed
        if (e.getKeyCode() == 32) {   // or whatever key you want to use for your spin key
            
            }
        }
    


    // Required KeyListener interface methods
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
	
}
