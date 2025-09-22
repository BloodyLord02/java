package com.education.ztu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = """
                ПІБ: Айсін Владислав Сергійович, Вік: 19, Посада: Програміст, Досвід: 10 років, Дата народження: 17.09.2005,
                Адреса: вул. Добровського 84А, Email: vladaisin@example.com, Телефон: +380-67-854-0535

                ПІБ: Айсін Іван Сергійович, Вік: 29, Посада: Бухгалтер, Досвід: 6 років, Дата народження: 10.10.1994,
                Адреса: вул. Київська 21, Email: ivanaisin@gmail.com, Телефон: +380-50-956-4626
                
                ПІБ: Айсін Владислав Сергійович, Вік: 19, Посада: Програміст, Досвід: 10 років, Дата народження: 17.09.2005,
                Адреса: вул. Добровського 84А, Email: vladaisin@example.com, Телефон: +380-67-854-0535

                ПІБ: Айсін Іван Сергійович, Вік: 29, Посада: Бухгалтер, Досвід: 6 років, Дата народження: 10.10.1994,
                Адреса: вул. Київська 21, Email: ivanaisin@gmail.com, Телефон: +380-50-956-4626
                
                ПІБ: Айсін Владислав Сергійович, Вік: 19, Посада: Програміст, Досвід: 10 років, Дата народження: 17.09.2005,
                Адреса: вул. Добровського 84А, Email: vladaisin@example.com, Телефон: +380-67-854-0535
                """;
        System.out.println("Телефони:");
        Matcher phoneMatcher = Pattern.compile("\\+380-\\d{2}-\\d{3}-\\d{4}").matcher(text);
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }
        System.out.println("\nEmail:");
        Matcher emailMatcher = Pattern.compile("[\\w.%-]+@[\\w.-]+\\.[a-zA-Z]{2,6}").matcher(text);
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }
        System.out.println("\nТекст з оновленими датами:");
        String updatedDates = text.replaceAll(
                "(\\b\\d{2})\\.(\\d{2})\\.(\\d{4})",
                "$3-$2-$1"
        );
        System.out.println(updatedDates);
        String updatedPositions = updatedDates
                .replaceAll("Посада: Програміст", "Посада: Старший Програміст")
                .replaceAll("Посада: Менеджер", "Посада: Керівник відділу");

        System.out.println("\nТекст з оновленими посадами:");
        System.out.println(updatedPositions);
    }
}
