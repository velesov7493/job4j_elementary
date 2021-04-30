package ru.job4j.loop;

public class Mortgage {

    // Если кредит выплатить нельзя, то возвращаем -1

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int credit = amount;
        double dc = -1;
        while (credit > 0 && dc < 0) {
            dc = percent * credit / 100 - salary;
            credit += dc;
            year++;
        }
        if (dc >= 0) {
            year = -1;
        }
        return year;
    }
}
