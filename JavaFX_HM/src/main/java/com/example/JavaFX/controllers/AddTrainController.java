package com.example.JavaFX.controllers;

import com.example.JavaFX.Connection.ConnectationClass;
import com.example.JavaFX.PoesdApplication;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddTrainController {

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_type;

    @FXML
    private TextField txt_wagon;

    @FXML
    private TextField type_seats;

    Connection conn = null;
    PreparedStatement pst = null;




    @FXML
    public void toCancel(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        PoesdApplication.setRoot("Train");
    }
    @FXML
    public void toAddTrain(javafx.scene.input.MouseEvent mouseEvent) {
        conn = ConnectationClass.getConnection();
        String sql = "insert into train(Name,Type,Wagon,Seats)values(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_name.getText());
            pst.setString(2, txt_type.getText());
            pst.setLong(3, Long.parseLong(txt_wagon.getText()));
            pst.setLong(4, Long.parseLong(type_seats.getText()));

            pst.execute();
            JOptionPane.showMessageDialog(null, "Train Add success");
            PoesdApplication.setRoot("Train");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
