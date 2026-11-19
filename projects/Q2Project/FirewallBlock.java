import java.awt.Graphics;
import java.awt.Color;

// this class is a destructible firewall barrier the player hides behind
public class FirewallBlock {

    // location and size of the barrier
    private int x, y;
    private int width, height;

    // health states, barrier takes 3 bomb hits before it collapses
    private int health;

    // colors for the 3 health states
    private Color strong;
    private Color weak;
    private Color critical;

    // constructor sets position, size and full health
    public FirewallBlock(int x, int y) {
        this.x = x;
        this.y = y;
        width = 80;
        height = 24;
        health = 3;
        strong = new Color(0, 160, 255);
        weak = new Color(255, 190, 0);
        critical = new Color(255, 60, 60);
    }

    // draw the barrier, color depends on health state
    public void draw(Graphics g) {
        if (health == 3) {
            g.setColor(strong);
        } else if (health == 2) {
            g.setColor(weak);
        } else {
            g.setColor(critical);
        }
        g.fillRect(x, y, width, height);
    }

    // this method takes in a bomb position and lowers health if it hits the barrier
    public void takeDamage(int bombX, int bombY) {
        // checks overlap between the bomb point and the barrier rect
        if ((bombX >= x) && (bombX <= x + width) && (bombY >= y) && (bombY <= y + height)) {
            health--;
        }
    }

    // checks if the barrier has collapsed
    public boolean isDestroyed() {
        return health <= 0;
    }

    // method that returns this.x
    public int getX() {
        return x;
    }

    // method that returns this.y
    public int getY() {
        return y;
    }

    // method that returns this.width
    public int getWidth() {
        return width;
    }

    // method that returns this.height
    public int getHeight() {
        return height;
    }
}
