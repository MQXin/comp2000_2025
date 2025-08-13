import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
  public static void main(String[] args) throws Exception {
    Main window = new Main();
    window.run();
  }

  class Canvas extends JPanel {
    public Point mouse1 = new Point();

    public Canvas() {
      setPreferredSize(new Dimension(720, 720));
    }

    @Override
    public void paint(Graphics g) {
      mouse1 = getMousePosition();
      Grid grid = new Grid();
      grid.paint(g, mouse1);
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
