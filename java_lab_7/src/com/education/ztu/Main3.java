package com.education.ztu;

public class Main3 {
    public static void main(String[] args) {
        Runnable task = new Task4();
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");
        t1.start();
        t2.start();
        t3.start();
    }
}
