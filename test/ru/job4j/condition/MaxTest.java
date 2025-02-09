package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1And2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3And10Then10() {
        int left = 3;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7And7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax40And11Then40() {
        int left = 40;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12And11And10Then12() {
        int one = 12;
        int two = 11;
        int three = 10;
        int result = Max.max(one, two, three);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax120And70And55And144Then144() {
        int one = 120;
        int two = 70;
        int three = 55;
        int four = 144;
        int result = Max.max(one, two, three, four);
        int expected = 144;
        Assert.assertEquals(result, expected);
    }
}