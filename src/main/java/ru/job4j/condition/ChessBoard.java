package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == y1 && x2 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl > 6 || rsl < 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));
    }

}
