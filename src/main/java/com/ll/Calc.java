package com.ll;

import java.util.Arrays;

public class Calc {
    public static int run(String exp) {
        String[] numbers;

        exp = exp.replace(" - ", " + -");

        if(exp.contains("+")) {
            numbers = exp.split(" \\+ ");

            return Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .sum();
        } else if (exp.contains("*")) {
            numbers = exp.split(" \\* ");

            return Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .reduce((e1, e2) -> e1 * e2)
                    .getAsInt();
        }
        throw new RuntimeException();
    }
}
