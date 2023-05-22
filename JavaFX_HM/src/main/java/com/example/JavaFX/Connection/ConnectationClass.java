package com.example.JavaFX.Connection;


import com.example.JavaFX.models.FutureTrip;
import com.example.JavaFX.models.Train;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class ConnectationClass {

    public static Connection getConnection() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poesda", "root", "root");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static ObservableList<FutureTrip> getDataFutureTrip() {
        Connection conn = getConnection();
        ObservableList<FutureTrip> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select F,T,Dd,DT,AD,AT,Seats,Free_seats from future_trip");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new FutureTrip(rs.getNString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8)));
            }
        } catch (Exception e) {

        }

        return list;
    }

    public static ObservableList<Train> getDataTrain() {
        Connection conn = getConnection();
        ObservableList<Train> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select Name,Type, Wagon , Seats from train");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Train(rs.getNString(1), rs.getString(2), rs.getLong(3), rs.getLong(4)));
            }
        } catch (SQLException e) {

        }

        return list;
    }
}
