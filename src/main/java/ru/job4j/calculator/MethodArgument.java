package ru.job4j.calculator;

public class MethodArgument {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {

        MethodArgument.plus(100, 500);
        MethodArgument.plus(4, 2);
        MethodArgument.plus(3, 5);

    }
}
