package com.solvd.laba.gustavo.enumerators;

public enum TravelClass {
    ECONOMY("Economy", 100),
    BUSINESS("Business", 500),
    FIRST("First class", 1000);

    private final String name;
    private final int price;

    TravelClass(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return name + " costs " + price + " dollars";
    }

    static {
        System.out.println("Static block initialized on TravelClass");
    }
}
