package com.education.ztu;

public class Main2 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Головний потік перервано.");
        }
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
}
