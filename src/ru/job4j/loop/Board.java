package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        // Шестнодцатиричные коды
        // требуемых UNICODE-символов псевдографики
        char whiteChar = 0x2591;
        char blackChar = 0x2588;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int s = (i + j) % 2;
                if (s == 0) {
                    System.out.print(blackChar);
                } else {
                    System.out.print(whiteChar);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("3x3 :");
        paint(3, 3);
        System.out.println();
        System.out.println("4x4 :");
        paint(4, 4);
        System.out.println();
        System.out.println("8x8 :");
        paint(8, 8);
    }
}