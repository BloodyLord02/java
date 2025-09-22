package com.education.ztu;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть додатне ціле число:");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Число має бути додатним.");
            return;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сума цифр числа = " + sum);
    }
}
