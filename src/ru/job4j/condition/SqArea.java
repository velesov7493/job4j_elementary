package ru.job4j.condition;

public class SqArea {

    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        System.out.println("Площадь прямоугольника");
    }
}
