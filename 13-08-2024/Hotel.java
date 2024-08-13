package com.solvd.laba.gustavo;

public class Hotel extends Package {
    private Address address;
    private int totalRooms;
    private int emptyRooms;

    public Hotel(Double price, String packageName, Address address, int emptyRooms, int totalRooms) {
        super(price, packageName);
        this.address = address;
        this.emptyRooms = emptyRooms;
        this.totalRooms = totalRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + super.getPackageName() + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", address=" + address + '\'' +
                ", totalRooms=" + totalRooms  + '\'' +
                ", emptyRooms=" + emptyRooms + '\'';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmptyRooms() {
        return emptyRooms;
    }

    public void setEmptyRooms(int emptyRooms) {
        this.emptyRooms = emptyRooms;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }
}
