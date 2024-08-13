package com.solvd.laba.gustavo;

public class Customer extends Person {
    private Address address;
    private String email;

    public Customer(String name, String document, String contactNumber, Address address, String email) {
        super(name, document, contactNumber);
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " +
                ", name= " + super.getName() + '\'' +
                ", document='" + super.getDocument() + '\'' +
                ", contactNumber='" + super.getContactNumber() + '\'' +
                ", address=" + address + '\'' +
                ", email='" + email  + '\'';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
