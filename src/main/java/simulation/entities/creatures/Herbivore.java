package simulation.entities.creatures;

public class Herbivore extends Creature
{
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public int beEaten(int biteForce) {
        return getHitPoints();
    }
}
