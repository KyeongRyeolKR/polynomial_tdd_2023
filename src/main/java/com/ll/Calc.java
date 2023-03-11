package com.ll;

public class Calc {
    public static int run(String exp) {
        String[] numbers = exp.split(" \\+ ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        return a + b;
    }
}
