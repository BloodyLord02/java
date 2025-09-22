package com.education.ztu;
import java.util.function.Supplier;

public class SupplierC {
    public static void main(String[] args) {
        String input = "java";
        Supplier<String> upperSupplier = () -> input.toUpperCase();
        System.out.println("Результат: " + upperSupplier.get());
    }
}
