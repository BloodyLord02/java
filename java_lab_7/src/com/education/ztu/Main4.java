package com.education.ztu;

public class Main4 {
    public static void main(String[] args) {
        Runnable task = new Task5();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
