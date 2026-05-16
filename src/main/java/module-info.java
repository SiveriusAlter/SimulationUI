module simulation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens simulation to javafx.fxml;
    exports simulation;
    exports simulation.controllers;
    opens simulation.controllers to javafx.fxml;
    exports simulation.view;
    opens simulation.view to javafx.fxml;
    exports simulation.engine;
    opens simulation.engine to javafx.fxml;
}