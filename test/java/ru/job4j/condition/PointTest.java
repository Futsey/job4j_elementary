package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when30to36then6() {
        double expected = 6;
        Point a = new Point(3, 0);
        Point b = new Point(3, 6);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when30to218then18() {
        double expected = 18.02;
        Point a = new Point(3, 0);
        Point b = new Point(2, 18);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when56to18then6() {
        double expected = 4.47;
        Point a = new Point(5, 6);
        Point b = new Point(1, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus1and4to20then5() {
        double expected = 5;
        Point a = new Point(-1, 4);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}