package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            count += check(number) ? 1 : 0;
        }
        return count;
    }
}
