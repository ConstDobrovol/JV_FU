package com.example.JavaFX.controllers;

import com.example.JavaFX.ListFilesExample;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class MenuController implements Initializable {

    @FXML
    public Button ButtonAddTrip;
    @FXML
    public Button ButtonListTrain;
    @FXML
    private TableView<String> tableFutureTrip;
    @FXML
    private TableColumn<, String> From;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        From.setCellValueFactory(new PropertyValueFactory<String[], String>("From"));


        String[] listM = ListFilesExample.listFiles("/home/user/Documents");;
        tableFutureTrip.setItems(listM);
    }
}
