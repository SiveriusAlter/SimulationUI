package simulation.entities.creatures.animals;

import simulation.Resources;
import simulation.entities.creatures.Predator;

public class Tiger extends Predator {
    public Tiger() {
        super.setSpriteResourcePath(Resources.TIGER);
    }
}