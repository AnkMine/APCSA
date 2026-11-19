import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

// this class is the main game panel, holds the game objects and handles input
public class Screen extends JPanel implements KeyListener {

    // panel dimensions
    private static final int PANELW = 800;
    private static final int PANELH = 600;

    // y position where the firewall barriers sit
    private static final int HORIZON = 480;

    // game objects
    private ArcadeGame game;

    public Screen() {
        setFocusable(true);
        setLayout(null);

        // instantiate the game controller
        game = new ArcadeGame();

        // add key listener
        addKeyListener(this);
    }

    @Override
    public Dimension getPreferredSize() {
        // sets the size of the panel
        return new Dimension(PANELW, PANELH);
    }

    // paint component calls all of the drawing methods
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // DO NOT REMOVE THIS LINE

        // draw the background
        drawBackground(g);

        // draw all game objects through the game controller
        game.draw(g);
    }

    // color the background
    private void drawBackground(Graphics g) {
        g.setColor(new Color(0, 0, 20));
        g.fillRect(0, 0, PANELW, PANELH);
    }

    // interpret key presses and pass them to the game
    @Override
    public void keyPressed(KeyEvent e) {

        // left and right arrows move the player
        if (e.getKeyCode() == 37) {
            game.movePlayer(-1);
        } else if (e.getKeyCode() == 39) {
            game.movePlayer(1);
        } else if (e.getKeyCode() == 32) {   // space fires a data packet
            game.fire();
        } else if (e.getKeyCode() == 57) {   // '9' jumps to next level for testing
            game.testLevelJump();
        }

        // step the game forward one tick
        game.update();
        repaint();
    }

    // you must have method signatures for all methods that are part of an interface
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

}
