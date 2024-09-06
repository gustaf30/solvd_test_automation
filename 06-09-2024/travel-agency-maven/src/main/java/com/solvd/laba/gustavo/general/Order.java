package com.solvd.laba.gustavo.general;

import com.solvd.laba.gustavo.people.Customer;
import com.solvd.laba.gustavo.product.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private Payment payment;
    private List<Booking> bookings = new ArrayList<Booking>();
    private LocalDate date = LocalDate.now();

    @Override
    public String toString() {
        return "Order details:" +
                "bookingId=" + orderId +
                ", customer=" + customer.getName() +
                ", price=" + payment.getAmount() +
                ", travelPackage=" + bookings +
                ", date=" + date;
    }

    public Order(int orderId, List<Booking> bookings, Payment payment, Customer customer) {
        this.orderId = orderId;
        this.date = LocalDate.now();
        this.bookings = bookings;
        this.payment = payment;
        this.customer = customer;
    }

    public Order() {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBookings(Booking booking) {
        this.bookings.add(booking);
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
