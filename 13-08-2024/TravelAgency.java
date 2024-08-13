package com.solvd.laba.gustavo;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private String name;
    private Address address;
    private List<Employee> employeeList = new ArrayList<Employee>();
    private List<Booking> bookingsList = new ArrayList<Booking>();

    public TravelAgency(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Booking> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Booking> bookingsList) {
        this.bookingsList = bookingsList;
    }

    public void addBooking(Booking booking) {
        bookingsList.add(booking);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
