package com.solvd.laba.gustavo.service;

import com.solvd.laba.gustavo.general.Order;
import com.solvd.laba.gustavo.general.Payment;
import com.solvd.laba.gustavo.general.TravelAgency;
import com.solvd.laba.gustavo.people.Customer;
import com.solvd.laba.gustavo.product.Booking;

import java.util.List;

public class TravelAgencyService {
    private final TravelAgency travelAgency;

    public TravelAgencyService(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }

    public void addOrder(int orderId, Customer customer, int paymentId, int amount, String method, List<Booking> bookings) {
        Payment payment = new Payment(method, amount, paymentId);
        Order order = new Order(orderId, bookings, payment, customer);
        travelAgency.getOrdersList().add(order);
    }
}
