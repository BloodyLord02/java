package com.education.ztu;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main2 {
    public static void main(String[] args) {
        Deque<Product> productQueue = new ArrayDeque<>();
        productQueue.push(new Product("Tesla", "Cybertruck", 2024, 79999));
        productQueue.offerLast(new Product("BMW", "i8", 2021, 99999));
        productQueue.offerLast(new Product("Audi", "Q7", 2022, 65000));
        productQueue.push(new Product("Ford", "F-150", 2023, 48000));
        System.out.println("Черга після додавання:");
        productQueue.forEach(System.out::println);
        System.out.println("\nПерший елемент (getFirst): " + productQueue.getFirst());
        System.out.println("Останній елемент (peekLast): " + productQueue.peekLast());
        System.out.println("\nВидаляємо перший елемент (pop): " + productQueue.pop());
        System.out.println("Видаляємо останній елемент (removeLast): " + productQueue.removeLast());
        System.out.println("Видаляємо останній елемент (pollLast): " + productQueue.pollLast());
        System.out.println("\nЧерга після видалень:");
        productQueue.forEach(System.out::println);
        System.out.println("\nРозмір черги: " + productQueue.size());
        System.out.println("Черга порожня? " + productQueue.isEmpty());
        productQueue.clear();
        System.out.println("Після очищення, черга порожня? " + productQueue.isEmpty());
    }
}
