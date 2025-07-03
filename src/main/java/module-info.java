module com.pepe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.pepe.EjemploGUI to javafx.fxml;
    exports com.pepe.EjemploGUI;
}