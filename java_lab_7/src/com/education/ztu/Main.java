package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("[NEW] Створено потік: " + myThread.getName());
        System.out.println("живий " + myThread.isAlive());
        System.out.println("демон " + myThread.isDaemon());
        System.out.println("Пріоритет: " + myThread.getPriority());
        myThread.setName("CodingThread");
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\n[UPDATED INFO]");
        System.out.println("Нове ім'я: " + myThread.getName());
        System.out.println("Новий пріоритет: " + myThread.getPriority());
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread mainThread = Thread.currentThread();
        System.out.println("\n[MAIN THREAD INFO]");
        System.out.println("Ім'я головного потоку: " + mainThread.getName());
        System.out.println("Пріоритет головного потоку: " + mainThread.getPriority());
    }
}
