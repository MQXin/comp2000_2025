import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
    Cell location;
    ArrayList<Polygon> shapes = new ArrayList<>();

    Actor(Cell cell, Color c) {
        location = cell;
    }

    public void Paint(Graphics g) {

        if (shapes != null) {
            for (int i = 0; i < shapes.size(); i++) {
                g.drawPolygon(shapes.get(i));
                g.fillPolygon(shapes.get(i));
            }
        }
    }
}
