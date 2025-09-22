package com.education.ztu;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        TreeSet<Product> productSet = new TreeSet<>();

        productSet.add(new Product("Tesla", "Model Y", 2023, 52000));
        productSet.add(new Product("BMW", "X5", 2020, 60000));
        productSet.add(new Product("Toyota", "Corolla", 2019, 20000));
        productSet.add(new Product("Audi", "Q5", 2021, 45000));
        productSet.add(new Product("Ford", "Focus", 2018, 18000));

        System.out.println("Всі продукти у множині (за зростанням ціни):");
        productSet.forEach(System.out::println);

        System.out.println("\nПерший (найдешевший): " + productSet.first());
        System.out.println("Останній (найдорожчий): " + productSet.last());

        Product refProduct = new Product("Ref", "Ref", 2020, 45000);

        System.out.println("\nПродукти дешевші за $45000 (headSet):");
        productSet.headSet(refProduct).forEach(System.out::println);

        System.out.println("\nПродукти від $45000 включно (tailSet):");
        productSet.tailSet(refProduct).forEach(System.out::println);

        System.out.println("\nПродукти у діапазоні $20000 - $52000 (subSet):");
        Product low = new Product("L", "L", 0, 20000);
        Product high = new Product("H", "H", 0, 52000);
        productSet.subSet(low, high).forEach(System.out::println);

        System.out.println("\nЕлемент рівний або більший за $45000 (ceiling): " + productSet.ceiling(refProduct));
        System.out.println("Елемент рівний або менший за $45000 (floor): " + productSet.floor(refProduct));
        System.out.println("Наступний після $45000 (higher): " + productSet.higher(refProduct));
        System.out.println("Попередній перед $45000 (lower): " + productSet.lower(refProduct));

        System.out.println("\nВидаляємо найменший (pollFirst): " + productSet.pollFirst());
        System.out.println("Видаляємо найбільший (pollLast): " + productSet.pollLast());

        System.out.println("\nЗалишилось у множині:");
        productSet.forEach(System.out::println);

        System.out.println("\nУ зворотному порядку:");
        NavigableSet<Product> descending = productSet.descendingSet();
        descending.forEach(System.out::println);
    }
}
