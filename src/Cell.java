import java.awt.Graphics;
import java.awt.Point;

public class Cell {
    public int width = 35;
    public int height = 35;

    public void paint(Graphics g, int i, int j, Point mouse1) {
        g.setColor(java.awt.Color.BLACK);
        if (mouse1.getX() >= width * i + 10 && mouse1.getX() <= width * i + width + 10 && mouse1.getY() >= 10
                + height * j && mouse1.getY() <= 10 + height * j + height) {
            g.setColor(java.awt.Color.GRAY);

            g.fillRect(10 + width * i, 10 + height * j, width, height);
        } else {
            g.drawRect(10 + width * i, 10 + height * j, width, height);
        }

    }

}
