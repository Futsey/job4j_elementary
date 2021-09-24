package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int result;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = min;
            min = index;
            index = temp;
        }
        return data;
    }
}
