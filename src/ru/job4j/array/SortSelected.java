package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int j = FindLoop.indexOf(data, min, i, data.length);
            if (j != i) {
                SwitchArray.swap(data, i, j);
            }
        }
        return data;
    }
}
