package com.solvd.laba.gustavo.enumerators;

public enum Season {
    WINTER(0),
    SUMMER(30),
    SPRING(15),
    FALL(10);

    private final int avgTemperature;

    Season(int avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }
}

