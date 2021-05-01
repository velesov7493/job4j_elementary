package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Петр Арсентьев";
        names[1] = "Михаил Хазин";
        names[2] = "Дмитрий Джангиров";
        names[3] = "Сергей Немчинский";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
