package com.education.ztu;

import java.util.Scanner;

public class ReaderThread extends Thread {
    private final SharedData data;
    private final Scanner scanner = new Scanner(System.in);
    public ReaderThread(SharedData data) {
        this.data = data;
    }
    @Override
    public void run() {
        while (true) {
            System.out.print("Введіть рядок (або 'exit' для завершення): ");
            String input = scanner.nextLine();

            synchronized (data) {
                data.message = input;
                data.hasNewMessage = true;
                data.notify();
            }

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Reader перервано.");
                break;
            }
        }
    }
}
