package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Michael", "Brown", 22, Gender.MALE,
                Location.KIEV, "Software Engineering", "MIT");
        Teacher teacher = new Teacher("Emily", "Davis", 50, Gender.FEMALE,
                Location.ZHYTOMYR, "Physics", "Harvard", new Car("Ford"));
        Employee employee = new Employee("Daniel", "Clark", 35, Gender.MALE,
                Location.VINNYTSYA, "InnoTech", "Project Manager", new Car("Tesla"));
        student.sayName();
        teacher.sayAge();
        employee.sayLocation();
        System.out.println(student.getFullInfo());
        System.out.println(teacher.getFullInfo());
        System.out.println(employee.getFullInfo());
        System.out.println(student.getOccupation());
        System.out.println(teacher.getOccupation());
        System.out.println(employee.getOccupation());
        System.out.println("Teacher is a person.");
        teacher.getCar().getEngine().startEngine();
        System.out.println("Is engine running? " + teacher.getCar().engineIsRunning());
    }
}

