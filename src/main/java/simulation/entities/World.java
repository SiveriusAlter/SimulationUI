package simulation.entities;

import simulation.entities.interfaces.Eatable;

import java.awt.Point;
import java.util.HashMap;
import java.util.List;

public class World {

    public HashMap<Point, Entity> map;

    public Entity getEntity(Point point) {

        return map.get(point);
    }

    public void deleteEntity(Point point) {
        map.remove(point);
    }

    public List<Eatable> scan() {
        return List.of();
    }
}
