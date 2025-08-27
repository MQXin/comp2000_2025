import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList; // Import the ArrayList class
import java.util.Optional;

public class Stage {
    Grid grid;
    ArrayList<Actor> actors = new ArrayList<Actor>();

    Stage(Grid layout, Point p, Graphics g) {
        grid = layout;
        Bird bird = new Bird(grid.cells[0][0], Color.GREEN);
        Dog dog = new Dog(grid.cells[2][5], Color.YELLOW);
        Cat cat = new Cat(grid.cells[1][5], Color.BLUE);
        actors.add(bird);
        actors.add(dog);
        actors.add(cat);

        Optional<Cell> c = grid.cellAtPoint(p);
        if (c.isPresent()) {
            g.drawString(c.get().toString(), 800, 400);

        }
    }

    public void paintActors(Graphics g) {
        for (int i = 0; i < actors.size(); i++) {
            actors.get(i).Paint(g);
        }
    }
}
