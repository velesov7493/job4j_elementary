package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas13Then6() {
        int[] data = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int el = 13;
        int result = FindLoop.indexOf(data, el);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9ThenNotFound() {
        int[] data = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArray24Has2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArray810Has55Then9() {
        int[] data = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int el = 55;
        int start = 8;
        int finish = 10;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArray17Has55ThenNotFound() {
        int[] data = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int el = 55;
        int start = 1;
        int finish = 7;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}