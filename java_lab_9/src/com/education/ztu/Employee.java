package com.education.ztu;

@Annotation(author = "Student", version = "1.1", purpose = "15 4215245241524 5145 1252")
public class Employee {
    public String name;
    private int age;
    private String position;

    public Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.position = "None";
    }

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void work() {
        System.out.println(name + " is working as " + position);
    }

    private void promote(String newPosition) {
        this.position = newPosition;
        System.out.println(name + " has been promoted to " + position);
    }
}
