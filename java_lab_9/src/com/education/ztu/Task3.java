package com.education.ztu;

public class Task3 {
    public static void main(String[] args) throws Exception {
        Class<Employee> clazz = Employee.class;
        if (clazz.isAnnotationPresent(Annotation.class)) {
            Annotation Annotation = clazz.getAnnotation(Annotation.class);
            System.out.println("Інформація з анотації @Annotation:");
            System.out.println("Автор: " + Annotation.author());
            System.out.println("Версія: " + Annotation.version());
            System.out.println("Призначення: " + Annotation.purpose());
        } else {
            System.out.println("Анотація @Annotation не знайдена.");
        }
    }
}