package com.solvd.laba.gustavo.general;

import java.util.Objects;

public class Preference {
    private boolean beach;
    private boolean shopping;
    private boolean nightlife;
    private boolean cultural;
    private boolean adventure;
    private int climate;
    private boolean familyFriendly;
    private boolean luxury;

    public Preference(boolean beach, boolean shopping, boolean nightlife, boolean cultural, boolean adventure, int climate, boolean familyFriendly, boolean luxury) {
        this.beach = beach;
        this.shopping = shopping;
        this.nightlife = nightlife;
        this.cultural = cultural;
        this.adventure = adventure;
        this.climate = climate;
        this.familyFriendly = familyFriendly;
        this.luxury = luxury;
    }

    public Preference() {

    }

    @Override
    public String toString() {
        return "Preference{" +
                "beach=" + beach +
                ", shopping=" + shopping +
                ", nightlife=" + nightlife +
                ", cultural=" + cultural +
                ", adventure=" + adventure +
                ", climate=" + climate +
                ", familyFriendly=" + familyFriendly +
                ", luxury=" + luxury +
                '}';
    }

    public boolean hasBeach() {
        return beach;
    }

    public void setBeach(boolean beach) {
        this.beach = beach;
    }

    public boolean isGoodForShopping() {
        return shopping;
    }

    public void setShopping(boolean shopping) {
        this.shopping = shopping;
    }

    public boolean hasNightlife() {
        return nightlife;
    }

    public void setNightlife(boolean nightlife) {
        this.nightlife = nightlife;
    }

    public boolean isCultural() {
        return cultural;
    }

    public void setCultural(boolean cultural) {
        this.cultural = cultural;
    }

    public boolean isAdventure() {
        return adventure;
    }

    public void setAdventure(boolean adventure) {
        this.adventure = adventure;
    }

    public int getClimate() {
        return climate;
    }

    public void setClimate(int climate) {
        this.climate = climate;
    }

    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preference that = (Preference) o;
        return beach == that.beach && shopping == that.shopping && nightlife == that.nightlife && cultural == that.cultural && adventure == that.adventure && climate == that.climate && familyFriendly == that.familyFriendly && luxury == that.luxury;
    }

    @Override
    public int hashCode() {
        return Objects.hash(beach, shopping, nightlife, cultural, adventure, climate, familyFriendly, luxury);
    }
}
