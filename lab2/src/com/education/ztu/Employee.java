package com.education.ztu;

public class Employee extends Person {
    private String company="";
    private String position="";
    private Car car=null;
    public Employee() {
        super();
    }
    public Employee(String firstname, String lastname, int age, Gender gender, Location location, String company, String position, Car car) {
        super(firstname, lastname, age, gender, location);
        this.company = company;
        this.position = position;
        this.car = car;
    }
    public String getOccupation() {
        return "Company: " + this.company + ", Position: " +
                this.position;
    }
    public Car getCar() {
        return car;
    }
}
