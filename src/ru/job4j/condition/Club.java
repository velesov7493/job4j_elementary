package ru.job4j.condition;

public class Club {

    private static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("Можно пойти в клуб.");
        } else {
            System.out.println("В клуб сходить не получится.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
