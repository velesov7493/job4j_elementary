package ru.job4j.calculator;

public class Fit {

    private static double manWeight(short height) {
        return (height-100)*1.15;
    }

    private static double womanWeight(short height) {
        return (height-110)*1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double manWeight = manWeight(height);
        double womanWeight = womanWeight(height);
        System.out.println("Man 187 is " + manWeight + " kg");
        System.out.println("Woman 187 is " + womanWeight + " kg");
    }
}
