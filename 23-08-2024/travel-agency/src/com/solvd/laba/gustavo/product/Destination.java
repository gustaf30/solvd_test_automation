package com.solvd.laba.gustavo.product;

public class Destination {
    private String name;
    private boolean beach;
    private boolean goodForShopping;
    private boolean nightlife;
    private boolean cultural;
    private boolean adventure;
    private int climate;
    private boolean familyFriendly;
    private boolean luxury;

    public Destination(String name, boolean beach, boolean goodForShopping, boolean nightlife, boolean cultural, boolean adventure, int climate, boolean familyFriendly, boolean luxury) {
        this.name = name;
        this.beach = beach;
        this.goodForShopping = goodForShopping;
        this.nightlife = nightlife;
        this.cultural = cultural;
        this.adventure = adventure;
        this.climate = climate;
        this.familyFriendly = familyFriendly;
        this.luxury = luxury;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public int getClimate() {
        return climate;
    }

    public void setClimate(int climate) {
        this.climate = climate;
    }

    public boolean isAdventure() {
        return adventure;
    }

    public void setAdventure(boolean adventure) {
        this.adventure = adventure;
    }

    public boolean isCultural() {
        return cultural;
    }

    public void setCultural(boolean cultural) {
        this.cultural = cultural;
    }

    public boolean isNightlife() {
        return nightlife;
    }

    public void setNightlife(boolean nightlife) {
        this.nightlife = nightlife;
    }

    public boolean isGoodForShopping() {
        return goodForShopping;
    }

    public void setGoodForShopping(boolean shopping) {
        this.goodForShopping = shopping;
    }

    public boolean hasBeach() {
        return beach;
    }

    public void setBeach(boolean beach) {
        this.beach = beach;
    }
}
