package com.solvd.laba.gustavo.enumerators;

public enum BookingStatus {
    PENDING,
    CONFIRMED,
    CANCELLED;

    public String getStatusMessage() {
        switch (this) {
            case PENDING:
                return "Your booking is pending.";
            case CONFIRMED:
                return "Your booking is confirmed.!";
            case CANCELLED:
                return "Your booking was cancelled.";
            default:
                return "Unknown booking status.";
        }
    }

    static {
        System.out.println("Static block initialized on BookingStatus");
    }
}
