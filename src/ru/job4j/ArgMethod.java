package ru.job4j;

public class ArgMethod {

    private static void hello(String name, int age) {
        System.out.println("Hello, " + name + " - "+age);
    }

    public static void main(String[] args) {
        String name = "Alexandr Vlasov"; int age = 36;
        hello(name, age);
    }
}
