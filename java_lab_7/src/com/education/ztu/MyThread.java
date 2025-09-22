package com.education.ztu;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("[RUNNING] Потік почав виконання: " + getName());
        for (int i = 1; i <= 100; i++) {
            System.out.println("Я люблю програмувати!!! (" + i + ")");
        }
        System.out.println("[TERMINATED] Потік завершився: " + getName());
    }
}
