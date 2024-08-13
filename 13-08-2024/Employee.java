package com.solvd.laba.gustavo;

public class Employee extends Person{
    private int employeeID;
    private String position;
    private Double salary;

    public Employee(String name, String document, String contactNumber, Double salary, String position, int employeeID) {
        super(name, document, contactNumber);
        this.salary = salary;
        this.position = position;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee: " +
                        "employeeID=" + employeeID +
                        ", position='" + position + '\'' +
                        ", salary=" + salary +  '\'' +
                        ", name= " + super.getName() + '\'' +
                        ", document='" + super.getDocument() + '\'' +
                        ", contactNumber='" + super.getContactNumber() + '\'';
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
