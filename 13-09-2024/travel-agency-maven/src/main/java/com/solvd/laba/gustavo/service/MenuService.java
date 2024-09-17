package com.solvd.laba.gustavo.service;

import com.solvd.laba.gustavo.general.*;
import com.solvd.laba.gustavo.people.Customer;
import com.solvd.laba.gustavo.product.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.solvd.laba.gustavo.general.TravelAgency.logger;

public class MenuService {
    boolean customerFinished = false;
    private final List<Destination> destinationList;
    private final List<Flight> availableFlightList;
    private final List<Hotel> availableHotelList;
    private final List<Tour> availableTourList;
    private final Preference preference = new Preference();
    private final Customer customer = new Customer();

    Scanner input = new Scanner(System.in);

    public MenuService(List<Flight> availableFlightList, List<Hotel> availableHotelList, List<Tour> availableTourList, List<Destination> destinationList) {
        this.availableFlightList = availableFlightList;
        this.availableHotelList = availableHotelList;
        this.availableTourList = availableTourList;
        this.destinationList = destinationList;
    }

    public void startMenu(TravelAgencyService travelService, TravelAgency travelAgency) throws InterruptedException {
        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=              Let's get you a plan!             =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        TimeUnit.SECONDS.sleep(2);

        Address address3 = new Address("United States", "California", "San Francisco", "Sunset Boulevard", "1234", "90026");
        customer.setAddress(address3);
        System.out.println("=             Customer registration              =");
        System.out.println("Name: ");
        String text = input.nextLine();
        customer.setName(text);

        System.out.println("Document: ");
        text = input.nextLine();
        customer.setDocument(text);

        System.out.println("Email: ");
        text = input.nextLine();
        customer.setEmail(text);

        System.out.println("Phone: ");
        text = input.nextLine();
        customer.setContactNumber(text);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Do you have a destination? (Y/N)       =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        text = input.nextLine();
        if (text.equals("Y")) {
            defaultMenu(travelService, travelAgency);
        }
    }

    public void preferencesMenu() throws InterruptedException {
        boolean beach;
        boolean shopping;
        boolean nightlife;
        boolean cultural;
        boolean adventure;
        int climate;
        boolean familyFriendly;
        boolean luxury;

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Let's begin with your preferences      =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("= Do you plan to visit the beach?(true or false) =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        beach = Boolean.parseBoolean(input.nextLine());
        preference.setBeach(beach);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=           Do you plan to go shopping?          =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        shopping = Boolean.parseBoolean(input.nextLine());
        preference.setShopping(shopping);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=       Do you plan to hang out at night?        =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        nightlife = Boolean.parseBoolean(input.nextLine());
        preference.setNightlife(nightlife);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=           Do you like cultural tours?          =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        cultural = Boolean.parseBoolean(input.nextLine());
        preference.setCultural(cultural);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Do you like to go on adventures?       =");
        System.out.println("=           such as hikes, for example           =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        adventure = Boolean.parseBoolean(input.nextLine());
        preference.setAdventure(adventure);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=       What is your preference on climate       =");
        System.out.println("= (0 - 10) being 0 the coldest and 10 the hottest=");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        climate = Integer.parseInt(input.nextLine());
        preference.setClimate(climate);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Are you going with your family?        =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        familyFriendly = Boolean.parseBoolean(input.nextLine());
        preference.setFamilyFriendly(familyFriendly);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=    Are you looking for luxury on your trip?    =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        luxury = Boolean.parseBoolean(input.nextLine());
        preference.setLuxury(luxury);

        System.out.println(preference);
    }

    public void defaultMenu(TravelAgencyService travelService, TravelAgency travelAgency) throws InterruptedException {
        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=             Enter your destination             =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        String dest = input.nextLine();

        Destination destination = findFirstMatch(TravelAgency.getDestinationList(), d -> d.getName().equals(dest));

        List<Booking> bookingList = getBestBookings(destination);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=                 Travel plan:                   =");
        System.out.println(bookingList);
        System.out.println(sumField(bookingList, Booking::getPrice));

        sendOrder(bookingList, travelService, travelAgency);
    }

    <T> T findFirstMatch(List<T> list, java.util.function.Predicate<T> predicate) {
        return list.stream().filter(predicate).findFirst().orElse(null);
    }

    <T> double sumField(List<T> list, java.util.function.ToDoubleFunction<T> mapper) {
        return list.stream().mapToDouble(mapper).sum();
    }

    public void printMenu(TravelAgencyService travelService, TravelAgency travelAgency) {
        Destination best = getBestDestination();
        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=               Your destination is              =");
        assert best != null;
        System.out.println("=            " + best.getName() + "!             =");
        System.out.println("=                                                =");
        System.out.println("==================================================");

        List<Booking> bookingList = getBestBookings(best);

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=                 Travel plan:                   =");
        System.out.println(bookingList);
        System.out.println(sumField(bookingList, Booking::getPrice));

        sendOrder(bookingList, travelService, travelAgency);
    }

    private void sendOrder(List<Booking> bookings, TravelAgencyService travelService, TravelAgency travelAgency) {
        Payment payment = new Payment("Credit card", 1200, 1);
        Order order = new Order();
        order.setPayment(payment);
        order.setBookings(bookings);
        order.setOrderId(1);
        order.setCustomer(customer);

        travelService.addOrder(order, travelAgency);
    }

    private Destination getBestDestination() {
        return destinationList.stream()
                .max(Comparator.comparingInt(d -> {
                    int currentScore = 0;
                    if (preference.hasBeach() == d.hasBeach()) currentScore++;
                    if (preference.isGoodForShopping() == d.isGoodForShopping()) currentScore++;
                    if (preference.hasNightlife() == d.isNightlife()) currentScore++;
                    if (preference.isCultural() == d.isCultural()) currentScore++;
                    if (preference.isAdventure() == d.isAdventure()) currentScore++;
                    if (preference.isFamilyFriendly() == d.isFamilyFriendly()) currentScore++;
                    if (preference.isLuxury() == d.isLuxury()) currentScore++;
                    currentScore -= Math.abs(d.getClimate() - preference.getClimate());
                    return currentScore;
                }))
                .orElse(null);
    }

    private List<Booking> getBestBookings(Destination destination) {
        List<Booking> order = new ArrayList<>();

        availableFlightList.stream()
                .filter(f -> f.getDestination().getName().equals(destination.getName()))
                .findFirst()
                .ifPresent(order::add);

        logger.info(order.isEmpty() ? "No available flights found" : "Flight booked");

        availableHotelList.stream()
                .filter(h -> h.getAddress().getCity().equals(destination.getName()))
                .max(Comparator.comparingInt(h -> {
                    int currentScore = 0;
                    if (preference.isFamilyFriendly() == h.isFamilyFriendly()) currentScore++;
                    if (preference.isLuxury() == h.isLuxury()) currentScore++;
                    return currentScore;
                }))
                .ifPresent(order::add);

        availableTourList.stream()
                .filter(t -> t.getCity().equals(destination.getName()))
                .forEach(order::add);

        return order;
    }

    public boolean isCustomerFinished() {
        return customerFinished;
    }

    public void setCustomerFinished(boolean hasCustomerFinished) {
        this.customerFinished = hasCustomerFinished;
    }
}
