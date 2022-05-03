package ru.job4j.array;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Arrays;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int row = 0; row < size; row++) {
                for (int cell = 0; cell < size; cell++) {
                    array[row][cell] = (cell + 1) * (row + 1);
                    out.write(Arrays.deepToString(array).getBytes());
                    out.write(System.lineSeparator().getBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiple(3)));
    }
}
