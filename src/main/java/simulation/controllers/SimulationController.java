package simulation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class SimulationController {

    @FXML
    private Button pauseButton;

    @FXML
    private Button startButton;

    @FXML
    private Button stopButton;

    @FXML
    private TextField worldSize;

    @FXML
    private Canvas wordMap = new Canvas();


    @FXML
    void inputWorldSize(ActionEvent event) {

    }

    @FXML
    void onPauseClick(ActionEvent event) {

    }

    @FXML
    void onStartClick(ActionEvent event) {
        drawWordMap();
    }

    @FXML
    void onStopClick(ActionEvent event) {

    }

    void drawWordMap() {
        Image image = new Image(getClass().getResourceAsStream("/simulation/view/sprites/wolf.png"));
        assert wordMap != null;
        wordMap.setHeight(400);
        wordMap.setWidth(400);

        wordMap.getGraphicsContext2D().clearRect(0, 0, 400, 400);
        wordMap.getGraphicsContext2D().setFill(Color.RED);
        wordMap.getGraphicsContext2D().drawImage(image, 30, 30);
    }
}
