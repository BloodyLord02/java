package com.education.ztu;

public class Student extends Person {
    private String speciality="";
    private String university="";
    public Student() {
        super();
    }
    public Student(String firstname, String lastname, int age, Gender gender, Location location, String speciality, String university) {
        super(firstname, lastname, age, gender, location);
        this.speciality = speciality;
        this.university = university;
    }
    public String getOccupation() {
        return "Speciality: " + this.speciality + ", University: " + this.university;
    }
}