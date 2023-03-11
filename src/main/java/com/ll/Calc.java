package com.ll;

import java.util.Arrays;

public class Calc {
    public static int run(String exp) {
        String[] numbers;

        exp = exp.replace(" - ", " + -");
        numbers = exp.split(" \\+ ");

//        int sum = 0;
//        for(String x : numbers) {
//            sum += Integer.parseInt(x);
//        }

        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
