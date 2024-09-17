package com.solvd.laba.gustavo.enumerators;

public enum PaymentType {
    CASH("Cash"),
    CREDIT("Credit card"),
    DEBIT("Debt card");

    private final String paymentMethod;

    PaymentType(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public boolean isDigitalPayment() {
        return this != CASH;
    }
}
