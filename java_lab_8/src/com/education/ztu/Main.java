package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        Printable messagePrinter = () -> System.out.println("+-");
        messagePrinter.print();
    }
}
