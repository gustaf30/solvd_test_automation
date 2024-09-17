package com.solvd.laba.gustavo.people;

import com.solvd.laba.gustavo.general.TravelAgency;

import java.util.List;

public final class TravelAgencyManager {
    private final String managerName;
    private final TravelAgency travelAgency;

    public TravelAgencyManager(String managerName, TravelAgency travelAgency) {
        this.managerName = managerName;
        this.travelAgency = travelAgency;
    }

    public final void manageAgency() {
        System.out.println("Managing travel agency...");
    }

    public void applyDiscount() {
        applyToAll(TravelAgency.getFlightList(), flight -> flight.setPrice(flight.getPrice() * 0.9));
    }

    <T> void applyToAll(List<T> list, java.util.function.Consumer<T> action) {
        list.forEach(action);
    }

    public String getManagerName() {
        return managerName;
    }
}
