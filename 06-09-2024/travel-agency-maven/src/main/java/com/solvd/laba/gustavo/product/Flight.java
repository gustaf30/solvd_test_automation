package com.solvd.laba.gustavo.product;

import com.solvd.laba.gustavo.interfaces.Bookable;
import com.solvd.laba.gustavo.interfaces.Cancellable;
import com.solvd.laba.gustavo.interfaces.Rateable;

public class Flight extends Booking implements Bookable, Cancellable, Rateable {
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
                "flight number: " + flightNumber + '\'' +
                "origin: '" + origin + '\'' +
                "destination: '" + destination.getName() + '\'';
    }

    @Override
    public void book() {
        System.out.println("Flight booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Flight cancelled.");
    }

    @Override
    public void rate(int rating) {
        System.out.println("Flight rated with " + rating + " stars.");
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
