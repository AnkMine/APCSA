import java.awt.Color;
import java.awt.Graphics;

public class Triangle {
    // Instance Variables
    private int x, y, startX, startY;
    private int[] xArray, yArray;
    private Color color;

    // Constructor
    public Triangle(int x, int y, Color color) {
        // initialize instance variables
        this.x = x;
        startX = x;
        this.y = y;
        startY = y;
        xArray = new int[3];
        yArray = new int[3];
        this.color = color;
    }

    // Draw a Triangle
    public void drawTriangle(Graphics g) {
        // set the color
        g.setColor(color);
        

        // Set up the coordinate arrays
        xArray[0] = x;
        xArray[1] = x - 50;
        xArray[2] = x + 50;
        yArray[0] = y;
        yArray[1] = y + 100;
        yArray[2] = y + 100;
        // Draw the triangle
        g.fillPolygon(xArray, yArray, 3);
    }


    // Move a Triangle
    public void moveRight() {
        if (x > 800) {
            x = startX;
        } else {
            x += 5;
        }
    }

    public void moveDown() {
        if (y > 600) { 
            y = startY;
        } else {
            y += 3;
        }
    }

}
