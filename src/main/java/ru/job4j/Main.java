package ru.job4j;

public class Main {

    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;

    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}