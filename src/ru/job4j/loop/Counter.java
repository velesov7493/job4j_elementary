package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        return result;
    }

    public static int sumByEven(int start, int finish) {

        // Убираем if из тела цикла,
        // устанавливаем инкремент в 2,
        // чтобы не перебирать все числа,
        // и этим делаем цикл быстрее
        // минимум в 2 раза

        int sum = 0;
        // Новые границы должны быть четными
        int newStart = start + start % 2;
        int newFinish = finish - finish % 2;
        for (int i = newStart; i <= newFinish; i += 2) {
            sum += i;
        }
        return sum;
    }
}
