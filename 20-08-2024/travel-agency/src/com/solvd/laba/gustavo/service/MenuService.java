package com.solvd.laba.gustavo.service;

import com.solvd.laba.gustavo.general.Order;
import com.solvd.laba.gustavo.product.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MenuService {
    private boolean customerFinished = false;
    private boolean beach;
    private boolean shopping;
    private boolean nightlife;
    private boolean cultural;
    private boolean adventure;
    private int climate;
    private boolean familyFriendly;
    private boolean luxury;
    private final List<Destination> destinationList;
    private final List<Booking> availableList;
    Scanner input = new Scanner(System.in);

    public MenuService(List<Booking> availableList, List<Destination> destinationList) {
        this.availableList = availableList;
        this.destinationList = destinationList;
    }

    public void startMenu() throws InterruptedException {
        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=              Let's get you a plan!             =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        TimeUnit.SECONDS.sleep(3);
    }

    public void preferencesMenu() throws InterruptedException {
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

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=           Do you plan to go shopping?          =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        shopping = Boolean.parseBoolean(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=       Do you plan to hang out at night?        =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        nightlife = Boolean.parseBoolean(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=           Do you like cultural tours?          =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        cultural = Boolean.parseBoolean(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Do you like to go on adventures?       =");
        System.out.println("=           such as hikes, for example           =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        adventure = Boolean.parseBoolean(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=       What is your preference on climate       =");
        System.out.println("= (0 - 10) being 0 the coldest and 10 the hottest=");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        climate = Integer.parseInt(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=         Are you going with your family?        =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        familyFriendly = Boolean.parseBoolean(input.nextLine());

        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=    Are you looking for luxury on your trip?    =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        luxury = Boolean.parseBoolean(input.nextLine());
    }

    public void printMenu() {
        Destination best = getBestDestination();
        System.out.println("================ CVC Travel Agency ===============");
        System.out.println("=                                                =");
        System.out.println("=               Your destination is              =");
        System.out.println("=            " + best.getName() + "!             =");
        System.out.println("=                                                =");
        System.out.println("==================================================");

        List<Booking> bookingList = getBestBookings(best);
    }

    private Destination getBestDestination() {
        List<Integer> score = new ArrayList<>();
        int best = 0;
        for (Destination d : destinationList) {
            int currentScore = 0;
            if (this.beach == d.hasBeach()) currentScore++;
            if (this.shopping == d.isGoodForShopping()) currentScore++;
            if (this.nightlife == d.isNightlife()) currentScore++;
            if (this.cultural == d.isCultural()) currentScore++;
            if (this.adventure == d.isAdventure()) currentScore++;
            if (this.familyFriendly == d.isFamilyFriendly()) currentScore++;
            if (this.luxury == d.isLuxury()) currentScore++;
            currentScore -= d.getClimate() - this.climate;

            score.add(currentScore);
            if (best < currentScore) {
                best = currentScore;
            }
        }

        Integer maxScore = Collections.max(score);
        int maxIndex = score.indexOf(maxScore);

        return destinationList.get(maxIndex);
    }

    private List<Booking> getBestBookings(Destination destination) {
        List<Flight> flightList = new ArrayList<>();
        List<Hotel> hotelList = new ArrayList<>();
        List<Tour> tourList = new ArrayList<>();

        List<Booking> order = new ArrayList<>();

        for (Booking b : availableList) {
            if (b.getType() == Booking.Type.FLIGHT) {flightList.add((Flight) b);}
            if (b.getType() == Booking.Type.HOTEL) {hotelList.add((Hotel) b);}
            if (b.getType() == Booking.Type.TOUR) {tourList.add((Tour) b);}
        }

        for (Flight f : flightList) {
            if (f.getDestination().getName() != destination.getName()) {continue;}
            order.add(f);
        }

        for (Hotel h : hotelList) {
            if (h.getAddress().getCity() != destination.getName()) {continue;}

            List<Integer> score = new ArrayList<>();
            int best = 0;
            for (Destination d : destinationList) {
                int currentScore = 0;
                if (this.beach == d.hasBeach()) currentScore++;
                if (this.shopping == d.isGoodForShopping()) currentScore++;
                if (this.nightlife == d.isNightlife()) currentScore++;
                if (this.cultural == d.isCultural()) currentScore++;
                if (this.adventure == d.isAdventure()) currentScore++;
                if (this.familyFriendly == d.isFamilyFriendly()) currentScore++;
                if (this.luxury == d.isLuxury()) currentScore++;
                currentScore -= d.getClimate() - this.climate;

                score.add(currentScore);
                if (best < currentScore) {
                    best = currentScore;
                }
            }

            Integer maxScore = Collections.max(score);
            int maxIndex = score.indexOf(maxScore);

        }

        return null;
    }

    public boolean isCustomerFinished() {
        return customerFinished;
    }

    public void setCustomerFinished(boolean hasCustomerFinished) {
        this.customerFinished = hasCustomerFinished;
    }
}
