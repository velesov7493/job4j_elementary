package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        int in = 140;
        int expected = 2;
        int real = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, real);
    }

    @Test
    public void whenConvert360RubleTo6Dollars() {
        int in = 360;
        int expected = 6;
        int real = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, real);
    }
}