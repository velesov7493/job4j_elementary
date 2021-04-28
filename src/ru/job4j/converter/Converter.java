package ru.job4j.converter;

public class Converter {

    private static int rubleToEuro(int value) {
        return value / 70;
    }

    private static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int real = rubleToEuro(in);
        boolean passed = expected == real;
        System.out.println("140 рублей - это 2 евро. Тест пройден: " + passed);
        in = 360; expected = 6;
        real = rubleToDollar(in);
        passed = expected == real;
        System.out.println("360 рублей - это 6 долларов. Тест пройден: " + passed);
    }
}
