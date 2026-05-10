package simulation;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Path.*;

public class Resources {

    public static final Path BASE_PATH = of(Paths.get("").toAbsolutePath()
            .toString())
            .resolve()
            .resolve("view")
            .resolve("sprites");
    public static final Path WOLF_PATH = getSpritePath("wolf.png");
    public static final Path BEAR = getSpritePath("bear.png");
    public static final Path RABBIT = getSpritePath("rabbit.png");
    public static final Path ROE = getSpritePath("roe.png");
    public static final Path TIGER = getSpritePath("tiger.png");


    public static Image loadSprite(Path path) throws FileNotFoundException {
        var imageStream = new FileInputStream(path.toFile());
        var image = new Image(imageStream);
        return image;
    }

    public static Path getSpritePath(String spriteName) {
        Path path = of(BASE_PATH.toString()).resolve(spriteName);
        return path;
    }
}
