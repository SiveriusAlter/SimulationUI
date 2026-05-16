package simulation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import simulation.engine.Simulation;
import simulation.view.renderers.WorldRenderer;

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

    private Simulation simulation;

    private WorldRenderer worldRenderer;

    @FXML
    public void initialize() {
        changeState();
    }


    @FXML
    public void inputWorldSize(ActionEvent event) {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getControlNewText();
            if (text.matches("\\d{2,3}")) {
                return change;
            }
            return null;
        };
    }

    @FXML
    public void onPauseClick(ActionEvent event) {
        changeState();
    }

    @FXML
    public void onStartClick(ActionEvent event) throws FileNotFoundException {
        worldRenderer = new WorldRenderer();

        size = Integer.parseInt(worldSize.getText());
        simulation = new Simulation(size);
        worldRenderer.drawWorld(wordMap, simulation);
        changeState();
    }

    @FXML
    public void onStopClick(ActionEvent event) {
        worldRenderer.clearWorld(wordMap);
        worldRenderer = null;
        simulation = null;
        changeState();
    }

    private void changeState() {
        boolean isRun = false;
        if (simulation != null) {
            var state = simulation.getSimulationState();
            switch(state) {
                case INITIAL:
                case RUNNING:
                    isRun = true;
                    break;
                case PAUSED:
                case FINISHED:
                case null:
                default:
                    isRun = false;
                    break;
            }
        }
        startButton.setDisable(isRun);
        startButton.setVisible(!isRun);
        pauseButton.setDisable(!isRun);
        pauseButton.setVisible(isRun);
        worldSize.setDisable(isRun);
        stopButton.setVisible(isRun);
        stopButton.setDisable(!isRun);
    }
}
