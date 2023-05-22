package com.example.JavaFX.controllers;

import com.example.JavaFX.Connection.ConnectationClass;
import com.example.JavaFX.PoesdApplication;
import com.example.JavaFX.models.FutureTrip;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML
    public Button ButtonAddTrip;
    @FXML
    public Button ButtonListTrain;
    @FXML
    private TableView<FutureTrip> tableFutureTrip;
    @FXML
    private TableColumn<FutureTrip, String> From;
    @FXML
    private TableColumn<FutureTrip, String> To;
    @FXML
    private TableColumn<FutureTrip, String> Departure_date;
    @FXML
    private TableColumn<FutureTrip, String> Departure_time;
    @FXML
    private TableColumn<FutureTrip, String> Arrival_date;
    @FXML
    private TableColumn<FutureTrip, String> Arrival_time;
    @FXML
    private TableColumn<FutureTrip, Long> Seats;
    @FXML
    private TableColumn<FutureTrip, Long> Free_seats;

    ObservableList<FutureTrip> listM;

    int index = -1;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        From.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("From"));
        To.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("To"));
        Departure_date.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("Departure_date"));
        Departure_time.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("Departure_time"));
        Arrival_date.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("Arrival_date"));
        Arrival_time.setCellValueFactory(new PropertyValueFactory<FutureTrip, String>("Arrival_time"));
        Seats.setCellValueFactory(new PropertyValueFactory<FutureTrip, Long>("Seats"));
        Free_seats.setCellValueFactory(new PropertyValueFactory<FutureTrip, Long>("Free_seats"));

        listM = ConnectationClass.getDataFutureTrip();
        tableFutureTrip.setItems(listM);
    }

    public void toAddTrip(ActionEvent actionEvent) throws IOException {
        PoesdApplication.setRoot("Add_Trip");
    }

    public void toListTrain(ActionEvent actionEvent) throws IOException {
        PoesdApplication.setRoot("Train");
    }
}
