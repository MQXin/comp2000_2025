import java.awt.Color;
import java.awt.Graphics;

public class Actor {
    Cell location;
    Color color;

    Actor(Cell cell, Color c) {
        location = cell;
        color = c;
    }

    public void Paint(Graphics g) {
        g.setColor(color);
        g.fillRect((int) location.getX() + 5, (int) location.getY() + 5,
                location.width - 10, location.height - 10);
    }
}
