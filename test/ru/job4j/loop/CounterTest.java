package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumNumbersFromOneToHundredThen5050() {
        int start = 1;
        int finish = 100;
        int result = Counter.sum(start, finish);
        int expected = 5050;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToHundredThen2550() {
        int start = 1;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2550;
        Assert.assertEquals(expected, result);
    }
}