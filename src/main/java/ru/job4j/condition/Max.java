package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int threed) {
        return first > second && first > threed ? first : second > threed ? second : threed;
    }

    public static int max(int first, int second, int threed, int four) {
        return first > second && first > threed && first > four ? first : second > threed && second > four ? second : threed > four ? threed : four;
    }

    public static void main(String[] args) {
        int res = Max.max(5, 1, 6, 10);
        System.out.println(res);
    }
}