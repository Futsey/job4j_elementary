package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int result;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOfSection(data, min, 0, data.length);
            int temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
