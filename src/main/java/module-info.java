module com.pepe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.base;
	requires java.sql;
    opens com.pepe.EjemploGUI to javafx.fxml;
    opens com.pepe.EjemploGUI.Models to javafx.base;
    exports com.pepe.EjemploGUI;
}