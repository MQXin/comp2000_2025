import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

public class Grid {
  // fields
  Cell[][] cells = new Cell[20][20];

  // constructors
  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j] = new Cell(10 + Cell.size * i, 10 + Cell.size * j);
      }
    }
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }

  public Optional<Cell> cellAtPoint(Point p) {
    if (p == null || p.x < 10 || p.y < 10) {
      return Optional.empty();
    }

    int x = ((p.x) / Cell.size);
    int y = ((p.y) / Cell.size);

    if (y <= cells.length - 1 && x <= cells[y].length - 1) {
      return Optional.ofNullable(cells[x][y]);
    }

    return Optional.empty();

  }
}
