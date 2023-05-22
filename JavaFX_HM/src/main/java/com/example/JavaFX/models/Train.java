package com.example.JavaFX.models;

public class Train {
    private String Name;
    private String Type;
    private Long Wagon;
    private Long Seats;

    public Train(String name, String type, Long wagon, Long seats) {
        Name = name;
        Type = type;
        Wagon = wagon;
        Seats = seats;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Long getWagon() {
        return Wagon;
    }

    public void setWagon(Long wagon) {
        Wagon = wagon;
    }

    public Long getSeats() {
        return Seats;
    }

    public void setSeats(Long seats) {
        Seats = seats;
    }
}
