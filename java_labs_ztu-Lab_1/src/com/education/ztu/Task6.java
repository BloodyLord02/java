package com.education.ztu;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть додатне ціле число:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Число має бути додатним.");
            return;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("Послідовність Фібоначчі:");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Зворотна послідовність Фібоначчі:");
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; ++i) {
            reversedArr[i] = arr[n - 1 - i];
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(reversedArr[i] + " ");
        }

    }
}
