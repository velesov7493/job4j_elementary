package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4, 4}
        };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Длина вложенного массива " + i + " = " + numbers[i].length);
        }
    }
}
