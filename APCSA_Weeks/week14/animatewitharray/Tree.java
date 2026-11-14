import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Tree extends JPanel {

    private Color treeTrunkColor;
    private Color leafOrange;
    private int x, y;

    public Tree(int x, int y) {
        treeTrunkColor = new Color(80, 70, 65);
        leafOrange = new Color(230, 132, 14);
        this.x = x;
        this.y = y;
    }
    
    public void drawTree(Graphics g) {
        // tree size vars
		int trunkW = 20;
		int trunkH = 50;
		int treeCrownSize = 50;
		// tree trunk
		g.setColor(treeTrunkColor);
		g.fillRect(x, y, trunkW, trunkH);

        g.drawLine(x, y + 10, x - 10, y - 30);


        g.drawLine(x + trunkW, y + 10, x + 35, y - 25);

        // secondary branches
        g.drawLine(x + 10, y, x + 10, y - 45);
        g.drawLine(x + 3, y + 25, x - 20, y - 10);
        g.drawLine(x + 17, y + 25, x + 45, y - 5);

        g.setColor(leafOrange);
		g.fillOval(x - 15, y - 45, treeCrownSize, treeCrownSize);
    }
    

}