package simulation.entities.actions;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import simulation.Resources;

import java.io.FileNotFoundException;

public class Actions {

    public static Canvas initActions(Canvas canvas, int size) throws FileNotFoundException {
        Image image = Resources.loadSprite(Resources.WOLF);
        assert canvas != null;
        canvas.setHeight(size);
        canvas.setWidth(size);

        canvas.getGraphicsContext2D().clearRect(0, 0, size, size);
        canvas.getGraphicsContext2D().setFill(Color.RED);
        canvas.getGraphicsContext2D().drawImage(image, 30, 30);

        return canvas;
    }

    public void turnActions() {

    }
}
