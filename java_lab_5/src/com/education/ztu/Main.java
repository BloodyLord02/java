package com.education.ztu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tesla", "Model S", 2022, 89999));
        products.add(new Product("BMW", "X5", 2020, 60000));
        products.add(new Product("Toyota", "Camry", 2019, 25000));
        List<Product> moreProducts = new ArrayList<>();
        moreProducts.add(new Product("Audi", "A6", 2021, 55000));
        moreProducts.add(new Product("Ford", "Mustang", 2022, 45000));
        products.addAll(moreProducts);
        System.out.println("Перший продукт: " + products.get(0));
        System.out.println("Індекс BMW: " + products.indexOf(products.get(1)));
        System.out.println("\nУсі продукти:");
        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nУ зворотному порядку:");
        ListIterator<Product> listIt = products.listIterator(products.size());
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
        products.remove(2);
        products.set(1, new Product("Mercedes", "GLE", 2021, 70000));
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("\n2 найдешевші продукти:");
        List<Product> top2 = products.subList(0, 2);
        top2.forEach(System.out::println);
        System.out.println("\nМістить Audi A6? " + products.contains(moreProducts.get(0)));
        System.out.println("Список порожній? " + products.isEmpty());
        System.out.println("Кількість продуктів: " + products.size());
        Product[] productArray = products.toArray(new Product[0]);
        System.out.println("\nПродукти у вигляді масиву:");
        for (Product product : productArray) {
            System.out.println(product);
        }
        products.retainAll(moreProducts);
        System.out.println("\nПродукти після retainAll з moreProducts:");
        products.forEach(System.out::println);
        products.clear();
        System.out.println("Список очищено. Порожній? " + products.isEmpty());
    }
}
