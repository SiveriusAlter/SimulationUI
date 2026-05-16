package simulation.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class LayoutController {
    @FXML
    private StackPane layout;

    public void route(String fxml) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource(fxml));
        layout.getChildren().setAll(view);
    }
}
