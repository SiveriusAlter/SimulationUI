package simulation.entities.creatures.animals;

import simulation.Resources;
import simulation.entities.creatures.Predator;

public class Wolf extends Predator {
    public Wolf() {
        super.setSpriteResourcePath(Resources.WOLF);
    }
}
