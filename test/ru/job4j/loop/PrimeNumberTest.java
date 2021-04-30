package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void whenCheck5() {
        int number = 5;
        boolean result = PrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void whenCheck4() {
        int number = 4;
        boolean result = PrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void whenCheck1() {
        int number = 1;
        boolean result = PrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void whenCalc5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalc11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalc2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}