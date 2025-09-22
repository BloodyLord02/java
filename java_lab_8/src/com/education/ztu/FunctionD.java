package com.education.ztu;
import java.util.function.Function;

public class FunctionD {
    public static void main(String[] args) {
        Function<String, Integer> multiplyNumbers = str -> {
            String[] parts = str.split("\\s+");
            int result = 1;
            for (String part : parts) {
                result *= Integer.parseInt(part);
            }
            return result;
        };
        String numbers = "5 6 8";
        System.out.println("Добуток: " + multiplyNumbers.apply(numbers));  // 24
    }
}