import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList; // Import the ArrayList class
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid {
    public int cellWidth = 20;
    public int cellHeight = 20;
    public Cell cell = new Cell();

    public void paint(Graphics g, Point mouse1) {
        for (int i = 0; i < cellWidth; i++) {
            for (int j = 0; j < cellHeight; j++) {
                cell.paint(g, i, j, mouse1);
            }
        }
    }
}
