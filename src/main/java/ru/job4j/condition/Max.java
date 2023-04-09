package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int threed) {
        return Math.max(first, max(second, threed));
    }

    public static int max(int first, int second, int threed, int four) {
        return max(first, max(second, (max(threed, four))));
    }

    public static void main(String[] args) {
        int res = Max.max(5, 1, 6, 10);
        System.out.println(res);
    }
}