package ru.job4j.array;

public class Sequence {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        System.out.println(array[0][0]);
        array[0][1] = 2;
        System.out.println(array[0][1]);
        array[0][2] = 3;
        System.out.println(array[0][2]);
        array[1][0] = 4;
        System.out.println(array[1][0]);
        array[1][1] = 5;
        System.out.println(array[1][1]);
        array[1][2] = 6;
        System.out.println(array[1][2]);
        array[2][0] = 7;
        System.out.println(array[2][0]);
        array[2][1] = 8;
        System.out.println(array[2][1]);
        array[2][2] = 9;
        System.out.println(array[array.length - 1][array.length - 1]);
    }
}
