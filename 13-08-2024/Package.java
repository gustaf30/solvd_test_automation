package com.solvd.laba.gustavo;

public class Package {
    private String packageName;
    private Double price;

    public Package(Double price, String packageName) {
        this.price = price;
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
