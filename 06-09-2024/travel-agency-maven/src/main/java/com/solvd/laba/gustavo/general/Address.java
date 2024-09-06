package com.solvd.laba.gustavo.general;

public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String number;
    private String zipCode;

    public Address(String country, String state, String city, String street, String number, String zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address: " +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zipCode='" + zipCode + '\'';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
