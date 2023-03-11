package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort17and24and42() {
        int[] data = new int[] {24, 42, 17};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {17, 24, 42};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort6and12and36and77and548() {
        int[] data = new int[] {36, 12, 77, 548, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 12, 36, 77, 548};
        Assert.assertArrayEquals(expected, result);
    }
}