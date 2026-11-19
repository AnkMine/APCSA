import java.awt.Graphics;
import java.awt.Color;

// this class is a data packet projectile fired upward by the player
public class DataPacket {

    // location and size of the packet
    private int x, y;
    private int width, height;

    // color of the packet
    private Color packetColor;

    // constructor sets position from the player and size
    public DataPacket(int x, int y) {
        this.x = x;
        this.y = y;
        width = 6;
        height = 16;
        packetColor = new Color(0, 255, 120);
    }

    // draw the packet
    public void draw(Graphics g) {
        g.setColor(packetColor);
        g.fillRect(x, y, width, height);
    }

    // moves the packet up the screen
    public void move() {
        y -= 7;
    }

    // checks if the packet has left the top of the screen
    public boolean isOffScreen() {
        return y + height < 0;
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
