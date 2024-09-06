package com.solvd.laba.gustavo.general;

import com.solvd.laba.gustavo.list.CustomList;
import com.solvd.laba.gustavo.people.Employee;
import com.solvd.laba.gustavo.product.*;
import com.solvd.laba.gustavo.service.MenuService;
import com.solvd.laba.gustavo.service.TravelAgencyService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TravelAgency {
    private String name;
    private Address address;
    private CustomList<Employee> employeeList = new CustomList<>();
    private CustomList<Order> ordersList = new CustomList<>();
    private static List<Flight> flightList = new ArrayList<>();
    private static List<Hotel> hotelList = new ArrayList<>();
    private static List<Tour> tourList = new ArrayList<>();
    private static List<Destination> destinationList = new ArrayList<>();
    public static final Logger logger = Logger.getLogger(TravelAgency.class.getName());
    private static int totalAgencies;

    public TravelAgency(String name, Address address) {
        this.name = name;
        this.address = address;
        totalAgencies++;
    }

    public TravelAgency(String name) {
        this.name = name;
        totalAgencies++;
    }

    static {
        totalAgencies = 0;
        System.out.println("Static block: Initializing the TravelAgency class.");
        try {
            FileHandler fileHandler = new FileHandler("agency.log", true);
            fileHandler.setFormatter(new SimpleFormatter());

            ConsoleHandler consoleHandler = new ConsoleHandler();

            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);

        } catch (IOException e) {
            System.err.println("Error configuring the logger: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TravelAgency: " +
                "name='" + name + '\'' +
                ", address=" + address + '\'' +
                ", employeeList=" + employeeList + '\'' +
                ", ordersList=" + ordersList + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomList<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(CustomList<Order> orderList) {
        this.ordersList = orderList;
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }

    public static void setFlightList(List<Flight> flightList) {
        TravelAgency.flightList = flightList;
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public static List<Hotel> getHotelList() {
        return hotelList;
    }

    public static void setHotelList(List<Hotel> hotelList) {
        TravelAgency.hotelList = hotelList;
    }

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }

    public static List<Tour> getTourList() {
        return tourList;
    }

    public static void setTourList(List<Tour> tourList) {
        TravelAgency.tourList = tourList;
    }

    public void addTour(Tour tour) {
        tourList.add(tour);
    }

    public CustomList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(CustomList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.addAtEnd(employee);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static List<Destination> getDestinationList() {
        return destinationList;
    }

    public static void setDestinationList(List<Destination> destinationList) {
        TravelAgency.destinationList = destinationList;
    }

    public void addDestination(Destination destination) {
        destinationList.add(destination);
    }

    public static void main(String[] args) throws InterruptedException {
        TravelAgencyService travelService = new TravelAgencyService();
        Address address1 = new Address("Brazil", "São Paulo", "São Paulo", "Avenida Paulista", "1578", "01310-200");
        TravelAgency travelAgency = travelService.createTravelAgency("CVC", address1);
        MenuService menuService = new MenuService(flightList, hotelList, tourList, destinationList);

        menuService.startMenu();
        do {
            menuService.preferencesMenu();
            menuService.printMenu(travelService, travelAgency);
        } while (!(menuService.isCustomerFinished()));
    }
}
