import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUI extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
    Scene scene = new Scene(root, 800, 640);
    stage.setTitle("FXML Welcome");
    stage.setScene(scene);
    stage.show();

  }
}
