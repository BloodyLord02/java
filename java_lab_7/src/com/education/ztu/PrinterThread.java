package com.education.ztu;

public class PrinterThread extends Thread {
    private final SharedData data;
    public PrinterThread(SharedData data) {
        this.data = data;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                while (!data.hasNewMessage) {
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Printer перервано.");
                        return;
                    }
                }
                String msg = data.message;
                data.hasNewMessage = false;
                if ("exit".equalsIgnoreCase(msg)) {
                    System.out.println("Printer завершує роботу.");
                    break;
                }
                System.out.println("Printer: " + msg);
            }
        }
    }
}
