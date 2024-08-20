package com.solvd.laba.gustavo.product;

public class Tour extends Booking {
    private String location;
    private String duration;
    private String description;

    public Tour(Double price, String location, String duration) {
        super(price, Type.TOUR);
        this.location = location;
        this.duration = duration;
    }

    public Tour() {}

    @Override
    public String toString() {
        return "Tour: " +
                "description='" + description + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'';
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
}
