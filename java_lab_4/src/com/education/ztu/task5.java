package com.education.ztu;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class task5 {
    public static void main(String[] args) {
        LocalDateTime labStart = LocalDateTime.of(2025, Month.APRIL, 11, 22, 15, 22);
        System.out.println("Дата початку лабораторної: " + labStart);
        System.out.println("День тижня: " + labStart.getDayOfWeek());
        System.out.println("День у році: " + labStart.getDayOfYear());
        System.out.println("Місяць: " + labStart.getMonth());
        System.out.println("Рік: " + labStart.getYear());
        System.out.println("Години: " + labStart.getHour());
        System.out.println("Хвилини: " + labStart.getMinute());
        System.out.println("Секунди: " + labStart.getSecond());
        boolean isLeap = Year.isLeap(labStart.getYear());
        System.out.println("Рік високосний: " + isLeap);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Поточний час: " + now);
        System.out.println("isBefore" + labStart.isBefore(now));
        System.out.println("isAfter " + labStart.isAfter(now));
        LocalDateTime updatedDate = labStart.withYear(2026).withMonth(12).withDayOfMonth(25).withHour(20).withMinute(30);
        System.out.println("Оновлена дата: " + updatedDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", Locale.forLanguageTag("uk"));
        System.out.println("Відформатована дата: " + updatedDate.format(formatter));
    }
}

