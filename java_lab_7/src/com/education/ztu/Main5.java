package com.education.ztu;

public class Main5 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Thread reader = new ReaderThread(sharedData);
        Thread printer = new PrinterThread(sharedData);
        printer.start();
        reader.start();
    }
}
