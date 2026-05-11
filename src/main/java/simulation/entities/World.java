package simulation.entities;

import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {

    private int height;
    private int width;
    private int cellSize = 20;

    private Map<Point, Entity> entities = new HashMap<Point, Entity>();

    public World(int sideSize, int cellSize) {
        this.height = sideSize;
        this.width = sideSize;
        this.cellSize = cellSize;
    }

    public World(int height, int width, int cellSize) {
        this.height = height;
        this.width = width;
        this.cellSize = cellSize;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Entity getEntity(Point point) {

        return entities.get(point);
    }

    public void addEntity(Point point, Entity entity) {
        entities.put(point, entity);
    }

    public void deleteEntity(Point point) {

        entities.remove(point);
    }

    public Point getNearestEntity(Point point) {
        double distance = Double.MAX_VALUE;
        Point nearestPoint = null;

        for (Point p : entities.keySet()) {
            double d = point.distance(p);

            if (!p.equals(point) && d < distance)
            {
                distance = point.distance(p);
                nearestPoint = p;
            }
        }
        return nearestPoint;
    }

    public List<Point> scan() {
        return List.of();
    }
}
