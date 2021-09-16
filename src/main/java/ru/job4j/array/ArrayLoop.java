package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
            System.out.println(numbers[index]);
        }
        for (int ints : numbers) {
            System.out.println(ints);
        }
    }
}
