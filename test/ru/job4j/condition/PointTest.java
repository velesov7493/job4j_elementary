package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double real = p1.distance(p2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when12tom20thenSqrt13() {
        double expected = 3.605;
        Point p1 = new Point(1, 2);
        Point p2 = new Point(-2, 0);
        double real = p1.distance(p2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when34to11thenSqrt13() {
        double expected = 3.605;
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 1);
        double real = p1.distance(p2);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void when00to11thenSqrt2() {
        double expected = 1.414;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        double real = p1.distance(p2);
        Assert.assertEquals(expected, real, 0.001);
    }
}