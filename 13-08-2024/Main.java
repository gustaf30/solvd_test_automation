package com.solvd.laba.gustavo;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Brazil", "Parana", "Curitiba", "Catao Monclaro", "363", "84020-150");
        Address address2 = new Address("Brazil", "Sao Paulo", "Americana", "Ampelio Gazeta", "1200", "13467-511");
        Hotel hotel1 = new Hotel(1000.00, "Pousada Trivago", address1, 50, 200);
        Employee employee1 = new Employee("Heitor", "123123123", "5519987318470", 2000.00, "Manager", 1);
        Customer customer1 = new Customer("Carlos", "123123122", "123612631", address2, "carlos@gmail.com");

        TravelAgency travelAgency = new TravelAgency("CVC", address1);
        travelAgency.addEmployee(employee1);

        Payment payment1 = new Payment("Credit", 3000, 1);

        Booking booking1 = new Booking(1, customer1, payment1);
        booking1.addTravelPackage(hotel1);

        travelAgency.addBooking(booking1);
    }
}
