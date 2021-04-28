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

    public static void main(String[] args) {
        access(21);
        access(16);
        access(18);
    }

}
