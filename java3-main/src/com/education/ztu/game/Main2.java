package com.education.ztu.game;

public class Main2 {
    public static void main(String[] args) {
        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(new Student("Mykola", 20));
        studentTeam.addNewParticipant(new Student("Viktoria", 21));
        studentTeam.addNewParticipant(new Student("Anna", 22));

        System.out.println("\nSorting by name:");
        studentTeam.sortByName();
        studentTeam.getParticipants().forEach(System.out::println);

        System.out.println("\nSorting by age:");
        studentTeam.sortByAge();
        studentTeam.getParticipants().forEach(System.out::println);

        System.out.println("\nSorting by name then age:");
        studentTeam.sortByNameThenAge();
        studentTeam.getParticipants().forEach(System.out::println);
    }
}
