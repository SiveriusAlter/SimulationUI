package simulation.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import simulation.controllers.LayoutController;
import simulation.controllers.Router;

import java.io.IOException;

public class ApplicationWindow extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationWindow.class.getResource(Resources.LAYOUT));
        Parent root = fxmlLoader.load();
        LayoutController controller = fxmlLoader.getController();
        Router.route(controller.getLayout(), Resources.START_PAGE);
        Scene scene = new Scene(root, 1200, 800);
        Image icon = Resources.loadSprite(Resources.WOLF);
        stage.setTitle("Simulation");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

}
