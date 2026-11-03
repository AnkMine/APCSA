import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class MoveObjects extends JPanel {

    // Instance variables
    private Color skyBlue;
    private Color grassGreen;
    private Color ladybugRed;
    private static final int PANELW = 800;
    private static final int PANELH = 600;
    private static final int HORIZONY = 350;
    
    // Animation coordinates
    private int cloud1X = 200; // current cloud1 X
    private int cloud2X = 500; // current cloud2 X
    private int sunY = 100;      // Starting Y for the sun moving up
    private int animalX = -50;   // Starting X for the ladybug (animal)

    // Constructor
    public MoveObjects() {
        setFocusable(true);
        setLayout(null);

        skyBlue = new Color(79, 163, 238);
        grassGreen = new Color(93, 178, 77);
        ladybugRed = new Color(231, 24, 9);
    }

    // Set the dimension of the JPanel
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(PANELW, PANELH);
    }

    // Call methods that will draw on the JPanel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Background
        drawSky(g);
        drawGround(g);
        
        // draw a row of trees using drawTree();
        for (int i = 0; i < 6; i++) {
            drawTree(g, 75 + (i * 125), HORIZONY - 70);
        }

        // draw a row of flowers using drawFlower();
        for (int i = 0; i < 8; i++) {
            drawFlower(g, 50 + (i * 100), HORIZONY + 40);
        }

        // Animated Objects
        drawClouds(g);
        drawSun(g);
        drawLadybug(g, animalX, HORIZONY + 120);
    }

    // draw sky
    public void drawSky(Graphics g) {
        g.setColor(skyBlue);
        g.fillRect(0, 0, PANELW, HORIZONY);
    }

    // draw the ground
    private void drawGround(Graphics g) {
        g.setColor(grassGreen);
        g.fillRect(0, HORIZONY, PANELW, PANELH - HORIZONY);
    }

    // draw a sun
    private void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(650, sunY, 75, 75);
    }

    // draw 2 clouds (cloud1, cloud2)
    private void drawClouds(Graphics g) {
        g.setColor(Color.WHITE);
        
        // Cloud 1
        g.fillOval(cloud1X, 80, 60, 40);
        g.fillOval(cloud1X + 25, 65, 70, 50);
        g.fillOval(cloud1X + 65, 75, 60, 40);
        g.fillRect(cloud1X + 25, 95, 75, 25);

        // Cloud 2
        g.fillOval(cloud2X, 130, 50, 35);
        g.fillOval(cloud2X + 20, 115, 65, 45);
        g.fillOval(cloud2X + 60, 125, 50, 35);
        g.fillRect(cloud2X + 20, 140, 65, 20);
    }

    // draw animal (ladybug)
    private void drawLadybug(Graphics g, int x, int y) {
        // Body
        g.setColor(ladybugRed);
        g.fillOval(x, y, 50, 60);

        // Center line
        g.setColor(Color.BLACK);
        g.drawLine(x + 25, y, x + 25, y + 60);

        // Spots on body
        int spotRadius = 6;
        g.fillOval(x + 8, y + 15, spotRadius, spotRadius);
        g.fillOval(x + 15, y + 35, spotRadius, spotRadius);
        g.fillOval(x + 36, y + 15, spotRadius, spotRadius);
        g.fillOval(x + 29, y + 35, spotRadius, spotRadius);

        // Legs (Left)
        g.drawLine(x - 20, y + 5, x + 10, y + 15);
        g.drawLine(x - 25, y + 25, x + 10, y + 25);
        g.drawLine(x - 20, y + 45, x + 10, y + 35);
        
        // Legs (Right)
        g.drawLine(x + 40, y + 15, x + 70, y + 5);
        g.drawLine(x + 40, y + 25, x + 75, y + 25);
        g.drawLine(x + 40, y + 35, x + 70, y + 45);

        // Head
        g.fillOval(x + 13, y - 12, 24, 24);
    }

    // draw a tree
    private void drawTree(Graphics g, int x, int y) {
        // Trunk
        g.setColor(new Color(101, 67, 33));
        g.fillRect(x + 15, y + 40, 15, 50);
        // Leaves
        g.setColor(new Color(34, 139, 34));
        g.fillOval(x, y, 45, 45);
        g.fillOval(x + 10, y - 15, 35, 35);
    }

    // draw a flower
    private void drawFlower(Graphics g, int x, int y) {
        // Stem
        g.setColor(new Color(0, 100, 0));
        g.fillRect(x + 4, y + 10, 3, 20);
        // Petals
        g.setColor(Color.PINK);
        g.fillOval(x - 5, y, 10, 10);
        g.fillOval(x + 5, y, 10, 10);
        g.fillOval(x, y - 5, 10, 10);
        g.fillOval(x, y + 5, 10, 10);
        // Center
        g.setColor(Color.YELLOW);
        g.fillOval(x + 2, y + 2, 6, 6);
    }

    // animation loop
    public void animate() {
        while (true) {
            // pause for 10 milliseconds
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            // move clouds right, wrap around when off-screen
            cloud1X += 1;
            if (cloud1X > PANELW) {
                cloud1X = -150;
            }
            
            cloud2X += 1;
            if (cloud2X > PANELW) {
                cloud2X = -150;
            }

            // move sun up, wrap around to top of grass
            sunY -= 1;
            if (sunY < -75) {
                sunY = HORIZONY - 75;
            }

            // move ladybug across the screen, wrap around
            animalX += 2;
            if (animalX > PANELW) {
                animalX = -80;
            }
            
            // refresh the screen with new positions
            repaint();
        }
    }
}