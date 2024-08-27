package com.solvd.laba.gustavo.product;

import com.solvd.laba.gustavo.interfaces.Bookable;
import com.solvd.laba.gustavo.interfaces.Cancellable;
import com.solvd.laba.gustavo.interfaces.Reviewable;

public class Tour extends Booking implements Bookable, Cancellable, Reviewable {
    private String location;
    private String duration;
    private String description;
    private String city;

    public Tour(Double price, String location, String duration, String city) {
        super(price, Type.TOUR);
        this.location = location;
        this.duration = duration;
        this.city = city;
    }

    public Tour() {}

    @Override
    public String toString() {
        return "Tour: " +
                "description: '" + description + '\'';
    }

    @Override
    public void book() {
        System.out.println("Tour booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Tour cancelled.");
    }

    @Override
    public void review() {
        System.out.println("Tour reviewed.");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
