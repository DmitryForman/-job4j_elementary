package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to30then3() {
        double expected = 3;
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to40then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to40then3() {
        double expected = 3;
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to45then3() {
        double expected = 3;
        Point a = new Point(1, 5);
        Point b = new Point(4, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}