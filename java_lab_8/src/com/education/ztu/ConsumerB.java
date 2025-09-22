package com.education.ztu;
import java.util.function.Consumer;

public class ConsumerB {
    public static void main(String[] args) {
        Consumer<String> startLesson = s -> System.out.println("Пара почалася о 8:30");
        Consumer<String> endLesson = s -> System.out.println("Пара закінчилася о 9:50");
        Consumer<String> fullLesson = startLesson.andThen(endLesson);
        fullLesson.accept("Понеділок");
    }
}
