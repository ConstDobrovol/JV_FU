package com.example.JavaFX.controllers;

import com.example.JavaFX.Connection.ConnectationClass;
import com.example.JavaFX.PoesdApplication;
import com.example.JavaFX.models.Train;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;


public class TrainController implements Initializable {
    @FXML
    private TableView<Train> tableTrain;
    @FXML
    private TableColumn<Train, String> Name;
    @FXML
    private TableColumn<Train, String> Type;
    @FXML
    private TableColumn<Train, Long> Wagon;
    @FXML
    private TableColumn<Train, Long> Seats;

    ObservableList<Train> listT;

    int index = -1;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Name.setCellValueFactory(new PropertyValueFactory<Train, String>("Name"));
        Type.setCellValueFactory(new PropertyValueFactory<Train, String>("Type"));
        Wagon.setCellValueFactory(new PropertyValueFactory<Train, Long>("Wagon"));
        Seats.setCellValueFactory(new PropertyValueFactory<Train, Long>("Seats"));


        listT = ConnectationClass.getDataTrain();
        tableTrain.setItems(listT);
    }



    public void ToBack(ActionEvent actionEvent) throws IOException {
        PoesdApplication.setRoot("Menu");
    }

    public void ToAddTrain(MouseEvent mouseEvent) throws IOException {
        PoesdApplication.setRoot("Add_Train");
    }
}

