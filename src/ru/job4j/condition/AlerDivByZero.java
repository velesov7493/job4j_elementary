package ru.job4j.condition;

public class AlerDivByZero {

    private static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("На 0 делить нельзя.");
        }
        if (number < 0) {
            System.out.println("Это отрицательное число");
        }
    }

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-4);
        possibleDiv(-11);
    }
}
