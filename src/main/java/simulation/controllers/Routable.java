package simulation.controllers;

import javafx.scene.layout.StackPane;

import java.io.IOException;

public interface Routable {

    public StackPane getLayout();

    public void setLayout(StackPane layout);
}
