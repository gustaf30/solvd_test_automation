package com.solvd.laba.gustavo.people;

abstract class Person {
    protected String name;
    protected String document;
    protected String contactNumber;

    public Person(String name, String document, String contactNumber) {
        this.name = name;
        this.document = document;
        this.contactNumber = contactNumber;
    }

    public Person() {};

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
