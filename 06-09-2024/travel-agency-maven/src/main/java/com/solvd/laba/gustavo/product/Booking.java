package com.solvd.laba.gustavo.product;

public abstract class Booking {
    private Double price;
    public enum Type{FLIGHT, HOTEL, TOUR;}
    private Type type;

    public Booking(Double price, Type type) {
        this.price = price;
        this.type = type;
    }

    public Booking() {

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
