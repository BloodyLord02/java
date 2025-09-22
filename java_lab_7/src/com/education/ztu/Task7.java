package com.education.ztu;

import java.util.*;
import java.util.concurrent.*;

public class Task7 {
    private static final int ARRAY_SIZE = 1_000_000;
    private static final int THREAD_COUNT = 5;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] numbers = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = random.nextInt(10000);
        }
        long startSingle = System.currentTimeMillis();
        long singleThreadSum = sumDigitsSingleThread(numbers);
        long endSingle = System.currentTimeMillis();
        System.out.println("Однопоточна сума цифр: " + singleThreadSum);
        System.out.println("Час (мс): " + (endSingle - startSingle));
        long startMulti = System.currentTimeMillis();
        long multiThreadSum = sumDigitsMultiThread(numbers);
        long endMulti = System.currentTimeMillis();

        System.out.println("Багатопоточна сума цифр: " + multiThreadSum);
        System.out.println("Час (мс): " + (endMulti - startMulti));
    }
    public static long sumDigitsSingleThread(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += sumDigits(num);
        }
        return sum;
    }
    public static long sumDigitsMultiThread(int[] array) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        List<Future<Long>> futures = new ArrayList<>();
        int chunkSize = array.length / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int start = i * chunkSize;
            int end = (i == THREAD_COUNT - 1) ? array.length : start + chunkSize;
            futures.add(executor.submit(new DigitSumTask(Arrays.copyOfRange(array, start, end))));
        }
        long totalSum = 0;
        for (Future<Long> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();
        return totalSum;
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    static class DigitSumTask implements Callable<Long> {
        private final int[] data;
        public DigitSumTask(int[] data) {
            this.data = data;
        }
        @Override
        public Long call() {
            long sum = 0;
            for (int num : data) {
                sum += Task7.sumDigits(num);
            }
            return sum;
        }
    }
}
