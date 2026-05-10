package simulation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class Simulation extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Simulation.class.getResource("/simulation/view/simulation.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        Image icon = Resources.loadSprite(Resources.WOLF_PATH);
        stage.setTitle("Simulation");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
}
