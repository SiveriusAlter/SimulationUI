package simulation.entities.actions;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import simulation.Resources;
import simulation.entities.Entity;
import simulation.entities.World;
import simulation.entities.creatures.animals.Wolf;

import java.awt.*;
import java.io.FileNotFoundException;

public class Actions {


    public static Canvas initActions(Canvas canvas, int size) throws FileNotFoundException {
        canvas = initCanvas(canvas, size);
        World world = createWorld(size);
        //TODO: сделать логику создания существ.
        var point = new Point(0, 0);
        var wolf = new Wolf();
        world.addEntity(point, wolf);

        return drawEntity(canvas, wolf, point);
    }

    public void turnActions() {

    }

    private static Canvas initCanvas(Canvas canvas, int size) {
        assert canvas != null;
        canvas.setHeight(size);
        canvas.setWidth(size);
        return canvas;
    }

    private static World createWorld(int size) {
        var world = new World(size, size);
        return world;
    }

    private static Canvas drawEntity(Canvas canvas, Entity entity, Point coordinate) throws FileNotFoundException {
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
