package com.solvd.laba.gustavo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Payment payment;
    private List<Package> travelPackage = new ArrayList<Package>();
    private LocalDate date;

    @Override
    public String toString() {
        return "Booking details:" +
                "bookingId=" + bookingId +
                ", customer=" + customer.getName() +
                ", price=" + payment.getAmount() +
                ", travelPackage=" + travelPackage +
                ", date=" + date;
    }

    public Booking(int bookingId, Customer customer, Payment payment) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.payment = payment;
        this.date = LocalDate.now();
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Package> getTravelPackage() {
        return travelPackage;
    }

    public void setTravelPackage(List<Package> travelPackage) {
        this.travelPackage = travelPackage;
    }

    public void addTravelPackage(Package travelPackage) {
        this.travelPackage.add(travelPackage);
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
