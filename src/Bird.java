import java.awt.Color;
import java.awt.Polygon;

public class Bird extends Actor {
    Bird(Cell cell, Color c) {
        super(cell, c);

        Polygon wing1 = new Polygon();
        wing1.addPoint(location.x + 5, location.y + 5);
        wing1.addPoint(location.x + 15, location.y + 17);
        wing1.addPoint(location.x + 5, location.y + 17);
        Polygon wing2 = new Polygon();
        wing2.addPoint(location.x + 30, location.y + 5);
        wing2.addPoint(location.x + 20, location.y + 17);
        wing2.addPoint(location.x + 30, location.y + 17);
        Polygon body = new Polygon();
        body.addPoint(location.x + 15, location.y + 10);
        body.addPoint(location.x + 20, location.y + 10);
        body.addPoint(location.x + 20, location.y + 25);
        body.addPoint(location.x + 15, location.y + 25);

        super.shapes.add(wing1);
        super.shapes.add(wing2);
        super.shapes.add(body);
    }
}
