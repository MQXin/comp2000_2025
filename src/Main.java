import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
  public static void main(String[] args) throws Exception {
    Main window = new Main();
    window.run();
  }

  class Canvas extends JPanel {
    Grid grid = new Grid();

    public Canvas() {
      setPreferredSize(new Dimension(720, 720));
    }

    @Override
    public void paint(Graphics g) {
      grid.paint(g, getMousePosition());
      Stage stage = new Stage(grid);
      Bird bird = new Bird(stage.grid.cells[0][0], Color.GREEN);
      Dog dog = new Dog(stage.grid.cells[2][5], Color.YELLOW);
      Cat cat = new Cat(stage.grid.cells[1][5], Color.BLUE);
      stage.actors.add(bird);
      stage.actors.add(dog);
      stage.actors.add(cat);

      stage.paintActors(g);

    }
  }

  private Main() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Canvas();
    this.setContentPane(canvas);
    this.pack();
    this.setVisible(true);
  }

  public void run() {
    while (true) {
      repaint();
    }
  }
}
