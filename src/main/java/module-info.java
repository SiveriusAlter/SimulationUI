module org.example.simulation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens simulation to javafx.fxml;
    exports simulation;
    exports simulation.controllers;
    opens simulation.controllers to javafx.fxml;
}