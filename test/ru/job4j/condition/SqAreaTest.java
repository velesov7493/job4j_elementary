package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int p = 4; double k = 1;
        double expected = 1;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void whenP6K2Then2() {
        int p = 6; double k = 2;
        double expected = 2;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void whenP14K1d333Then12() {
        int p = 14; double k = 1.333;
        double expected = 12;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 0.001);
    }

    @Test
    public void whenP40K3Then75() {
        int p = 40; double k = 3;
        double expected = 75;
        double real = SqArea.square(p, k);
        Assert.assertEquals(expected, real, 0.001);
    }
}