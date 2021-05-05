package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            if (i == left.length || right[j] < left[i]) {
                result[k] = right[j];
                j++;
            } else if (j == right.length || left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            }
        }
        return result;
    }
}
