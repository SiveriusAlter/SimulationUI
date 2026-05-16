package simulation.entities.creatures.animals;

import simulation.view.Resources;
import simulation.entities.creatures.Omnivore;

public class Bear extends Omnivore {

    public Bear() {
        super.setSpriteResourcePath(Resources.BEAR);
    }
}
