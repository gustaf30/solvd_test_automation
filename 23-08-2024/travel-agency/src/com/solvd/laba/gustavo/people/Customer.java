package com.solvd.laba.gustavo.people;

import com.solvd.laba.gustavo.general.Address;
import com.solvd.laba.gustavo.general.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private Address address;
    private String email;
    private List<Order> orders = new ArrayList<Order>();

    public Customer(String name, String document, String contactNumber, Address address, String email) {
        super(name, document, contactNumber);
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "name= " + name + '\'' +
                ", document='" + document + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
