package com.solvd.laba.gustavo;

public class Person {
    private String name;
    private String document;
    private String contactNumber;

    public Person(String name, String document, String contactNumber) {
        this.name = name;
        this.document = document;
        this.contactNumber = contactNumber;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
