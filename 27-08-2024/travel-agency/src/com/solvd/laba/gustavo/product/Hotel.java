package com.solvd.laba.gustavo.product;

import com.solvd.laba.gustavo.general.Address;
import com.solvd.laba.gustavo.interfaces.Bookable;
import com.solvd.laba.gustavo.interfaces.Rateable;
import com.solvd.laba.gustavo.interfaces.Reviewable;

public class Hotel extends Booking implements Bookable, Reviewable, Rateable {
    private String hotelName;
    private Address address;
    private boolean familyFriendly;
    private boolean luxury;

    public Hotel(Double price, String hotelName, Address address, boolean familyFriendly, boolean luxury) {
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
                "name: '" + hotelName + '\'' +
                "address: " + address + '\'';
    }

    @Override
    public void book() {
        System.out.println("Hotel booked.");
    }

    @Override
    public void review() {
        System.out.println("Hotel reviewed.");
    }

    @Override
    public void rate(int rating) {
        System.out.println("Hotel rated with " + rating + " stars.");
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

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }
}
