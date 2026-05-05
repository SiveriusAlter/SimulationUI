module org.example.simulationui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.simulationui to javafx.fxml;
    exports org.example.simulationui;
}