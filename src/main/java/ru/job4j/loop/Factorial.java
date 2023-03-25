package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 2;
        for (int i = result; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}