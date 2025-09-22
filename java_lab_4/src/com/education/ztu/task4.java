package com.education.ztu;

import java.util.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Formatter;

public class task4 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("data", locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        Date now = new Date();
        Formatter fr = new Formatter();
        fr.format("%s %tF %<tT\n", bundle.getString("date"), now);
        fr.format("=========================================\n");
        fr.format("%s %5s %14s %12s\n", bundle.getString("no"), bundle.getString("product_name"), bundle.getString("category"), bundle.getString("price"));
        fr.format("%d %5s %16s %14s\n", 1, bundle.getString("item1"), bundle.getString("category1"), currencyFormatter.format(1500.78));
        fr.format("%d %5s %14s %14s\n", 2, bundle.getString("item2"), bundle.getString("category1"), currencyFormatter.format(1000.56));
        fr.format("%d %5s %16s %11s\n", 3, bundle.getString("item3"), bundle.getString("category2"), currencyFormatter.format(500.78));
        fr.format("%d %5s %16s %14s\n", 4, bundle.getString("item1"), bundle.getString("category1"), currencyFormatter.format(1500.78));
        fr.format("%d %5s %14s %14s\n", 5, bundle.getString("item2"), bundle.getString("category1"), currencyFormatter.format(1000.56));
        fr.format("%d %5s %16s %11s\n", 6, bundle.getString("item3"), bundle.getString("category2"), currencyFormatter.format(500.78));
        fr.format("%d %5s %16s %14s\n", 7, bundle.getString("item1"), bundle.getString("category1"), currencyFormatter.format(1500.78));
        fr.format("%d %5s %14s %14s\n", 8, bundle.getString("item2"), bundle.getString("category1"), currencyFormatter.format(1000.56));
        fr.format("%d %5s %16s %11s\n", 9, bundle.getString("item3"), bundle.getString("category2"), currencyFormatter.format(500.78));
        fr.format("%d %5s %15s %14s\n", 10, bundle.getString("item1"), bundle.getString("category1"), currencyFormatter.format(1500.78));
        double total = 10507.8;
        fr.format("=========================================\n");
        fr.format("%s %33s\n", bundle.getString("total"), currencyFormatter.format(total));
        System.out.println(fr.toString());
    }
}
