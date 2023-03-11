package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxvalueTwoTopLeft() {
        int left = 10;
        int right = 5;
        int result = Max.maxvalue(left, right);
        int expected = left;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxvalueThreeTopUp() {
        int left = 10;
        int right = 5;
        int up = 14;
        int result = Max.maxvalue(left, right, up);
        int expected = up;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxvalueFourTopDown() {
        int left = 10;
        int right = 5;
        int up = 14;
        int down = 64;
        int result = Max.maxvalue(left, right, up, down);
        int expected = down;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxvalueFourTopUp() {
        int left = 4;
        int right = 1;
        int up = 44;
        int down = 24;
        int result = Max.maxvalue(left, right, up, down);
        int expected = up;
        Assert.assertEquals(expected, result);
    }
}