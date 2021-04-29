package ru.job4j.condition;

public class Cinema {

    private static void access(int age) {
        System.out.println("Возраст посетителя : " + age);
        if (age >= 18) {
            System.out.println("Добро пожаловать в кинотеатр!");
        } else {
            System.out.println("Вам еще рано смотреть фильмы для взрослых.");
        }
    }

    private static void permission(boolean allowByParent, boolean hasMoney) {
        boolean result = allowByParent && hasMoney;
        if (result) {
            System.out.println("Я могу пойти в кинотеатр.");
        } else {
            System.out.println("Я не могу пойти в кинотеатр.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }

}
