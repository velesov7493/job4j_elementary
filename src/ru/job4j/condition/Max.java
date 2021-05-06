package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return right > left ? right : left;
    }

    public static int max(int one, int two, int three) {
        return max(max(one, two), three);
    }

    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }
}
