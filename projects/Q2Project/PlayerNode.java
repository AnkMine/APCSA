import java.awt.Graphics;
import java.awt.Color;

// this class is the player's system core node at the bottom of the screen
public class PlayerNode {

    // location and size of the player
    private int x, y;
    private int width, height;

    // colors for the core node
    private Color core;

    // constructor sets position and size
    public PlayerNode(int x, int y) {
        this.x = x;
        this.y = y;
        width = 50;
        height = 40;
        core = new Color(0, 200, 255);
    }

    // draw the player
    public void draw(Graphics g) {
        g.setColor(core);
        g.fillRect(x, y, width, height);
    }

    // moves the player left or right, dir is -1 or 1
    public void move(int dir) {
        x += dir * 8;

        // keeps the player inside the panel bounds
        if (x < 0) {
            x = 0;
        } else if (x + width > 800) {
            x = 800 - width;
        }
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
