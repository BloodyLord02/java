package com.education.ztu;

abstract class Person implements Human {
    protected String firstname = "";
    protected String lastname = "";
    protected int age = 0;
    protected Gender gender = null;
    protected Location location = null;
    protected static int counter = 0;
    {
        counter++;
    }
    public Person() {}
    public Person(String firstname, String lastname, int age, Gender gender, Location location) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }
    public abstract String getOccupation();
    public String getFullInfo() {
        return firstname + " " + lastname + ", Age: " + age + ", Gender: " + gender + ", Location: " + location;
    }
    public static void showCounter() {
        System.out.println("Persons: " + counter);
    }
    public void sayName() {
        System.out.println(this.firstname + " " + this.lastname);
    }
    public void sayAge() {
        System.out.println("Age: " + this.age);
    }
    public void sayLocation() {
        System.out.println("Location: " + this.location);
    }
    public void sayGender() {
        System.out.println("Gender: " + this.gender);
    }
}

