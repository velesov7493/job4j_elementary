package ru.job4j.array;

public class AlgoArray {

    public static void exchange(int[] data, int i1, int i2) {
        int tmp = data[i1];
        data[i1] = data[i2];
        data[i2] = tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        exchange(array, 3, 0);
        exchange(array, 1, 2);
        exchange(array, 3, 4);

        for (int val : array) {
            System.out.println(val);
        }
    }
}
