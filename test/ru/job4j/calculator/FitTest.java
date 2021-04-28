package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeightWhen187Then100d05() {
        short height = 187;
        double expected = 100.05;
        double real = Fit.manWeight(height);
        Assert.assertEquals(expected, real, 0.01);
    }

    @Test
    public void womanWeightWhen187Then88d55() {
        short height = 187;
        double expected = 88.55;
        double real = Fit.womanWeight(height);
        Assert.assertEquals(expected, real, 0.01);
    }

    @Test
    public void manWeightWhen177Then88d55() {
        short height = 177;
        double expected = 88.55;
        double real = Fit.manWeight(height);
        Assert.assertEquals(expected, real, 0.01);
    }

    @Test
    public void womanWeightWhen175Then74d75() {
        short height = 175;
        double expected = 74.75;
        double real = Fit.womanWeight(height);
        Assert.assertEquals(expected, real, 0.01);
    }
}