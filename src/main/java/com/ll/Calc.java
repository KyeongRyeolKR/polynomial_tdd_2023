package com.ll;

public class Calc {
    public static int run(String exp) {
        String[] numbers;

        if(exp.contains("+")) {
            numbers = exp.split(" \\+ ");
        } else {
            numbers = exp.split(" - ");
        }

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if(exp.contains("+")) {
            return a + b;
        } else {
            return a - b;
        }

    }
}
