package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int result;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            System.out.println("Method MinDiapason.findMin: Получили минимальное значение элемента: " + min);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            System.out.println("Method FindLoop.indexOf: Получили значение индекса элемента с минимальным значением: " + index);

            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
            System.out.println("Method sort: Заменили элемент : " + temp + " на наименьший: " + data[i]);
        }
        return data;
    }
}
