import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StageReader {
  public static Stage readStage(String path) throws IOException {
    Stage stage = new Stage();
    List<String> lines = Files.readAllLines(Paths.get(path));

    for (int i = 0; i < lines.size(); i++) {
      String regex = "[=]";
      String[] cellCoordinates = lines.get(i).split(regex);
      System.out.println(cellCoordinates[0]);
      System.out.println(cellCoordinates[1]);
      int columnNum = cellCoordinates[0].charAt(0) - 'A';

      int rowNum = Integer.parseInt(cellCoordinates[0].substring(1));
      System.out.println(rowNum);
      if (cellCoordinates[1].equalsIgnoreCase("cat")) {
        stage.actors.get(0).loc.setLocation(columnNum, rowNum);
        stage.actors.get(0).loc.x = columnNum;
        stage.actors.get(0).loc.row = rowNum;
        // Cell cell = stage.grid.cellAtColRow(columnNum, rowNum);
        stage.actors.get(0).loc = cell;
        System.out.println(stage.actors.get(0).loc.y);

      } else if (cellCoordinates[1] == "dog") {

      } else if (cellCoordinates[1] == "bird") {

      } else {
        System.out.println("actor doesn't exist");
      }

    }
    return new Stage();
  }
}