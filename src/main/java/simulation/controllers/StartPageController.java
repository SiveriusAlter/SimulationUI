package simulation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import simulation.view.Resources;

import java.io.IOException;

public class StartPageController implements Routable {
    @FXML
    private ChoiceBox<?> chooseSize;

    @FXML
    private TextField mainTitle;

    @FXML
    private Button startButton;

    private StackPane root;

    @FXML
    public void onStartClick(ActionEvent event) throws IOException {
        Router.route(root, Resources.SIMULATION);
    }

    @Override
    public StackPane getLayout() {
        return root;
    }

    @Override
    public void setLayout(StackPane layout) {
        this.root = layout;
    }
}
