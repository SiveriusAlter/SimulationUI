package simulation.entities.inanimates;

import simulation.entities.interfaces.Eatable;
import simulation.entities.Entity;

public class Grass extends Entity implements Eatable {
    private int calories = 0;
    private static final int GROWTH = 10;

    public Grass( int calories) {
        this.calories = calories;
    }

    @Override
    public void makeMove() {
        calories += GROWTH;
    }

    @Override
    public int beEaten(int biteForce) {
        return calories;
    }
}
