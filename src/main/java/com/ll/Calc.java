package com.ll;

import java.util.Arrays;

public class Calc {
    public static double run(String exp) {
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
        } else if (exp.contains("/")) {
            numbers = exp.split(" / ");

            return Arrays.stream(numbers)
                    .mapToDouble(Double::parseDouble)
                    .reduce((e1, e2) -> e1 / e2)
                    .getAsDouble();
        }
        throw new RuntimeException();
    }
}
