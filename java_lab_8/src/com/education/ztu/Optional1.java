package com.education.ztu;

import java.util.Optional;
import java.util.stream.IntStream;

public class Optional1 {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,3,77};
        Optional<Integer> max = IntStream.of(numbers)
                .boxed()
                .max(Integer::compareTo);
        String result = max.map(String::valueOf)
                .orElse("Числа відсутні");
        System.out.println("Результат: " + result);
    }
}

