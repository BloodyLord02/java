package com.education.ztu;

public class Task4 implements Runnable {
    private static int result = 1;
    private static final int MAX = 100;
    private static synchronized int getNextValue() {
        if (result <= MAX) {
            return result++;
        } else {
            return -1;
        }
    }
    @Override
    public void run() {
        while (true) {
            int value = getNextValue();
            if (value == -1) break;
            System.out.println(Thread.currentThread().getName() + ": " + value);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " перервано.");
                break;
            }
        }
    }
}
