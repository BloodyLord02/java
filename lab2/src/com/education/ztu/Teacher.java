package com.education.ztu;

public class Teacher extends Person {
    private String subject="";
    private String university="";
    private Car car=null;
    public Teacher() {
        super();
    }
    public Teacher(String firstname, String lastname, int age, Gender gender, Location location, String subject, String university, Car car){
        super(firstname, lastname, age, gender, location);
        this.subject = subject;
        this.university = university;
        this.car = car;
    }
    public String getOccupation() {
        return "Subject: " + this.subject + ", University: " + this.university;
    }
    public Car getCar() {
        return car;
    }
}


