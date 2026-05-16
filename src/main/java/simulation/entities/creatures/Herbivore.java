package simulation.entities.creatures;

public class Herbivore extends Creature
{

    @Override
    public int beEaten(int biteForce) {
        return getHitPoints();
    }

    @Override
    public void makeMove() {

    }
}
