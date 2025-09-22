package com.education.ztu;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть два числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Числа мають бути додатніми.");
            return;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Найбільший спільний дільник чисел " + a );
    }
}
