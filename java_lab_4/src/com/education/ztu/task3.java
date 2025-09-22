package com.education.ztu;

import java.util.Formatter;
import java.util.Date;

public class task3 {
    public static void main(String[] args) {
        Formatter fr=new Formatter();
        Date now = new Date();
        fr.format("%s %tF %<tT\n","Дата та час покупки:" ,now);
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
        System.out.println(fr.toString());
    }
}

