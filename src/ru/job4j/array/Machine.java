package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int change = money - price;
        for (int nominal : coins) {
            int count = change / nominal;
            change %= nominal;
            while (count > 0) {
                result[size] = nominal;
                size++;
                count--;
            }
        }
        return Arrays.copyOf(result, size);
    }
}