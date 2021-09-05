package ru.job4j.condition;

public class Max {

    public static int maxvalue(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.maxvalue(3, 5);
        System.out.println(msg);
    }
}
