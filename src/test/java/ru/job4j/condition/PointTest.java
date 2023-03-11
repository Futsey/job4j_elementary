package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when30to36Then6() {
        double expected = 6;
        Point a = new Point(3, 0);
        Point b = new Point(3, 6);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when30to218Then18dot02() {
        double expected = 18.02;
        Point a = new Point(3, 0);
        Point b = new Point(2, 18);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when56to18Then4dot47() {
        double expected = 4.47;
        Point a = new Point(5, 6);
        Point b = new Point(1, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus1and4to20Then5() {
        double expected = 5;
        Point a = new Point(-1, 4);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenMinus1and4and6to2and0and8Then5dot38() {
        double expected = 5.38;
        Point a = new Point(-1, 4, 6);
        Point b = new Point(2, 0, 8);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1and2and3to5and6and7Then6dot92() {
        double expected = 6.92;
        Point a = new Point(1, 2, 3);
        Point b = new Point(5, 6, 7);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenZeroThen0dot0() {
        double expected = 0.0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}