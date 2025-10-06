package com.education.ztu;

class Operation {
    public static int addition(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int subtraction(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            result -= numbers[i];
            i++;
        }
        return result;
    }

    public static int multiplication(int... numbers) {
        if (numbers.length == 0) return 0;
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static double division(int... numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] != 0) {
                result /= numbers[i];
            } else {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
            i++;
        }
        return result;
    }

    public static double average(int... numbers) {
        if (numbers.length == 0) return 0;
        return (double) addition(numbers) / numbers.length;
    }

    public static int maximum(int... numbers) {
        if (numbers.length == 0) return Integer.MIN_VALUE;
        int max = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            i++;
        }
        return max;
    }

    public static int minimum(int... numbers) {
        if (numbers.length == 0) return Integer.MAX_VALUE;
        int min = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        return min;
    }
}
