package com.education.ztu;

public class Task5 implements Runnable {
    private static int result = 1;
    private static final int MAX = 100;
    private static final Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            int value;
            synchronized (lock) {
                if (result > MAX) break;
                value = result++;
                System.out.println(Thread.currentThread().getName() + ": " + value);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " перервано.");
                break;
            }
        }
    }
}

