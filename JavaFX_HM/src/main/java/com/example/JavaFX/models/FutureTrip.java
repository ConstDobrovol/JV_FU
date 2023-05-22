package com.example.JavaFX.models;

public class FutureTrip {

    private String From;
    private String To;
    private String Departure_date;
    private String Departure_time;
    private String Arrival_date;
    private String Arrival_time;
    private Long Seats;
    private Long Free_seats;

    public FutureTrip(String from, String to, String departure_date, String departure_time,
                      String arrival_date, String arrival_time, Long seats, Long free_seats) {
        this.From = from;
        this.To = to;
        this.Departure_date = departure_date;
        this.Departure_time = departure_time;
        this.Arrival_date = arrival_date;
        this.Arrival_time = arrival_time;
        this.Seats = seats;
        this.Free_seats = free_seats;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        this.From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getDeparture_date() {
        return Departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.Departure_date = departure_date;
    }

    public String getDeparture_time() {
        return Departure_time;
    }

    public void setDeparture_time(String departure_time) {
        Departure_time = departure_time;
    }

    public String getArrival_date() {
        return Arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        Arrival_date = arrival_date;
    }

    public String getArrival_time() {
        return Arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        Arrival_time = arrival_time;
    }

    public Long getSeats() {
        return Seats;
    }

    public void setSeats(Long seats) {
        Seats = seats;
    }

    public Long getFree_seats() {
        return Free_seats;
    }

    public void setFree_seats(Long free_seats) {
        Free_seats = free_seats;
    }


}
