package ru.job4j.condition;

public class ChessBoard {

    // Длина хода слона
    // из точки x1, y1 в точку x2, y2

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            if (dx == dy && dx < 8) {
                result = dx;
            }
        }
        return result;
    }
}
