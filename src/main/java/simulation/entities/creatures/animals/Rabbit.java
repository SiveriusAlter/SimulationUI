package simulation.entities.creatures.animals;

import simulation.view.Resources;
import simulation.entities.creatures.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super.setSpriteResourcePath(Resources.RABBIT);
    }
}
