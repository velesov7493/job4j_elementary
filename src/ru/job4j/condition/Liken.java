package ru.job4j.condition;

public class Liken {

    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

        boolean result = first > second;
        System.out.println("first больше second?..." + result);

        result = first < second;
        System.out.println("first меньше second?..." + result);

        result = first == second;
        System.out.println("first равна second?..." + result);
    }
}
