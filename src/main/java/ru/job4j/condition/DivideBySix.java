package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
    String rsl;
        if (number % 3 == 0) {
        if (number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
            return rsl;
        } else if (number % 2 == 1) {
            rsl = "Исходное число делится на 3, но не является четным.";
            return rsl;
        }
    } else {
        if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
            return rsl;
        }
    }
        return "Исходное число не делится на 3 и не является четным.";
}

    public static void main(String[] args) {
        System.out.println(checkNumber(25));
    }
}
