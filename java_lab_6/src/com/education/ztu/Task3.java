package com.education.ztu;

import java.io.*;
import java.util.Date;
import java.util.Formatter;

public class Task3 {
    public static void main(String[] args) {
        Formatter fr = null;
        FileWriter writer = null;
        FileReader reader = null;
        try {
            StringBuilder report = new StringBuilder();
            Date now = new Date();
            fr = new Formatter(report);
            fr.format("%s %tF %<tT\n", "Дата та час покупки:", now);
            fr.format("=========================================\n");
            fr.format("%s %5s %14s %12s\n", "№", "Товар", "Категорія", "Ціна");
            fr.format("%d %5s %16s %14s\n", 1, "Джинси", "Жіночий одяг", "1500,78 ₴");
            fr.format("%d %5s %14s %14s\n", 2, "Спідниця", "Жіночий одяг", "1000,56 ₴");
            fr.format("%d %5s %16s %11s\n", 3, "Краватка", "Чоловічий одяг", "500,78 ₴");
            fr.format("%d %5s %16s %14s\n", 4, "Джинси", "Жіночий одяг", "1500,78 ₴");
            fr.format("%d %5s %14s %14s\n", 5, "Спідниця", "Жіночий одяг", "1000,56 ₴");
            fr.format("%d %5s %16s %11s\n", 6, "Краватка", "Чоловічий одяг", "500,78 ₴");
            fr.format("%d %5s %16s %14s\n", 7, "Джинси", "Жіночий одяг", "1500,78 ₴");
            fr.format("%d %5s %14s %14s\n", 8, "Спідниця", "Жіночий одяг", "1000,56 ₴");
            fr.format("%d %5s %16s %11s\n", 9, "Краватка", "Чоловічий одяг", "500,78 ₴");
            fr.format("%d %5s %15s %14s\n", 10, "Джинси", "Жіночий одяг", "1500,78 ₴");
            fr.format("=========================================\n");
            fr.format("%s %33s\n", "Разом:", "10507.8 ₴");
            File reportFile = new File("directory_for_files/report.txt");
            writer = new FileWriter(reportFile);
            writer.write(report.toString());
            writer.flush();
            System.out.println("Звіт збережено у файл: " + reportFile.getPath());
            reader = new FileReader(reportFile);
            System.out.println("\nВміст файлу:");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Помилка при роботі з файлом: " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
                if (writer != null) writer.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.err.println("Помилка при закритті файлу: " + e.getMessage());
            }
        }
    }
}
