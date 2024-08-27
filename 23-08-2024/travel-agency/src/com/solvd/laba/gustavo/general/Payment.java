package com.solvd.laba.gustavo.general;

public class Payment {
    private int paymentId;
    private int amount;
    private String method;

    public Payment(String method, int amount, int paymentId) {
        this.method = method;
        this.amount = amount;
        this.paymentId = paymentId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
