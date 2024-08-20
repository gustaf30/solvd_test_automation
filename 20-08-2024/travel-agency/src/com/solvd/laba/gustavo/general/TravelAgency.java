package com.solvd.laba.gustavo.general;

import com.solvd.laba.gustavo.people.Customer;
import com.solvd.laba.gustavo.people.Employee;
import com.solvd.laba.gustavo.product.*;
import com.solvd.laba.gustavo.service.MenuService;
import com.solvd.laba.gustavo.service.TravelAgencyService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelAgency {
    private String name;
    private Address address;
    private List<Employee> employeeList = new ArrayList<Employee>();
    private List<Order> ordersList = new ArrayList<Order>();
    private static List<Booking> availableList = new ArrayList<Booking>();

    public TravelAgency(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public TravelAgency(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TravelAgency: " +
                "name='" + name + '\'' +
                ", address=" + address + '\'' +
                ", employeeList=" + employeeList + '\'' +
                ", ordersList=" + ordersList + '\'' +
                ", availableList=" + availableList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> orderList) {
        this.ordersList = orderList;
    }

    public List<Booking> getAvailableList() {
        return availableList;
    }

    public void setAvailableList(List<Booking> availableList) {
        this.availableList = availableList;
    }

    public void addAvailable(Booking booking) {
        availableList.add(booking);
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

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Objects
        Address address1 = new Address("Brazil", "São Paulo", "São Paulo", "Avenida Paulista", "1578", "01310-200");
        Address address2 = new Address("United States", "California", "Los Angeles", "Sunset Boulevard", "1234", "90026");
        Address address3 = new Address("Germany", "Bavaria", "Munich", "Marienplatz", "1", "80331");
        Address address4 = new Address("Japan", "Tokyo", "Tokyo", "Shibuya Crossing", "15", "150-0002");
        Address address5 = new Address("Canada", "Ontario", "Toronto", "Queen Street", "567", "M5V 2B6");

        Employee employee1 = new Employee("Lucas Silva", "123.456.789-00", "+55 11 98765-4321", 1001.00, "Travel Agent", 1);
        Employee employee2 = new Employee("Maria Oliveira", "987.654.321-00", "+55 21 99876-5432", 1002.00, "Sales Manager", 2);
        Employee employee3 = new Employee("João Pereira", "456.123.789-00", "+55 31 91234-5678", 1003.00, "Tour Guide", 3);

        Address customerAddress1 = new Address("Brazil", "Rio de Janeiro", "Rio de Janeiro", "Rua das Flores", "200", "22041-001");
        Address customerAddress2 = new Address("United States", "New York", "New York", "Broadway", "789", "10019");
        Address customerAddress3 = new Address("Canada", "British Columbia", "Vancouver", "Granville Street", "567", "V6Z 1M6");

        Customer customer1 = new Customer("Ana Costa", "321.654.987-00", "+55 21 97654-3210", customerAddress1, "ana.costa@example.com");
        Customer customer2 = new Customer("Michael Johnson", "555-66-7777", "+1 212 555-1234", customerAddress2, "michael.johnson@example.com");
        Customer customer3 = new Customer("Emily Davis", "888-99-4444", "+1 604 555-9876", customerAddress3, "emily.davis@example.com");

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

        Flight flight1 = new Flight(
                1200.00,
                1234,
                destination4,
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
                5
        );

        Tour tour1 = new Tour(
                200.00,
                "3h",
                "Guided tour of the Statue of Liberty and Ellis Island."
        );

        TravelAgency travelAgency = new TravelAgency("CVC", address1);
        TravelAgencyService travelService = new TravelAgencyService(travelAgency);
        List<Destination> destinationList = new ArrayList<>();
        destinationList.add(destination1);
        destinationList.add(destination2);
        destinationList.add(destination3);
        destinationList.add(destination4);
        MenuService menuService = new MenuService(availableList, destinationList);
        travelAgency.addAvailable(flight1);
        travelAgency.addAvailable(hotel1);
        travelAgency.addAvailable(tour1);
        travelAgency.addEmployee(employee1);
        travelAgency.addEmployee(employee2);
        travelAgency.addEmployee(employee3);

        List<Booking> order1 = new ArrayList<>();
        order1.add(flight1);
        order1.add(hotel1);
        order1.add(tour1);
        travelService.addOrder(1, customer1, 1, 2000, "credit", order1);

        menuService.startMenu();
        do {
            menuService.preferencesMenu();
            menuService.printMenu();
        } while (!(menuService.isCustomerFinished()));
    }
}
