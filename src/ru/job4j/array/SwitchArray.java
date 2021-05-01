package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] data, int source, int dest) {
        int tmp = data[source];
        data[source] = data[dest];
        data[dest] = tmp;
        return data;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}