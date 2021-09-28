package ru.job4j.array;

public class Defragment {

    public static String[] nullNonNullMethod(String[] array, int nullPoint, int nonNullPoint) {
        String tmp = array[nonNullPoint];
        array[nonNullPoint] = array[nullPoint];
        array[nullPoint] = tmp;

        return array;
    }

    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[k] != null) {
                        nullNonNullMethod(array, i, k);
                        break;
                    }
                }
            }
        }
        return array;
    }

        public static void main(String[]args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
}
