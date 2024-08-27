package com.solvd.laba.gustavo.people;

public final class TravelAgencyManager {
    private final String managerName;

    public TravelAgencyManager(String managerName) {
        this.managerName = managerName;
    }

    public final void manageAgency() {
        System.out.println("Managing travel agency...");
    }

    public String getManagerName() {
        return managerName;
    }
}
