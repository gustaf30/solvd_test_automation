package com.solvd.laba.gustavo.service;

import com.solvd.laba.gustavo.general.Address;
import com.solvd.laba.gustavo.general.Order;
import com.solvd.laba.gustavo.general.Payment;
import com.solvd.laba.gustavo.general.TravelAgency;
import com.solvd.laba.gustavo.people.Customer;
import com.solvd.laba.gustavo.people.Employee;
import com.solvd.laba.gustavo.product.*;

import java.util.List;

public class TravelAgencyService {

    public TravelAgencyService() {}

    public void addOrder(int orderId, Customer customer, int paymentId, int amount, String method, List<Booking> bookings) {
        Payment payment = new Payment(method, amount, paymentId);
        Order order = new Order(orderId, bookings, payment, customer);
    }

    public TravelAgency createTravelAgency(String name, Address address) {
        TravelAgency travelAgency = new TravelAgency(name, address);

        Address address2 = new Address("United States", "California", "New York", "Sunset Boulevard", "1234", "90026");

        Employee employee1 = new Employee("Lucas Silva", "123.456.789-00", "+55 11 98765-4321", 1001.00, "Travel Agent", 1);
        Employee employee2 = new Employee("Maria Oliveira", "987.654.321-00", "+55 21 99876-5432", 1002.00, "Sales Manager", 2);
        Employee employee3 = new Employee("João Pereira", "456.123.789-00", "+55 31 91234-5678", 1003.00, "Tour Guide", 3);

        Destination destination1 = new Destination(
                "Maldives",
                true,
                false,
                true,
                true,
                true,
                10,
                false,
                true
        );

        Destination destination2 = new Destination(
                "Paris",
                false,
                true,
                true,
                true,
                false,
                5,
                true,
                true
        );

        Destination destination3 = new Destination(
                "Swiss Alps",
                false,
                false,
                false,
                false,
                true,
                2,
                true,
                true
        );

        Destination destination4 = new Destination(
                "Tokyo",
                false,
                false,
                true,
                true,
                false,
                7,
                true,
                true
        );

        Destination destination5 = new Destination(
                "New York",
                false,
                false,
                true,
                false,
                false,
                5,
                true,
                true
        );

        Flight flight1 = new Flight(
                1200.00,
                1234,
                destination5,
                "2024-09-10 10:00 AM",
                "2024-09-10 02:00 PM",
                "São Paulo - GRU",
                "New York - JFK"
        );

        Flight flight2 = new Flight(
                1200.00,
                1234,
                destination3,
                "2024-09-10 10:00 AM",
                "2024-09-10 02:00 PM",
                "São Paulo - GRU",
                "New York - JFK"
        );

        Hotel hotel1 = new Hotel(
                800.00,
                "The Plaza Hotel",
                address2,
                true,
                true
        );

        Hotel hotel2 = new Hotel(
                800.00,
                "The Other Hotel",
                address2,
                true,
                false
        );

        Tour tour1 = new Tour(
                200.00,
                "3h",
                "Guided tour of the Statue of Liberty and Ellis Island.",
                "New York"
        );

        Tour tour2 = new Tour(
                200.00,
                "3h",
                "2 Guided tour of the Statue of Liberty and Ellis Island.",
                "New York"
        );

        Tour tour3 = new Tour(
                200.00,
                "3h",
                "Guided tour of the Statue of Liberty and Ellis Island.",
                "Tokyo"
        );

        travelAgency.addDestination(destination1);
        travelAgency.addDestination(destination2);
        travelAgency.addDestination(destination3);
        travelAgency.addDestination(destination4);
        travelAgency.addDestination(destination5);
        travelAgency.addFlight(flight1);
        travelAgency.addFlight(flight2);
        travelAgency.addHotel(hotel1);
        travelAgency.addHotel(hotel2);
        travelAgency.addTour(tour1);
        travelAgency.addTour(tour2);
        travelAgency.addTour(tour3);
        travelAgency.addEmployee(employee1);
        travelAgency.addEmployee(employee2);
        travelAgency.addEmployee(employee3);

        return travelAgency;
    }
}
