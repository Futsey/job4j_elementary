package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyTwoThenOneHundredAndTwelve() {
        int start = 10;
        int finish = 22;
        int result = Counter.sumByEven(start, finish);
        int expected = 112;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoThenTwenty() {
        int start = 2;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }

}