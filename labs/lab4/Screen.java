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
        g.setColor(new Color(40, 40, 40));
        g.fillRect(0, 0, 800, 600);
    }

    // Required KeyListener interface methods

    @Override
    public void keyPressed(KeyEvent e) {
        // Triggers spin when spacebar is pressed
        if (e.getKeyCode() == 32) {
            if (!machine.keepPlaying()) {
                // game over, do nothing SlotMachine handles
            } else if (machine.bet > machine.balance) {
                machine.warningMessage = "Bet exceeds balance! Lower your bet.";
            } else {
                machine.play();
            }

        // if '+' pressed, increase bet by 1
        } else if (e.getKeyChar() == '+') {
            machine.increaseBet(1);

        // if "-" pressed, decrease bet by 1
        } else if (e.getKeyChar() == '-') {
            machine.decreaseBet(1);

        // if "" pressed, increase bet by 5
        } else if (e.getKeyCode() == 53) {
            machine.increaseBet(5);
        
        // if "" pressed, decrease bet by 5
        } else if (e.getKeyCode() == 52) {
            machine.decreaseBet(5);

        // if "M" is pressed, set bet to max
        }
        else if (e.getKeyCode() == 77) {
            machine.setMaxBet();
    
        // if "N" is pressed, set bet back to 1
        } else if (e.getKeyCode() == 78) {
            machine.setMinBet();
        
        // Press 'Q' to quit game
        } else if (e.getKeyCode() == 81) {
            System.exit(0);
        }

        repaint();
    }

    
    @Override public void keyTyped(KeyEvent e) {}


    @Override public void keyReleased(KeyEvent e) {}
}