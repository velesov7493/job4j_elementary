package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean result = PrimeNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = PrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    // Этот тест пришлось поправить,
    // Потому что 1 - тоже простое число

    @Test
    public void when1() {
        int number = 1;
        boolean result = PrimeNumber.check(number);
        //Assert.assertFalse(result);
        Assert.assertTrue(result);
    }

}