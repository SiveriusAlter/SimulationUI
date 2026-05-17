package simulation.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class LayoutController implements Routable {

    @FXML
    private StackPane layout;

    @Override
    public StackPane getLayout() {
        return layout;
    }

    @Override
    public void setLayout(StackPane layout) {
        this.layout = layout;
    }
}
