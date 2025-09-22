package com.education.ztu;
import java.util.function.Predicate;

public class PredicateA {
    public static void main(String[] args) {
        Predicate<String> isNumeric = str -> {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        };
        Predicate<String> notEmpty = str -> !str.isEmpty();
        Predicate<String> validNumber = isNumeric.and(notEmpty);
        String test = "123.45";
        System.out.println("Чи є числом: " + validNumber.test(test)); // true
    }
}
