package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            int m = number % i;
            if (m == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
