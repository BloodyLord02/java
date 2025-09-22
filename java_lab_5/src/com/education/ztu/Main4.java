package com.education.ztu;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Tesla Model S", new Product("Tesla", "Model S", 2022, 89999));
        productMap.put("BMW X5", new Product("BMW", "X5", 2020, 60000));
        productMap.put("Toyota Camry", new Product("Toyota", "Camry", 2019, 25000));
        productMap.putIfAbsent("BMW X5", new Product("BMW", "X5", 2021, 62000));
        productMap.putIfAbsent("Audi A6", new Product("Audi", "A6", 2021, 55000));
        System.out.println("Отримати Tesla Model S: " + productMap.get("Tesla Model S"));
        System.out.println("Отримати Audi A6: " + productMap.get("Audi A6"));
        System.out.println("\nМістить ключ 'BMW X5'? " + productMap.containsKey("BMW X5"));
        System.out.println("Містить значення Audi A6? " + productMap.containsValue(new Product("Audi", "A6", 2021, 55000)));
        System.out.println("\nУсі ключі (keySet):");
        for (String key : productMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("\nУсі значення (values):");
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
        System.out.println("\nПари ключ-значення (entrySet):");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey());
            System.out.println("Значення: " + entry.getValue());
            if (entry.getKey().equals("Toyota Camry")) {
                entry.setValue(new Product("Toyota", "Camry", 2019, 23000)); // змінили ціну
            }
        }
        System.out.println("\nПісля зміни ціни Toyota Camry:");
        productMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        productMap.remove("BMW X5");
        Map<String, Product> newProducts = new HashMap<>();
        newProducts.put("Ford Mustang", new Product("Ford", "Mustang", 2022, 45000));
        productMap.putAll(newProducts);
        System.out.println("\nПісля видалення BMW та додавання Mustang:");
        productMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        System.out.println("\nКількість елементів у Map: " + productMap.size());
        productMap.clear();
        System.out.println("Map очищено. Порожня? " + productMap.isEmpty());
    }
}
