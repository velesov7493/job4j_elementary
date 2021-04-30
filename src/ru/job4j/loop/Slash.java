package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean left = row == col;
                boolean right = col == size - row - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Крест 3");
        draw(3);
        System.out.println("Крест 5");
        draw(5);
        System.out.println("Крест 4");
        draw(4);
    }
}
