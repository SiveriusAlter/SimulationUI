package simulation.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class Router {

    public static void route(StackPane layout, String fxml) throws IOException {
        var fxmlLoader = new FXMLLoader(LayoutController.class.getResource(fxml));
        Parent view = fxmlLoader.load();
        Routable controller = fxmlLoader.getController();
        if (controller != null) {
            controller.setLayout(layout);
            layout.getChildren().setAll(view);
        }
    }

}
