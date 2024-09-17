package com.solvd.laba.gustavo.enumerators;

public enum FlightType {
    DOMESTIC,
    INTERNATIONAL;

    public boolean isInternational() {
        return this == INTERNATIONAL;
    }
}
