package com.education.ztu;

import java.lang.reflect.*;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz1 = Employee.class;
        Class<?> clazz2 = new Employee().getClass();
        Class<?> clazz3 = Class.forName("com.education.ztu.Employee");
        System.out.println("Отримано Class трьома способами:");
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println("\nМетоди класу:");
        for (Method method : clazz1.getDeclaredMethods()) {
            System.out.println("Назва: " + method.getName());
            System.out.println("  Тип повернення: " + method.getReturnType());
            System.out.print("  Параметри: ");
            for (Class<?> paramType : method.getParameterTypes()) {
                System.out.print(paramType.getSimpleName() + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Поля класу:");
        for (Field field : clazz1.getDeclaredFields()) {
            System.out.println("Назва: " + field.getName() + ", Тип: " + field.getType().getSimpleName());
        }
        System.out.println("Конструктори класу:");
        for (Constructor<?> constructor : clazz1.getDeclaredConstructors()) {
            System.out.print("Конструктор: (");
            for (Class<?> param : constructor.getParameterTypes()) {
                System.out.print(param.getSimpleName() + " ");
            }
            System.out.println(")");
        }
        Constructor<?> constructor = clazz1.getConstructor(String.class, int.class, String.class);
        Object employeeObj = constructor.newInstance("Марія", 28, "Аналітик");
        System.out.println("\nВиклик методу work():");
        Method workMethod = clazz1.getMethod("work");
        workMethod.invoke(employeeObj);
        Field ageField = clazz1.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(employeeObj, 30);
        System.out.println("\nЗмінено приватне поле age на 30");
        int ageValue = (int) ageField.get(employeeObj);
        System.out.println("Значення поля age: " + ageValue);
        Method promoteMethod = clazz1.getDeclaredMethod("promote", String.class);
        promoteMethod.setAccessible(true);
        promoteMethod.invoke(employeeObj, "Старший аналітик");
    }
}
