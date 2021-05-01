package ru.job4j.loop;

public class Mortgage {

    // Если кредит выплатить нельзя, то возвращаем -1

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double delta;
        do {
            delta = percent * amount / 100 - salary;
            amount += delta;
            year++;
        } while (amount > 0 && delta < 0);
        if (delta >= 0) {
            year = -1;
        }
        return year;
    }
}
