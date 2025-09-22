package com.education.ztu;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Ноутбук", "Lenovo", 25000, 5),
                new Product("Мишка", "Logitech", 800, 20),
                new Product("Клавіатура", "A4Tech", 600, 15),
                new Product("Монітор", "Samsung", 7000, 8),
                new Product("Навушники", "Sony", 950, 10),
                new Product("Флешка", "Kingston", 300, 50),
                new Product("Принтер", "Canon", 3500, 4)
        );
        System.out.println("Бренди:");
        products.stream()
                .map(Product::getBrand)
                .distinct()
                .forEach(System.out::println);
        System.out.println("\nТовари з ціною < 1000:");
        products.stream()
                .filter(p -> p.getPrice() < 1000)
                .limit(2)
                .forEach(System.out::println);
        double totalValue = products.stream()
                .mapToDouble(p -> p.getPrice() * p.getCount())
                .reduce(0, Double::sum);
        System.out.println("\nЗагальна вартість товарів на складі: ₴" + totalValue);
        System.out.println("\nГрупування по бренду:");
        Map<String, List<Product>> grouped = products.stream()
                .collect(Collectors.groupingBy(Product::getBrand));
        grouped.forEach((brand, prodList) -> {
            System.out.println(brand + ":");
            prodList.forEach(p -> System.out.println("  " + p));
        });
        Product[] sortedArray = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toArray(Product[]::new);
        System.out.println("\nТовари, відсортовані за ціною:");
        Arrays.stream(sortedArray).forEach(System.out::println);
    }
}

