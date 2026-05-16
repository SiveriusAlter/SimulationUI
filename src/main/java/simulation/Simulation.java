package simulation;

import simulation.entities.World;

public class Simulation {

    private World world;
    private int size;

    private SimulationState simulationState;


    public Simulation(int size) {
        this.size = size;
        createWorld();
        simulationState = SimulationState.INITIAL;
    }

    public SimulationState getSimulationState() {
        return simulationState;
    }

    public void setSimulationState(SimulationState simulationState) {
        this.simulationState = simulationState;
    }


    public World getWorld() {
        return world;
    }

    public int getSize() {
        return size;
    }

    private void createWorld() {
        world = new World(size, size);
    }

}
