package com.education.ztu.game;

public class Main {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        System.out.println("Original: " + schoolar1);
        Schoolar clonedSchoolar = (Schoolar) schoolar1.clone();
        System.out.println("Cloned: " + clonedSchoolar);
        System.out.println("Equals? " + schoolar1.equals(clonedSchoolar));
        System.out.println("Original hashCode: " + schoolar1.hashCode());
        System.out.println("Clone hashCode: " + clonedSchoolar.hashCode());
        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(new Schoolar("Mariya", 15));
        Team<Schoolar> clonedTeam = schoolarTeam.deepClone();
        System.out.println("\nOriginal team participants:");
        schoolarTeam.getParticipants().forEach(System.out::println);
        System.out.println("\nCloned team participants:");
        clonedTeam.getParticipants().forEach(System.out::println);
    }
}
