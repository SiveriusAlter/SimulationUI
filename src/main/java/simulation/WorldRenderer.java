package simulation;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import simulation.entities.Entity;
import simulation.entities.creatures.animals.Wolf;

import java.awt.*;
import java.io.FileNotFoundException;

public class WorldRenderer {

    public Canvas drawWorld(Canvas canvas, Simulation simulation) throws FileNotFoundException {
        canvas = initCanvas(canvas, simulation.getSize());
        //TODO: сделать логику создания существ.
        var point = new Point(100, 100);
        var wolf = new Wolf();
        var world = simulation.getWorld();
        world.addEntity(point, wolf);

        return drawEntity(canvas, wolf, point);
    }

    public void turnActions(Canvas canvas) {

    }

    public Canvas clearWorld(Canvas canvas) {
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        return canvas;
    }

    private Canvas initCanvas(Canvas canvas, int size) {
        assert canvas != null;
        canvas.setHeight(size);
        canvas.setWidth(size);
        return canvas;
    }

    private Canvas drawEntity(Canvas canvas, Entity entity, Point coordinate) throws FileNotFoundException {
        String spritePath = entity.getSpriteResourcePath();
        Image sprite = Resources.loadSprite(spritePath) ;
        int x = (int) coordinate.getX();
        int y = (int) coordinate.getY();

        var graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.RED);
        graphics.drawImage(sprite, x, y);

        return canvas;
    }
}
