package com.education.ztu;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product("Tesla", "Model S", 2022, 89999),
                new Product("BMW", "X5", 2020, 60000),
                new Product("Toyota", "Camry", 2019, 25000),
                new Product("Ford", "Focus", 2018, 18000),
                new Product("Audi", "A6", 2021, 55000)
        ));
        System.out.println("Оригінальний список:");
        productList.forEach(System.out::println);
        Collections.sort(productList);
        System.out.println("\nСписок після Collections.sort() за ціною:");
        productList.forEach(System.out::println);
        Product key = new Product("Toyota", "Camry", 2019, 25000);
        int index = Collections.binarySearch(productList, key);
        System.out.println("\nІндекс Toyota Camry після binarySearch: " + index);
        Collections.reverse(productList);
        System.out.println("\nСписок після Collections.reverse():");
        productList.forEach(System.out::println);
        Collections.shuffle(productList);
        System.out.println("\nСписок після Collections.shuffle():");
        productList.forEach(System.out::println);
        Collections.fill(productList, new Product("Filled", "Product", 2025, 999));
        System.out.println("\nСписок після Collections.fill():");
        productList.forEach(System.out::println);
        List<Product> newList = new ArrayList<>(Arrays.asList(
                new Product("Tesla", "Model 3", 2023, 45000),
                new Product("BMW", "i4", 2021, 48000),
                new Product("Toyota", "Corolla", 2020, 22000),
                new Product("Ford", "Mondeo", 2022, 27000),
                new Product("Audi", "A4", 2021, 40000)
        ));
        System.out.println("\nМаксимальний (найдорожчий): " + Collections.max(newList));
        System.out.println("Мінімальний (найдешевший): " + Collections.min(newList));
        List<Product> copyList = new ArrayList<>(Arrays.asList(
                null, null, null, null, null
        ));
        Collections.copy(copyList, newList);
        System.out.println("\nСписок після Collections.copy():");
        copyList.forEach(System.out::println);
        Collections.rotate(copyList, 2);
        System.out.println("\nСписок після Collections.rotate(2):");
        copyList.forEach(System.out::println);
        Collection<Product> checked = Collections.checkedCollection(new ArrayList<>(), Product.class);
        checked.add(new Product("Skoda", "Octavia", 2020, 23000));
        System.out.println("\nПеревірена колекція (checkedCollection):");
        checked.forEach(System.out::println);
        Product duplicate = new Product("Ford", "Mondeo", 2022, 27000);
        newList.add(duplicate);
        newList.add(duplicate);
        int count = Collections.frequency(newList, duplicate);
        System.out.println("\nКількість входжень Ford Mondeo: " + count);
    }
}
