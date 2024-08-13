package com.solvd.laba.gustavo;

public class Tour extends Package {
    private String location;
    private String duration;
    private String description;

    public Tour(Double price, String packageName, String location, String duration) {
        super(price, packageName);
        this.location = location;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Tour: " +
                "name='" + super.getPackageName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", location='" + location + '\'' +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'';
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
