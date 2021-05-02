package ru.job4j.array;

public class Defragment {

    private static void exchange(String[] data, int source, int dest) {
        String tmp = data[source];
        data[source] = data[dest];
        data[dest] = tmp;
    }

    private static int indexOfNotNullAfter(String[] array, int start) {
        int result = -1;
        if (start >= array.length || start < 0) {
            return result;
        }
        for (int i = start; i < array.length; i++) {
            if (array[i] != null) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int notNullPoint = indexOfNotNullAfter(array, index + 1);
                if (notNullPoint < 0) {
                    break;
                }
                exchange(array, index, notNullPoint);
            }
        }
        return array;
    }
}
