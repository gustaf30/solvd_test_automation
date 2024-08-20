package com.solvd.laba.gustavo.product;

import com.solvd.laba.gustavo.general.Address;

public class Hotel extends Booking {
    private String hotelName;
    private Address address;
    private boolean familyFriendly;
    private int luxury;

    public Hotel(Double price, String hotelName, Address address, boolean familyFriendly, int luxury) {
        super(price, Type.HOTEL);
        this.hotelName = hotelName;
        this.address = address;
        this.familyFriendly = familyFriendly;
        this.luxury = luxury;
    }

    public Hotel() {}

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + hotelName + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", address=" + address + '\'';
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public int getLuxury() {
        return luxury;
    }

    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }
}
