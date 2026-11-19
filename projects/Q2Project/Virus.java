import java.awt.Graphics;
import java.awt.Color;

// this class is a rogue malware enemy in the descending formation
public class Virus {

    // location and size of the virus
    private int x, y;
    private int width, height;

    // health states, virus takes 2 packet hits to destroy
    private int health;

    // colors for full and damaged states
    private Color healthy;
    private Color damaged;

    // constructor sets grid position and size
    public Virus(int x, int y) {
        this.x = x;
        this.y = y;
        width = 40;
        height = 30;
        health = 2;
        healthy = new Color(180, 0, 255);
        damaged = new Color(255, 80, 80);
    }

    // draw the virus, color depends on health state
    public void draw(Graphics g) {
        if (health == 2) {
            g.setColor(healthy);
        } else {
            g.setColor(damaged);
        }
        g.fillRect(x, y, width, height);
    }

    // moves the virus down by dy and sideways by dx
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // this method takes in a packet and reduces health if it overlaps the virus
    public void takeDamage(DataPacket p) {
        // checks overlap between the packet rect and the virus rect
        if ((p.getX() + p.getWidth() >= x) && (p.getX() <= x + width)
                && (p.getY() + p.getHeight() >= y) && (p.getY() <= y + height)) {
            health--;
        }
    }

    // checks if the virus is destroyed
    public boolean isDead() {
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
