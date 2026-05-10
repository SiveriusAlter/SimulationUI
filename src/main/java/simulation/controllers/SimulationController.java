package simulation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.util.converter.IntegerStringConverter;
import simulation.Resources;
import simulation.entities.actions.Actions;

import java.io.FileNotFoundException;
import java.util.function.UnaryOperator;

public class SimulationController {

    @FXML
    private Button pauseButton;

    @FXML
    private Button startButton;

    @FXML
    private Button stopButton;

    @FXML
    private TextField worldSize;

    public int size;

    @FXML
    private Canvas wordMap = new Canvas();


    @FXML
    void inputWorldSize(ActionEvent event) {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getControlNewText();
            if (text.matches("\\d{2,3}")) {
                return change;
            }
            return null;
        };
    }

    @FXML
    void onPauseClick(ActionEvent event) {

    }

    @FXML
    void onStartClick(ActionEvent event) throws FileNotFoundException {
        size = Integer.parseInt(worldSize.getText());
        Actions.initActions(wordMap, size);
    }

    @FXML
    void onStopClick(ActionEvent event) {

    }
}
