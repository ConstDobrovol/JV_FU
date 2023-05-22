package com.example.JavaFX.controllers;

import com.example.JavaFX.Connection.ConnectationClass;
import com.example.JavaFX.PoesdApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class AddTripController implements Initializable {


    @FXML
    private TextField txt_arrival_date;

    @FXML
    private TextField txt_arrival_time;

    @FXML
    private TextField txt_base_price;

    @FXML
    private TextField txt_departure_date;

    @FXML
    private TextField txt_departure_time;

    @FXML
    private TextField txt_from;

    @FXML
    private TextField txt_to;

    @FXML
    private TextField txt_train;


    Connection conn = null;
    PreparedStatement pst = null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ToCancel(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        PoesdApplication.setRoot("Menu");
    }

    public void toAddTrip(javafx.scene.input.MouseEvent mouseEvent) {
        conn = ConnectationClass.getConnection();
        String sql = "insert into future_trip(F,T,Dd,DT,AD,AT,BasePrice,Train,Seats)values(?,?,?,?,?,?,?,?,null )";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_from.getText());
            pst.setString(2, txt_to.getText());
            pst.setString(3, txt_departure_date.getText());
            pst.setString(4, txt_departure_time.getText());
            pst.setString(5, txt_arrival_date.getText());
            pst.setString(6, txt_arrival_time.getText());
            pst.setString(7, txt_base_price.getText());
            pst.setString(8, txt_train.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Trip Add success");
            PoesdApplication.setRoot("Menu");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
