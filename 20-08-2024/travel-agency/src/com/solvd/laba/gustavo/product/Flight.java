package com.solvd.laba.gustavo.product;

import java.awt.geom.FlatteningPathIterator;

public class Flight extends Booking {
    private int flightNumber;
    private String airline;
    private String departureTime;
    private String arrivalTime;
    private String origin;
    private Destination destination;

    public Flight(Double price, int flightNumber, Destination destination, String origin, String arrivalTime, String departureTime, String airline) {
        super(price, Type.FLIGHT);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.airline = airline;
    }

    public Flight() {}

    @Override
    public String toString() {
        return "Flight: " +
                "flightNumber=" + flightNumber +
                ", airline='" + airline + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price='" + super.getPrice() + '\'';
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
