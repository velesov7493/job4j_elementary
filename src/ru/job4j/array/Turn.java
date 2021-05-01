package ru.job4j.array;

public class Turn {

    private static void exchange(int[] data, int source, int dest) {
        int tmp = data[source];
        data[source] = data[dest];
        data[dest] = tmp;
    }

    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - i - 1; i++) {
            exchange(array, i, array.length - i - 1);
        }
        return array;
    }
}
