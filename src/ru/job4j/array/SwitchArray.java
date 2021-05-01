package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] data, int i1, int i2) {
        int tmp = data[i1];
        data[i1] = data[i2];
        data[i2] = tmp;
        return data;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}