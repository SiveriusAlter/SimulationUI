package simulation.view;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Resources {
    public static final String RESOURCES = "/simulation/view/";
    public static final String SPRITES = RESOURCES + "sprites/";

    public static final String WOLF = getSpritePath("wolf.png");
    public static final String BEAR = getSpritePath("bear.png");
    public static final String RABBIT = getSpritePath("rabbit.png");
    public static final String ROE = getSpritePath("roe.png");
    public static final String TIGER = getSpritePath("tiger.png");


    public static Image loadSprite(String path) throws FileNotFoundException {
        var imageStream = new FileInputStream(path);
        var image = new Image(imageStream);
        return image;
    }

    public static String getSpritePath(String spriteName) {
        String path = Resources.class.getResource(SPRITES + spriteName).getPath();
        return path;
    }
}
