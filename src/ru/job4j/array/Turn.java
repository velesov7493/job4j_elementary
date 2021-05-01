package ru.job4j.array;

public class Turn {

    private static void exchange(int[] data, int i1, int i2) {
        int tmp = data[i1];
        data[i1] = data[i2];
        data[i2] = tmp;
    }

    public static int[] back(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < j; i++) {
            exchange(array, i, j);
            j--;
        }
        return array;
    }
}
