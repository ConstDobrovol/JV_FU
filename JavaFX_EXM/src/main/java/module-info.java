module com.example.chernovik {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires mysql.connector.j;
    opens com.example.JavaFX.models to javafx.base;

    opens com.example.JavaFX to javafx.fxml;
    exports com.example.JavaFX;
    exports com.example.JavaFX.controllers;
    opens com.example.JavaFX.controllers to javafx.fxml;
    exports com.example.JavaFX.Connection;
    opens com.example.JavaFX.Connection to javafx.fxml;
}