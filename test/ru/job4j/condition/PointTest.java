package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double real = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when12tom20thenSqrt13() {
        double expected = 3.605;
        int x1 = 1;
        int y1 = 2;
        int x2 = -2;
        int y2 = 0;
        double real = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when34to11thenSqrt13() {
        double expected = 3.605;
        int x1 = 3;
        int y1 = 4;
        int x2 = 1;
        int y2 = 1;
        double real = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when00to11thenSqrt2() {
        double expected = 1.414;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double real = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, real, 0.001);
    }
}