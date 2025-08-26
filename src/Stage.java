import java.awt.Graphics;
import java.util.ArrayList; // Import the ArrayList class

public class Stage {
    Grid grid;
    ArrayList<Actor> actors = new ArrayList<Actor>();

    Stage(Grid g) {
        grid = g;
    }

    public void paintActors(Graphics g) {
        for (int i = 0; i < actors.size(); i++) {
            actors.get(i).Paint(g);
        }
    }
}
